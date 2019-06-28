package com.nanyin.pattern.flyweight;

public class App {
    public static void main(String[] args) {
        FlyWeight flyWeight = new FlyWeight();
        MyString ins1 = flyWeight.factory(InstanceType.INSTANCE1);
        MyString ins2 = flyWeight.factory(InstanceType.INSTANCE1);
        System.out.println(ins1.equals(ins2));
        ins1.create("*****");
        ins2.create("-----");
    }
}
