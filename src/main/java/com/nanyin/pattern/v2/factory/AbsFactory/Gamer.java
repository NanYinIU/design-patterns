package com.nanyin.pattern.v2.factory.AbsFactory;

/**
 * @author nanyin
 * @class Gamer.java
 * @description TODO
 * @create 19:46 2020-04-18
 */
public class Gamer {

    public static void main(String[] args) {
        WarFactory senior = new SeniorFactory();
        Armor armor = senior.buildArmor();
        armor.defence();
        Weapon weapon = senior.buildWeapon();
        weapon.attack();
    }
}
