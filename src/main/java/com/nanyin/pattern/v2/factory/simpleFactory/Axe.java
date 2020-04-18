package com.nanyin.pattern.v2.factory.simpleFactory;

/**
 * @author nanyin
 * @class Axe.java
 * @description 斧子
 * @create 14:10 2020-04-18
 */
public class Axe implements Weapon{
    @Override
    public String attack() {
        System.out.println("使用斧子用来劈向敌人！！");
        return "攻击方式： 劈";
    }
}
