/**
 * Created by lin on 2/1/17.
 */

import jdk.nashorn.internal.ir.VarNode;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.*;


import java.util.HashSet;


public class  xQuerytest {
    
    private static int visitTree(String Xpath) throws Exception{
   // private static int visitTree(String Xpath) {

    ANTLRInputStream input = new ANTLRInputStream(Xpath);
        xqueryLexer lexer = new xqueryLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        xqueryParser parser = new xqueryParser(tokens);

        ParseTree tree = parser.query();

        // rewrite
//        String rewriteQuery = rewrite(tree);
//        if(!rewriteQuery.isEmpty()) {
//            try {
//
//                BufferedWriter out = new BufferedWriter(new FileWriter("rewrittenQuery.txt"));
//                out.write(rewriteQuery);
//                out.close();
//            }
//            catch (IOException e)
//            {
//                System.out.println("Output Exception");
//            }
//            input = new ANTLRInputStream(rewriteQuery);
//            lexer = new xqueryLexer(input);
//            tokens = new CommonTokenStream(lexer);
//            parser = new xqueryParser(tokens);
//            tree = parser.query();
//        }


        xqueryMyVisitor eval = new xqueryMyVisitor();


        ArrayList<Node> res = eval.visit(tree);
        writeFile(res, "output.xml");

        return res.size();
    }

    private static void writeFile(ArrayList<Node> result, String outputFile) throws TransformerException, FileNotFoundException
    {
        File out = new File(outputFile);
        if(out.exists()){
            out.delete();
        }

        FileOutputStream os = new FileOutputStream(outputFile,true);
        for(Node node : result) {
            Transformer t = TransformerFactory.newInstance().newTransformer();
            t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            t.setOutputProperty(OutputKeys.INDENT, "yes");
            t.transform(new DOMSource(node), new StreamResult(os));
        }
    }

