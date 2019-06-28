package com.nanyin.pattern.composite;

public abstract class Component {
    String name;
    Integer areaLevel;

    public Component(String name, Integer areaLevel) {
        this.name = name;
        this.areaLevel = areaLevel;
    }

    // 整体和部分都要继承这个组件
    public void printName(){
        System.out.println("Name : "+name);
    };

    public void printLevel(){
        System.out.println("Area Level :" + areaLevel);
    };

    public abstract void printAll();

}
