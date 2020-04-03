package com.nanyin.pattern.strategy;
/**
 * @class CarStrategy.java
 * @author nanyin
 * @description 策略实现
 * @create 08:35 2020-04-03
 */
public class CarStrategy implements TrafficStrategy {

    @Override
    public void go() {
        System.out.println("开车出行");
    }
}
