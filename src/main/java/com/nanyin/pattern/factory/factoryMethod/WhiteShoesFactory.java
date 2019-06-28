package com.nanyin.pattern.factory.factoryMethod;

public class WhiteShoesFactory implements ShoesFactory{
    public Shoes getShoes(){
        return new WhiteShoes();
    }
}
