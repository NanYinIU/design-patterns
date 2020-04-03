package com.nanyin.pattern.strategy;
/**
 * @class Context.java
 * @author nanyin
 * @description 持有策略的环境类
 * @create 08:40 2020-04-03
 */
public class Context {
    private TrafficStrategy trafficStrategy;

    public Context(TrafficStrategy trafficStrategy) {
        this.trafficStrategy = trafficStrategy;
    }

    public TrafficStrategy getTrafficStrategy() {
        return trafficStrategy;
    }

    public void setTrafficStrategy(TrafficStrategy trafficStrategy) {
        this.trafficStrategy = trafficStrategy;
    }

    public void doStrategy(){
        trafficStrategy.go();
    }
}
