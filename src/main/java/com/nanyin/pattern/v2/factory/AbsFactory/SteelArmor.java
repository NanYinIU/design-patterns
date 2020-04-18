package com.nanyin.pattern.v2.factory.AbsFactory;

/**
 * @author nanyin
 * @class SteelArmor.java
 * @description TODO
 * @create 19:39 2020-04-18
 */
public class SteelArmor implements Armor {
    @Override
    public String defence() {
        System.out.println("使用精钢制防具防御");
        return "精钢质防具";
    }
}
