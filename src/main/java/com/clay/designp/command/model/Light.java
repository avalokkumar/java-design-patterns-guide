package com.clay.designp.command.model;

public class Light {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Light is turned on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light is turned off");
    }

    public boolean isOn() {
        return isOn;
    }
}
