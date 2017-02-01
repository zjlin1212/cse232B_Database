/**
 * Created by lin on 2/1/17.
 */

import java.util.ArrayList;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;

public class xPathtest {
    public static void main(String[] args) {

        String Xpath = "doc(\"j_caesar.xml\")//(ACT,PERSONAE)/TITLE";
        ANTLRInputStream input = new ANTLRInputStream(Xpath);
        xpathLexer lexer = new xpathLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        xpathParser parser = new xpathParser(tokens);

        ParseTree tree = parser.ap();
        xpathMyVisitor eval = new xpathMyVisitor();

        ArrayList<Node> res = eval.visit(tree);
        for(Node node : res) {
            System.out.println(node.getNodeValue());
        }
    }
}