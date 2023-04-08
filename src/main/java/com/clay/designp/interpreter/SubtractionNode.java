package com.clay.designp.interpreter;

// Concrete implementation of a binary operator for subtraction
class SubtractionNode extends BinaryOperatorNode {
    public SubtractionNode(Node left, Node right) {
        super(left, right);
    }

    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }
}