// Generated from com/compiladores/minicompilador/interprete2022/minicompilador.g4 by ANTLR 4.5.1
package com.compiladores.minicompilador.interprete2022;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class minicompiladorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, INT=2, STRING=3, PRINTLN=4, IF=5, ELSE=6, ASIGN=7, PLUS=8, 
		MINUS=9, MULT=10, DIV=11, AND=12, OR=13, GT=14, LT=15, GEQ=16, LEQ=17, 
		EQ=18, BRACKET_OPEN=19, BRACKET_CLOSE=20, PAR_OPEN=21, PAR_CLOSE=22, SEMICOLON=23, 
		ID=24, NUMBER=25, CADENA=26, WS=27, LINE_COMMENT=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PROGRAM", "INT", "STRING", "PRINTLN", "IF", "ELSE", "ASIGN", "PLUS", 
		"MINUS", "MULT", "DIV", "AND", "OR", "GT", "LT", "GEQ", "LEQ", "EQ", "BRACKET_OPEN", 
		"BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "ID", "NUMBER", 
		"CADENA", "WS", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'rosa'", "'tulipan'", "'petunia'", "'orquidea'", "'lirio'", "'hortensia'", 
		"':='", "' + '", "' - '", "' * '", "' / '", "'&&'", "'||'", "'>'", "'<'", 
		"'>='", "'<='", "'=='", "'{'", "'}'", "'('", "')'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM", "INT", "STRING", "PRINTLN", "IF", "ELSE", "ASIGN", "PLUS", 
		"MINUS", "MULT", "DIV", "AND", "OR", "GT", "LT", "GEQ", "LEQ", "EQ", "BRACKET_OPEN", 
		"BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "ID", "NUMBER", 
		"CADENA", "WS", "LINE_COMMENT"
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


	public minicompiladorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "minicompilador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00c0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\7\31\u009c\n\31\f\31\16\31"+
		"\u009f\13\31\3\32\6\32\u00a2\n\32\r\32\16\32\u00a3\3\33\3\33\7\33\u00a8"+
		"\n\33\f\33\16\33\u00ab\13\33\3\33\3\33\3\34\6\34\u00b0\n\34\r\34\16\34"+
		"\u00b1\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00ba\n\35\f\35\16\35\u00bd"+
		"\13\35\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36\3\2\b\4\2C\\c|\5\2\62;C\\c|\3\2\62;\5\2\f\f\17\17"+
		"$$\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u00c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5@\3\2\2\2\7H\3\2\2\2"+
		"\tP\3\2\2\2\13Y\3\2\2\2\r_\3\2\2\2\17i\3\2\2\2\21l\3\2\2\2\23p\3\2\2\2"+
		"\25t\3\2\2\2\27x\3\2\2\2\31|\3\2\2\2\33\177\3\2\2\2\35\u0082\3\2\2\2\37"+
		"\u0084\3\2\2\2!\u0086\3\2\2\2#\u0089\3\2\2\2%\u008c\3\2\2\2\'\u008f\3"+
		"\2\2\2)\u0091\3\2\2\2+\u0093\3\2\2\2-\u0095\3\2\2\2/\u0097\3\2\2\2\61"+
		"\u0099\3\2\2\2\63\u00a1\3\2\2\2\65\u00a5\3\2\2\2\67\u00af\3\2\2\29\u00b5"+
		"\3\2\2\2;<\7t\2\2<=\7q\2\2=>\7u\2\2>?\7c\2\2?\4\3\2\2\2@A\7v\2\2AB\7w"+
		"\2\2BC\7n\2\2CD\7k\2\2DE\7r\2\2EF\7c\2\2FG\7p\2\2G\6\3\2\2\2HI\7r\2\2"+
		"IJ\7g\2\2JK\7v\2\2KL\7w\2\2LM\7p\2\2MN\7k\2\2NO\7c\2\2O\b\3\2\2\2PQ\7"+
		"q\2\2QR\7t\2\2RS\7s\2\2ST\7w\2\2TU\7k\2\2UV\7f\2\2VW\7g\2\2WX\7c\2\2X"+
		"\n\3\2\2\2YZ\7n\2\2Z[\7k\2\2[\\\7t\2\2\\]\7k\2\2]^\7q\2\2^\f\3\2\2\2_"+
		"`\7j\2\2`a\7q\2\2ab\7t\2\2bc\7v\2\2cd\7g\2\2de\7p\2\2ef\7u\2\2fg\7k\2"+
		"\2gh\7c\2\2h\16\3\2\2\2ij\7<\2\2jk\7?\2\2k\20\3\2\2\2lm\7\"\2\2mn\7-\2"+
		"\2no\7\"\2\2o\22\3\2\2\2pq\7\"\2\2qr\7/\2\2rs\7\"\2\2s\24\3\2\2\2tu\7"+
		"\"\2\2uv\7,\2\2vw\7\"\2\2w\26\3\2\2\2xy\7\"\2\2yz\7\61\2\2z{\7\"\2\2{"+
		"\30\3\2\2\2|}\7(\2\2}~\7(\2\2~\32\3\2\2\2\177\u0080\7~\2\2\u0080\u0081"+
		"\7~\2\2\u0081\34\3\2\2\2\u0082\u0083\7@\2\2\u0083\36\3\2\2\2\u0084\u0085"+
		"\7>\2\2\u0085 \3\2\2\2\u0086\u0087\7@\2\2\u0087\u0088\7?\2\2\u0088\"\3"+
		"\2\2\2\u0089\u008a\7>\2\2\u008a\u008b\7?\2\2\u008b$\3\2\2\2\u008c\u008d"+
		"\7?\2\2\u008d\u008e\7?\2\2\u008e&\3\2\2\2\u008f\u0090\7}\2\2\u0090(\3"+
		"\2\2\2\u0091\u0092\7\177\2\2\u0092*\3\2\2\2\u0093\u0094\7*\2\2\u0094,"+
		"\3\2\2\2\u0095\u0096\7+\2\2\u0096.\3\2\2\2\u0097\u0098\7=\2\2\u0098\60"+
		"\3\2\2\2\u0099\u009d\t\2\2\2\u009a\u009c\t\3\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\62\3\2\2"+
		"\2\u009f\u009d\3\2\2\2\u00a0\u00a2\t\4\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\64\3\2\2\2\u00a5"+
		"\u00a9\7$\2\2\u00a6\u00a8\n\5\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00ad\7$\2\2\u00ad\66\3\2\2\2\u00ae\u00b0\t\6\2\2"+
		"\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\34\2\2\u00b48\3\2\2\2\u00b5"+
		"\u00b6\7\61\2\2\u00b6\u00b7\7\61\2\2\u00b7\u00bb\3\2\2\2\u00b8\u00ba\n"+
		"\7\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\b\35"+
		"\2\2\u00bf:\3\2\2\2\b\2\u009d\u00a3\u00a9\u00b1\u00bb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}