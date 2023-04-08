package com.clay.designp.chainofresponsibility;

public class Ticket {
    public enum Type {
        GENERAL_INQUIRY,
        TECHNICAL_ISSUE,
        BILLING_ISSUE
    }

    private Type type;
    private String description;

    public Ticket(Type type, String description) {
        this.type = type;
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}