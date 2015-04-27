// Generated from Team8.g4 by ANTLR 4.5

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link Team8Listener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CustomListener implements yoyoheadListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRoot(yoyoheadParser.RootContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRoot(yoyoheadParser.RootContext ctx) {
		System.out.println("end");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterContext(yoyoheadParser.ContextContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitContext(yoyoheadParser.ContextContext ctx) { }
	/**
	* {@inheritDoc}
	*
	* <p>The default implementation does nothing.</p>
	*/
	@Override public void enterSystemCall(yoyoheadParser.SystemCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSystemCall(yoyoheadParser.SystemCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVoidSystemCall(yoyoheadParser.VoidSystemCallContext ctx) {
		System.out.println("push " + ctx.IDENTIFIER());
		System.out.println("print");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVoidSystemCall(yoyoheadParser.VoidSystemCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNumberSystemCall(yoyoheadParser.NumberSystemCallContext ctx) {
		System.out.println("read string");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNumberSystemCall(yoyoheadParser.NumberSystemCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStringSystemCall(yoyoheadParser.StringSystemCallContext ctx) {
		System.out.println("read string");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStringSystemCall(yoyoheadParser.StringSystemCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBooleanSystemCall(yoyoheadParser.BooleanSystemCallContext ctx) {
		System.out.println("read boolean");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBooleanSystemCall(yoyoheadParser.BooleanSystemCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBranch(yoyoheadParser.BranchContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBranch(yoyoheadParser.BranchContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLoop(yoyoheadParser.LoopContext ctx) {
		if (ctx.numberComparison() != null) {
			System.out.println("push " + ctx.numberComparison().IDENTIFIER(0));
			System.out.println("push " + ctx.numberComparison().IDENTIFIER(1));
			switch (ctx.numberComparison().NUMBERCOMPARITOR().toString()) {
				case "greater than":
					System.out.println("greater");
					break;
			}
		}
		System.out.println("testfgoto 22");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLoop(yoyoheadParser.LoopContext ctx) {
		if (ctx.numberComparison() != null) {
			System.out.println("push " + ctx.numberComparison().IDENTIFIER(0));
			System.out.println("push " + ctx.numberComparison().IDENTIFIER(1));
			switch (ctx.numberComparison().NUMBERCOMPARITOR().toString()) {
				case "greater than":
					System.out.println("greater");
					break;
			}
		}
		System.out.println("testtgoto 10");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignment(yoyoheadParser.AssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignment(yoyoheadParser.AssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInitialAssignment(yoyoheadParser.InitialAssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInitialAssignment(yoyoheadParser.InitialAssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInitialNumberAssignment(yoyoheadParser.InitialNumberAssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInitialNumberAssignment(yoyoheadParser.InitialNumberAssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInitialStringAssignment(yoyoheadParser.InitialStringAssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInitialStringAssignment(yoyoheadParser.InitialStringAssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInitialBooleanAssignemnt(yoyoheadParser.InitialBooleanAssignemntContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInitialBooleanAssignemnt(yoyoheadParser.InitialBooleanAssignemntContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReassignment(yoyoheadParser.ReassignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReassignment(yoyoheadParser.ReassignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNumberReassignment(yoyoheadParser.NumberReassignmentContext ctx) {
		if (ctx.NUMBER() != null) {
			System.out.println("push " + ctx.NUMBER());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNumberReassignment(yoyoheadParser.NumberReassignmentContext ctx) {
		System.out.println("store " + ctx.IDENTIFIER());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStringReassignment(yoyoheadParser.StringReassignmentContext ctx) {
		if (ctx.STRING() != null) {
			System.out.println("push " + ctx.STRING());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStringReassignment(yoyoheadParser.StringReassignmentContext ctx) {
		System.out.println("store " + ctx.IDENTIFIER());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBooleanReassignemnt(yoyoheadParser.BooleanReassignemntContext ctx) {
		if (ctx.BOOLEAN() != null) {
			System.out.println("push " + ctx.BOOLEAN());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBooleanReassignemnt(yoyoheadParser.BooleanReassignemntContext ctx) {
		System.out.println("store " + ctx.IDENTIFIER());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOperation(yoyoheadParser.OperationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOperation(yoyoheadParser.OperationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNumberOperation(yoyoheadParser.NumberOperationContext ctx) {
		System.out.println("push " + ctx.IDENTIFIER(0));
		System.out.println("push " + ctx.IDENTIFIER(1));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNumberOperation(yoyoheadParser.NumberOperationContext ctx) {
		switch (ctx.NUMBEROPERATOR().toString()) {
			case "multiply by":
				System.out.println("multiply");
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
	@Override public void enterStringOperation(yoyoheadParser.StringOperationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStringOperation(yoyoheadParser.StringOperationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBooleanOperation(yoyoheadParser.BooleanOperationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBooleanOperation(yoyoheadParser.BooleanOperationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterComparison(yoyoheadParser.ComparisonContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitComparison(yoyoheadParser.ComparisonContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNumberComparison(yoyoheadParser.NumberComparisonContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNumberComparison(yoyoheadParser.NumberComparisonContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStringComparison(yoyoheadParser.StringComparisonContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStringComparison(yoyoheadParser.StringComparisonContext ctx) { }

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
