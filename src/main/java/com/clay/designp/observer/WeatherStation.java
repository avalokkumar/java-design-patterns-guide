package com.clay.designp.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    // List of observers to notify when weather data changes
    private List<Observer> observers;

    // The weather data being observed
    private WeatherData weatherData;

    public WeatherStation() {
        // Initialize the observer list and weather data
        observers = new ArrayList<>();
        weatherData = new WeatherData();
    }

    public void setWeatherData(float temperature, float humidity, float pressure) {
        // Update the weather data
        weatherData.setTemperature(temperature);
        weatherData.setHumidity(humidity);
        weatherData.setPressure(pressure);

        // Notify all observers that the weather data has changed
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        // Add a new observer to the list
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        // Remove an observer from the list
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        // Notify all observers that the weather data has changed by calling their update method
        for (Observer observer : observers) {
            observer.update(weatherData.getTemperature(), weatherData.getHumidity(), weatherData.getPressure());
        }
    }
}