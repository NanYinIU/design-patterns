package com.nanyin.pattern.flyweight;

public class StringIns2 implements MyString {

    String innerState;

    public StringIns2(String innerState) {
        this.innerState = innerState;
    }

    @Override
    public void create(String outerState) {
        System.out.println("create instance 2 -> innerState:"+this.innerState);
        System.out.println("create instance 2 -> outerState:"+outerState);
    }
}
