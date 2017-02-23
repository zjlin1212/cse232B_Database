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
 * Created by kaiyizhang on 2/14/17.
 */
public class xqueryMyVisitor extends xqueryBaseVisitor<ArrayList<Node>> {
    private HashMap<String, ArrayList<Node>> varMap = new HashMap<>();
    private ArrayList<Node> currentNodes = new ArrayList<>();
    private Stack<HashMap<String, ArrayList<Node>>> mapHistory = new Stack<>();
    Document inputDoc, outputDoc;

    private Node makeElem(String tagName, ArrayList<Node> listOfNode) {
        Node e = outputDoc.createElement(tagName);
        for (Node node : listOfNode) {
            if (node != null) {
                Node importedNode = outputDoc.importNode(node, true);
                e.appendChild(importedNode);
            }
        }
        return e;
    }

    private Node makeText(String s) {
        Document dc = inputDoc;
        return dc.createTextNode(s);

    }

    @Override
    public ArrayList<Node> visitQuery(xqueryParser.QueryContext ctx) {
        return visit(ctx.xq());
    }
    @Override
    public ArrayList<Node> visitDoc(xqueryParser.DocContext ctx) {
        ArrayList<Node> result = new ArrayList<>();
        if (inputDoc == null) {
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dB = null;
            String seeme = ctx.filename().getText();
            File fileXml = new File(ctx.filename().getText());
            Document doc = null;


            try {
                dB = docBuilderFactory.newDocumentBuilder();
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            }

            try {
                if (dB != null) {
                    inputDoc = dB.parse(fileXml);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            inputDoc.getDocumentElement().normalize();

        }
        result.add(inputDoc);
        currentNodes = result;
        return result;
    }

    @Override
    public ArrayList<Node> visitXqVar(xqueryParser.XqVarContext ctx) {

        return varMap.get(ctx.var().getText());

    }

    @Override
    public ArrayList<Node> visitXqString(xqueryParser.XqStringContext ctx) {
        String cons = ctx.StringConstant().getText();
        String s = cons.substring(1, cons.length() - 1);
        ArrayList<Node> result = new ArrayList<>();
        result.add(makeText(s));
        return result;


    }

    @Override
    public ArrayList<Node> visitXqAp(xqueryParser.XqApContext ctx) {
        return visit(ctx.ap());
    }

    @Override
    public ArrayList<Node> visitApRoot(xqueryParser.ApRootContext ctx) {
        ArrayList<Node> result;
        visit(ctx.doc());
        result = visit(ctx.rp());
        currentNodes = result;
        return result;
    }

    @Override
    public ArrayList<Node> visitApCurrent(xqueryParser.ApCurrentContext ctx) {
        ArrayList<Node> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        visit(ctx.doc());
        result.addAll(currentNodes);
        queue.addAll(currentNodes);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();

            for (int i = 0; i < cur.getChildNodes().getLength(); i++) {
                result.add(cur.getChildNodes().item(i));
                queue.offer(cur.getChildNodes().item(i));
            }
        }

        currentNodes = result;
        ArrayList<Node> result2 = visit(ctx.rp());
        return result2;
    }


    @Override
    public ArrayList<Node> visitXqParenthesis(xqueryParser.XqParenthesisContext ctx) {
        return visit(ctx.xq());
    }


    @Override
    public ArrayList<Node> visitXqComma(xqueryParser.XqCommaContext ctx) {
        ArrayList<Node> result = visit(ctx.xq(0));
        result.addAll(visit(ctx.xq(1)));
        return result;
    }


    @Override
    public ArrayList<Node> visitXqSlash(xqueryParser.XqSlashContext ctx) {
        ArrayList<Node> temp = visit(ctx.xq());
        currentNodes = new ArrayList<>(temp);
        ArrayList<Node> resultWithDup = visit(ctx.rp());
        ArrayList<Node> result = new ArrayList<>();

        for (Node n : resultWithDup) {
            if (!result.contains(n)) {
                result.add(n);
            }
        }
        return result;
    }

    @Override
    public ArrayList<Node> visitXq2Slash(xqueryParser.Xq2SlashContext ctx) {
        ArrayList<Node> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Node> startNodes = visit(ctx.xq());

        result.addAll(startNodes);
        queue.addAll(startNodes);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            for (int i = 0; i < cur.getChildNodes().getLength(); i++) {
                result.add(cur.getChildNodes().item(i));
                queue.offer(cur.getChildNodes().item(i));
            }
        }

        currentNodes = result;
        ArrayList<Node> resultWithDup = visit(ctx.rp());
        ArrayList<Node> resultNoDup = new ArrayList<>();
        for (Node n : resultWithDup) {
            if (!resultNoDup.contains(n)) {
                resultNoDup.add(n);
            }
        }

        return resultNoDup;
    }

