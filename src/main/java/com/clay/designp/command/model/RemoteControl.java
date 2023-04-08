package com.clay.designp.command.model;

import com.clay.designp.command.actions.Command;

public class RemoteControl {
    private Command command;
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void pressButton() {
        command.execute();
    }
}