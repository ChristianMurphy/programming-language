// Generated from Team8.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Team8Parser}.
 */
public interface Team8Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Team8Parser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(Team8Parser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(Team8Parser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(Team8Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(Team8Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(Team8Parser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(Team8Parser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(Team8Parser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(Team8Parser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#numberFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNumberFunctionDeclaration(Team8Parser.NumberFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#numberFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNumberFunctionDeclaration(Team8Parser.NumberFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#stringFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStringFunctionDeclaration(Team8Parser.StringFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#stringFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStringFunctionDeclaration(Team8Parser.StringFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#booleanFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFunctionDeclaration(Team8Parser.BooleanFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#booleanFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFunctionDeclaration(Team8Parser.BooleanFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#callParameters}.
	 * @param ctx the parse tree
	 */
	void enterCallParameters(Team8Parser.CallParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#callParameters}.
	 * @param ctx the parse tree
	 */
	void exitCallParameters(Team8Parser.CallParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(Team8Parser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(Team8Parser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(Team8Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(Team8Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#numberParameter}.
	 * @param ctx the parse tree
	 */
	void enterNumberParameter(Team8Parser.NumberParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#numberParameter}.
	 * @param ctx the parse tree
	 */
	void exitNumberParameter(Team8Parser.NumberParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#stringParameter}.
	 * @param ctx the parse tree
	 */
	void enterStringParameter(Team8Parser.StringParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#stringParameter}.
	 * @param ctx the parse tree
	 */
	void exitStringParameter(Team8Parser.StringParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#booleanParameter}.
	 * @param ctx the parse tree
	 */
	void enterBooleanParameter(Team8Parser.BooleanParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#booleanParameter}.
	 * @param ctx the parse tree
	 */
	void exitBooleanParameter(Team8Parser.BooleanParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(Team8Parser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(Team8Parser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(Team8Parser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(Team8Parser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(Team8Parser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(Team8Parser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Team8Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Team8Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#initialAssignment}.
	 * @param ctx the parse tree
	 */
	void enterInitialAssignment(Team8Parser.InitialAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#initialAssignment}.
	 * @param ctx the parse tree
	 */
	void exitInitialAssignment(Team8Parser.InitialAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#initialNumberAssignment}.
	 * @param ctx the parse tree
	 */
	void enterInitialNumberAssignment(Team8Parser.InitialNumberAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#initialNumberAssignment}.
	 * @param ctx the parse tree
	 */
	void exitInitialNumberAssignment(Team8Parser.InitialNumberAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#initialStringAssignment}.
	 * @param ctx the parse tree
	 */
	void enterInitialStringAssignment(Team8Parser.InitialStringAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#initialStringAssignment}.
	 * @param ctx the parse tree
	 */
	void exitInitialStringAssignment(Team8Parser.InitialStringAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#initialBooleanAssignemnt}.
	 * @param ctx the parse tree
	 */
	void enterInitialBooleanAssignemnt(Team8Parser.InitialBooleanAssignemntContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#initialBooleanAssignemnt}.
	 * @param ctx the parse tree
	 */
	void exitInitialBooleanAssignemnt(Team8Parser.InitialBooleanAssignemntContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#reassignment}.
	 * @param ctx the parse tree
	 */
	void enterReassignment(Team8Parser.ReassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#reassignment}.
	 * @param ctx the parse tree
	 */
	void exitReassignment(Team8Parser.ReassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#numberReassignment}.
	 * @param ctx the parse tree
	 */
	void enterNumberReassignment(Team8Parser.NumberReassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#numberReassignment}.
	 * @param ctx the parse tree
	 */
	void exitNumberReassignment(Team8Parser.NumberReassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#stringReassignment}.
	 * @param ctx the parse tree
	 */
	void enterStringReassignment(Team8Parser.StringReassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#stringReassignment}.
	 * @param ctx the parse tree
	 */
	void exitStringReassignment(Team8Parser.StringReassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#booleanReassignemnt}.
	 * @param ctx the parse tree
	 */
	void enterBooleanReassignemnt(Team8Parser.BooleanReassignemntContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#booleanReassignemnt}.
	 * @param ctx the parse tree
	 */
	void exitBooleanReassignemnt(Team8Parser.BooleanReassignemntContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(Team8Parser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(Team8Parser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#numberOperation}.
	 * @param ctx the parse tree
	 */
	void enterNumberOperation(Team8Parser.NumberOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#numberOperation}.
	 * @param ctx the parse tree
	 */
	void exitNumberOperation(Team8Parser.NumberOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#stringOperation}.
	 * @param ctx the parse tree
	 */
	void enterStringOperation(Team8Parser.StringOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#stringOperation}.
	 * @param ctx the parse tree
	 */
	void exitStringOperation(Team8Parser.StringOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#booleanOperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperation(Team8Parser.BooleanOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#booleanOperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperation(Team8Parser.BooleanOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(Team8Parser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(Team8Parser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#numberComparison}.
	 * @param ctx the parse tree
	 */
	void enterNumberComparison(Team8Parser.NumberComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#numberComparison}.
	 * @param ctx the parse tree
	 */
	void exitNumberComparison(Team8Parser.NumberComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link Team8Parser#stringComparison}.
	 * @param ctx the parse tree
	 */
	void enterStringComparison(Team8Parser.StringComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Team8Parser#stringComparison}.
	 * @param ctx the parse tree
	 */
	void exitStringComparison(Team8Parser.StringComparisonContext ctx);
}