package com.nanyin.pattern.factory.factoryMethod;

public class RedShoesFactory implements ShoesFactory{
    public Shoes getShoes(){
        return new RedShoes();
    }
}
