package com.nanyin.pattern.strategy;

public class App {
    public static void main(String[] args) {
        Context context = new Context(new CarStrategy());
        context.doStrategy();
    }
}
