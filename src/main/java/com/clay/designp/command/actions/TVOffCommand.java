package com.clay.designp.command.actions;

import com.clay.designp.command.model.TV;

public class TVOffCommand implements Command {
    private TV tv;
    
    public TVOffCommand(TV tv) {
        this.tv = tv;
    }
    
    public void execute() {
        tv.off();
    }
}