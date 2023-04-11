package com.clay.designp.mediator;

public interface ChatMediator {
    public void sendMessage(String message, User user);
    public void addUser(User user);
}
