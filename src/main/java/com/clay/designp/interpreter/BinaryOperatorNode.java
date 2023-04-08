package com.clay.designp.interpreter;

// Non-terminal expression representing a binary operator
abstract class BinaryOperatorNode implements Node {
    protected Node left;
    protected Node right;

    public BinaryOperatorNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
}