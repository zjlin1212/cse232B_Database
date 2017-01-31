// Generated from xpath.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xpathParser}.
 */
public interface xpathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ApChildren}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApChildren(xpathParser.ApChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApChildren}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApChildren(xpathParser.ApChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ApAll}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApAll(xpathParser.ApAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApAll}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApAll(xpathParser.ApAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(xpathParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(xpathParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#fname}.
	 * @param ctx the parse tree
	 */
	void enterFname(xpathParser.FnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#fname}.
	 * @param ctx the parse tree
	 */
	void exitFname(xpathParser.FnameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAllChildren(xpathParser.AllChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAllChildren(xpathParser.AllChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpwithP}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpwithP(xpathParser.RpwithPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpwithP}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpwithP(xpathParser.RpwithPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagName(xpathParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagName(xpathParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpAll}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpAll(xpathParser.RpAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpAll}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpAll(xpathParser.RpAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParent(xpathParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParent(xpathParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(xpathParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(xpathParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpChildren}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpChildren(xpathParser.RpChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpChildren}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpChildren(xpathParser.RpChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Text}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterText(xpathParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitText(xpathParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Current}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCurrent(xpathParser.CurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCurrent(xpathParser.CurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoRp}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTwoRp(xpathParser.TwoRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoRp}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTwoRp(xpathParser.TwoRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpFilter(xpathParser.RpFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpFilter(xpathParser.RpFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilAnd}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilAnd(xpathParser.FilAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilAnd}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilAnd(xpathParser.FilAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilEqual}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilEqual(xpathParser.FilEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilEqual}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilEqual(xpathParser.FilEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilNot}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilNot(xpathParser.FilNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilNot}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilNot(xpathParser.FilNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilOr}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilOr(xpathParser.FilOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilOr}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilOr(xpathParser.FilOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilIs}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilIs(xpathParser.FilIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilIs}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilIs(xpathParser.FilIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilwithP}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilwithP(xpathParser.FilwithPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilwithP}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilwithP(xpathParser.FilwithPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilRp}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilRp(xpathParser.FilRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilRp}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilRp(xpathParser.FilRpContext ctx);
}