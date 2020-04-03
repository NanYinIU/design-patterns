package com.nanyin.pattern.strategy;
/**
 * @class Client.java
 * @author nanyin
 * @description 客户端类，调用context环境类，指明策略，不需要知道策略实现
 * @create 08:40 2020-04-03
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new CarStrategy());
        context.doStrategy();
    }
}
