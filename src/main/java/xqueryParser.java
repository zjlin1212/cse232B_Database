// Generated from xquery.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xqueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, String=36, WS=37, StringConstant=38;
	public static final int
		RULE_query = 0, RULE_xq = 1, RULE_joinClause = 2, RULE_attrNames = 3, 
		RULE_forClause = 4, RULE_letClause = 5, RULE_whereClause = 6, RULE_returnClause = 7, 
		RULE_var = 8, RULE_cond = 9, RULE_ap = 10, RULE_doc = 11, RULE_filename = 12, 
		RULE_rp = 13, RULE_filter = 14;
	public static final String[] ruleNames = {
		"query", "xq", "joinClause", "attrNames", "forClause", "letClause", "whereClause", 
		"returnClause", "var", "cond", "ap", "doc", "filename", "rp", "filter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'/'", "'//'", "','", "'<'", "'>'", "'{'", "'}'", 
		"'join'", "'['", "']'", "'for'", "'in'", "'let'", "':='", "'where'", "'return'", 
		"'$'", "'='", "'eq'", "'=='", "'is'", "'empty'", "'some'", "'satisfies'", 
		"'and'", "'or'", "'not'", "'doc'", "'*'", "'.'", "'..'", "'text()'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"String", "WS", "StringConstant"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "xquery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public xqueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode EOF() { return getToken(xqueryParser.EOF, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			xq(0);
			setState(31);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XqCommaContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public XqCommaContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterXqComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitXqComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitXqComma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqApContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public XqApContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterXqAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitXqAp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitXqAp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqVarContext extends XqContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public XqVarContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterXqVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitXqVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitXqVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqParenthesisContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqParenthesisContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterXqParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitXqParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitXqParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqJoinContext extends XqContext {
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public XqJoinContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterXqJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitXqJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitXqJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqSlashContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqSlashContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterXqSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitXqSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitXqSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq2SlashContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Xq2SlashContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterXq2Slash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitXq2Slash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitXq2Slash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqStringContext extends XqContext {
		public TerminalNode StringConstant() { return getToken(xqueryParser.StringConstant, 0); }
		public XqStringContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterXqString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitXqString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitXqString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqMakeElementContext extends XqContext {
		public List<TerminalNode> String() { return getTokens(xqueryParser.String); }
		public TerminalNode String(int i) {
			return getToken(xqueryParser.String, i);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqMakeElementContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterXqMakeElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitXqMakeElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitXqMakeElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqForContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public XqForContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterXqFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitXqFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitXqFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqLetContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqLetContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterXqLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitXqLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitXqLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				{
				_localctx = new XqVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(34);
				var();
				}
				break;
			case StringConstant:
				{
				_localctx = new XqStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(StringConstant);
				}
				break;
			case T__29:
				{
				_localctx = new XqApContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				ap();
				}
				break;
			case T__0:
				{
				_localctx = new XqParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(T__0);
				setState(38);
				xq(0);
				setState(39);
				match(T__1);
				}
				break;
			case T__5:
				{
				_localctx = new XqMakeElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(T__5);
				setState(42);
				match(String);
				setState(43);
				match(T__6);
				setState(44);
				match(T__7);
				setState(45);
				xq(0);
				setState(46);
				match(T__8);
				setState(47);
				match(T__5);
				setState(48);
				match(T__2);
				setState(49);
				match(String);
				setState(50);
				match(T__6);
				}
				break;
			case T__12:
				{
				_localctx = new XqForContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				forClause();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(53);
					letClause();
					}
				}

				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(56);
					whereClause();
					}
				}

				setState(59);
				returnClause();
				}
				break;
			case T__14:
				{
				_localctx = new XqLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				letClause();
				setState(62);
				xq(2);
				}
				break;
			case T__9:
				{
				_localctx = new XqJoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				joinClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new XqCommaContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(67);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(68);
						match(T__4);
						setState(69);
						xq(6);
						}
						break;
					case 2:
						{
						_localctx = new XqSlashContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(70);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(71);
						match(T__2);
						setState(72);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new Xq2SlashContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(73);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(74);
						match(T__3);
						setState(75);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinClauseContext extends ParserRuleContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<AttrNamesContext> attrNames() {
			return getRuleContexts(AttrNamesContext.class);
		}
		public AttrNamesContext attrNames(int i) {
			return getRuleContext(AttrNamesContext.class,i);
		}
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_joinClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__9);
			setState(82);
			match(T__0);
			setState(83);
			xq(0);
			setState(84);
			match(T__4);
			setState(85);
			xq(0);
			setState(86);
			match(T__4);
			setState(87);
			attrNames();
			setState(88);
			match(T__4);
			setState(89);
			attrNames();
			setState(90);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrNamesContext extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(xqueryParser.String); }
		public TerminalNode String(int i) {
			return getToken(xqueryParser.String, i);
		}
		public AttrNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterAttrNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitAttrNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitAttrNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrNamesContext attrNames() throws RecognitionException {
		AttrNamesContext _localctx = new AttrNamesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attrNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__10);
			setState(93);
			match(String);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(94);
				match(T__4);
				setState(95);
				match(String);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__12);
			setState(104);
			var();
			setState(105);
			match(T__13);
			setState(106);
			xq(0);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(107);
				match(T__4);
				setState(108);
				var();
				setState(109);
				match(T__13);
				setState(110);
				xq(0);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__14);
			setState(118);
			var();
			setState(119);
			match(T__15);
			setState(120);
			xq(0);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(121);
				match(T__4);
				setState(122);
				var();
				setState(123);
				match(T__15);
				setState(124);
				xq(0);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__16);
			setState(132);
			cond(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnClauseContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__17);
			setState(135);
			xq(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(xqueryParser.String, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__18);
			setState(138);
			match(String);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondOrContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondOrContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterCondOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitCondOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitCondOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondIsEmptyContext extends CondContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public CondIsEmptyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterCondIsEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitCondIsEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitCondIsEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondAndContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondAndContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterCondAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitCondAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitCondAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondSomeContext extends CondContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondSomeContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterCondSome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitCondSome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitCondSome(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondIsContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondIsContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterCondIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitCondIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitCondIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondParenthesisContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondParenthesisContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterCondParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitCondParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitCondParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondNotContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondNotContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterCondNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitCondNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitCondNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondEqContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondEqContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterCondEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitCondEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitCondEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new CondEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(141);
				xq(0);
				setState(142);
				match(T__19);
				setState(143);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new CondEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				xq(0);
				setState(146);
				match(T__20);
				setState(147);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new CondIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				xq(0);
				setState(150);
				match(T__21);
				setState(151);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new CondIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				xq(0);
				setState(154);
				match(T__22);
				setState(155);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new CondIsEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(T__23);
				setState(158);
				match(T__0);
				setState(159);
				xq(0);
				setState(160);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new CondSomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(T__24);
				setState(163);
				var();
				setState(164);
				match(T__13);
				setState(165);
				xq(0);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(166);
					match(T__4);
					setState(167);
					var();
					setState(168);
					match(T__13);
					setState(169);
					xq(0);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(T__25);
				setState(177);
				cond(5);
				}
				break;
			case 7:
				{
				_localctx = new CondParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(T__0);
				setState(180);
				cond(0);
				setState(181);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new CondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(T__28);
				setState(184);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(187);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(188);
						match(T__26);
						setState(189);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(190);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(191);
						match(T__27);
						setState(192);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ApRootContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApRootContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterApRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitApRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitApRoot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApCurrentContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApCurrentContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterApCurrent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitApCurrent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitApCurrent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ap);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ApRootContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				doc();
				setState(199);
				match(T__2);
				setState(200);
				rp(0);
				}
				break;
			case 2:
				_localctx = new ApCurrentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				doc();
				setState(203);
				match(T__3);
				setState(204);
				rp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocContext extends ParserRuleContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__29);
			setState(209);
			match(T__0);
			setState(210);
			filename();
			setState(211);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode StringConstant() { return getToken(xqueryParser.StringConstant, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(StringConstant);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllContext extends RpContext {
		public AllContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpcurrentContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpcurrentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterRpcurrent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitRpcurrent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitRpcurrent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttNameContext extends RpContext {
		public TerminalNode String() { return getToken(xqueryParser.String, 0); }
		public AttNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterAttName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitAttName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitAttName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagNameContext extends RpContext {
		public TerminalNode String() { return getToken(xqueryParser.String, 0); }
		public TagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpPrthsisContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpPrthsisContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterRpPrthsis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitRpPrthsis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitRpPrthsis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentContext extends RpContext {
		public ParentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpfilterContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public RpfilterContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterRpfilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitRpfilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitRpfilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextContext extends RpContext {
		public TextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentContext extends RpContext {
		public CurrentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterCurrent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitCurrent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitCurrent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RprootContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RprootContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterRproot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitRproot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitRproot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpAndContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpAndContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterRpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitRpAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitRpAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				{
				_localctx = new TagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(216);
				match(String);
				}
				break;
			case T__30:
				{
				_localctx = new AllContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(T__30);
				}
				break;
			case T__31:
				{
				_localctx = new CurrentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(T__31);
				}
				break;
			case T__32:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(T__32);
				}
				break;
			case T__33:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(T__33);
				}
				break;
			case T__34:
				{
				_localctx = new AttNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(T__34);
				setState(222);
				match(String);
				}
				break;
			case T__0:
				{
				_localctx = new RpPrthsisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(T__0);
				setState(224);
				rp(0);
				setState(225);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new RprootContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(229);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(230);
						match(T__2);
						setState(231);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RpcurrentContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(232);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(233);
						match(T__3);
						setState(234);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RpAndContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(235);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(236);
						match(T__4);
						setState(237);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RpfilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(238);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(239);
						match(T__10);
						setState(240);
						filter(0);
						setState(241);
						match(T__11);
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	 
		public FilterContext() { }
		public void copyFrom(FilterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FilterEqualContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FilterEqualContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterFilterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitFilterEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitFilterEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterNotContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public FilterNotContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterFilterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitFilterNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitFilterNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterOrContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public FilterOrContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterFilterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitFilterOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitFilterOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterAndContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public FilterAndContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterFilterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitFilterAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitFilterAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterRpContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FilterRpContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterFilterRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitFilterRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitFilterRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterPrthsisContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public FilterPrthsisContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterFilterPrthsis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitFilterPrthsis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitFilterPrthsis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterIsContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FilterIsContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).enterFilterIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xqueryListener ) ((xqueryListener)listener).exitFilterIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xqueryVisitor ) return ((xqueryVisitor<? extends T>)visitor).visitFilterIs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		return filter(0);
	}

	private FilterContext filter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilterContext _localctx = new FilterContext(_ctx, _parentState);
		FilterContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new FilterRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(249);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FilterEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				rp(0);
				setState(251);
				match(T__19);
				setState(252);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FilterEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				rp(0);
				setState(255);
				match(T__20);
				setState(256);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FilterIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				rp(0);
				setState(259);
				match(T__21);
				setState(260);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new FilterIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				rp(0);
				setState(263);
				match(T__22);
				setState(264);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new FilterPrthsisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(T__0);
				setState(267);
				filter(0);
				setState(268);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new FilterNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				match(T__28);
				setState(271);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(280);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new FilterAndContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(274);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(275);
						match(T__26);
						setState(276);
						filter(4);
						}
						break;
					case 2:
						{
						_localctx = new FilterOrContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(277);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(278);
						match(T__27);
						setState(279);
						filter(3);
						}
						break;
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 9:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 13:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 14:
			return filter_sempred((FilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0120\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\39\n\3\3\3\5\3<\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3D\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3O\n\3\f\3\16\3R\13\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5c\n\5\f\5\16\5f\13\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6s\n\6\f\6\16\6v\13\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0081\n\7\f\7\16\7\u0084\13\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ae\n\13\f\13\16"+
		"\13\u00b1\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00bc"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00c4\n\13\f\13\16\13\u00c7\13"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d1\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00e6\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00f6\n\17\f\17\16\17\u00f9\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0113\n\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u011b\n\20\f\20\16\20\u011e\13\20\3\20\2\6\4\24\34\36"+
		"\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\u013c\2 \3\2\2\2\4C\3\2"+
		"\2\2\6S\3\2\2\2\b^\3\2\2\2\ni\3\2\2\2\fw\3\2\2\2\16\u0085\3\2\2\2\20\u0088"+
		"\3\2\2\2\22\u008b\3\2\2\2\24\u00bb\3\2\2\2\26\u00d0\3\2\2\2\30\u00d2\3"+
		"\2\2\2\32\u00d7\3\2\2\2\34\u00e5\3\2\2\2\36\u0112\3\2\2\2 !\5\4\3\2!\""+
		"\7\2\2\3\"\3\3\2\2\2#$\b\3\1\2$D\5\22\n\2%D\7(\2\2&D\5\26\f\2\'(\7\3\2"+
		"\2()\5\4\3\2)*\7\4\2\2*D\3\2\2\2+,\7\b\2\2,-\7&\2\2-.\7\t\2\2./\7\n\2"+
		"\2/\60\5\4\3\2\60\61\7\13\2\2\61\62\7\b\2\2\62\63\7\5\2\2\63\64\7&\2\2"+
		"\64\65\7\t\2\2\65D\3\2\2\2\668\5\n\6\2\679\5\f\7\28\67\3\2\2\289\3\2\2"+
		"\29;\3\2\2\2:<\5\16\b\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\5\20\t\2>D\3\2"+
		"\2\2?@\5\f\7\2@A\5\4\3\4AD\3\2\2\2BD\5\6\4\2C#\3\2\2\2C%\3\2\2\2C&\3\2"+
		"\2\2C\'\3\2\2\2C+\3\2\2\2C\66\3\2\2\2C?\3\2\2\2CB\3\2\2\2DP\3\2\2\2EF"+
		"\f\7\2\2FG\7\7\2\2GO\5\4\3\bHI\f\t\2\2IJ\7\5\2\2JO\5\34\17\2KL\f\b\2\2"+
		"LM\7\6\2\2MO\5\34\17\2NE\3\2\2\2NH\3\2\2\2NK\3\2\2\2OR\3\2\2\2PN\3\2\2"+
		"\2PQ\3\2\2\2Q\5\3\2\2\2RP\3\2\2\2ST\7\f\2\2TU\7\3\2\2UV\5\4\3\2VW\7\7"+
		"\2\2WX\5\4\3\2XY\7\7\2\2YZ\5\b\5\2Z[\7\7\2\2[\\\5\b\5\2\\]\7\4\2\2]\7"+
		"\3\2\2\2^_\7\r\2\2_d\7&\2\2`a\7\7\2\2ac\7&\2\2b`\3\2\2\2cf\3\2\2\2db\3"+
		"\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\16\2\2h\t\3\2\2\2ij\7\17\2\2"+
		"jk\5\22\n\2kl\7\20\2\2lt\5\4\3\2mn\7\7\2\2no\5\22\n\2op\7\20\2\2pq\5\4"+
		"\3\2qs\3\2\2\2rm\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\13\3\2\2\2vt\3"+
		"\2\2\2wx\7\21\2\2xy\5\22\n\2yz\7\22\2\2z\u0082\5\4\3\2{|\7\7\2\2|}\5\22"+
		"\n\2}~\7\22\2\2~\177\5\4\3\2\177\u0081\3\2\2\2\u0080{\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\r\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7\23\2\2\u0086\u0087\5\24\13\2\u0087\17\3\2"+
		"\2\2\u0088\u0089\7\24\2\2\u0089\u008a\5\4\3\2\u008a\21\3\2\2\2\u008b\u008c"+
		"\7\25\2\2\u008c\u008d\7&\2\2\u008d\23\3\2\2\2\u008e\u008f\b\13\1\2\u008f"+
		"\u0090\5\4\3\2\u0090\u0091\7\26\2\2\u0091\u0092\5\4\3\2\u0092\u00bc\3"+
		"\2\2\2\u0093\u0094\5\4\3\2\u0094\u0095\7\27\2\2\u0095\u0096\5\4\3\2\u0096"+
		"\u00bc\3\2\2\2\u0097\u0098\5\4\3\2\u0098\u0099\7\30\2\2\u0099\u009a\5"+
		"\4\3\2\u009a\u00bc\3\2\2\2\u009b\u009c\5\4\3\2\u009c\u009d\7\31\2\2\u009d"+
		"\u009e\5\4\3\2\u009e\u00bc\3\2\2\2\u009f\u00a0\7\32\2\2\u00a0\u00a1\7"+
		"\3\2\2\u00a1\u00a2\5\4\3\2\u00a2\u00a3\7\4\2\2\u00a3\u00bc\3\2\2\2\u00a4"+
		"\u00a5\7\33\2\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7\7\20\2\2\u00a7\u00af"+
		"\5\4\3\2\u00a8\u00a9\7\7\2\2\u00a9\u00aa\5\22\n\2\u00aa\u00ab\7\20\2\2"+
		"\u00ab\u00ac\5\4\3\2\u00ac\u00ae\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ae\u00b1"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b3\7\34\2\2\u00b3\u00b4\5\24\13\7\u00b4\u00bc"+
		"\3\2\2\2\u00b5\u00b6\7\3\2\2\u00b6\u00b7\5\24\13\2\u00b7\u00b8\7\4\2\2"+
		"\u00b8\u00bc\3\2\2\2\u00b9\u00ba\7\37\2\2\u00ba\u00bc\5\24\13\3\u00bb"+
		"\u008e\3\2\2\2\u00bb\u0093\3\2\2\2\u00bb\u0097\3\2\2\2\u00bb\u009b\3\2"+
		"\2\2\u00bb\u009f\3\2\2\2\u00bb\u00a4\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00c5\3\2\2\2\u00bd\u00be\f\5\2\2\u00be\u00bf\7\35"+
		"\2\2\u00bf\u00c4\5\24\13\6\u00c0\u00c1\f\4\2\2\u00c1\u00c2\7\36\2\2\u00c2"+
		"\u00c4\5\24\13\5\u00c3\u00bd\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00c7\3"+
		"\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\25\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c9\5\30\r\2\u00c9\u00ca\7\5\2\2\u00ca\u00cb\5"+
		"\34\17\2\u00cb\u00d1\3\2\2\2\u00cc\u00cd\5\30\r\2\u00cd\u00ce\7\6\2\2"+
		"\u00ce\u00cf\5\34\17\2\u00cf\u00d1\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00cc"+
		"\3\2\2\2\u00d1\27\3\2\2\2\u00d2\u00d3\7 \2\2\u00d3\u00d4\7\3\2\2\u00d4"+
		"\u00d5\5\32\16\2\u00d5\u00d6\7\4\2\2\u00d6\31\3\2\2\2\u00d7\u00d8\7(\2"+
		"\2\u00d8\33\3\2\2\2\u00d9\u00da\b\17\1\2\u00da\u00e6\7&\2\2\u00db\u00e6"+
		"\7!\2\2\u00dc\u00e6\7\"\2\2\u00dd\u00e6\7#\2\2\u00de\u00e6\7$\2\2\u00df"+
		"\u00e0\7%\2\2\u00e0\u00e6\7&\2\2\u00e1\u00e2\7\3\2\2\u00e2\u00e3\5\34"+
		"\17\2\u00e3\u00e4\7\4\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00d9\3\2\2\2\u00e5"+
		"\u00db\3\2\2\2\u00e5\u00dc\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00de\3\2"+
		"\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\u00f7\3\2\2\2\u00e7"+
		"\u00e8\f\6\2\2\u00e8\u00e9\7\5\2\2\u00e9\u00f6\5\34\17\7\u00ea\u00eb\f"+
		"\5\2\2\u00eb\u00ec\7\6\2\2\u00ec\u00f6\5\34\17\6\u00ed\u00ee\f\3\2\2\u00ee"+
		"\u00ef\7\7\2\2\u00ef\u00f6\5\34\17\4\u00f0\u00f1\f\4\2\2\u00f1\u00f2\7"+
		"\r\2\2\u00f2\u00f3\5\36\20\2\u00f3\u00f4\7\16\2\2\u00f4\u00f6\3\2\2\2"+
		"\u00f5\u00e7\3\2\2\2\u00f5\u00ea\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00f0"+
		"\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\35\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\b\20\1\2\u00fb\u0113\5\34"+
		"\17\2\u00fc\u00fd\5\34\17\2\u00fd\u00fe\7\26\2\2\u00fe\u00ff\5\34\17\2"+
		"\u00ff\u0113\3\2\2\2\u0100\u0101\5\34\17\2\u0101\u0102\7\27\2\2\u0102"+
		"\u0103\5\34\17\2\u0103\u0113\3\2\2\2\u0104\u0105\5\34\17\2\u0105\u0106"+
		"\7\30\2\2\u0106\u0107\5\34\17\2\u0107\u0113\3\2\2\2\u0108\u0109\5\34\17"+
		"\2\u0109\u010a\7\31\2\2\u010a\u010b\5\34\17\2\u010b\u0113\3\2\2\2\u010c"+
		"\u010d\7\3\2\2\u010d\u010e\5\36\20\2\u010e\u010f\7\4\2\2\u010f\u0113\3"+
		"\2\2\2\u0110\u0111\7\37\2\2\u0111\u0113\5\36\20\3\u0112\u00fa\3\2\2\2"+
		"\u0112\u00fc\3\2\2\2\u0112\u0100\3\2\2\2\u0112\u0104\3\2\2\2\u0112\u0108"+
		"\3\2\2\2\u0112\u010c\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u011c\3\2\2\2\u0114"+
		"\u0115\f\5\2\2\u0115\u0116\7\35\2\2\u0116\u011b\5\36\20\6\u0117\u0118"+
		"\f\4\2\2\u0118\u0119\7\36\2\2\u0119\u011b\5\36\20\5\u011a\u0114\3\2\2"+
		"\2\u011a\u0117\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\37\3\2\2\2\u011e\u011c\3\2\2\2\258;CNPdt\u0082\u00af\u00bb"+
		"\u00c3\u00c5\u00d0\u00e5\u00f5\u00f7\u0112\u011a\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}