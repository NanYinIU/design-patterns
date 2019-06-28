package com.nanyin.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Weather {

    protected WeatherState weatherState;

    private List<Observer> observerList = new ArrayList<>();

    public Weather addObserver(Observer observer){
        observerList.add(observer);
        return this;
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObserver(){
        for (Observer o:observerList
             ) {
            o.update(this.weatherState);
        }
    }
}
