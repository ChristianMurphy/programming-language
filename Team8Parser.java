// Generated from Team8.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Team8Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, NUMBEROPERATOR=17, 
		STRINGOPERATOR=18, BOOLEANOPERATOR=19, NUMBERCOMPARITOR=20, STRINGCOMPARITOR=21, 
		IDENTIFIER=22, NUMBER=23, STRING=24, BOOLEAN=25, WHITESPACE=26, COMMENT=27;
	public static final int
		RULE_root = 0, RULE_function = 1, RULE_functionCall = 2, RULE_functionDeclaration = 3, 
		RULE_numberFunctionDeclaration = 4, RULE_stringFunctionDeclaration = 5, 
		RULE_booleanFunctionDeclaration = 6, RULE_callParameters = 7, RULE_parameters = 8, 
		RULE_parameter = 9, RULE_numberParameter = 10, RULE_stringParameter = 11, 
		RULE_booleanParameter = 12, RULE_loop = 13, RULE_whileLoop = 14, RULE_forLoop = 15, 
		RULE_assignment = 16, RULE_initialAssignment = 17, RULE_initialNumberAssignment = 18, 
		RULE_initialStringAssignment = 19, RULE_initialBooleanAssignemnt = 20, 
		RULE_reassignment = 21, RULE_numberReassignment = 22, RULE_stringReassignment = 23, 
		RULE_booleanReassignemnt = 24, RULE_operation = 25, RULE_numberOperation = 26, 
		RULE_stringOperation = 27, RULE_booleanOperation = 28, RULE_comparison = 29, 
		RULE_numberComparison = 30, RULE_stringComparison = 31;
	public static final String[] ruleNames = {
		"root", "function", "functionCall", "functionDeclaration", "numberFunctionDeclaration", 
		"stringFunctionDeclaration", "booleanFunctionDeclaration", "callParameters", 
		"parameters", "parameter", "numberParameter", "stringParameter", "booleanParameter", 
		"loop", "whileLoop", "forLoop", "assignment", "initialAssignment", "initialNumberAssignment", 
		"initialStringAssignment", "initialBooleanAssignemnt", "reassignment", 
		"numberReassignment", "stringReassignment", "booleanReassignemnt", "operation", 
		"numberOperation", "stringOperation", "booleanOperation", "comparison", 
		"numberComparison", "stringComparison"
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

	@Override
	public String getGrammarFileName() { return "Team8.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Team8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(69);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(64);
					operation();
					}
					break;
				case 2:
					{
					setState(65);
					comparison();
					}
					break;
				case 3:
					{
					setState(66);
					assignment();
					}
					break;
				case 4:
					{
					setState(67);
					loop();
					}
					break;
				case 5:
					{
					setState(68);
					function();
					}
					break;
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN))) != 0) );
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			setState(75);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				functionCall();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				functionDeclaration();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Team8Parser.IDENTIFIER, 0); }
		public CallParametersContext callParameters() {
			return getRuleContext(CallParametersContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(IDENTIFIER);
			setState(78);
			match(T__0);
			setState(79);
			callParameters();
			setState(80);
			match(T__1);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public NumberFunctionDeclarationContext numberFunctionDeclaration() {
			return getRuleContext(NumberFunctionDeclarationContext.class,0);
		}
		public StringFunctionDeclarationContext stringFunctionDeclaration() {
			return getRuleContext(StringFunctionDeclarationContext.class,0);
		}
		public BooleanFunctionDeclarationContext booleanFunctionDeclaration() {
			return getRuleContext(BooleanFunctionDeclarationContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				numberFunctionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				stringFunctionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				booleanFunctionDeclaration();
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

	public static class NumberFunctionDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Team8Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Team8Parser.IDENTIFIER, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public RootContext root() {
			return getRuleContext(RootContext.class,0);
		}
		public NumberFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterNumberFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitNumberFunctionDeclaration(this);
		}
	}

	public final NumberFunctionDeclarationContext numberFunctionDeclaration() throws RecognitionException {
		NumberFunctionDeclarationContext _localctx = new NumberFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numberFunctionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__2);
			setState(88);
			match(T__3);
			setState(89);
			match(IDENTIFIER);
			setState(90);
			match(T__0);
			setState(91);
			parameters();
			setState(92);
			match(T__1);
			setState(93);
			match(T__4);
			setState(94);
			root();
			setState(95);
			match(T__5);
			setState(96);
			match(IDENTIFIER);
			setState(97);
			match(T__6);
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

	public static class StringFunctionDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Team8Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Team8Parser.IDENTIFIER, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public RootContext root() {
			return getRuleContext(RootContext.class,0);
		}
		public StringFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterStringFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitStringFunctionDeclaration(this);
		}
	}

	public final StringFunctionDeclarationContext stringFunctionDeclaration() throws RecognitionException {
		StringFunctionDeclarationContext _localctx = new StringFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stringFunctionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__2);
			setState(100);
			match(T__7);
			setState(101);
			match(IDENTIFIER);
			setState(102);
			match(T__0);
			setState(103);
			parameters();
			setState(104);
			match(T__1);
			setState(105);
			match(T__4);
			setState(106);
			root();
			setState(107);
			match(T__5);
			setState(108);
			match(IDENTIFIER);
			setState(109);
			match(T__6);
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

	public static class BooleanFunctionDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Team8Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Team8Parser.IDENTIFIER, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public RootContext root() {
			return getRuleContext(RootContext.class,0);
		}
		public BooleanFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterBooleanFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitBooleanFunctionDeclaration(this);
		}
	}

	public final BooleanFunctionDeclarationContext booleanFunctionDeclaration() throws RecognitionException {
		BooleanFunctionDeclarationContext _localctx = new BooleanFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_booleanFunctionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__2);
			setState(112);
			match(T__8);
			setState(113);
			match(IDENTIFIER);
			setState(114);
			match(T__0);
			setState(115);
			parameters();
			setState(116);
			match(T__1);
			setState(117);
			match(T__4);
			setState(118);
			root();
			setState(119);
			match(T__5);
			setState(120);
			match(IDENTIFIER);
			setState(121);
			match(T__6);
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

	public static class CallParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Team8Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Team8Parser.IDENTIFIER, i);
		}
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public CallParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterCallParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitCallParameters(this);
		}
	}

	public final CallParametersContext callParameters() throws RecognitionException {
		CallParametersContext _localctx = new CallParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN))) != 0)) {
				{
				setState(126);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(123);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(124);
					comparison();
					}
					break;
				case 3:
					{
					setState(125);
					operation();
					}
					break;
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(128);
					match(T__9);
					setState(132);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(129);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(130);
						comparison();
						}
						break;
					case 3:
						{
						setState(131);
						operation();
						}
						break;
					}
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				setState(141);
				parameter();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(142);
					match(T__9);
					setState(143);
					parameter();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class ParameterContext extends ParserRuleContext {
		public NumberParameterContext numberParameter() {
			return getRuleContext(NumberParameterContext.class,0);
		}
		public StringParameterContext stringParameter() {
			return getRuleContext(StringParameterContext.class,0);
		}
		public BooleanParameterContext booleanParameter() {
			return getRuleContext(BooleanParameterContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		try {
			setState(154);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				numberParameter();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				stringParameter();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				booleanParameter();
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

	public static class NumberParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Team8Parser.IDENTIFIER, 0); }
		public NumberParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterNumberParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitNumberParameter(this);
		}
	}

	public final NumberParameterContext numberParameter() throws RecognitionException {
		NumberParameterContext _localctx = new NumberParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numberParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__3);
			setState(157);
			match(IDENTIFIER);
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

	public static class StringParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Team8Parser.IDENTIFIER, 0); }
		public StringParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterStringParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitStringParameter(this);
		}
	}

	public final StringParameterContext stringParameter() throws RecognitionException {
		StringParameterContext _localctx = new StringParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stringParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__7);
			setState(160);
			match(IDENTIFIER);
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

	public static class BooleanParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Team8Parser.IDENTIFIER, 0); }
		public BooleanParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterBooleanParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitBooleanParameter(this);
		}
	}

	public final BooleanParameterContext booleanParameter() throws RecognitionException {
		BooleanParameterContext _localctx = new BooleanParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_booleanParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__8);
			setState(163);
			match(IDENTIFIER);
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

	public static class LoopContext extends ParserRuleContext {
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loop);
		try {
			setState(167);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				whileLoop();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				forLoop();
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

	public static class WhileLoopContext extends ParserRuleContext {
		public RootContext root() {
			return getRuleContext(RootContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Team8Parser.IDENTIFIER, 0); }
		public BooleanOperationContext booleanOperation() {
			return getRuleContext(BooleanOperationContext.class,0);
		}
		public NumberComparisonContext numberComparison() {
			return getRuleContext(NumberComparisonContext.class,0);
		}
		public StringComparisonContext stringComparison() {
			return getRuleContext(StringComparisonContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__10);
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(170);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(171);
				booleanOperation();
				}
				break;
			case 3:
				{
				setState(172);
				numberComparison();
				}
				break;
			case 4:
				{
				setState(173);
				stringComparison();
				}
				break;
			}
			setState(176);
			match(T__4);
			setState(177);
			root();
			setState(178);
			match(T__6);
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

	public static class ForLoopContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Team8Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Team8Parser.IDENTIFIER, i);
		}
		public RootContext root() {
			return getRuleContext(RootContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(Team8Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Team8Parser.NUMBER, i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__11);
			setState(181);
			match(IDENTIFIER);
			setState(182);
			match(T__12);
			setState(183);
			match(T__13);
			setState(184);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(185);
			match(T__14);
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(187);
			match(T__4);
			setState(188);
			root();
			setState(189);
			match(T__6);
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
		public InitialAssignmentContext initialAssignment() {
			return getRuleContext(InitialAssignmentContext.class,0);
		}
		public ReassignmentContext reassignment() {
			return getRuleContext(ReassignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			setState(193);
			switch (_input.LA(1)) {
			case T__3:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				initialAssignment();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				reassignment();
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

	public static class InitialAssignmentContext extends ParserRuleContext {
		public InitialNumberAssignmentContext initialNumberAssignment() {
			return getRuleContext(InitialNumberAssignmentContext.class,0);
		}
		public InitialStringAssignmentContext initialStringAssignment() {
			return getRuleContext(InitialStringAssignmentContext.class,0);
		}
		public InitialBooleanAssignemntContext initialBooleanAssignemnt() {
			return getRuleContext(InitialBooleanAssignemntContext.class,0);
		}
		public InitialAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterInitialAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitInitialAssignment(this);
		}
	}

	public final InitialAssignmentContext initialAssignment() throws RecognitionException {
		InitialAssignmentContext _localctx = new InitialAssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_initialAssignment);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				initialNumberAssignment();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				initialStringAssignment();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				initialBooleanAssignemnt();
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

	public static class InitialNumberAssignmentContext extends ParserRuleContext {
		public NumberReassignmentContext numberReassignment() {
			return getRuleContext(NumberReassignmentContext.class,0);
		}
		public InitialNumberAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialNumberAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterInitialNumberAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitInitialNumberAssignment(this);
		}
	}

	public final InitialNumberAssignmentContext initialNumberAssignment() throws RecognitionException {
		InitialNumberAssignmentContext _localctx = new InitialNumberAssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_initialNumberAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__3);
			setState(201);
			numberReassignment();
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

	public static class InitialStringAssignmentContext extends ParserRuleContext {
		public StringReassignmentContext stringReassignment() {
			return getRuleContext(StringReassignmentContext.class,0);
		}
		public InitialStringAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialStringAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterInitialStringAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitInitialStringAssignment(this);
		}
	}

	public final InitialStringAssignmentContext initialStringAssignment() throws RecognitionException {
		InitialStringAssignmentContext _localctx = new InitialStringAssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_initialStringAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__7);
			setState(204);
			stringReassignment();
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

	public static class InitialBooleanAssignemntContext extends ParserRuleContext {
		public BooleanReassignemntContext booleanReassignemnt() {
			return getRuleContext(BooleanReassignemntContext.class,0);
		}
		public InitialBooleanAssignemntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialBooleanAssignemnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterInitialBooleanAssignemnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitInitialBooleanAssignemnt(this);
		}
	}

	public final InitialBooleanAssignemntContext initialBooleanAssignemnt() throws RecognitionException {
		InitialBooleanAssignemntContext _localctx = new InitialBooleanAssignemntContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_initialBooleanAssignemnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__8);
			setState(207);
			booleanReassignemnt();
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

	public static class ReassignmentContext extends ParserRuleContext {
		public NumberReassignmentContext numberReassignment() {
			return getRuleContext(NumberReassignmentContext.class,0);
		}
		public StringReassignmentContext stringReassignment() {
			return getRuleContext(StringReassignmentContext.class,0);
		}
		public BooleanReassignemntContext booleanReassignemnt() {
			return getRuleContext(BooleanReassignemntContext.class,0);
		}
		public ReassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterReassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitReassignment(this);
		}
	}

	public final ReassignmentContext reassignment() throws RecognitionException {
		ReassignmentContext _localctx = new ReassignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_reassignment);
		try {
			setState(212);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				numberReassignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				stringReassignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				booleanReassignemnt();
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

	public static class NumberReassignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Team8Parser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(Team8Parser.NUMBER, 0); }
		public NumberOperationContext numberOperation() {
			return getRuleContext(NumberOperationContext.class,0);
		}
		public NumberReassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberReassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterNumberReassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitNumberReassignment(this);
		}
	}

	public final NumberReassignmentContext numberReassignment() throws RecognitionException {
		NumberReassignmentContext _localctx = new NumberReassignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_numberReassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(IDENTIFIER);
			setState(215);
			match(T__15);
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(216);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(217);
				numberOperation();
				}
				break;
			}
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

	public static class StringReassignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Team8Parser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(Team8Parser.STRING, 0); }
		public StringOperationContext stringOperation() {
			return getRuleContext(StringOperationContext.class,0);
		}
		public StringReassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringReassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterStringReassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitStringReassignment(this);
		}
	}

	public final StringReassignmentContext stringReassignment() throws RecognitionException {
		StringReassignmentContext _localctx = new StringReassignmentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_stringReassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(IDENTIFIER);
			setState(221);
			match(T__15);
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(222);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(223);
				stringOperation();
				}
				break;
			}
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

	public static class BooleanReassignemntContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Team8Parser.IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(Team8Parser.BOOLEAN, 0); }
		public BooleanOperationContext booleanOperation() {
			return getRuleContext(BooleanOperationContext.class,0);
		}
		public NumberComparisonContext numberComparison() {
			return getRuleContext(NumberComparisonContext.class,0);
		}
		public StringComparisonContext stringComparison() {
			return getRuleContext(StringComparisonContext.class,0);
		}
		public BooleanReassignemntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanReassignemnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterBooleanReassignemnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitBooleanReassignemnt(this);
		}
	}

	public final BooleanReassignemntContext booleanReassignemnt() throws RecognitionException {
		BooleanReassignemntContext _localctx = new BooleanReassignemntContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_booleanReassignemnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(IDENTIFIER);
			setState(227);
			match(T__15);
			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(228);
				match(BOOLEAN);
				}
				break;
			case 2:
				{
				setState(229);
				booleanOperation();
				}
				break;
			case 3:
				{
				setState(230);
				numberComparison();
				}
				break;
			case 4:
				{
				setState(231);
				stringComparison();
				}
				break;
			}
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

	public static class OperationContext extends ParserRuleContext {
		public StringOperationContext stringOperation() {
			return getRuleContext(StringOperationContext.class,0);
		}
		public NumberOperationContext numberOperation() {
			return getRuleContext(NumberOperationContext.class,0);
		}
		public BooleanOperationContext booleanOperation() {
			return getRuleContext(BooleanOperationContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_operation);
		try {
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				stringOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				numberOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				booleanOperation();
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

	public static class NumberOperationContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(Team8Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Team8Parser.NUMBER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Team8Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Team8Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMBEROPERATOR() { return getTokens(Team8Parser.NUMBEROPERATOR); }
		public TerminalNode NUMBEROPERATOR(int i) {
			return getToken(Team8Parser.NUMBEROPERATOR, i);
		}
		public NumberOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterNumberOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitNumberOperation(this);
		}
	}

	public final NumberOperationContext numberOperation() throws RecognitionException {
		NumberOperationContext _localctx = new NumberOperationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_numberOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(242); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(240);
				match(NUMBEROPERATOR);
				setState(241);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBEROPERATOR );
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

	public static class StringOperationContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(Team8Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(Team8Parser.STRING, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Team8Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Team8Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> STRINGOPERATOR() { return getTokens(Team8Parser.STRINGOPERATOR); }
		public TerminalNode STRINGOPERATOR(int i) {
			return getToken(Team8Parser.STRINGOPERATOR, i);
		}
		public StringOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterStringOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitStringOperation(this);
		}
	}

	public final StringOperationContext stringOperation() throws RecognitionException {
		StringOperationContext _localctx = new StringOperationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stringOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(247);
				match(STRINGOPERATOR);
				setState(248);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==STRING) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRINGOPERATOR );
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

	public static class BooleanOperationContext extends ParserRuleContext {
		public List<TerminalNode> BOOLEAN() { return getTokens(Team8Parser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(Team8Parser.BOOLEAN, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Team8Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Team8Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> BOOLEANOPERATOR() { return getTokens(Team8Parser.BOOLEANOPERATOR); }
		public TerminalNode BOOLEANOPERATOR(int i) {
			return getToken(Team8Parser.BOOLEANOPERATOR, i);
		}
		public BooleanOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterBooleanOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitBooleanOperation(this);
		}
	}

	public final BooleanOperationContext booleanOperation() throws RecognitionException {
		BooleanOperationContext _localctx = new BooleanOperationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_booleanOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==BOOLEAN) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254);
				match(BOOLEANOPERATOR);
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==BOOLEAN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BOOLEANOPERATOR );
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

	public static class ComparisonContext extends ParserRuleContext {
		public NumberComparisonContext numberComparison() {
			return getRuleContext(NumberComparisonContext.class,0);
		}
		public StringComparisonContext stringComparison() {
			return getRuleContext(StringComparisonContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_comparison);
		try {
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				numberComparison();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				stringComparison();
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

	public static class NumberComparisonContext extends ParserRuleContext {
		public TerminalNode NUMBERCOMPARITOR() { return getToken(Team8Parser.NUMBERCOMPARITOR, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(Team8Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Team8Parser.NUMBER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Team8Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Team8Parser.IDENTIFIER, i);
		}
		public NumberComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterNumberComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitNumberComparison(this);
		}
	}

	public final NumberComparisonContext numberComparison() throws RecognitionException {
		NumberComparisonContext _localctx = new NumberComparisonContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_numberComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(265);
			match(NUMBERCOMPARITOR);
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class StringComparisonContext extends ParserRuleContext {
		public TerminalNode STRINGCOMPARITOR() { return getToken(Team8Parser.STRINGCOMPARITOR, 0); }
		public List<TerminalNode> STRING() { return getTokens(Team8Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(Team8Parser.STRING, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Team8Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Team8Parser.IDENTIFIER, i);
		}
		public StringComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).enterStringComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Team8Listener ) ((Team8Listener)listener).exitStringComparison(this);
		}
	}

	public final StringComparisonContext stringComparison() throws RecognitionException {
		StringComparisonContext _localctx = new StringComparisonContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stringComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(269);
			match(STRINGCOMPARITOR);
			setState(270);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u0113\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\6\2H\n\2\r\2\16\2I\3\3\3\3\5\3N\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\5\5X\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u0081\n\t\3\t\3\t"+
		"\3\t\3\t\5\t\u0087\n\t\7\t\u0089\n\t\f\t\16\t\u008c\13\t\5\t\u008e\n\t"+
		"\3\n\3\n\3\n\7\n\u0093\n\n\f\n\16\n\u0096\13\n\5\n\u0098\n\n\3\13\3\13"+
		"\3\13\5\13\u009d\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\5\17\u00aa\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00b1\n\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\5\22\u00c4\n\22\3\23\3\23\3\23\5\23\u00c9\n\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00d7\n\27\3\30\3\30\3\30"+
		"\3\30\5\30\u00dd\n\30\3\31\3\31\3\31\3\31\5\31\u00e3\n\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u00eb\n\32\3\33\3\33\3\33\5\33\u00f0\n\33\3\34"+
		"\3\34\3\34\6\34\u00f5\n\34\r\34\16\34\u00f6\3\35\3\35\3\35\6\35\u00fc"+
		"\n\35\r\35\16\35\u00fd\3\36\3\36\3\36\6\36\u0103\n\36\r\36\16\36\u0104"+
		"\3\37\3\37\5\37\u0109\n\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\2\2\"\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\5\3\2\30\31"+
		"\4\2\30\30\32\32\4\2\30\30\33\33\u0118\2G\3\2\2\2\4M\3\2\2\2\6O\3\2\2"+
		"\2\bW\3\2\2\2\nY\3\2\2\2\fe\3\2\2\2\16q\3\2\2\2\20\u008d\3\2\2\2\22\u0097"+
		"\3\2\2\2\24\u009c\3\2\2\2\26\u009e\3\2\2\2\30\u00a1\3\2\2\2\32\u00a4\3"+
		"\2\2\2\34\u00a9\3\2\2\2\36\u00ab\3\2\2\2 \u00b6\3\2\2\2\"\u00c3\3\2\2"+
		"\2$\u00c8\3\2\2\2&\u00ca\3\2\2\2(\u00cd\3\2\2\2*\u00d0\3\2\2\2,\u00d6"+
		"\3\2\2\2.\u00d8\3\2\2\2\60\u00de\3\2\2\2\62\u00e4\3\2\2\2\64\u00ef\3\2"+
		"\2\2\66\u00f1\3\2\2\28\u00f8\3\2\2\2:\u00ff\3\2\2\2<\u0108\3\2\2\2>\u010a"+
		"\3\2\2\2@\u010e\3\2\2\2BH\5\64\33\2CH\5<\37\2DH\5\"\22\2EH\5\34\17\2F"+
		"H\5\4\3\2GB\3\2\2\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2HI\3\2\2\2"+
		"IG\3\2\2\2IJ\3\2\2\2J\3\3\2\2\2KN\5\6\4\2LN\5\b\5\2MK\3\2\2\2ML\3\2\2"+
		"\2N\5\3\2\2\2OP\7\30\2\2PQ\7\3\2\2QR\5\20\t\2RS\7\4\2\2S\7\3\2\2\2TX\5"+
		"\n\6\2UX\5\f\7\2VX\5\16\b\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\t\3\2\2\2Y"+
		"Z\7\5\2\2Z[\7\6\2\2[\\\7\30\2\2\\]\7\3\2\2]^\5\22\n\2^_\7\4\2\2_`\7\7"+
		"\2\2`a\5\2\2\2ab\7\b\2\2bc\7\30\2\2cd\7\t\2\2d\13\3\2\2\2ef\7\5\2\2fg"+
		"\7\n\2\2gh\7\30\2\2hi\7\3\2\2ij\5\22\n\2jk\7\4\2\2kl\7\7\2\2lm\5\2\2\2"+
		"mn\7\b\2\2no\7\30\2\2op\7\t\2\2p\r\3\2\2\2qr\7\5\2\2rs\7\13\2\2st\7\30"+
		"\2\2tu\7\3\2\2uv\5\22\n\2vw\7\4\2\2wx\7\7\2\2xy\5\2\2\2yz\7\b\2\2z{\7"+
		"\30\2\2{|\7\t\2\2|\17\3\2\2\2}\u0081\7\30\2\2~\u0081\5<\37\2\177\u0081"+
		"\5\64\33\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u008a"+
		"\3\2\2\2\u0082\u0086\7\f\2\2\u0083\u0087\7\30\2\2\u0084\u0087\5<\37\2"+
		"\u0085\u0087\5\64\33\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0082\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u0080\3\2\2\2\u008d\u008e\3\2\2\2\u008e\21\3\2\2\2\u008f\u0094"+
		"\5\24\13\2\u0090\u0091\7\f\2\2\u0091\u0093\5\24\13\2\u0092\u0090\3\2\2"+
		"\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u008f\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\23\3\2\2\2\u0099\u009d\5\26\f\2\u009a\u009d\5\30\r\2\u009b\u009d\5\32"+
		"\16\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\25\3\2\2\2\u009e\u009f\7\6\2\2\u009f\u00a0\7\30\2\2\u00a0\27\3\2\2\2"+
		"\u00a1\u00a2\7\n\2\2\u00a2\u00a3\7\30\2\2\u00a3\31\3\2\2\2\u00a4\u00a5"+
		"\7\13\2\2\u00a5\u00a6\7\30\2\2\u00a6\33\3\2\2\2\u00a7\u00aa\5\36\20\2"+
		"\u00a8\u00aa\5 \21\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\35"+
		"\3\2\2\2\u00ab\u00b0\7\r\2\2\u00ac\u00b1\7\30\2\2\u00ad\u00b1\5:\36\2"+
		"\u00ae\u00b1\5> \2\u00af\u00b1\5@!\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3"+
		"\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\7\7\2\2\u00b3\u00b4\5\2\2\2\u00b4\u00b5\7\t\2\2\u00b5\37\3\2\2"+
		"\2\u00b6\u00b7\7\16\2\2\u00b7\u00b8\7\30\2\2\u00b8\u00b9\7\17\2\2\u00b9"+
		"\u00ba\7\20\2\2\u00ba\u00bb\t\2\2\2\u00bb\u00bc\7\21\2\2\u00bc\u00bd\t"+
		"\2\2\2\u00bd\u00be\7\7\2\2\u00be\u00bf\5\2\2\2\u00bf\u00c0\7\t\2\2\u00c0"+
		"!\3\2\2\2\u00c1\u00c4\5$\23\2\u00c2\u00c4\5,\27\2\u00c3\u00c1\3\2\2\2"+
		"\u00c3\u00c2\3\2\2\2\u00c4#\3\2\2\2\u00c5\u00c9\5&\24\2\u00c6\u00c9\5"+
		"(\25\2\u00c7\u00c9\5*\26\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9%\3\2\2\2\u00ca\u00cb\7\6\2\2\u00cb\u00cc\5.\30\2"+
		"\u00cc\'\3\2\2\2\u00cd\u00ce\7\n\2\2\u00ce\u00cf\5\60\31\2\u00cf)\3\2"+
		"\2\2\u00d0\u00d1\7\13\2\2\u00d1\u00d2\5\62\32\2\u00d2+\3\2\2\2\u00d3\u00d7"+
		"\5.\30\2\u00d4\u00d7\5\60\31\2\u00d5\u00d7\5\62\32\2\u00d6\u00d3\3\2\2"+
		"\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7-\3\2\2\2\u00d8\u00d9"+
		"\7\30\2\2\u00d9\u00dc\7\22\2\2\u00da\u00dd\7\31\2\2\u00db\u00dd\5\66\34"+
		"\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd/\3\2\2\2\u00de\u00df"+
		"\7\30\2\2\u00df\u00e2\7\22\2\2\u00e0\u00e3\7\32\2\2\u00e1\u00e3\58\35"+
		"\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\61\3\2\2\2\u00e4\u00e5"+
		"\7\30\2\2\u00e5\u00ea\7\22\2\2\u00e6\u00eb\7\33\2\2\u00e7\u00eb\5:\36"+
		"\2\u00e8\u00eb\5> \2\u00e9\u00eb\5@!\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\63\3\2\2\2\u00ec"+
		"\u00f0\58\35\2\u00ed\u00f0\5\66\34\2\u00ee\u00f0\5:\36\2\u00ef\u00ec\3"+
		"\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\65\3\2\2\2\u00f1"+
		"\u00f4\t\2\2\2\u00f2\u00f3\7\23\2\2\u00f3\u00f5\t\2\2\2\u00f4\u00f2\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\67\3\2\2\2\u00f8\u00fb\t\3\2\2\u00f9\u00fa\7\24\2\2\u00fa\u00fc\t\3\2"+
		"\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe9\3\2\2\2\u00ff\u0102\t\4\2\2\u0100\u0101\7\25\2\2\u0101"+
		"\u0103\t\4\2\2\u0102\u0100\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105;\3\2\2\2\u0106\u0109\5> \2\u0107\u0109"+
		"\5@!\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109=\3\2\2\2\u010a\u010b"+
		"\t\2\2\2\u010b\u010c\7\26\2\2\u010c\u010d\t\2\2\2\u010d?\3\2\2\2\u010e"+
		"\u010f\t\3\2\2\u010f\u0110\7\27\2\2\u0110\u0111\t\3\2\2\u0111A\3\2\2\2"+
		"\32GIMW\u0080\u0086\u008a\u008d\u0094\u0097\u009c\u00a9\u00b0\u00c3\u00c8"+
		"\u00d6\u00dc\u00e2\u00ea\u00ef\u00f6\u00fd\u0104\u0108";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}