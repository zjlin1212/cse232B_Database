// Generated from xpath.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xpathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, String=21, WS=22, StringConstant=23;
	public static final int
		RULE_ap = 0, RULE_doc = 1, RULE_filename = 2, RULE_rp = 3, RULE_filter = 4;
	public static final String[] ruleNames = {
		"ap", "doc", "filename", "rp", "filter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'/'", "'//'", "'doc'", "'('", "')'", "'*'", "'.'", "'..'", "'text()'", 
		"'@'", "'['", "']'", "','", "'='", "'eq'", "'=='", "'is'", "'and'", "'or'", 
		"'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "String", "WS", 
		"StringConstant"
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
	public String getGrammarFileName() { return "xpath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public xpathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterApRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitApRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitApRoot(this);
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
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterApCurrent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitApCurrent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitApCurrent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ap);
		try {
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ApRootContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				doc();
				setState(11);
				match(T__0);
				setState(12);
				rp(0);
				}
				break;
			case 2:
				_localctx = new ApCurrentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				doc();
				setState(15);
				match(T__1);
				setState(16);
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
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__2);
			setState(21);
			match(T__3);
			setState(22);
			filename();
			setState(23);
			match(T__4);
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
		public TerminalNode StringConstant() { return getToken(xpathParser.StringConstant, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
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
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitAll(this);
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
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterRpcurrent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitRpcurrent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitRpcurrent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttNameContext extends RpContext {
		public TerminalNode String() { return getToken(xpathParser.String, 0); }
		public AttNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterAttName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitAttName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitAttName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagNameContext extends RpContext {
		public TerminalNode String() { return getToken(xpathParser.String, 0); }
		public TagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitTagName(this);
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
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterRpPrthsis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitRpPrthsis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitRpPrthsis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentContext extends RpContext {
		public ParentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitParent(this);
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
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterRpfilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitRpfilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitRpfilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextContext extends RpContext {
		public TextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentContext extends RpContext {
		public CurrentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterCurrent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitCurrent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitCurrent(this);
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
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterRproot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitRproot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitRproot(this);
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
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterRpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitRpAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitRpAnd(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				{
				_localctx = new TagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(28);
				match(String);
				}
				break;
			case T__5:
				{
				_localctx = new AllContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(T__5);
				}
				break;
			case T__6:
				{
				_localctx = new CurrentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(T__6);
				}
				break;
			case T__7:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				match(T__7);
				}
				break;
			case T__8:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				match(T__8);
				}
				break;
			case T__9:
				{
				_localctx = new AttNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				match(T__9);
				setState(34);
				match(String);
				}
				break;
			case T__3:
				{
				_localctx = new RpPrthsisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(T__3);
				setState(36);
				rp(0);
				setState(37);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(55);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new RprootContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(41);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(42);
						match(T__0);
						setState(43);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RpcurrentContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(44);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(45);
						match(T__1);
						setState(46);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RpAndContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(47);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(48);
						match(T__12);
						setState(49);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RpfilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(50);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(51);
						match(T__10);
						setState(52);
						filter(0);
						setState(53);
						match(T__11);
						}
						break;
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilterEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilterEqual(this);
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
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilterNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilterNot(this);
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
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilterOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilterOr(this);
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
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilterAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilterAnd(this);
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
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilterRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilterRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilterRp(this);
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
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilterPrthsis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilterPrthsis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilterPrthsis(this);
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
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilterIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilterIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilterIs(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new FilterRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(61);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FilterEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				rp(0);
				setState(63);
				match(T__13);
				setState(64);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FilterEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				rp(0);
				setState(67);
				match(T__14);
				setState(68);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FilterIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				rp(0);
				setState(71);
				match(T__15);
				setState(72);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new FilterIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				rp(0);
				setState(75);
				match(T__16);
				setState(76);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new FilterPrthsisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(T__3);
				setState(79);
				filter(0);
				setState(80);
				match(T__4);
				}
				break;
			case 7:
				{
				_localctx = new FilterNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(T__19);
				setState(83);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(92);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new FilterAndContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(86);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(87);
						match(T__17);
						setState(88);
						filter(4);
						}
						break;
					case 2:
						{
						_localctx = new FilterOrContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(89);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(90);
						match(T__18);
						setState(91);
						filter(3);
						}
						break;
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		case 3:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 4:
			return filter_sempred((FilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31d\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\25\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5*\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5:\n\5\f\5\16\5=\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6W\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6_\n\6\f\6\16\6b\13\6\3\6\2\4\b\n\7\2\4\6\b\n\2\2q"+
		"\2\24\3\2\2\2\4\26\3\2\2\2\6\33\3\2\2\2\b)\3\2\2\2\nV\3\2\2\2\f\r\5\4"+
		"\3\2\r\16\7\3\2\2\16\17\5\b\5\2\17\25\3\2\2\2\20\21\5\4\3\2\21\22\7\4"+
		"\2\2\22\23\5\b\5\2\23\25\3\2\2\2\24\f\3\2\2\2\24\20\3\2\2\2\25\3\3\2\2"+
		"\2\26\27\7\5\2\2\27\30\7\6\2\2\30\31\5\6\4\2\31\32\7\7\2\2\32\5\3\2\2"+
		"\2\33\34\7\31\2\2\34\7\3\2\2\2\35\36\b\5\1\2\36*\7\27\2\2\37*\7\b\2\2"+
		" *\7\t\2\2!*\7\n\2\2\"*\7\13\2\2#$\7\f\2\2$*\7\27\2\2%&\7\6\2\2&\'\5\b"+
		"\5\2\'(\7\7\2\2(*\3\2\2\2)\35\3\2\2\2)\37\3\2\2\2) \3\2\2\2)!\3\2\2\2"+
		")\"\3\2\2\2)#\3\2\2\2)%\3\2\2\2*;\3\2\2\2+,\f\6\2\2,-\7\3\2\2-:\5\b\5"+
		"\7./\f\5\2\2/\60\7\4\2\2\60:\5\b\5\6\61\62\f\3\2\2\62\63\7\17\2\2\63:"+
		"\5\b\5\4\64\65\f\4\2\2\65\66\7\r\2\2\66\67\5\n\6\2\678\7\16\2\28:\3\2"+
		"\2\29+\3\2\2\29.\3\2\2\29\61\3\2\2\29\64\3\2\2\2:=\3\2\2\2;9\3\2\2\2;"+
		"<\3\2\2\2<\t\3\2\2\2=;\3\2\2\2>?\b\6\1\2?W\5\b\5\2@A\5\b\5\2AB\7\20\2"+
		"\2BC\5\b\5\2CW\3\2\2\2DE\5\b\5\2EF\7\21\2\2FG\5\b\5\2GW\3\2\2\2HI\5\b"+
		"\5\2IJ\7\22\2\2JK\5\b\5\2KW\3\2\2\2LM\5\b\5\2MN\7\23\2\2NO\5\b\5\2OW\3"+
		"\2\2\2PQ\7\6\2\2QR\5\n\6\2RS\7\7\2\2SW\3\2\2\2TU\7\26\2\2UW\5\n\6\3V>"+
		"\3\2\2\2V@\3\2\2\2VD\3\2\2\2VH\3\2\2\2VL\3\2\2\2VP\3\2\2\2VT\3\2\2\2W"+
		"`\3\2\2\2XY\f\5\2\2YZ\7\24\2\2Z_\5\n\6\6[\\\f\4\2\2\\]\7\25\2\2]_\5\n"+
		"\6\5^X\3\2\2\2^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\13\3\2\2\2b`\3"+
		"\2\2\2\t\24)9;V^`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}