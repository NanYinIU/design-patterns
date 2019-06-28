package com.nanyin.pattern.flyweight;

public class StringIns1 implements MyString {

    String innerState;

    public StringIns1(String innerState) {
        this.innerState = innerState;
    }

    @Override
    public void create(String outerState) {
        System.out.println("create instance 1 -> innerState:"+this.innerState);
        System.out.println("create instance 1 -> outerState:"+outerState);
    }
}
