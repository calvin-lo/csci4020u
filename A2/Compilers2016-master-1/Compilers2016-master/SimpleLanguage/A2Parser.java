// Generated from A2.g4 by ANTLR 4.5.2

import java.util.TreeMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class A2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, NUM=6, ID=7, WS=8;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_var_decl = 2, RULE_var_assign = 3, 
		RULE_repeat_show = 4, RULE_var = 5;
	public static final String[] ruleNames = {
		"start", "statement", "var_decl", "var_assign", "repeat_show", "var"
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

	@Override
	public String getGrammarFileName() { return "A2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		public static TreeMap<String, Integer> decVars = new TreeMap<String, Integer>();

	public A2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(A2Parser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				statement();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3))) != 0) );
			setState(17);
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

	public static class StatementContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public Repeat_showContext repeat_show() {
			return getRuleContext(Repeat_showContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(22);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				var_decl();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				var_assign();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				repeat_show();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Var_declContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(A2Parser.ID, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			((Var_declContext)_localctx).ID = match(ID);
			setState(26);
			match(T__1);
			 
						decVars.put( ((Var_declContext)_localctx).ID.getText(), null); 
					
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

	public static class Var_assignContext extends ParserRuleContext {
		public Token name;
		public VarContext var;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ID() { return getToken(A2Parser.ID, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__2);
			setState(30);
			((Var_assignContext)_localctx).name = match(ID);
			setState(31);
			((Var_assignContext)_localctx).var = var();
			setState(32);
			match(T__1);
			 
						decVars.put( ((Var_assignContext)_localctx).name.getText(), ((Var_assignContext)_localctx).var.number); 
					
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

	public static class Repeat_showContext extends ParserRuleContext {
		public VarContext iterations;
		public VarContext x;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Repeat_showContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_show; }
	}

	public final Repeat_showContext repeat_show() throws RecognitionException {
		Repeat_showContext _localctx = new Repeat_showContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_repeat_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__3);
			setState(36);
			((Repeat_showContext)_localctx).iterations = var();
			setState(37);
			match(T__4);
			setState(38);
			((Repeat_showContext)_localctx).x = var();
			setState(39);
			match(T__1);
			 
						for(int i = 0; i < ((Repeat_showContext)_localctx).iterations.number; i++)
							System.out.print(((Repeat_showContext)_localctx).x.number + " ");
						System.out.println();
					
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
		public int number;
		public Token x;
		public TerminalNode ID() { return getToken(A2Parser.ID, 0); }
		public TerminalNode NUM() { return getToken(A2Parser.NUM, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		try {
			setState(46);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				((VarContext)_localctx).x = match(ID);
				 
							((VarContext)_localctx).number =  decVars.get(((VarContext)_localctx).x.getText()); 
						
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				((VarContext)_localctx).x = match(NUM);
				 
							((VarContext)_localctx).number =  Integer.parseInt(((VarContext)_localctx).x.getText()); 
						
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n\63\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\2\3"+
		"\2\3\3\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\61\n\7\3\7\2\2\b\2\4"+
		"\6\b\n\f\2\2\60\2\17\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b\37\3\2\2\2\n"+
		"%\3\2\2\2\f\60\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17"+
		"\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\24\7\2\2\3\24\3\3\2\2\2\25\31"+
		"\5\6\4\2\26\31\5\b\5\2\27\31\5\n\6\2\30\25\3\2\2\2\30\26\3\2\2\2\30\27"+
		"\3\2\2\2\31\5\3\2\2\2\32\33\7\3\2\2\33\34\7\t\2\2\34\35\7\4\2\2\35\36"+
		"\b\4\1\2\36\7\3\2\2\2\37 \7\5\2\2 !\7\t\2\2!\"\5\f\7\2\"#\7\4\2\2#$\b"+
		"\5\1\2$\t\3\2\2\2%&\7\6\2\2&\'\5\f\7\2\'(\7\7\2\2()\5\f\7\2)*\7\4\2\2"+
		"*+\b\6\1\2+\13\3\2\2\2,-\7\t\2\2-\61\b\7\1\2./\7\b\2\2/\61\b\7\1\2\60"+
		",\3\2\2\2\60.\3\2\2\2\61\r\3\2\2\2\5\21\30\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}