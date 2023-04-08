package com.clay.designp.chainofresponsibility;

import com.clay.designp.chainofresponsibility.handler.BillingSupportHandler;
import com.clay.designp.chainofresponsibility.handler.GeneralInquiriesHandler;
import com.clay.designp.chainofresponsibility.handler.TechnicalSupportHandler;

public class Example {

    public static void main(String[] args) {
        GeneralInquiriesHandler generalHandler = new GeneralInquiriesHandler();
        TechnicalSupportHandler technicalHandler = new TechnicalSupportHandler();
        BillingSupportHandler billingHandler = new BillingSupportHandler();

        generalHandler.setNextHandler(technicalHandler);
        technicalHandler.setNextHandler(billingHandler);

        // Create some sample tickets
        Ticket ticket1 = new Ticket(Ticket.Type.GENERAL_INQUIRY, "What is the product warranty period?");
        Ticket ticket2 = new Ticket(Ticket.Type.TECHNICAL_ISSUE, "I can't connect to the internet.");
        Ticket ticket3 = new Ticket(Ticket.Type.BILLING_ISSUE, "I was charged twice for my last purchase.");

        // Handle the tickets
        generalHandler.handleRequest(ticket1);
        generalHandler.handleRequest(ticket2);
        generalHandler.handleRequest(ticket3);
    }
}
