package com.clay.designp.command.actions;

import com.clay.designp.command.model.TV;

public class TVOnCommand implements Command {
    private TV tv;
    
    public TVOnCommand(TV tv) {
        this.tv = tv;
    }
    
    public void execute() {
        tv.on();
    }
}
