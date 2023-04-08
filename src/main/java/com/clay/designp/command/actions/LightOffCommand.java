package com.clay.designp.command.actions;

import com.clay.designp.command.model.Light;

public class LightOffCommand implements Command {
    private final Light light;
    
    public LightOffCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        light.turnOff();
    }
}