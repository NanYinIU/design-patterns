package com.nanyin.pattern.proxy;

public class Person {
    private String name ;

    private SexEnum sex;
    //是否有皮肤病
    private int hasSkinDisease;

    public Person(String name, SexEnum sex, int hasSkinDisease) {
        this.name = name;
        this.sex = sex;
        this.hasSkinDisease = hasSkinDisease;
    }

    public String getName() {
        return name;
    }

    public SexEnum getSex() {
        return sex;
    }

    public int getHasSkinDisease() {
        return hasSkinDisease;
    }
}

