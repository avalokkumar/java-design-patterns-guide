package com.clay.designp.chainofresponsibility.handler;

import com.clay.designp.chainofresponsibility.Ticket;

public class GeneralInquiriesHandler implements SupportHandler {
    private SupportHandler nextHandler;
    
    public void setNextHandler(SupportHandler handler) {
        this.nextHandler = handler;
    }

    public void handleRequest(Ticket ticket) {
        if (ticket.getType() == Ticket.Type.GENERAL_INQUIRY) {
            System.out.println("Thank you for contacting us. A customer service representative will respond to your inquiry shortly.");
        }
        else if (nextHandler != null) {
            nextHandler.handleRequest(ticket);
        }
    }
}
