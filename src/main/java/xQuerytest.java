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


public class xQuerytest {
    private static int visitTree(String Xpath) throws Exception{
        ANTLRInputStream input = new ANTLRInputStream(Xpath);
        xpathLexer lexer = new xpathLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        xpathParser parser = new xpathParser(tokens);

        ParseTree tree = parser.ap();
        xpathMyVisitor eval = new xpathMyVisitor();

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


    public static void main(String[] args) {
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
                int sz = visitTree(files.get(0));
                System.out.println("Total Node size is " + sz);

        }
        catch (Exception e){

        }
    }
}