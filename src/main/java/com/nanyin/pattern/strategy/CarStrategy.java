package com.nanyin.pattern.strategy;

public class CarStrategy implements TrafficStrategy {

    @Override
    public void go() {
        System.out.println("i am driving");
    }
}
