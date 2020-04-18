package com.nanyin.pattern.v2.factory.AbsFactory;

/**
 * @author nanyin
 * @class IronArmor.java
 * @description TODO
 * @create 19:38 2020-04-18
 */
public class IronArmor implements Armor{
    @Override
    public String defence() {
        System.out.println("使用铁制防具防御");
        return "铁质防具";
    }
}
