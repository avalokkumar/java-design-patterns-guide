package com.clay.designp.interpreter;

// Terminal expression representing a number
class NumberNode implements Node {
    private int number;

    public NumberNode(int number) {
        this.number = number;
    }

    public int evaluate() {
        return number;
    }
}