    @Override
    public ArrayList<Node> visitXqMakeElement(xqueryParser.XqMakeElementContext ctx) {
        if (outputDoc == null) {
            try {
                DocumentBuilderFactory docBF = DocumentBuilderFactory.newInstance();
                DocumentBuilder docB = docBF.newDocumentBuilder();
                outputDoc = docB.newDocument();
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            }
        }
        ArrayList<Node> result = new ArrayList<>();
        ArrayList<Node> xqRes = visit(ctx.xq());
        result.add(makeElem(ctx.String(0).getText(), xqRes));

        return result;
    }


    // Conditions
    @Override
    public ArrayList<Node> visitCondEq(xqueryParser.CondEqContext ctx) {
        ArrayList<Node> temp = new ArrayList<>(currentNodes);
        ArrayList<Node> result1 = visit(ctx.xq(0));
        currentNodes = temp;
        ArrayList<Node> result2 = visit(ctx.xq(1));
        currentNodes = temp;
        for (Node node0 : result1) {
            for (Node node1 : result2) {
                if (node0.isEqualNode(node1)) {
                    ArrayList<Node> list = new ArrayList<>();
                    Node tmp = null;
                    list.add(tmp);
                    return list;
                }
            }
        }

        return new ArrayList<>();
    }

    @Override
    public ArrayList<Node> visitCondIs(xqueryParser.CondIsContext ctx) {
        ArrayList<Node> temp = new ArrayList<>(currentNodes);
        ArrayList<Node> result1 = visit(ctx.xq(0));
        currentNodes = temp;
        ArrayList<Node> result2 = visit(ctx.xq(1));
        currentNodes = temp;
        for (Node node0 : result1) {
            for (Node node1 : result2) {
                if (node0 == node1) {
                    ArrayList<Node> list = new ArrayList<>();
                    Node tmp = null;
                    list.add(tmp);
                    return list;
                }
            }
        }

        return new ArrayList<>();
    }

    @Override
    public ArrayList<Node> visitCondParenthesis(xqueryParser.CondParenthesisContext ctx) {
        return visit(ctx.cond());
    }

    @Override
    public ArrayList<Node> visitCondIsEmpty(xqueryParser.CondIsEmptyContext ctx) {
        ArrayList<Node> result = visit(ctx.xq());
        if (result.isEmpty()) {
            ArrayList<Node> list = new ArrayList<>();
            Node tmp = null;
            list.add(tmp);
            return list;
        }
        return new ArrayList<>();
    }

    @Override
    public ArrayList<Node> visitCondNot(xqueryParser.CondNotContext ctx) {
        ArrayList<Node> result = visit(ctx.cond());
        if (result.isEmpty()) {
            ArrayList<Node> list = new ArrayList<>();
            Node tmp = null;
            list.add(tmp);
            return list;
        }
        return new ArrayList<>();
    }

    @Override
    public ArrayList<Node> visitCondAnd(xqueryParser.CondAndContext ctx) {
        ArrayList<Node> result1 = visit(ctx.cond(0));
        ArrayList<Node> result2 = visit(ctx.cond(1));
        if (result1.isEmpty() || result2.isEmpty()) {
            return new ArrayList<>();
        }
        return result1;
    }

    @Override
    public ArrayList<Node> visitCondOr(xqueryParser.CondOrContext ctx) {
        ArrayList<Node> result1 = visit(ctx.cond(0));
        ArrayList<Node> result2 = visit(ctx.cond(1));
        if (!result1.isEmpty()) {
            return result1;
        }
        if (!result2.isEmpty()) {
            return result2;
        }
        return new ArrayList<>();
    }

    @Override
    public ArrayList<Node> visitCondSome(xqueryParser.CondSomeContext ctx) {
        for (int i = 0; i < ctx.var().size(); i++) {
            varMap.put(ctx.var(i).getText(), visit(ctx.xq(i)));
        }
        return visit(ctx.cond());
    }

    @Override
    public ArrayList<Node> visitReturnClause(xqueryParser.ReturnClauseContext ctx) {
        return visit(ctx.xq());
    }


    @Override
    public ArrayList<Node> visitWhereClause(xqueryParser.WhereClauseContext ctx) {
        return visit(ctx.cond());
    }

    @Override
    public ArrayList<Node> visitLetClause(xqueryParser.LetClauseContext ctx) {
        for (int i = 0; i < ctx.var().size(); i++) {
            varMap.put(ctx.var(i).getText(), visit(ctx.xq(i)));
        }
        return null;
    }

    @Override
    public ArrayList<Node> visitXqLet(xqueryParser.XqLetContext ctx) {
        HashMap<String, ArrayList<Node>> oldMap = new HashMap<>(varMap);
        mapHistory.push(oldMap);
        visit(ctx.letClause());
        ArrayList<Node> result = visit(ctx.xq());
        varMap = mapHistory.pop();
        return result;
    }



