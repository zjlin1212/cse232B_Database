// Generated from xpath.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link xpathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface xpathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code apRoot}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApRoot(xpathParser.ApRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apCurrent}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApCurrent(xpathParser.ApCurrentContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(xpathParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(xpathParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code All}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(xpathParser.AllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rpcurrent}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpcurrent(xpathParser.RpcurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttName}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(xpathParser.AttNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(xpathParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpPrthsis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpPrthsis(xpathParser.RpPrthsisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(xpathParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rpfilter}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpfilter(xpathParser.RpfilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(xpathParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent(xpathParser.CurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rproot}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRproot(xpathParser.RprootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpAnd}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpAnd(xpathParser.RpAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterEqual}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEqual(xpathParser.FilterEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterNot(xpathParser.FilterNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterOr(xpathParser.FilterOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterAnd(xpathParser.FilterAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterRp(xpathParser.FilterRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterPrthsis}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterPrthsis(xpathParser.FilterPrthsisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterIs}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterIs(xpathParser.FilterIsContext ctx);
}