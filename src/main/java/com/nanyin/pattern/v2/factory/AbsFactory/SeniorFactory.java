package com.nanyin.pattern.v2.factory.AbsFactory;

/**
 * @author nanyin
 * @class SeniorFactory.java
 * @description TODO
 * @create 19:42 2020-04-18
 */
public class SeniorFactory implements WarFactory {
    @Override
    public Weapon buildWeapon() {
        return new EnchantedAxe();
    }

    @Override
    public Armor buildArmor() {
        return new SteelArmor();
    }
}
