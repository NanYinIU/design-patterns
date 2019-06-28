package com.nanyin.pattern.observer;

public class WeatherObserverA implements Observer {
    @Override
    public void update(WeatherState weatherState) {
        System.out.println("observer A get new weather message is " + weatherState.toString());
    }
}
