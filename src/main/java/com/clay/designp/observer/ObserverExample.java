package com.clay.designp.observer;

public class ObserverExample {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer display = new Display();
        weatherStation.registerObserver(display);
        weatherStation.setWeatherData(20, 50, 100);
    }

}
