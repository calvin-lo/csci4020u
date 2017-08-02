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


		

	public A2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StatementContext statement;
		public List<TerminalNode> EOF() { return getTokens(A2Parser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(A2Parser.EOF, i);
		}
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
			System.out.println("public class A2_apples {\n\tpublic static void main(String[] args){");
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13);
				((StartContext)_localctx).statement = statement();
				System.out.println("\t\t" + ((StartContext)_localctx).statement.s+"\n");
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3))) != 0) );
			setState(20);
			match(EOF);
			System.out.println("\n\t}\n}");
			setState(22);
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
		public String s;
		public Var_declContext var_decl;
		public Var_assignContext var_assign;
		public Repeat_showContext repeat_show;
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
			setState(33);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				((StatementContext)_localctx).var_decl = var_decl();
				 ((StatementContext)_localctx).s =  ((StatementContext)_localctx).var_decl.s; 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				((StatementContext)_localctx).var_assign = var_assign();
				 ((StatementContext)_localctx).s =  ((StatementContext)_localctx).var_assign.s; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				((StatementContext)_localctx).repeat_show = repeat_show();
				 ((StatementContext)_localctx).s =  ((StatementContext)_localctx).repeat_show.s; 
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
		public String s;
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
			setState(35);
			match(T__0);
			setState(36);
			((Var_declContext)_localctx).ID = match(ID);
			setState(37);
			match(T__1);
			 
						((Var_declContext)_localctx).s =  "int "+((Var_declContext)_localctx).ID.getText()+";";
						
					
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
		public String s;
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
			setState(40);
			match(T__2);
			setState(41);
			((Var_assignContext)_localctx).name = match(ID);
			setState(42);
			((Var_assignContext)_localctx).var = var();
			setState(43);
			match(T__1);
			 
						((Var_assignContext)_localctx).s =  ((Var_assignContext)_localctx).name.getText() + " = " + ((Var_assignContext)_localctx).var.number + ";";
					
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
		public String s;
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
			setState(46);
			match(T__3);
			setState(47);
			((Repeat_showContext)_localctx).iterations = var();
			setState(48);
			match(T__4);
			setState(49);
			((Repeat_showContext)_localctx).x = var();
			setState(50);
			match(T__1);
			 
						((Repeat_showContext)_localctx).s =  "for(int i = 0; i < " + ((Repeat_showContext)_localctx).iterations.number + "; i++)";
						((Repeat_showContext)_localctx).s =  _localctx.s + "System.out.print(" + ((Repeat_showContext)_localctx).x.number + ");";
					
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
		public String number;
		public Token ID;
		public Token NUM;
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
			setState(57);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				((VarContext)_localctx).ID = match(ID);
				 
							((VarContext)_localctx).number =  ((VarContext)_localctx).ID.getText(); 
						
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				((VarContext)_localctx).NUM = match(NUM);
				 
							((VarContext)_localctx).number =  ""+ ((VarContext)_localctx).NUM.getText(); 
						
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n>\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\6\2\23\n\2\r\2\16\2"+
		"\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\5\7<\n\7\3\7\2\2\b\2\4\6\b\n\f\2\2;\2\16\3\2\2\2\4#\3\2\2"+
		"\2\6%\3\2\2\2\b*\3\2\2\2\n\60\3\2\2\2\f;\3\2\2\2\16\22\b\2\1\2\17\20\5"+
		"\4\3\2\20\21\b\2\1\2\21\23\3\2\2\2\22\17\3\2\2\2\23\24\3\2\2\2\24\22\3"+
		"\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\27\7\2\2\3\27\30\b\2\1\2\30\31\7"+
		"\2\2\3\31\3\3\2\2\2\32\33\5\6\4\2\33\34\b\3\1\2\34$\3\2\2\2\35\36\5\b"+
		"\5\2\36\37\b\3\1\2\37$\3\2\2\2 !\5\n\6\2!\"\b\3\1\2\"$\3\2\2\2#\32\3\2"+
		"\2\2#\35\3\2\2\2# \3\2\2\2$\5\3\2\2\2%&\7\3\2\2&\'\7\t\2\2\'(\7\4\2\2"+
		"()\b\4\1\2)\7\3\2\2\2*+\7\5\2\2+,\7\t\2\2,-\5\f\7\2-.\7\4\2\2./\b\5\1"+
		"\2/\t\3\2\2\2\60\61\7\6\2\2\61\62\5\f\7\2\62\63\7\7\2\2\63\64\5\f\7\2"+
		"\64\65\7\4\2\2\65\66\b\6\1\2\66\13\3\2\2\2\678\7\t\2\28<\b\7\1\29:\7\b"+
		"\2\2:<\b\7\1\2;\67\3\2\2\2;9\3\2\2\2<\r\3\2\2\2\5\24#;";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}