package com.clay.designp.interpreter;

/**
 * In this example, we use the Interpreter pattern to evaluate a simple mathematical expression. The expression is parsed into an abstract syntax tree (AST) using a Expression class, which maintains the input expression and a current position in the input. The Expression class has a parse() method that constructs an AST by recursively parsing each term in the expression.
 *
 * The AST is composed of Node objects, which represent either a number (terminal expression) or a binary operator (non-terminal expression). The NumberNode and BinaryOperatorNode classes are abstract classes that define the common behavior of all nodes in the AST. The AdditionNode and SubtractionNode classes are concrete implementations of binary operators that perform addition and subtraction, respectively.
 */
public class InterpreterExample {
    public static void main(String[] args) {
        String input = "5-2+1";
        Expression expression = new Expression(input);
        Node ast = expression.parse();
        int result = ast.evaluate();
        System.out.println(input + " = " + result);
    }
}