package com.clay.designp.interpreter;

// Context class that maintains the input expression and parses it into an AST
class Expression {
    private String input;
    private int position;

    public Expression(String input) {
        this.input = input;
    }

    public Node parse() {
        Node left = parseTerm();

        while (position < input.length()) {
            char operator = input.charAt(position);

            if (operator != '+' && operator != '-') {
                throw new IllegalArgumentException("Unexpected operator: " + operator);
            }

            position++;

            Node right = parseTerm();

            if (operator == '+') {
                left = new AdditionNode(left, right);
            } else {
                left = new SubtractionNode(left, right);
            }
        }

        return left;
    }

    private Node parseTerm() {
        int start = position;

        while (position < input.length() && Character.isDigit(input.charAt(position))) {
            position++;
        }

        if (start == position) {
            throw new IllegalArgumentException("Expected number, found: " + input.charAt(position));
        }

        return new NumberNode(Integer.parseInt(input.substring(start, position)));
    }
}