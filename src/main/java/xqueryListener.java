// Generated from xquery.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xqueryParser}.
 */
public interface xqueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link xqueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(xqueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(xqueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqComma}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqComma(xqueryParser.XqCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqComma}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqComma(xqueryParser.XqCommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqAp}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqAp(xqueryParser.XqApContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqAp}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqAp(xqueryParser.XqApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqVar}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqVar(xqueryParser.XqVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqVar}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqVar(xqueryParser.XqVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqParenthesis}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqParenthesis(xqueryParser.XqParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqParenthesis}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqParenthesis(xqueryParser.XqParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqSlash}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqSlash(xqueryParser.XqSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqSlash}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqSlash(xqueryParser.XqSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq2Slash}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq2Slash(xqueryParser.Xq2SlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq2Slash}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq2Slash(xqueryParser.Xq2SlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqString}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqString(xqueryParser.XqStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqString}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqString(xqueryParser.XqStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqMakeElement}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqMakeElement(xqueryParser.XqMakeElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqMakeElement}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqMakeElement(xqueryParser.XqMakeElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqFor}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqFor(xqueryParser.XqForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqFor}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqFor(xqueryParser.XqForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqLet}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqLet(xqueryParser.XqLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqLet}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqLet(xqueryParser.XqLetContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(xqueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(xqueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(xqueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(xqueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(xqueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(xqueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(xqueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(xqueryParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(xqueryParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(xqueryParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondOr}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondOr(xqueryParser.CondOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondOr}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondOr(xqueryParser.CondOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondIsEmpty}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondIsEmpty(xqueryParser.CondIsEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondIsEmpty}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondIsEmpty(xqueryParser.CondIsEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondAnd}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondAnd(xqueryParser.CondAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondAnd}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondAnd(xqueryParser.CondAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondSome}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondSome(xqueryParser.CondSomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondSome}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondSome(xqueryParser.CondSomeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondIs}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondIs(xqueryParser.CondIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondIs}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondIs(xqueryParser.CondIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondParenthesis}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondParenthesis(xqueryParser.CondParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondParenthesis}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondParenthesis(xqueryParser.CondParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondNot}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondNot(xqueryParser.CondNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondNot}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondNot(xqueryParser.CondNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondEq}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEq(xqueryParser.CondEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondEq}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEq(xqueryParser.CondEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apRoot}
	 * labeled alternative in {@link xqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApRoot(xqueryParser.ApRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apRoot}
	 * labeled alternative in {@link xqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApRoot(xqueryParser.ApRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apCurrent}
	 * labeled alternative in {@link xqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApCurrent(xqueryParser.ApCurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apCurrent}
	 * labeled alternative in {@link xqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApCurrent(xqueryParser.ApCurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code All}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAll(xqueryParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code All}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAll(xqueryParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rpcurrent}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpcurrent(xqueryParser.RpcurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rpcurrent}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpcurrent(xqueryParser.RpcurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttName}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttName(xqueryParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttName}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttName(xqueryParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagName(xqueryParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagName(xqueryParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpPrthsis}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpPrthsis(xqueryParser.RpPrthsisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpPrthsis}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpPrthsis(xqueryParser.RpPrthsisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParent(xqueryParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParent(xqueryParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rpfilter}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpfilter(xqueryParser.RpfilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rpfilter}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpfilter(xqueryParser.RpfilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Text}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterText(xqueryParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitText(xqueryParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Current}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCurrent(xqueryParser.CurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCurrent(xqueryParser.CurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rproot}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRproot(xqueryParser.RprootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rproot}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRproot(xqueryParser.RprootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpAnd}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpAnd(xqueryParser.RpAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpAnd}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpAnd(xqueryParser.RpAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterEqual}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterEqual(xqueryParser.FilterEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterEqual}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterEqual(xqueryParser.FilterEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterNot(xqueryParser.FilterNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterNot(xqueryParser.FilterNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterOr(xqueryParser.FilterOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterOr(xqueryParser.FilterOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterAnd(xqueryParser.FilterAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterAnd(xqueryParser.FilterAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterRp(xqueryParser.FilterRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterRp(xqueryParser.FilterRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterPrthsis}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterPrthsis(xqueryParser.FilterPrthsisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterPrthsis}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterPrthsis(xqueryParser.FilterPrthsisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterIs}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterIs(xqueryParser.FilterIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterIs}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterIs(xqueryParser.FilterIsContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(xqueryParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(xqueryParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(xqueryParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(xqueryParser.FilenameContext ctx);
}