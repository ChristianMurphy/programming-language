// Generated from Team8.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Team8Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, NUMBEROPERATOR=17, 
		STRINGOPERATOR=18, BOOLEANOPERATOR=19, NUMBERCOMPARITOR=20, STRINGCOMPARITOR=21, 
		IDENTIFIER=22, NUMBER=23, STRING=24, BOOLEAN=25, WHITESPACE=26, COMMENT=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "NUMBEROPERATOR", 
		"STRINGOPERATOR", "BOOLEANOPERATOR", "NUMBERCOMPARITOR", "STRINGCOMPARITOR", 
		"IDENTIFIER", "NUMBER", "STRING", "BOOLEAN", "WHITESPACE", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'func'", "'number'", "'{'", "'return'", "'}'", "'string'", 
		"'boolean'", "','", "'while'", "'for'", "'in'", "'range'", "'to'", "':='", 
		null, "'append'", null, null, "'equals'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "NUMBEROPERATOR", "STRINGOPERATOR", "BOOLEANOPERATOR", 
		"NUMBERCOMPARITOR", "STRINGCOMPARITOR", "IDENTIFIER", "NUMBER", "STRING", 
		"BOOLEAN", "WHITESPACE", "COMMENT"
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


	public Team8Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Team8.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u012f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a5\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b6\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00fc\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\6\27\u0106\n\27\r\27\16\27\u0107"+
		"\3\30\6\30\u010b\n\30\r\30\16\30\u010c\3\31\3\31\6\31\u0111\n\31\r\31"+
		"\16\31\u0112\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u011c\n\32\3\33\6"+
		"\33\u011f\n\33\r\33\16\33\u0120\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u0129"+
		"\n\34\f\34\16\34\u012c\13\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\7\3\2c|\3\2\62;\6\2\"\"\62;C"+
		"\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u013e\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\tB\3\2\2"+
		"\2\13I\3\2\2\2\rK\3\2\2\2\17R\3\2\2\2\21T\3\2\2\2\23[\3\2\2\2\25c\3\2"+
		"\2\2\27e\3\2\2\2\31k\3\2\2\2\33o\3\2\2\2\35r\3\2\2\2\37x\3\2\2\2!{\3\2"+
		"\2\2#\u00a4\3\2\2\2%\u00a6\3\2\2\2\'\u00b5\3\2\2\2)\u00fb\3\2\2\2+\u00fd"+
		"\3\2\2\2-\u0105\3\2\2\2/\u010a\3\2\2\2\61\u010e\3\2\2\2\63\u011b\3\2\2"+
		"\2\65\u011e\3\2\2\2\67\u0124\3\2\2\29:\7*\2\2:\4\3\2\2\2;<\7+\2\2<\6\3"+
		"\2\2\2=>\7h\2\2>?\7w\2\2?@\7p\2\2@A\7e\2\2A\b\3\2\2\2BC\7p\2\2CD\7w\2"+
		"\2DE\7o\2\2EF\7d\2\2FG\7g\2\2GH\7t\2\2H\n\3\2\2\2IJ\7}\2\2J\f\3\2\2\2"+
		"KL\7t\2\2LM\7g\2\2MN\7v\2\2NO\7w\2\2OP\7t\2\2PQ\7p\2\2Q\16\3\2\2\2RS\7"+
		"\177\2\2S\20\3\2\2\2TU\7u\2\2UV\7v\2\2VW\7t\2\2WX\7k\2\2XY\7p\2\2YZ\7"+
		"i\2\2Z\22\3\2\2\2[\\\7d\2\2\\]\7q\2\2]^\7q\2\2^_\7n\2\2_`\7g\2\2`a\7c"+
		"\2\2ab\7p\2\2b\24\3\2\2\2cd\7.\2\2d\26\3\2\2\2ef\7y\2\2fg\7j\2\2gh\7k"+
		"\2\2hi\7n\2\2ij\7g\2\2j\30\3\2\2\2kl\7h\2\2lm\7q\2\2mn\7t\2\2n\32\3\2"+
		"\2\2op\7k\2\2pq\7p\2\2q\34\3\2\2\2rs\7t\2\2st\7c\2\2tu\7p\2\2uv\7i\2\2"+
		"vw\7g\2\2w\36\3\2\2\2xy\7v\2\2yz\7q\2\2z \3\2\2\2{|\7<\2\2|}\7?\2\2}\""+
		"\3\2\2\2~\177\7c\2\2\177\u0080\7f\2\2\u0080\u00a5\7f\2\2\u0081\u0082\7"+
		"u\2\2\u0082\u0083\7w\2\2\u0083\u0084\7d\2\2\u0084\u0085\7v\2\2\u0085\u0086"+
		"\7t\2\2\u0086\u0087\7c\2\2\u0087\u0088\7e\2\2\u0088\u00a5\7v\2\2\u0089"+
		"\u008a\7o\2\2\u008a\u008b\7w\2\2\u008b\u008c\7n\2\2\u008c\u008d\7v\2\2"+
		"\u008d\u008e\7k\2\2\u008e\u008f\7r\2\2\u008f\u0090\7n\2\2\u0090\u0091"+
		"\7{\2\2\u0091\u0092\7\"\2\2\u0092\u0093\7d\2\2\u0093\u00a5\7{\2\2\u0094"+
		"\u0095\7f\2\2\u0095\u0096\7k\2\2\u0096\u0097\7x\2\2\u0097\u0098\7k\2\2"+
		"\u0098\u0099\7f\2\2\u0099\u009a\7g\2\2\u009a\u009b\7\"\2\2\u009b\u009c"+
		"\7d\2\2\u009c\u00a5\7{\2\2\u009d\u009e\7o\2\2\u009e\u009f\7q\2\2\u009f"+
		"\u00a0\7f\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7w\2\2"+
		"\u00a3\u00a5\7u\2\2\u00a4~\3\2\2\2\u00a4\u0081\3\2\2\2\u00a4\u0089\3\2"+
		"\2\2\u00a4\u0094\3\2\2\2\u00a4\u009d\3\2\2\2\u00a5$\3\2\2\2\u00a6\u00a7"+
		"\7c\2\2\u00a7\u00a8\7r\2\2\u00a8\u00a9\7r\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\u00ab\7p\2\2\u00ab\u00ac\7f\2\2\u00ac&\3\2\2\2\u00ad\u00ae\7c\2\2\u00ae"+
		"\u00af\7p\2\2\u00af\u00b6\7f\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b6\7t\2\2"+
		"\u00b2\u00b3\7z\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b6\7t\2\2\u00b5\u00ad"+
		"\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6(\3\2\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8\u00b9\7s\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7c\2\2"+
		"\u00bb\u00bc\7n\2\2\u00bc\u00fc\7u\2\2\u00bd\u00be\7n\2\2\u00be\u00bf"+
		"\7g\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7\"\2\2\u00c2"+
		"\u00c3\7v\2\2\u00c3\u00c4\7j\2\2\u00c4\u00c5\7c\2\2\u00c5\u00fc\7p\2\2"+
		"\u00c6\u00c7\7i\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca"+
		"\7c\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7t\2\2\u00cd"+
		"\u00ce\7\"\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7j\2\2\u00d0\u00d1\7c\2"+
		"\2\u00d1\u00fc\7p\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5"+
		"\7u\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7\"\2\2\u00d7\u00d8\7v\2\2\u00d8"+
		"\u00d9\7j\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7\"\2"+
		"\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7\"\2\2\u00df\u00e0"+
		"\7g\2\2\u00e0\u00e1\7s\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7c\2\2\u00e3"+
		"\u00e4\7n\2\2\u00e4\u00fc\7u\2\2\u00e5\u00e6\7i\2\2\u00e6\u00e7\7t\2\2"+
		"\u00e7\u00e8\7g\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb"+
		"\7g\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7\"\2\2\u00ed\u00ee\7v\2\2\u00ee"+
		"\u00ef\7j\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7\"\2"+
		"\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7\"\2\2\u00f5\u00f6"+
		"\7g\2\2\u00f6\u00f7\7s\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9\7c\2\2\u00f9"+
		"\u00fa\7n\2\2\u00fa\u00fc\7u\2\2\u00fb\u00b7\3\2\2\2\u00fb\u00bd\3\2\2"+
		"\2\u00fb\u00c6\3\2\2\2\u00fb\u00d2\3\2\2\2\u00fb\u00e5\3\2\2\2\u00fc*"+
		"\3\2\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7s\2\2\u00ff\u0100\7w\2\2\u0100"+
		"\u0101\7c\2\2\u0101\u0102\7n\2\2\u0102\u0103\7u\2\2\u0103,\3\2\2\2\u0104"+
		"\u0106\t\2\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108.\3\2\2\2\u0109\u010b\t\3\2\2\u010a\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\60\3\2\2\2\u010e\u0110\7$\2\2\u010f\u0111\t\4\2\2\u0110\u010f\3\2\2\2"+
		"\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0115\7$\2\2\u0115\62\3\2\2\2\u0116\u0117\7{\2\2\u0117"+
		"\u0118\7g\2\2\u0118\u011c\7u\2\2\u0119\u011a\7p\2\2\u011a\u011c\7q\2\2"+
		"\u011b\u0116\3\2\2\2\u011b\u0119\3\2\2\2\u011c\64\3\2\2\2\u011d\u011f"+
		"\t\5\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b\33\2\2\u0123\66\3\2\2"+
		"\2\u0124\u0125\7\61\2\2\u0125\u0126\7\61\2\2\u0126\u012a\3\2\2\2\u0127"+
		"\u0129\n\6\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d"+
		"\u012e\b\34\2\2\u012e8\3\2\2\2\f\2\u00a4\u00b5\u00fb\u0107\u010c\u0112"+
		"\u011b\u0120\u012a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}