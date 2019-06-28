package com.nanyin.pattern.factory.simpleFactory;

public class ShoesFactory {

    public Shoes getShoes(String color){
        if("red".equals(color)){
            return new RedShoes();
        }else if("white".equals(color)){
            return new WhiteShoes();
        }else {
            return new OtherShoes();
        }
    }
}
