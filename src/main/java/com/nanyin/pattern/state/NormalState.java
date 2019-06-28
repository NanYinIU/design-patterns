package com.nanyin.pattern.state;

public class NormalState implements State{
    @Override
    public void open() {
        System.out.println("电灯开了！");
    }

    @Override
    public void close() {
        System.out.println("电灯关了！");
    }
}
