package com.nanyin.pattern.facade;

public class MysqlService implements Services {
    @Override
    public void start() {
        System.out.println("mysql is started");
    }

    @Override
    public void stop() {
        System.out.println("mysql is stopped");
    }

    @Override
    public void restart() {
        System.out.println("mysql is restart");
    }
}
