package com.nanyin.pattern.v2.factory.simpleFactory;

/**
 * @author nanyin
 * @class Gamer.java
 * @description TODO
 * @create 14:16 2020-04-18
 */
public class Gamer {
    public static void main(String[] args) {
        Weapon axe = WeaponFactory.build(WeaponType.AXE);
        axe.attack();

        Weapon sword = WeaponFactory.build(WeaponType.SWORD);
        sword.attack();

    }
}
