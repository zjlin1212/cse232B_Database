import java.io.File;
import java.util.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.Attr;

/**
 * Created by kaiyizhang on 1/31/17.
 */
public class xpathMyVisitor extends xpathBaseVisitor<ArrayList<Node>> {

    ArrayList<Node>  currentNodes  = new ArrayList<>();

    @Override
    public ArrayList<Node> visitDoc(xpathParser.DocContext ctx) {

        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dB = null;
        String fname = ctx.filename().getText();
        fname = fname.substring(1, fname.length() - 1);
        File fileXml = new File(fname);
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
        result.addAll(currentNodes);
        queue.addAll(currentNodes);
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            int curn = cur.getChildNodes().getLength();
            for(int i = 0; i < cur.getChildNodes().getLength(); i++) {
                result.add(cur.getChildNodes().item(i));
                queue.offer(cur.getChildNodes().item(i));
            }
        }
        //unique(result);
        currentNodes = result;
        ArrayList<Node> result2 = visit(ctx.rp());
        return result2;


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

            if(element.hasAttributes()){
                NamedNodeMap map = element.getAttributes();
                for(int i = 0; i < map.getLength(); i++) {
                    result.add(map.item(i));
                }

            }

        }
        currentNodes = new ArrayList<>(result);
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
                    if (e.getTagName().equals(ctx.String().getText())) {
                        result.add(child);
                    }
                }
            }
        }
        currentNodes = result;
        return result;
    }

    @Override
    public ArrayList<Node> visitRpPrthsis(xpathParser.RpPrthsisContext ctx) {

        return visit(ctx.rp());

    }

    @Override
    public ArrayList<Node> visitParent(xpathParser.ParentContext ctx) {
           ArrayList<Node>  result = new ArrayList<>();

           for(Node node : currentNodes) {
               Node parent = null;
               if(node.getNodeType() == Node.ATTRIBUTE_NODE){
                   parent =((Attr) node).getOwnerElement();
               }else {
                   parent = node.getParentNode();

               }
               if (!result.contains(parent)) {
                   result.add(parent);
               }
           }
           currentNodes = result;
           return result;
    }

    @Override
    public ArrayList<Node> visitRpfilter(xpathParser.RpfilterContext ctx) {

        visit(ctx.rp());
        ArrayList<Node> currentCopy = new ArrayList<>(currentNodes);

        ArrayList<Node> result = new ArrayList<>();
        for (Node n : currentCopy) {
            currentNodes.clear();
            currentNodes.add(n);
            if (!visit(ctx.filter()).isEmpty()) {
                result.add(n);
            }

        }

        currentNodes = result;
        return result;

    }



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

    @Override
     public ArrayList<Node> visitCurrent(xpathParser.CurrentContext ctx) {
        return currentNodes;
    }



    @Override public ArrayList<Node> visitRpAnd(xpathParser.RpAndContext ctx) {

            ArrayList<Node> currentCopy = new ArrayList<Node>(currentNodes);
            ArrayList<Node> result = visit(ctx.rp(0));
            ArrayList<Node> currentNodesForRp1 = new ArrayList<Node>(currentNodes);

            currentNodes = currentCopy;
            ArrayList<Node>  result2 = visit(ctx.rp(1));

            result.addAll(result2);
            currentNodes.addAll(currentNodesForRp1);
            return result;

    }

    @Override
    public ArrayList<Node> visitFilterEqual(xpathParser.FilterEqualContext ctx) {

        ArrayList<Node> temp = new ArrayList<>(currentNodes);
        ArrayList<Node> result1 = visit(ctx.rp(0));
        currentNodes = temp;
        ArrayList<Node> result2 = visit(ctx.rp(1));
        currentNodes = temp;
        for(Node node0 : result1){
            for(Node node1 : result2){
                if(node0.isEqualNode(node1)){
                     return temp;
                }
            }
        }

        return new ArrayList<>();
    }


    @Override public ArrayList<Node> visitFilterNot(xpathParser.FilterNotContext ctx) {
        ArrayList<Node> result = visit(ctx.filter());
        if(result.isEmpty()){
            return new ArrayList<>(currentNodes);
        }
        return new ArrayList<>();
    }

    @Override
    public ArrayList<Node> visitFilterOr(xpathParser.FilterOrContext ctx) {
        ArrayList<Node> result1 =  visit(ctx.filter(0));
        ArrayList<Node> result2 =  visit(ctx.filter(1));
        if(!result1.isEmpty()) {
            return result1;
        }
        if(!result2.isEmpty()) {
            return result2;
        }
        return new ArrayList<>();
    }


    @Override
    public ArrayList<Node> visitFilterAnd(xpathParser.FilterAndContext ctx) {
         ArrayList<Node> result1 =  visit(ctx.filter(0));
         ArrayList<Node> result2 =  visit(ctx.filter(1));
         if(result1.isEmpty() || result2.isEmpty()){
             return new ArrayList<>();
         }
         return result1;
    }



    @Override
    public ArrayList<Node> visitFilterRp(xpathParser.FilterRpContext ctx) {
        ArrayList<Node> temp = new ArrayList<>(currentNodes);
        ArrayList<Node>  result =  visit(ctx.rp());
        currentNodes = temp;
        if( result.isEmpty()) {
            return new ArrayList<>();
        } else {
            return result;
        }

    }

    @Override
    public ArrayList<Node> visitFilterPrthsis(xpathParser.FilterPrthsisContext ctx) {
        return visit(ctx.filter());
    }

    @Override
    public ArrayList<Node> visitFilterIs(xpathParser.FilterIsContext ctx) {
        ArrayList<Node> temp = new ArrayList<>(currentNodes);
        ArrayList<Node> result1 = visit(ctx.rp(0));
        currentNodes = temp;
        ArrayList<Node> result2 = visit(ctx.rp(1));
        currentNodes = temp;
        for(Node node0 : result1){
            for(Node node1 : result2){
                if(node0 == node1){
                    return temp;
                }
            }
        }

        return new ArrayList<>();
    }


    @Override public ArrayList<Node> visitFilename(xpathParser.FilenameContext ctx) { return visitChildren(ctx); }
}
