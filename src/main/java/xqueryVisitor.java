// Generated from xquery.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link xqueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface xqueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link xqueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(xqueryParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqComma}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqComma(xqueryParser.XqCommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqAp}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqAp(xqueryParser.XqApContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqVar}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqVar(xqueryParser.XqVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqParenthesis}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqParenthesis(xqueryParser.XqParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqSlash}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqSlash(xqueryParser.XqSlashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xq2Slash}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq2Slash(xqueryParser.Xq2SlashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqString}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqString(xqueryParser.XqStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqMakeElement}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqMakeElement(xqueryParser.XqMakeElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqFor}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqFor(xqueryParser.XqForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqLet}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqLet(xqueryParser.XqLetContext ctx);
	/**
	 * Visit a parse tree produced by {@link xqueryParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(xqueryParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link xqueryParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(xqueryParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link xqueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(xqueryParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link xqueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(xqueryParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link xqueryParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(xqueryParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondOr}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOr(xqueryParser.CondOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondIsEmpty}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondIsEmpty(xqueryParser.CondIsEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondAnd}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondAnd(xqueryParser.CondAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondSome}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondSome(xqueryParser.CondSomeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondIs}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondIs(xqueryParser.CondIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondParenthesis}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondParenthesis(xqueryParser.CondParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondNot}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondNot(xqueryParser.CondNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondEq}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEq(xqueryParser.CondEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apRoot}
	 * labeled alternative in {@link xqueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApRoot(xqueryParser.ApRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apCurrent}
	 * labeled alternative in {@link xqueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApCurrent(xqueryParser.ApCurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code All}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(xqueryParser.AllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rpcurrent}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpcurrent(xqueryParser.RpcurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttName}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(xqueryParser.AttNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(xqueryParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpPrthsis}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpPrthsis(xqueryParser.RpPrthsisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(xqueryParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rpfilter}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpfilter(xqueryParser.RpfilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(xqueryParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent(xqueryParser.CurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rproot}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRproot(xqueryParser.RprootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpAnd}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpAnd(xqueryParser.RpAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterEqual}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEqual(xqueryParser.FilterEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterNot(xqueryParser.FilterNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterOr(xqueryParser.FilterOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterAnd(xqueryParser.FilterAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterRp(xqueryParser.FilterRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterPrthsis}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterPrthsis(xqueryParser.FilterPrthsisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterIs}
	 * labeled alternative in {@link xqueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterIs(xqueryParser.FilterIsContext ctx);
	/**
	 * Visit a parse tree produced by {@link xqueryParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(xqueryParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link xqueryParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(xqueryParser.FilenameContext ctx);
}