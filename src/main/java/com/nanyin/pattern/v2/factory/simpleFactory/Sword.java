package com.nanyin.pattern.v2.factory.simpleFactory;

/**
 * @author nanyin
 * @class Sword.java
 * @description 刀
 * @create 14:09 2020-04-18
 */
public class Sword implements Weapon{
    @Override
    public String attack() {
        System.out.println("使用刀用来砍向敌人！！");
        return "攻击方式： 砍";
    }
}
