// Generated from Team8.g4 by ANTLR 4.5

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link Team8Listener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CustomListener implements Team8Listener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRoot(Team8Parser.RootContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRoot(Team8Parser.RootContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterContext(Team8Parser.ContextContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitContext(Team8Parser.ContextContext ctx) { }
	/**
	* {@inheritDoc}
	*
	* <p>The default implementation does nothing.</p>
	*/
	@Override public void enterSystemCall(Team8Parser.SystemCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSystemCall(Team8Parser.SystemCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVoidSystemCall(Team8Parser.VoidSystemCallContext ctx) {
		System.out.println("push " + ctx.IDENTIFIER());
		System.out.println("print");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVoidSystemCall(Team8Parser.VoidSystemCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNumberSystemCall(Team8Parser.NumberSystemCallContext ctx) {
		System.out.println("read");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNumberSystemCall(Team8Parser.NumberSystemCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStringSystemCall(Team8Parser.StringSystemCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStringSystemCall(Team8Parser.StringSystemCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBooleanSystemCall(Team8Parser.BooleanSystemCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBooleanSystemCall(Team8Parser.BooleanSystemCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBranch(Team8Parser.BranchContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBranch(Team8Parser.BranchContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLoop(Team8Parser.LoopContext ctx) {
		if (ctx.numberComparison() != null) {
			System.out.println("push " + ctx.numberComparison().IDENTIFIER(0));
			System.out.println("push " + ctx.numberComparison().IDENTIFIER(1));
			switch (ctx.numberComparison().NUMBERCOMPARITOR().toString()) {
				case "greater than":
					System.out.println("greater");
					break;
			}
		}
		System.out.println("testfgoto 23");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLoop(Team8Parser.LoopContext ctx) {
		if (ctx.numberComparison() != null) {
			System.out.println("push " + ctx.numberComparison().IDENTIFIER(0));
			System.out.println("push " + ctx.numberComparison().IDENTIFIER(1));
			switch (ctx.numberComparison().NUMBERCOMPARITOR().toString()) {
				case "greater than":
					System.out.println("greater");
					break;
			}
		}
		System.out.println("testtgoto 11");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignment(Team8Parser.AssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignment(Team8Parser.AssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInitialAssignment(Team8Parser.InitialAssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInitialAssignment(Team8Parser.InitialAssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInitialNumberAssignment(Team8Parser.InitialNumberAssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInitialNumberAssignment(Team8Parser.InitialNumberAssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInitialStringAssignment(Team8Parser.InitialStringAssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInitialStringAssignment(Team8Parser.InitialStringAssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInitialBooleanAssignemnt(Team8Parser.InitialBooleanAssignemntContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInitialBooleanAssignemnt(Team8Parser.InitialBooleanAssignemntContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReassignment(Team8Parser.ReassignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReassignment(Team8Parser.ReassignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNumberReassignment(Team8Parser.NumberReassignmentContext ctx) {
		if (ctx.NUMBER() != null) {
			System.out.println("push " + ctx.NUMBER());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNumberReassignment(Team8Parser.NumberReassignmentContext ctx) {
		System.out.println("store " + ctx.IDENTIFIER());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStringReassignment(Team8Parser.StringReassignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStringReassignment(Team8Parser.StringReassignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBooleanReassignemnt(Team8Parser.BooleanReassignemntContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBooleanReassignemnt(Team8Parser.BooleanReassignemntContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOperation(Team8Parser.OperationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOperation(Team8Parser.OperationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNumberOperation(Team8Parser.NumberOperationContext ctx) {
		System.out.println("push " + ctx.IDENTIFIER(0));
		System.out.println("push " + ctx.IDENTIFIER(1));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNumberOperation(Team8Parser.NumberOperationContext ctx) {
		switch (ctx.NUMBEROPERATOR().toString()) {
			case "multiply by":
				System.out.println("multply");
				break;
			case "subtract":
				System.out.println("minus");
				break;
			case "add":
				System.out.println("add");
				break;
			default:
				System.out.println("INVALID COMMAND " + ctx.NUMBEROPERATOR());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStringOperation(Team8Parser.StringOperationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStringOperation(Team8Parser.StringOperationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBooleanOperation(Team8Parser.BooleanOperationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBooleanOperation(Team8Parser.BooleanOperationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterComparison(Team8Parser.ComparisonContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitComparison(Team8Parser.ComparisonContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNumberComparison(Team8Parser.NumberComparisonContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNumberComparison(Team8Parser.NumberComparisonContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStringComparison(Team8Parser.StringComparisonContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStringComparison(Team8Parser.StringComparisonContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}
