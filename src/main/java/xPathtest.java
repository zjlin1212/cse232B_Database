/**
 * Created by lin on 2/1/17.
 */

import java.util.ArrayList;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;

public class xPathtest {
    public static void main(String[] args) {

        String Xpath = "doc(\"j_caesar.xml\")//ACT[(./TITLE)eq(./TITLE)]";
        ANTLRInputStream input = new ANTLRInputStream(Xpath);
        xpathLexer lexer = new xpathLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        xpathParser parser = new xpathParser(tokens);

        ParseTree tree = parser.ap();
        xpathMyVisitor eval = new xpathMyVisitor();

        ArrayList<Node> res = eval.visit(tree);
        System.out.println(res.size());
        for(Node node : res) {
            System.out.println(node.getNodeName() + " " + node.getNodeValue());

            for(int i = 0; i < node.getChildNodes().getLength(); i++){
                if(node.getChildNodes().item(i).getNodeType() == Node.TEXT_NODE){
                    System.out.println(node.getChildNodes().item(i).getNodeValue());
                }

            }

        }
    }
}