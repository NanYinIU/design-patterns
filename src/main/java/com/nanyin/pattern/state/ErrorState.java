package com.nanyin.pattern.state;

public class ErrorState implements State {
    @Override
    public void open() {
        System.out.println("电灯开不了！");
    }

    @Override
    public void close() {
        System.out.println("电灯关不了！");
    }
}
