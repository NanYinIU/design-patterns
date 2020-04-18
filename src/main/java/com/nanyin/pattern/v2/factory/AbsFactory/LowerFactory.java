package com.nanyin.pattern.v2.factory.AbsFactory;

/**
 * @author nanyin
 * @class LowerFactory.java
 * @description TODO
 * @create 19:43 2020-04-18
 */
public class LowerFactory implements WarFactory{
    // 低级的制造工厂

    @Override
    public Weapon buildWeapon() {
        return new Axe();
    }

    @Override
    public Armor buildArmor() {
        return new IronArmor();
    }
}
