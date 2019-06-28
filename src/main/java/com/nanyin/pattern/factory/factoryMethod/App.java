package com.nanyin.pattern.factory.factoryMethod;

public class App {
    public static void main(String[] args) {
        ShoesFactory redFactory = new RedShoesFactory();
        Shoes redshoes = redFactory.getShoes();
        redshoes.getColor();
        ShoesFactory whiteFactory = new WhiteShoesFactory();
        Shoes whiteshoes = whiteFactory.getShoes();
    }
}
