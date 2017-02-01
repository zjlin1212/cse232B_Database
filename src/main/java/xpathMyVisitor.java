import java.io.File;
import java.util.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * Created by kaiyizhang on 1/31/17.
 */
public class xpathMyVisitor extends xpathBaseVisitor<ArrayList<Node>> {

    ArrayList<Node>  currentNodes  = new ArrayList<>();

    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */




    @Override
    public ArrayList<Node> visitApRoot(xpathParser.ApRootContext ctx) {
        ArrayList<Node> result;
        visit(ctx.doc());
        result = visit(ctx.rp());
        currentNodes = result;
        return result;
    }

    @Override
        public ArrayList<Node> visitApCurrent(xpathParser.ApCurrentContext ctx) {
        ArrayList<Node> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        visit(ctx.doc());

        currentNodes = result;
        return visit(ctx.rp());


    }

    @Override
    public ArrayList<Node> visitAll(xpathParser.AllContext ctx) {
         ArrayList<Node> result = new ArrayList<>();
         for(Node n : currentNodes){
             for(int i = 0; i < n.getChildNodes().getLength(); i++) {
                 if( n.getNodeType() != Node.TEXT_NODE &&  n.getNodeType() != Node.ATTRIBUTE_NODE) {
                     result.add(n.getChildNodes().item(i));
                 }
             }
         }
         currentNodes = result;
         return result;
    }

    @Override
    public ArrayList<Node> visitRproot(xpathParser.RprootContext ctx) { // --- (/)

        visit(ctx.rp(0));
        ArrayList<Node>  tempResult = visit(ctx.rp(1));

        ArrayList<Node>  result= new ArrayList<>();
        for(Node node : tempResult){
            if(!result.contains(node)){
                result.add(node);
            }
        }

        return result;

    }

    @Override
    public ArrayList<Node>  visitRpcurrent(xpathParser.RpcurrentContext ctx) {  // ----- (//)

        visit(ctx.rp(0));

        ArrayList<Node> tempResult = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        tempResult.addAll(currentNodes);
        queue.addAll(currentNodes);
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            for(int i = 0; i < cur.getChildNodes().getLength(); i++) {
                tempResult.add(cur.getChildNodes().item(i));
                queue.offer(cur.getChildNodes().item(i));
            }
        }

        currentNodes = tempResult;


        tempResult = visit(ctx.rp(1));

        ArrayList<Node>  result= new ArrayList<>();
        for(Node node : tempResult){
            if(!result.contains(node)){
                result.add(node);
            }
        }

        return result;
    }

    @Override
    public ArrayList<Node> visitAttName(xpathParser.AttNameContext ctx) {
        ArrayList<Node> result = new ArrayList<>();
        for(Node node : currentNodes){
            Element element = (Element) node;
            String value = element.getAttribute(ctx.String().getText());
            if(!value.isEmpty()){
                result.add(node);
            }

        }

        return result;
    }

    @Override
    public ArrayList<Node> visitTagName(xpathParser.TagNameContext ctx) {
        ArrayList<Node> result = new ArrayList<>();
        for(Node cur : currentNodes){
            for(int i = 0; i < cur.getChildNodes().getLength(); i++) {
                Node child = cur.getChildNodes().item(i);
                if (child.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) child;
                    if(e.getTagName().equals(ctx.String().getText())) ;
                }
                result.add(child);
            }
        }
        currentNodes = result;
        return result;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ArrayList<Node> visitRpPrthsis(xpathParser.RpPrthsisContext ctx) {

        return visit(ctx.rp());

    }

    @Override
    public ArrayList<Node> visitParent(xpathParser.ParentContext ctx) {
           ArrayList<Node>  result = new ArrayList<>();

           for(Node node : currentNodes) {
               Node parent = node.getParentNode();
               if (!result.contains(parent)) {
                   result.add(parent);
               }
           }
           currentNodes = result;
           return result;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ArrayList<Node> visitRpfilter(xpathParser.RpfilterContext ctx) { return visitChildren(ctx); }


    public ArrayList<Node> visitText(xpathParser.TextContext ctx) {
        ArrayList<Node> result = new ArrayList<>();
        for(Node node : currentNodes){
                for (int i = 0; i < node.getChildNodes().getLength(); i++) {
                    Node cur = node.getChildNodes().item(i);
                    if(cur.getNodeType() == Node.TEXT_NODE && !cur.getNodeValue().isEmpty() && !cur.getNodeValue().equals("\n") ) {
                          result.add(cur);
                    }
                }
        }

        return result;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
     public ArrayList<Node> visitCurrent(xpathParser.CurrentContext ctx) {
        return currentNodes;
    }




    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ArrayList<Node> visitRpAnd(xpathParser.RpAndContext ctx) {

            ArrayList<Node> currentCopy = new ArrayList<Node>(currentNodes);
            ArrayList<Node> result = visit(ctx.rp(0));

            currentNodes = currentCopy;

            result.addAll(visit(ctx.rp(1)));

            return result;

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ArrayList<Node> visitFilterEqual(xpathParser.FilterEqualContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ArrayList<Node> visitFilterNot(xpathParser.FilterNotContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ArrayList<Node> visitFilterOr(xpathParser.FilterOrContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ArrayList<Node> visitFilterAnd(xpathParser.FilterAndContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ArrayList<Node> visitFilterRp(xpathParser.FilterRpContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ArrayList<Node> visitFilterPrthsis(xpathParser.FilterPrthsisContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ArrayList<Node> visitFilterIs(xpathParser.FilterIsContext ctx) { return visitChildren(ctx); }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ArrayList<Node> visitDoc(xpathParser.DocContext ctx) {

        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dB = null;
        File fileXml = new File(ctx.filename().getText());
        Document doc = null;
        ArrayList<Node> result = new ArrayList<>();

        try {
            dB = docBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        try {
            if (dB != null) {
                doc = dB.parse(fileXml);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        if (doc != null) {
            doc.getDocumentElement().normalize();
        }

        result.add(doc);
        currentNodes = result;
        return result;



    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ArrayList<Node> visitFilename(xpathParser.FilenameContext ctx) { return visitChildren(ctx); }
}
