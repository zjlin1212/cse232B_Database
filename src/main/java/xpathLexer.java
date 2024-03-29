// Generated from xpath.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xpathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, String=21, WS=22, StringConstant=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "String", "LETTER", "DIGIT", "WS", "StringConstant"
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


	public xpathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "xpath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\7\26r\n\26\f\26\16\26u\13\26\3\27\3\27\3\30\3\30\3\31\6\31|\n\31"+
		"\r\31\16\31}\3\31\3\31\3\32\6\32\u0083\n\32\r\32\16\32\u0084\3\32\6\32"+
		"\u0088\n\32\r\32\16\32\u0089\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\2/\2\61\30\63\31\3\2\6\5\2C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\n\2"+
		"\"$)).\60\62=AAC\\aac|\u008f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\7:\3\2\2\2"+
		"\t>\3\2\2\2\13@\3\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21F\3\2\2\2\23I\3\2\2\2"+
		"\25P\3\2\2\2\27R\3\2\2\2\31T\3\2\2\2\33V\3\2\2\2\35X\3\2\2\2\37Z\3\2\2"+
		"\2!]\3\2\2\2#`\3\2\2\2%c\3\2\2\2\'g\3\2\2\2)j\3\2\2\2+n\3\2\2\2-v\3\2"+
		"\2\2/x\3\2\2\2\61{\3\2\2\2\63\u0082\3\2\2\2\65\66\7\61\2\2\66\4\3\2\2"+
		"\2\678\7\61\2\289\7\61\2\29\6\3\2\2\2:;\7f\2\2;<\7q\2\2<=\7e\2\2=\b\3"+
		"\2\2\2>?\7*\2\2?\n\3\2\2\2@A\7+\2\2A\f\3\2\2\2BC\7,\2\2C\16\3\2\2\2DE"+
		"\7\60\2\2E\20\3\2\2\2FG\7\60\2\2GH\7\60\2\2H\22\3\2\2\2IJ\7v\2\2JK\7g"+
		"\2\2KL\7z\2\2LM\7v\2\2MN\7*\2\2NO\7+\2\2O\24\3\2\2\2PQ\7B\2\2Q\26\3\2"+
		"\2\2RS\7]\2\2S\30\3\2\2\2TU\7_\2\2U\32\3\2\2\2VW\7.\2\2W\34\3\2\2\2XY"+
		"\7?\2\2Y\36\3\2\2\2Z[\7g\2\2[\\\7s\2\2\\ \3\2\2\2]^\7?\2\2^_\7?\2\2_\""+
		"\3\2\2\2`a\7k\2\2ab\7u\2\2b$\3\2\2\2cd\7c\2\2de\7p\2\2ef\7f\2\2f&\3\2"+
		"\2\2gh\7q\2\2hi\7t\2\2i(\3\2\2\2jk\7p\2\2kl\7q\2\2lm\7v\2\2m*\3\2\2\2"+
		"ns\5-\27\2or\5-\27\2pr\5/\30\2qo\3\2\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2"+
		"st\3\2\2\2t,\3\2\2\2us\3\2\2\2vw\t\2\2\2w.\3\2\2\2xy\t\3\2\2y\60\3\2\2"+
		"\2z|\t\4\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\b\31\2\2\u0080\62\3\2\2\2\u0081\u0083\7$\2\2\u0082\u0081\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087"+
		"\3\2\2\2\u0086\u0088\t\5\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7$"+
		"\2\2\u008c\64\3\2\2\2\b\2qs}\u0084\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}