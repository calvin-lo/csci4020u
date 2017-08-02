// Generated from Simple.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Num=10, ID=11, OP=12, WS=13;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_stmt = 2, RULE_assignment = 3, 
		RULE_printStmt = 4, RULE_whileStmt = 5, RULE_expr = 6, RULE_cond = 7;
	public static final String[] ruleNames = {
		"start", "program", "stmt", "assignment", "printStmt", "whileStmt", "expr", 
		"cond"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'let'", "'='", "'print'", "'while'", "'('", "')'", "'{'", "'}'", 
		"'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "Num", "ID", 
		"OP", "WS"
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
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    SymbolTable sym = new SymbolTable();
	    public void printCode(Code c) {
	        System.out.println(".class public MyApp");
	        System.out.println(".super java/lang/Object");
	        System.out.println(".method public <init>()V");
	        System.out.println("aload_0");
	        System.out.println("invokenonvirtual java/lang/Object/<init>()V");
	        System.out.println("return");
	        System.out.println(".end method");

	        System.out.println(".method public static main([Ljava/lang/String;)V");
	        System.out.println(".limit stack 10");
	        System.out.println(".limit locals 10");

	        for(String i : c) {
	            System.out.println(i);
	        }

	        System.out.println("return");
	        System.out.println(".end method");
	    }

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program;
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((StartContext)_localctx).program = program();
			 printCode(((StartContext)_localctx).program.code); 
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

	public static class ProgramContext extends ParserRuleContext {
		public Code code;
		public StmtContext stmt;
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);

		        ((ProgramContext)_localctx).code =  new Code();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				((ProgramContext)_localctx).stmt = stmt();
				 _localctx.code.extend(((ProgramContext)_localctx).stmt.code); 
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3))) != 0) );
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

	public static class StmtContext extends ParserRuleContext {
		public Code code;
		public AssignmentContext assignment;
		public PrintStmtContext printStmt;
		public WhileStmtContext whileStmt;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(35);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				((StmtContext)_localctx).assignment = assignment();
				 ((StmtContext)_localctx).code =  ((StmtContext)_localctx).assignment.code; 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				((StmtContext)_localctx).printStmt = printStmt();
				 ((StmtContext)_localctx).code =  ((StmtContext)_localctx).printStmt.code; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				((StmtContext)_localctx).whileStmt = whileStmt();
				 ((StmtContext)_localctx).code =  ((StmtContext)_localctx).whileStmt.code; 
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

	public static class AssignmentContext extends ParserRuleContext {
		public Code code;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__0);
			setState(38);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(39);
			match(T__1);
			setState(40);
			((AssignmentContext)_localctx).expr = expr(0);
			 int register = sym.resolve((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), true);
			        ((AssignmentContext)_localctx).code =  new Code()
			                    .extend(((AssignmentContext)_localctx).expr.code)
			                    .append(I.ISTORE(register));

			      
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

	public static class PrintStmtContext extends ParserRuleContext {
		public Code code;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__2);
			setState(44);
			((PrintStmtContext)_localctx).expr = expr(0);
			 ((PrintStmtContext)_localctx).code =  new Code()
			                    .append(I.GetPrintStream())
			                    .extend(((PrintStmtContext)_localctx).expr.code)
			                    .append(I.invokePrintln());
			      
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

	public static class WhileStmtContext extends ParserRuleContext {
		public Code code;
		public CondContext cond;
		public ProgramContext program;
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__3);
			setState(48);
			match(T__4);
			setState(49);
			((WhileStmtContext)_localctx).cond = cond();
			setState(50);
			match(T__5);
			setState(51);
			match(T__6);
			setState(52);
			((WhileStmtContext)_localctx).program = program();
			setState(53);
			match(T__7);

			        String start = Code.newLabel();
			        String end   = Code.newLabel();
			        ((WhileStmtContext)_localctx).code =  new Code()
			                    .append(I.Label(start))
			                    .extend(((WhileStmtContext)_localctx).cond.code)
			                    .append(I.IFZERO(end))
			                    .extend(((WhileStmtContext)_localctx).program.code)
			                    .append(I.GOTO(start))
			                    .append(I.Label(end));
			      
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

	public static class ExprContext extends ParserRuleContext {
		public Code code;
		public ExprContext e1;
		public Token ID;
		public Token Num;
		public ExprContext expr;
		public Token OP;
		public ExprContext e2;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode Num() { return getToken(SimpleParser.Num, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP() { return getToken(SimpleParser.OP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(57);
				((ExprContext)_localctx).ID = match(ID);
				  int register = sym.resolve((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), false);
				                ((ExprContext)_localctx).code =  new Code();
				                if(register < 0)
				                    _localctx.code.append(I.LDC(0));
				                else
				                    _localctx.code.append(I.ILOAD(register));
				            
				}
				break;
			case Num:
				{
				setState(59);
				((ExprContext)_localctx).Num = match(Num);
				   ((ExprContext)_localctx).code =  new Code().append(I.LDC((((ExprContext)_localctx).Num!=null?((ExprContext)_localctx).Num.getText():null)));
				            
				}
				break;
			case T__4:
				{
				setState(61);
				match(T__4);
				setState(62);
				((ExprContext)_localctx).expr = expr(0);

				                ((ExprContext)_localctx).code =  _localctx.code;
				            
				setState(64);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					_localctx.e1 = _prevctx;
					_localctx.e1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(68);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(69);
					((ExprContext)_localctx).OP = match(OP);
					setState(70);
					((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(2);

					                          ((ExprContext)_localctx).code =  new Code()
					                                      .extend(((ExprContext)_localctx).e1.code)
					                                      .extend(((ExprContext)_localctx).e2.code)
					                                      .append(I.Op((((ExprContext)_localctx).OP!=null?((ExprContext)_localctx).OP.getText():null)));
					                      
					}
					} 
				}
				setState(77);
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

	public static class CondContext extends ParserRuleContext {
		public Code code;
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((CondContext)_localctx).e1 = expr(0);
			setState(79);
			match(T__8);
			setState(80);
			((CondContext)_localctx).e2 = expr(0);

			                String l1 = Code.newLabel();
			                String l2 = Code.newLabel();
			                ((CondContext)_localctx).code =  new Code()
			                            .extend(((CondContext)_localctx).e1.code)
			                            .extend(((CondContext)_localctx).e2.code)
			                            .append(I.ISUB())
			                            .append(I.IFGE(l1))
			                            .append(I.LDC(1))
			                            .append(I.GOTO(l2))
			                            .append(I.Label(l1))
			                            .append(I.LDC(0))
			                            .append(I.Label(l2));
			            
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17V\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\6\3\31\n\3\r\3\16\3\32\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4&\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bE\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\bL\n\b\f\b\16\bO\13\b\3\t\3\t\3\t\3\t\3\t\3\t\2\3\16\n\2\4"+
		"\6\b\n\f\16\20\2\2S\2\22\3\2\2\2\4\30\3\2\2\2\6%\3\2\2\2\b\'\3\2\2\2\n"+
		"-\3\2\2\2\f\61\3\2\2\2\16D\3\2\2\2\20P\3\2\2\2\22\23\5\4\3\2\23\24\b\2"+
		"\1\2\24\3\3\2\2\2\25\26\5\6\4\2\26\27\b\3\1\2\27\31\3\2\2\2\30\25\3\2"+
		"\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\5\3\2\2\2\34\35\5\b"+
		"\5\2\35\36\b\4\1\2\36&\3\2\2\2\37 \5\n\6\2 !\b\4\1\2!&\3\2\2\2\"#\5\f"+
		"\7\2#$\b\4\1\2$&\3\2\2\2%\34\3\2\2\2%\37\3\2\2\2%\"\3\2\2\2&\7\3\2\2\2"+
		"\'(\7\3\2\2()\7\r\2\2)*\7\4\2\2*+\5\16\b\2+,\b\5\1\2,\t\3\2\2\2-.\7\5"+
		"\2\2./\5\16\b\2/\60\b\6\1\2\60\13\3\2\2\2\61\62\7\6\2\2\62\63\7\7\2\2"+
		"\63\64\5\20\t\2\64\65\7\b\2\2\65\66\7\t\2\2\66\67\5\4\3\2\678\7\n\2\2"+
		"89\b\7\1\29\r\3\2\2\2:;\b\b\1\2;<\7\r\2\2<E\b\b\1\2=>\7\f\2\2>E\b\b\1"+
		"\2?@\7\7\2\2@A\5\16\b\2AB\b\b\1\2BC\7\b\2\2CE\3\2\2\2D:\3\2\2\2D=\3\2"+
		"\2\2D?\3\2\2\2EM\3\2\2\2FG\f\3\2\2GH\7\16\2\2HI\5\16\b\4IJ\b\b\1\2JL\3"+
		"\2\2\2KF\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\17\3\2\2\2OM\3\2\2\2P"+
		"Q\5\16\b\2QR\7\13\2\2RS\5\16\b\2ST\b\t\1\2T\21\3\2\2\2\6\32%DM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}