    private static String rewrite (ParseTree tree){
        if(tree == null || tree.getChild(0) == null)
            return "";

        tree = tree.getChild(0); //xquery - > xq

        if(tree.getChildCount() != 3)
            return "";

        ParseTree forClause = null;
        ParseTree whereClause = null;
        ParseTree returnClause = null;


        if(tree.getChild(0).getText().contains("for"))
            forClause = tree.getChild(0);
        else
            return "";

        if(tree.getChild(1).getText().contains("where"))
            whereClause = tree.getChild(1);
        else
            return "";

        if(tree.getChild(2).getText().contains("return"))
            returnClause = tree.getChild(2);
        else
            return "";

        HashMap<String, HashMap<String, String>> var2set = new HashMap<>();
        ArrayList<HashMap<String, String>> sets = new ArrayList<>();

        for(int i = 0; i < forClause.getChildCount(); i++) {
            String var1Name = forClause.getChild(i).getText();
            if(var1Name.equals("in")) {
                ParseTree varTree = forClause.getChild(i - 1);
                ParseTree xqTree = forClause.getChild(i + 1);
                String varTreeName = varTree.getText();
                String xqTreeName = xqTree.getText();


                if(varTree.getText().contains("doc")) {
                    HashMap<String, String> var2xq = new HashMap<>();

                    var2xq.put(varTreeName, xqTreeName);
                    sets.add(var2xq);
                    var2set.put(varTreeName, var2xq);
                } else {
                    String parentVarName = xqTree.getChild(0).getText();
                    HashMap<String, String> var2xq = var2set.get(parentVarName);
                    var2xq.put(varTreeName, xqTreeName);
                    var2set.put(varTreeName, var2xq);
                }

            }
        }
        if(sets.size() < 2)
            return "";

        String whereClauseString = whereClause.getChild(1).getText();
        ArrayList<String> conds = new ArrayList<>(Arrays.asList
                                                (whereClauseString.split(" and ")));
        ArrayList<String> createSentence = new ArrayList<String>();
        ArrayList<String> whereSentence = new ArrayList<String>();

        for(int i = 0; i < sets.size(); i++) {
            createSentence.add("");
            whereSentence.add("");
        }

        String remainWhere = "";

        while(conds.size() > 0) {

            ArrayList<String> lBags = new ArrayList<>();
            ArrayList<String> rBags = new ArrayList<>();
            HashMap<String, String> lset = null, rset = null;

            for(int i = 0; i < conds.size(); ) {
                String[] vars = conds.get(i).split("eq");
                String var1 = vars[0];
                String var2 = vars[1];

                if(var2.charAt(0) != '$') {
                    //var eq constant
                    int setidx = sets.indexOf(var2set.get(var1));
                    if(whereSentence.get(setidx) == "")
                        whereSentence.set(setidx, "where " + conds.get(i));
                    else
                        whereSentence.set(setidx,  whereSentence.get(setidx) + " and " + conds.get(i));
                    conds.remove(i);
                }

                else {
                    HashMap<String, String> set1 = var2set.get(var1);
                    HashMap<String, String> set2 = var2set.get(var2);
                    if (set1 == set2 && set1 != null) {
                        int setidx = sets.indexOf(set1);
                        whereSentence.set(setidx, whereSentence.get(setidx) + "\t" + conds.get(i));
                        conds.remove(i);
                    }
                    else if(set1 != set2) {
                        if(lset == null) {
                            lset = set1;
                            rset = set2;
                            lBags.add(var1);
                            rBags.add(var2);
                            conds.remove(i);

                        }
                        else {
                            if(lset == set1 && rset == set2) {
                                lBags.add(var1);
                                rBags.add(var2);
                                conds.remove(i);
                            }
                            else if(lset == set2 && rset == set2) {
                                lBags.add(var2);
                                rBags.add(var1);
                                conds.remove(i);
                            } else {
                                i++;
                            }

                        }
                    }
                }

            }// for conds
            //if(lset == null)
            //
            int lidx = sets.indexOf(lBags);
            int ridx = sets.indexOf(rBags);
            String part1 = "";
            if(createSentence.get(lidx) == "") {
                part1 = "for ";
                for (String var: lset.keySet()) {
                    part1 = part1 + var + " in " + lset.get(var) + ",\n";
                }

                part1 = part1 + whereSentence.get(lidx) + " ";

                part1 = part1 +  "\n\t return <tuple>{\n\t";
                for (String var: lset.keySet()) {
                    part1 = part1 + "<" +  var + ">{" + var + "}</" + var + "> ,\n";
                }
                part1 = part1.substring(0, part1.length() - 3) + "\n\t}</tuple>" ;//remove , and \n

            } else {
                part1 = createSentence.get(lidx);
            }

            String part2 = "";
            if(createSentence.get(ridx) == "") {
                part2 = "for ";
                for (String var: rset.keySet()) {
                    part2 = part2 + var + " in " + rset.get(var) + ",\n";
                }
                part2 = part2 + whereSentence.get(ridx) + " ";

                part2 = part2 +  "\n\t return <tuple>{\n\t";
                for (String var: rset.keySet()) {
                    part2 = part2 + "<" +  var + ">{" + var + "}</" + var + "> ,\n";
                }
                part2 = part2.substring(0, part2.length() - 3)  + "\n\t}</tuple>";//remove , and \n
            } else {
                part2 = createSentence.get(ridx);
            }

            String fullsentence = "join ( ";
            fullsentence = fullsentence + part1 + ",\n " + part2 + ",\n";

            fullsentence += "[";
            for(String var : lBags)
                fullsentence = fullsentence + var.substring(1, var.length()) + ",";
           fullsentence = fullsentence.substring(0, fullsentence.length() - 1);
           fullsentence = fullsentence + "],\t";

            for(String var : rBags)
                fullsentence = fullsentence + var.substring(1, var.length()) + ",";
            fullsentence = fullsentence.substring(0, fullsentence.length() - 1);
            fullsentence = fullsentence + "],\n\t)";


            lset.putAll(rset);
            for(Map.Entry<String, String> entry : rset.entrySet()) {
                lset.put(entry.getKey(), entry.getValue());
                var2set.replace(entry.getKey(), lset);
            }
            sets.remove(ridx);

            createSentence.remove(ridx);
            whereSentence.remove(ridx);

            createSentence.set(lidx, fullsentence);
            whereSentence.set(lidx, "");
        }

        String fullsentence = createSentence.get(0);
        fullsentence = "for $tuple in" + fullsentence;

        returnClause = returnClause.getChild(1);
        int retVarSz = returnClause.getChildCount();
        for(int i = 0; i < retVarSz; i++) {
            fullsentence
        }





        return "";

    }

    public static void main(String[] args) {
        String Filepath  = "testFile";
        String xquery = "";
        String line;

        try {
            InputStream fis = new FileInputStream(Filepath);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            while ((line = br.readLine()) != null) {
                xquery = xquery + " " + line;
            }
        }   catch(Exception e) {

        }
        try {
            int sz = visitTree(xquery);

            System.out.println("Total Node size is " + sz);

        }
        catch (Exception e){

        }
        //int sz = visitTree(xquery);
        //System.out.println("Total Node size is " + sz);

    }
}