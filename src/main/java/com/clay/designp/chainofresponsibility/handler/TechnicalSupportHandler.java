package com.clay.designp.chainofresponsibility.handler;

import com.clay.designp.chainofresponsibility.Ticket;

public class TechnicalSupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    public void setNextHandler(SupportHandler handler) {
        this.nextHandler = handler;
    }

    public void handleRequest(Ticket ticket) {
        if (ticket.getType() == Ticket.Type.TECHNICAL_ISSUE) {
            System.out.println("Technical support team is handling the ticket: " + ticket.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(ticket);
        }
    }
}