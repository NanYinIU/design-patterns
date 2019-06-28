package com.nanyin.pattern.facade;

public class ApacheService implements Services {
    @Override
    public void start() {
        System.out.println("apache is started");
    }

    @Override
    public void stop() {
        System.out.println("apache is stopped");
    }

    @Override
    public void restart() {
        System.out.println("apache is restart");
    }
}
