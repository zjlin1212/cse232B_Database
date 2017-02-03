/**
 * Created by lin on 2/1/17.
 */

import java.io.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;


public class xPathtest {
    private static int visitTree(String Xpath, PrintWriter writer) throws Exception{
        ANTLRInputStream input = new ANTLRInputStream(Xpath);
        xpathLexer lexer = new xpathLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        xpathParser parser = new xpathParser(tokens);

        ParseTree tree = parser.ap();
        xpathMyVisitor eval = new xpathMyVisitor();

        ArrayList<Node> res = eval.visit(tree);
        writer.println("Total Node size is " + res.size());
        for(Node node : res) {
            //System.out.println(node.getNodeName() + " " + node.getNodeValue());
            writer.println(node.getNodeName() + " " + node.getNodeValue());
            for(int i = 0; i < node.getChildNodes().getLength(); i++){
                if(node.getChildNodes().item(i).getNodeType() == Node.TEXT_NODE){
                    //System.out.println(node.getChildNodes().item(i).getNodeValue());
                    writer.println(node.getChildNodes().item(i).getNodeValue());
                }
                if(node.getChildNodes().item(i).getNodeType() == Node.ATTRIBUTE_NODE){
                    writer.println(node.getChildNodes().item(i).getAttributes());
                }

            }

        }
        return res.size();
    }
    public static void main(String[] args) {

        //String Xpath = "doc(\"j_caesar.xml\")//ACT[(./TITLE)eq(./TITLE)]";
        //ANTLRInputStream input = new ANTLRInputStream(Xpath);

        String Filepath  = "testFile";
        ArrayList<String> files = new ArrayList<>();
        String line;

        try {
            InputStream fis = new FileInputStream(Filepath);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            while ((line = br.readLine()) != null) {
                files.add(line);
            }
        }   catch(Exception e) {

        }
        try {
            PrintWriter writer = new PrintWriter("outputFile", "UTF-8");
            for(int i = 0; i < files.size(); i++) {
                writer.println("\n\nResult for test case "+ i);

                int sz = visitTree(files.get(i), writer);
                System.out.println("Total Node size is " + sz);

            }
            writer.close();
        }
        catch (Exception e){

        }


    }
}