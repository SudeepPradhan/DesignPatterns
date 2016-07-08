package interpreter_pattern;

import java.util.Stack;

public class Context {
	private Expression expressionTree;

	public Context(String expression) {
		Stack<Expression> expressionStack = new Stack<Expression>();
		String[] tokens = expression.split(" ");
		Expression subExpression;
		for (int i = tokens.length - 1; i >= 0; i--) {
			if (tokens[i].equals("+")) {
				subExpression = new PlusOperation(expressionStack.pop(), expressionStack.pop());
				expressionStack.push(subExpression);
			} else if (tokens[i].equals("-")) {
				subExpression = new MinusOperation(expressionStack.pop(), expressionStack.pop());
				expressionStack.push(subExpression);
			} else {
				expressionStack.push(new Number(Integer.valueOf(tokens[i])));
			}
		}
		expressionTree = expressionStack.pop();
	}

	public int interpret() {
		return expressionTree.interpret();
	}

}
