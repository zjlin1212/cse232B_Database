// Generated from xpath.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xpathParser}.
 */
public interface xpathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code apRoot}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApRoot(xpathParser.ApRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apRoot}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApRoot(xpathParser.ApRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apCurrent}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApCurrent(xpathParser.ApCurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apCurrent}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApCurrent(xpathParser.ApCurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code All}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAll(xpathParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code All}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAll(xpathParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rpcurrent}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpcurrent(xpathParser.RpcurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rpcurrent}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpcurrent(xpathParser.RpcurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttName}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttName(xpathParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttName}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttName(xpathParser.AttNameContext ctx);
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
	 * Enter a parse tree produced by the {@code RpPrthsis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpPrthsis(xpathParser.RpPrthsisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpPrthsis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpPrthsis(xpathParser.RpPrthsisContext ctx);
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
	 * Enter a parse tree produced by the {@code Rpfilter}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpfilter(xpathParser.RpfilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rpfilter}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpfilter(xpathParser.RpfilterContext ctx);
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
	 * Enter a parse tree produced by the {@code Rproot}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRproot(xpathParser.RprootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rproot}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRproot(xpathParser.RprootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpAnd}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpAnd(xpathParser.RpAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpAnd}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpAnd(xpathParser.RpAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterEqual}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterEqual(xpathParser.FilterEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterEqual}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterEqual(xpathParser.FilterEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterNot(xpathParser.FilterNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterNot(xpathParser.FilterNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterOr(xpathParser.FilterOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterOr(xpathParser.FilterOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterAnd(xpathParser.FilterAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterAnd(xpathParser.FilterAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterRp(xpathParser.FilterRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterRp(xpathParser.FilterRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterPrthsis}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterPrthsis(xpathParser.FilterPrthsisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterPrthsis}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterPrthsis(xpathParser.FilterPrthsisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterIs}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterIs(xpathParser.FilterIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterIs}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterIs(xpathParser.FilterIsContext ctx);
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
	 * Enter a parse tree produced by {@link xpathParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(xpathParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(xpathParser.FilenameContext ctx);
}