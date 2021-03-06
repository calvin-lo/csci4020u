// Generated from A2.g4 by ANTLR 4.5.2

import java.util.TreeMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class A2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, NUM=6, ID=7, WS=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "NUM", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'variable'", "';'", "'make'", "'repeat'", "'show'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "NUM", "ID", "WS"
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


		public static TreeMap<String, Integer> decVars = new TreeMap<String, Integer>();


	public A2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "A2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 7:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\nB\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\6\7\61\n\7\r\7\16\7\62\3\b\6\b\66\n\b\r"+
		"\b\16\b\67\3\b\7\b;\n\b\f\b\16\b>\13\b\3\t\3\t\3\t\2\2\n\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\3\2\5\4\2C\\c|\7\2//\62;C\\aac|\5\2\13\f\17\17\""+
		"\"D\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\34\3\2\2\2\7\36\3\2\2"+
		"\2\t#\3\2\2\2\13*\3\2\2\2\r\60\3\2\2\2\17\65\3\2\2\2\21?\3\2\2\2\23\24"+
		"\7x\2\2\24\25\7c\2\2\25\26\7t\2\2\26\27\7k\2\2\27\30\7c\2\2\30\31\7d\2"+
		"\2\31\32\7n\2\2\32\33\7g\2\2\33\4\3\2\2\2\34\35\7=\2\2\35\6\3\2\2\2\36"+
		"\37\7o\2\2\37 \7c\2\2 !\7m\2\2!\"\7g\2\2\"\b\3\2\2\2#$\7t\2\2$%\7g\2\2"+
		"%&\7r\2\2&\'\7g\2\2\'(\7c\2\2()\7v\2\2)\n\3\2\2\2*+\7u\2\2+,\7j\2\2,-"+
		"\7q\2\2-.\7y\2\2.\f\3\2\2\2/\61\4\62;\2\60/\3\2\2\2\61\62\3\2\2\2\62\60"+
		"\3\2\2\2\62\63\3\2\2\2\63\16\3\2\2\2\64\66\t\2\2\2\65\64\3\2\2\2\66\67"+
		"\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28<\3\2\2\29;\t\3\2\2:9\3\2\2\2;>\3\2"+
		"\2\2<:\3\2\2\2<=\3\2\2\2=\20\3\2\2\2><\3\2\2\2?@\t\4\2\2@A\b\t\2\2A\22"+
		"\3\2\2\2\6\2\62\67<\3\3\t\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}