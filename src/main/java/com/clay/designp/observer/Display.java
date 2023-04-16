package com.clay.designp.observer;

public class Display implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
    }
}
