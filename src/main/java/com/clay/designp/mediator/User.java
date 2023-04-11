package com.clay.designp.mediator;

public class User {
    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void send(String message) {
        chatMediator.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(name + " received message: " + message);
    }
}
