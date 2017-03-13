/**
 * Created by lin on 2/1/17.
 */

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
import java.util.ArrayList;


public class  xQuerytest {
    
    private static int visitTree(String Xpath) throws Exception{
   // private static int visitTree(String Xpath) {

    ANTLRInputStream input = new ANTLRInputStream(Xpath);
        xqueryLexer lexer = new xqueryLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        xqueryParser parser = new xqueryParser(tokens);

        ParseTree tree = parser.query();

        // rewrite
        String rewriteQuery = rewrite(tree);
        if(!rewriteQuery.isEmpty()) {
            try {

                BufferedWriter out = new BufferedWriter(new FileWriter("rewrittenQuery.txt"));
                out.write(rewriteQuery);
                out.close();
            }
            catch (IOException e)
            {
                System.out.println("Output Exception");
            }
            input = new ANTLRInputStream(rewriteQuery);
            lexer = new xqueryLexer(input);
            tokens = new CommonTokenStream(lexer);
            parser = new xqueryParser(tokens);
            tree = parser.query();
        }


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