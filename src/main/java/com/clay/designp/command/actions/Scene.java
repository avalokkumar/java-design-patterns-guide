package com.clay.designp.command.actions;

import java.util.List;

public class Scene implements Command {
    private List<Command> commands;
    
    public Scene(List<Command> commands) {
        this.commands = commands;
    }
    
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}