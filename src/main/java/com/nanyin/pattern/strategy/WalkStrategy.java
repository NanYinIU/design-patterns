package com.nanyin.pattern.strategy;
/**
 * @class WalkStrategy.java
 * @author nanyin
 * @description 策略实现
 * @create 08:36 2020-04-03
 */
public class WalkStrategy implements TrafficStrategy{
    @Override
    public void go() {
        System.out.println("步行");
    }
}
