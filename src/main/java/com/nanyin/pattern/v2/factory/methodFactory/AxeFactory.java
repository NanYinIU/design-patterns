package com.nanyin.pattern.v2.factory.methodFactory;

/**
 * @author nanyin
 * @class AxeFactory.java
 * @description TODO
 * @create 14:53 2020-04-18
 */
public class AxeFactory implements WeaponFactory {

    @Override
    public Weapon build(boolean isEnchanted) {
        if(isEnchanted){
            return new EnchantedAxe();
        }else{
            return new Axe();
        }
    }
}
