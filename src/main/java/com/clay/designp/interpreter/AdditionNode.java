package com.clay.designp.interpreter;

// Concrete implementation of a binary operator for addition
class AdditionNode extends BinaryOperatorNode {
    public AdditionNode(Node left, Node right) {
        super(left, right);
    }

    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}