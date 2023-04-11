package com.clay.designp.mediator;

public class MediatorExample {

    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User john = new User("John", chatRoom);
        User jane = new User("Jane", chatRoom);
        User bob = new User("Bob", chatRoom);

        chatRoom.addUser(john);
        chatRoom.addUser(jane);
        chatRoom.addUser(bob);

        john.send("Hi everyone!");
    }
}
