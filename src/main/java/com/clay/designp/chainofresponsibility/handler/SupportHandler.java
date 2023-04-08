package com.clay.designp.chainofresponsibility.handler;

import com.clay.designp.chainofresponsibility.Ticket;

public interface SupportHandler {
    void handleRequest(Ticket ticket);
}
