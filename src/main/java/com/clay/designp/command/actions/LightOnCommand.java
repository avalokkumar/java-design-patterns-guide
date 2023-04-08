package com.clay.designp.command.actions;

import com.clay.designp.command.model.Light;

public class LightOnCommand implements Command {
    private final Light light;
    
    public LightOnCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        light.turnOn();
    }
}