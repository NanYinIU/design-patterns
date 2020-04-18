package com.nanyin.pattern.v2.factory.AbsFactory;

/**
 * @author nanyin
 * @class EnchantedAxe.java
 * @description 附魔的
 * @create 15:00 2020-04-18
 */
public class EnchantedAxe extends Axe {

    @Override
    public String attack() {
        System.out.println("使用一把附魔的斧子用来劈向敌人！！");
        return "攻击方式： 劈";
    }
}
