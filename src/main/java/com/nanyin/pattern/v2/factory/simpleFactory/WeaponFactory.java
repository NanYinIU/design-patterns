package com.nanyin.pattern.v2.factory.simpleFactory;

/**
 * @author nanyin
 * @class WeaponFactory.java
 * @description TODO
 * @create 14:12 2020-04-18
 */
public class WeaponFactory {

    public static Weapon build(WeaponType weaponType){
        if(WeaponType.AXE.equals(weaponType)){
            return new Axe();
        }else if(WeaponType.SWORD.equals(weaponType)){
            return new Sword();
        }
        return null;
    }
}
