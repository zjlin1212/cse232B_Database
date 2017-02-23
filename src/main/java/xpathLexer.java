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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, WS=9, 
		String=10, INT=11, LPAR=12, RPAR=13, LBRAC=14, RBRAC=15, MINUS=16, PLUS=17, 
		DOT=18, MUL=19, DOTDOT=20, AT=21, COMMA=22, PATHSEP=23, ABRPATH=24, EQUL=25, 
		DEQUL=26, NEWLINE=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "WS", 
		"String", "INT", "LPAR", "RPAR", "LBRAC", "RBRAC", "MINUS", "PLUS", "DOT", 
		"MUL", "DOTDOT", "AT", "COMMA", "PATHSEP", "ABRPATH", "EQUL", "DEQUL", 
		"NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'text()'", "'eq'", "'is'", "'and'", "'or'", "'not'", "'doc'", "'\"'", 
		null, null, null, "'('", "')'", "'['", "']'", "'-'", "'+'", "'.'", "'*'", 
		"'..'", "'@'", "','", "'/'", "'//'", "'='", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "WS", "String", 
		"INT", "LPAR", "RPAR", "LBRAC", "RBRAC", "MINUS", "PLUS", "DOT", "MUL", 
		"DOTDOT", "AT", "COMMA", "PATHSEP", "ABRPATH", "EQUL", "DEQUL", "NEWLINE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\6\nY\n\n\r\n\16\nZ\3\n\3\n\3\13\6\13`\n\13\r\13\16"+
		"\13a\3\f\6\fe\n\f\r\f\16\ff\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\5\34\u008b\n\34"+
		"\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\35\3\2\5\5\2\13\f\17\17\"\"\7\2//\62;C\\aac|\3\2\62;\u0091\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5@\3\2\2"+
		"\2\7C\3\2\2\2\tF\3\2\2\2\13J\3\2\2\2\rM\3\2\2\2\17Q\3\2\2\2\21U\3\2\2"+
		"\2\23X\3\2\2\2\25_\3\2\2\2\27d\3\2\2\2\31h\3\2\2\2\33j\3\2\2\2\35l\3\2"+
		"\2\2\37n\3\2\2\2!p\3\2\2\2#r\3\2\2\2%t\3\2\2\2\'v\3\2\2\2)x\3\2\2\2+{"+
		"\3\2\2\2-}\3\2\2\2/\177\3\2\2\2\61\u0081\3\2\2\2\63\u0084\3\2\2\2\65\u0086"+
		"\3\2\2\2\67\u008a\3\2\2\29:\7v\2\2:;\7g\2\2;<\7z\2\2<=\7v\2\2=>\7*\2\2"+
		">?\7+\2\2?\4\3\2\2\2@A\7g\2\2AB\7s\2\2B\6\3\2\2\2CD\7k\2\2DE\7u\2\2E\b"+
		"\3\2\2\2FG\7c\2\2GH\7p\2\2HI\7f\2\2I\n\3\2\2\2JK\7q\2\2KL\7t\2\2L\f\3"+
		"\2\2\2MN\7p\2\2NO\7q\2\2OP\7v\2\2P\16\3\2\2\2QR\7f\2\2RS\7q\2\2ST\7e\2"+
		"\2T\20\3\2\2\2UV\7$\2\2V\22\3\2\2\2WY\t\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3"+
		"\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\n\2\2]\24\3\2\2\2^`\t\3\2\2_^\3\2\2\2"+
		"`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\26\3\2\2\2ce\t\4\2\2dc\3\2\2\2ef\3\2\2"+
		"\2fd\3\2\2\2fg\3\2\2\2g\30\3\2\2\2hi\7*\2\2i\32\3\2\2\2jk\7+\2\2k\34\3"+
		"\2\2\2lm\7]\2\2m\36\3\2\2\2no\7_\2\2o \3\2\2\2pq\7/\2\2q\"\3\2\2\2rs\7"+
		"-\2\2s$\3\2\2\2tu\7\60\2\2u&\3\2\2\2vw\7,\2\2w(\3\2\2\2xy\7\60\2\2yz\7"+
		"\60\2\2z*\3\2\2\2{|\7B\2\2|,\3\2\2\2}~\7.\2\2~.\3\2\2\2\177\u0080\7\61"+
		"\2\2\u0080\60\3\2\2\2\u0081\u0082\7\61\2\2\u0082\u0083\7\61\2\2\u0083"+
		"\62\3\2\2\2\u0084\u0085\7?\2\2\u0085\64\3\2\2\2\u0086\u0087\7?\2\2\u0087"+
		"\u0088\7?\2\2\u0088\66\3\2\2\2\u0089\u008b\7\17\2\2\u008a\u0089\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\f\2\2\u008d8"+
		"\3\2\2\2\7\2Zaf\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}