    @Override
    public ArrayList<Node> visitXqFor(xqueryParser.XqForContext ctx) {
        ArrayList<Node> result =  new ArrayList<>();
        HashMap<String, ArrayList<Node>> oldMap = new HashMap<>(varMap);
        mapHistory.push(oldMap);

        recurForClusOnIdx(ctx, 0, result);
        varMap = mapHistory.pop();
        currentNodes = result;
        return result;
    }


    private void recurForClusOnIdx(xqueryParser.XqForContext ctx , int idx, ArrayList<Node> result) {

        int sz = ctx.forClause().var().size();

        if (idx == sz) {
            HashMap<String, ArrayList<Node>> oldMap = new HashMap<>(varMap);
            mapHistory.push(oldMap);
            if(ctx.letClause() != null) {
                visit(ctx.letClause());
            }
            if(ctx.whereClause() != null) {
                ArrayList<Node> whereRes = visit(ctx.whereClause());
                if(!whereRes.isEmpty()){
                    result.addAll(visit(ctx.returnClause()));
                }
            }
            else {
                result.addAll(visit(ctx.returnClause()));
            }
            varMap = mapHistory.pop();

            return;

        }

        else {

            ArrayList<Node> curList = visit(ctx.forClause().xq(idx));


            for (Node temp : curList) {
                HashMap<String, ArrayList<Node>> oldMap = new HashMap<>(varMap);
                mapHistory.push(oldMap);

                ArrayList<Node> tmpList = new ArrayList<>();
                tmpList.add(temp);

                varMap.put(ctx.forClause().var(idx).getText(), tmpList);

                recurForClusOnIdx(ctx, idx + 1, result);
                varMap = mapHistory.pop();
            }
            return;
        }
    }


/*
    @Override
    public ArrayList<Node> visitForClause(xqueryParser.ForClauseContext ctx) {
        ArrayList<Node> result = new ArrayList<>();
        result.addAll(recurForClusOnIdx(ctx, 0));
        return result;
    }
    */

    @Override
    public ArrayList<Node> visitAll(xqueryParser.AllContext ctx) {

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
    public ArrayList<Node> visitRpcurrent(xqueryParser.RpcurrentContext ctx) {
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
    public ArrayList<Node> visitAttName(xqueryParser.AttNameContext ctx) {
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
    public ArrayList<Node> visitTagName(xqueryParser.TagNameContext ctx) {

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
    public ArrayList<Node> visitRpPrthsis(xqueryParser.RpPrthsisContext ctx) {
        return visit(ctx.rp());
    }


    @Override
    public ArrayList<Node> visitParent(xqueryParser.ParentContext ctx) {

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
    public ArrayList<Node> visitRpfilter(xqueryParser.RpfilterContext ctx) {
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


    @Override
    public ArrayList<Node> visitText(xqueryParser.TextContext ctx) {
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
    public ArrayList<Node> visitCurrent(xqueryParser.CurrentContext ctx) {
        return currentNodes;
    }


    @Override
    public ArrayList<Node> visitRproot(xqueryParser.RprootContext ctx) {

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
    public ArrayList<Node> visitRpAnd(xqueryParser.RpAndContext ctx) {

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
    public ArrayList<Node> visitFilterEqual(xqueryParser.FilterEqualContext ctx) {

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


    @Override
    public ArrayList<Node> visitFilterNot(xqueryParser.FilterNotContext ctx) {

        ArrayList<Node> result = visit(ctx.filter());
        if(result.isEmpty()){
            return new ArrayList<>(currentNodes);
        }
        return new ArrayList<>();
    }


    @Override
    public ArrayList<Node> visitFilterOr(xqueryParser.FilterOrContext ctx) {

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
    public ArrayList<Node> visitFilterAnd(xqueryParser.FilterAndContext ctx) {

        ArrayList<Node> result1 =  visit(ctx.filter(0));
        ArrayList<Node> result2 =  visit(ctx.filter(1));
        if(result1.isEmpty() || result2.isEmpty()){
            return new ArrayList<>();
        }
        return result1;
    }


    @Override
    public ArrayList<Node> visitFilterRp(xqueryParser.FilterRpContext ctx) {

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
    public ArrayList<Node> visitFilterPrthsis(xqueryParser.FilterPrthsisContext ctx) {

        return visit(ctx.filter());
    }


    @Override
    public ArrayList<Node> visitFilterIs(xqueryParser.FilterIsContext ctx) {

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



    @Override
    public ArrayList<Node> visitFilename(xqueryParser.FilenameContext ctx) {
        return visitChildren(ctx);
    }
}