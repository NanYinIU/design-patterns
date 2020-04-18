package com.nanyin.pattern.v2.factory.methodFactory;

/**
 * @author nanyin
 * @class Gamer.java
 * @description TODO
 * @create 14:16 2020-04-18
 */
public class Gamer {
    public static void main(String[] args) {
        WeaponFactory axeFactory = new AxeFactory();
        Weapon enchantedAxe = axeFactory.build(true);
        enchantedAxe.attack();
        Weapon axe = axeFactory.build(false);
        axe.attack();
    }
}
