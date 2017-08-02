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
		T__9=10, T__10=11, T__11=12, Num=13, ID=14, OP=15, WS=16;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_printProgram = 2, RULE_pstmt = 3, 
		RULE_stmt = 4, RULE_assignment = 5, RULE_printStmt = 6, RULE_print2Stmt = 7, 
		RULE_print3Stmt = 8, RULE_printExpr = 9, RULE_printExprEnd = 10, RULE_whileStmt = 11, 
		RULE_repeatStmt = 12, RULE_expr = 13, RULE_cond = 14, RULE_repeatCond = 15;
	public static final String[] ruleNames = {
		"start", "program", "printProgram", "pstmt", "stmt", "assignment", "printStmt", 
		"print2Stmt", "print3Stmt", "printExpr", "printExprEnd", "whileStmt", 
		"repeatStmt", "expr", "cond", "repeatCond"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'let'", "'='", "'print'", "'('", "')'", "'print ('", "','", "'while'", 
		"'{'", "'}'", "'repeat'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Num", "ID", "OP", "WS"
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
			setState(32);
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
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				((ProgramContext)_localctx).stmt = stmt();
				 _localctx.code.extend(((ProgramContext)_localctx).stmt.code); 
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__10))) != 0) );
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

	public static class PrintProgramContext extends ParserRuleContext {
		public Code code;
		public PstmtContext pstmt;
		public List<PstmtContext> pstmt() {
			return getRuleContexts(PstmtContext.class);
		}
		public PstmtContext pstmt(int i) {
			return getRuleContext(PstmtContext.class,i);
		}
		public PrintProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printProgram; }
	}

	public final PrintProgramContext printProgram() throws RecognitionException {
		PrintProgramContext _localctx = new PrintProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_printProgram);

		        ((PrintProgramContext)_localctx).code =  new Code();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				((PrintProgramContext)_localctx).pstmt = pstmt();
				 _localctx.code.extend(((PrintProgramContext)_localctx).pstmt.code); 
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << Num) | (1L << ID))) != 0) );
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

	public static class PstmtContext extends ParserRuleContext {
		public Code code;
		public PrintExprContext printExpr;
		public PrintExprEndContext printExprEnd;
		public PrintExprContext printExpr() {
			return getRuleContext(PrintExprContext.class,0);
		}
		public PrintExprEndContext printExprEnd() {
			return getRuleContext(PrintExprEndContext.class,0);
		}
		public PstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pstmt; }
	}

	public final PstmtContext pstmt() throws RecognitionException {
		PstmtContext _localctx = new PstmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pstmt);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				((PstmtContext)_localctx).printExpr = printExpr();
				 ((PstmtContext)_localctx).code =  ((PstmtContext)_localctx).printExpr.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				((PstmtContext)_localctx).printExprEnd = printExprEnd();
				 ((PstmtContext)_localctx).code =  ((PstmtContext)_localctx).printExprEnd.code; 
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

	public static class StmtContext extends ParserRuleContext {
		public Code code;
		public AssignmentContext assignment;
		public PrintStmtContext printStmt;
		public Print2StmtContext print2Stmt;
		public Print3StmtContext print3Stmt;
		public WhileStmtContext whileStmt;
		public RepeatStmtContext repeatStmt;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public Print2StmtContext print2Stmt() {
			return getRuleContext(Print2StmtContext.class,0);
		}
		public Print3StmtContext print3Stmt() {
			return getRuleContext(Print3StmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public RepeatStmtContext repeatStmt() {
			return getRuleContext(RepeatStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				((StmtContext)_localctx).assignment = assignment();
				 ((StmtContext)_localctx).code =  ((StmtContext)_localctx).assignment.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				((StmtContext)_localctx).printStmt = printStmt();
				 ((StmtContext)_localctx).code =  ((StmtContext)_localctx).printStmt.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				((StmtContext)_localctx).print2Stmt = print2Stmt();
				 ((StmtContext)_localctx).code =  ((StmtContext)_localctx).print2Stmt.code; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				((StmtContext)_localctx).print3Stmt = print3Stmt();
				 ((StmtContext)_localctx).code =  ((StmtContext)_localctx).print3Stmt.code; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				((StmtContext)_localctx).whileStmt = whileStmt();
				 ((StmtContext)_localctx).code =  ((StmtContext)_localctx).whileStmt.code; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				((StmtContext)_localctx).repeatStmt = repeatStmt();
				 ((StmtContext)_localctx).code =  ((StmtContext)_localctx).repeatStmt.code; 
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
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__0);
			setState(78);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(79);
			match(T__1);
			setState(80);
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
		public ExprContext e1;
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
		enterRule(_localctx, 12, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__2);
			setState(84);
			match(T__3);
			setState(85);
			((PrintStmtContext)_localctx).e1 = expr(0);
			setState(86);
			match(T__4);
			 ((PrintStmtContext)_localctx).code =  new Code()
			                    .append(I.GetPrintStream())
			                    .extend(((PrintStmtContext)_localctx).e1.code) 
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

	public static class Print2StmtContext extends ParserRuleContext {
		public Code code;
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Print2StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print2Stmt; }
	}

	public final Print2StmtContext print2Stmt() throws RecognitionException {
		Print2StmtContext _localctx = new Print2StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print2Stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__5);
			setState(90);
			((Print2StmtContext)_localctx).e1 = expr(0);
			setState(91);
			match(T__6);
			setState(92);
			((Print2StmtContext)_localctx).e2 = expr(0);
			setState(93);
			match(T__4);
			 ((Print2StmtContext)_localctx).code =  new Code()
			                    .append(I.GetPrintStream())
			                    .extend(((Print2StmtContext)_localctx).e1.code) 
			                    .append(I.invokePrint())
			                    .append(I.GetPrintStream())
			                    .append(I.ISPACE())
			                    .append(I.invokePrintS())
			                    .append(I.GetPrintStream())
			                    .extend(((Print2StmtContext)_localctx).e2.code) 
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

	public static class Print3StmtContext extends ParserRuleContext {
		public Code code;
		public PrintProgramContext printProgram;
		public PrintProgramContext printProgram() {
			return getRuleContext(PrintProgramContext.class,0);
		}
		public Print3StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print3Stmt; }
	}

	public final Print3StmtContext print3Stmt() throws RecognitionException {
		Print3StmtContext _localctx = new Print3StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print3Stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__2);
			setState(97);
			match(T__3);
			setState(98);
			((Print3StmtContext)_localctx).printProgram = printProgram();
			setState(99);
			match(T__4);
			 ((Print3StmtContext)_localctx).code =  new Code()
			                   .extend(((Print3StmtContext)_localctx).printProgram.code);
			      
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

	public static class PrintExprContext extends ParserRuleContext {
		public Code code;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpr; }
	}

	public final PrintExprContext printExpr() throws RecognitionException {
		PrintExprContext _localctx = new PrintExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((PrintExprContext)_localctx).expr = expr(0);
			setState(103);
			match(T__6);
			 ((PrintExprContext)_localctx).code =  new Code()
			                    .append(I.GetPrintStream())
			                    .extend(((PrintExprContext)_localctx).expr.code) 
			                    .append(I.invokePrint())
			                    .append(I.GetPrintStream())
			                    .append(I.ISPACE())
			                    .append(I.invokePrintS());
			    
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

	public static class PrintExprEndContext extends ParserRuleContext {
		public Code code;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExprEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExprEnd; }
	}

	public final PrintExprEndContext printExprEnd() throws RecognitionException {
		PrintExprEndContext _localctx = new PrintExprEndContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printExprEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((PrintExprEndContext)_localctx).expr = expr(0);
			 ((PrintExprEndContext)_localctx).code =  new Code()
			                    .append(I.GetPrintStream())
			                    .extend(((PrintExprEndContext)_localctx).expr.code) 
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
		enterRule(_localctx, 22, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__7);
			setState(110);
			match(T__3);
			setState(111);
			((WhileStmtContext)_localctx).cond = cond();
			setState(112);
			match(T__4);
			setState(113);
			match(T__8);
			setState(114);
			((WhileStmtContext)_localctx).program = program();
			setState(115);
			match(T__9);

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

	public static class RepeatStmtContext extends ParserRuleContext {
		public Code code;
		public ExprContext expr;
		public ProgramContext program;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public RepeatStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStmt; }
	}

	public final RepeatStmtContext repeatStmt() throws RecognitionException {
		RepeatStmtContext _localctx = new RepeatStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_repeatStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__10);
			setState(119);
			((RepeatStmtContext)_localctx).expr = expr(0);
			setState(120);
			match(T__8);
			setState(121);
			((RepeatStmtContext)_localctx).program = program();
			setState(122);
			match(T__9);

			        String l1 = Code.newLabel();
			        String l2 = Code.newLabel();
			        String start = Code.newLabel();
			        String end = Code.newLabel();
			        int register = sym.resolve((((RepeatStmtContext)_localctx).expr!=null?_input.getText(((RepeatStmtContext)_localctx).expr.start,((RepeatStmtContext)_localctx).expr.stop):null), true);
			        ((RepeatStmtContext)_localctx).code =  new Code()
			                .extend(((RepeatStmtContext)_localctx).expr.code)
			                .append(I.ISTORE(register))
			                .append(I.Label(start))
			                .append(I.LDC(0))
			                .append(I.ILOAD(register))
			                .append(I.ISUB())
			                .append(I.IFGE(l1))
			                .append(I.LDC(1))
			                .append(I.GOTO(l2))
			                .append(I.Label(l1))
			                .append(I.LDC(0))
			                .append(I.Label(l2))
			                .append(I.IFZERO(end))
			                .extend(((RepeatStmtContext)_localctx).program.code)
			                .append(I.ILOAD(register))
			                .append(I.LDC(1))
			                .append(I.ISUB())
			                .append(I.ISTORE(register))
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
		public ExprContext expr;
		public Token ID;
		public Token Num;
		public Token OP;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode Num() { return getToken(SimpleParser.Num, 0); }
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(126);
				match(T__3);
				setState(127);
				((ExprContext)_localctx).expr = expr(3);

				                ((ExprContext)_localctx).code =  _localctx.code;
				            
				}
				break;
			case 2:
				{
				setState(130);
				((ExprContext)_localctx).ID = match(ID);
				  int register = sym.resolve((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), false);
				                ((ExprContext)_localctx).code =  new Code();
				                if(register < 0)
				                    _localctx.code.append(I.LDC(0));
				                else
				                    _localctx.code.append(I.ILOAD(register));
				            
				}
				break;
			case 3:
				{
				setState(132);
				((ExprContext)_localctx).Num = match(Num);
				   ((ExprContext)_localctx).code =  new Code().append(I.LDC((((ExprContext)_localctx).Num!=null?((ExprContext)_localctx).Num.getText():null)));
				            
				}
				break;
			case 4:
				{
				setState(134);
				match(T__3);
				setState(135);
				((ExprContext)_localctx).e1 = ((ExprContext)_localctx).expr = expr(0);
				setState(136);
				((ExprContext)_localctx).OP = match(OP);
				setState(137);
				((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(0);
				setState(138);
				match(T__4);

				                ((ExprContext)_localctx).code =  new Code()
				                            .extend(((ExprContext)_localctx).e1.code)
				                            .extend(((ExprContext)_localctx).e2.code)
				                            .append(I.Op((((ExprContext)_localctx).OP!=null?((ExprContext)_localctx).OP.getText():null)));
				            
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
					setState(143);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(144);
					((ExprContext)_localctx).OP = match(OP);
					setState(145);
					((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(3);

					                          ((ExprContext)_localctx).code =  new Code()
					                                      .extend(((ExprContext)_localctx).e1.code)
					                                      .extend(((ExprContext)_localctx).e2.code)
					                                      .append(I.Op((((ExprContext)_localctx).OP!=null?((ExprContext)_localctx).OP.getText():null)));
					                      
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 28, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((CondContext)_localctx).e1 = expr(0);
			setState(154);
			match(T__11);
			setState(155);
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

	public static class RepeatCondContext extends ParserRuleContext {
		public Code code;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RepeatCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatCond; }
	}

	public final RepeatCondContext repeatCond() throws RecognitionException {
		RepeatCondContext _localctx = new RepeatCondContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_repeatCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			expr(0);

			                String l1 = Code.newLabel();
			                String l2 = Code.newLabel();
			                ((RepeatCondContext)_localctx).code =  new Code()
			                            .append(I.LDC(0))
			                            .append(I.ILOAD(1))
			                            .append(I.ISUB());
			        
			        
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
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22\u00a4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\6\3)\n\3\r\3\16\3*\3\4\3\4\3\4\6\4\60\n\4\r\4\16\4\61"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5:\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0090\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u0097\n\17\f\17\16\17\u009a\13\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\2\3\34\22\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \2\2\u009f\2\"\3\2\2\2\4(\3\2\2\2\6/\3\2\2\2\b9\3\2\2"+
		"\2\nM\3\2\2\2\fO\3\2\2\2\16U\3\2\2\2\20[\3\2\2\2\22b\3\2\2\2\24h\3\2\2"+
		"\2\26l\3\2\2\2\30o\3\2\2\2\32x\3\2\2\2\34\u008f\3\2\2\2\36\u009b\3\2\2"+
		"\2 \u00a0\3\2\2\2\"#\5\4\3\2#$\b\2\1\2$\3\3\2\2\2%&\5\n\6\2&\'\b\3\1\2"+
		"\')\3\2\2\2(%\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,-\5\b\5"+
		"\2-.\b\4\1\2.\60\3\2\2\2/,\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2"+
		"\2\2\62\7\3\2\2\2\63\64\5\24\13\2\64\65\b\5\1\2\65:\3\2\2\2\66\67\5\26"+
		"\f\2\678\b\5\1\28:\3\2\2\29\63\3\2\2\29\66\3\2\2\2:\t\3\2\2\2;<\5\f\7"+
		"\2<=\b\6\1\2=N\3\2\2\2>?\5\16\b\2?@\b\6\1\2@N\3\2\2\2AB\5\20\t\2BC\b\6"+
		"\1\2CN\3\2\2\2DE\5\22\n\2EF\b\6\1\2FN\3\2\2\2GH\5\30\r\2HI\b\6\1\2IN\3"+
		"\2\2\2JK\5\32\16\2KL\b\6\1\2LN\3\2\2\2M;\3\2\2\2M>\3\2\2\2MA\3\2\2\2M"+
		"D\3\2\2\2MG\3\2\2\2MJ\3\2\2\2N\13\3\2\2\2OP\7\3\2\2PQ\7\20\2\2QR\7\4\2"+
		"\2RS\5\34\17\2ST\b\7\1\2T\r\3\2\2\2UV\7\5\2\2VW\7\6\2\2WX\5\34\17\2XY"+
		"\7\7\2\2YZ\b\b\1\2Z\17\3\2\2\2[\\\7\b\2\2\\]\5\34\17\2]^\7\t\2\2^_\5\34"+
		"\17\2_`\7\7\2\2`a\b\t\1\2a\21\3\2\2\2bc\7\5\2\2cd\7\6\2\2de\5\6\4\2ef"+
		"\7\7\2\2fg\b\n\1\2g\23\3\2\2\2hi\5\34\17\2ij\7\t\2\2jk\b\13\1\2k\25\3"+
		"\2\2\2lm\5\34\17\2mn\b\f\1\2n\27\3\2\2\2op\7\n\2\2pq\7\6\2\2qr\5\36\20"+
		"\2rs\7\7\2\2st\7\13\2\2tu\5\4\3\2uv\7\f\2\2vw\b\r\1\2w\31\3\2\2\2xy\7"+
		"\r\2\2yz\5\34\17\2z{\7\13\2\2{|\5\4\3\2|}\7\f\2\2}~\b\16\1\2~\33\3\2\2"+
		"\2\177\u0080\b\17\1\2\u0080\u0081\7\6\2\2\u0081\u0082\5\34\17\5\u0082"+
		"\u0083\b\17\1\2\u0083\u0090\3\2\2\2\u0084\u0085\7\20\2\2\u0085\u0090\b"+
		"\17\1\2\u0086\u0087\7\17\2\2\u0087\u0090\b\17\1\2\u0088\u0089\7\6\2\2"+
		"\u0089\u008a\5\34\17\2\u008a\u008b\7\21\2\2\u008b\u008c\5\34\17\2\u008c"+
		"\u008d\7\7\2\2\u008d\u008e\b\17\1\2\u008e\u0090\3\2\2\2\u008f\177\3\2"+
		"\2\2\u008f\u0084\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0088\3\2\2\2\u0090"+
		"\u0098\3\2\2\2\u0091\u0092\f\4\2\2\u0092\u0093\7\21\2\2\u0093\u0094\5"+
		"\34\17\5\u0094\u0095\b\17\1\2\u0095\u0097\3\2\2\2\u0096\u0091\3\2\2\2"+
		"\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\35"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\5\34\17\2\u009c\u009d\7\16\2"+
		"\2\u009d\u009e\5\34\17\2\u009e\u009f\b\20\1\2\u009f\37\3\2\2\2\u00a0\u00a1"+
		"\5\34\17\2\u00a1\u00a2\b\21\1\2\u00a2!\3\2\2\2\b*\619M\u008f\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}