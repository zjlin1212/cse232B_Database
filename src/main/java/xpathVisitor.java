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
	 * Visit a parse tree produced by the {@code ApChildren}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApChildren(xpathParser.ApChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ApAll}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApAll(xpathParser.ApAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(xpathParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathParser#fname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFname(xpathParser.FnameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllChildren(xpathParser.AllChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpwithP}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpwithP(xpathParser.RpwithPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(xpathParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpAll}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpAll(xpathParser.RpAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(xpathParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(xpathParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpChildren}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpChildren(xpathParser.RpChildrenContext ctx);
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
	 * Visit a parse tree produced by the {@code TwoRp}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoRp(xpathParser.TwoRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpFilter(xpathParser.RpFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilAnd}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilAnd(xpathParser.FilAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilEqual}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilEqual(xpathParser.FilEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilNot}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilNot(xpathParser.FilNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilOr}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilOr(xpathParser.FilOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilIs}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilIs(xpathParser.FilIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilwithP}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilwithP(xpathParser.FilwithPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilRp}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilRp(xpathParser.FilRpContext ctx);
}