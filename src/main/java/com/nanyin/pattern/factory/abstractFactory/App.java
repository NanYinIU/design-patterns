package com.nanyin.pattern.factory.abstractFactory;

public class App {
    public static void main(String[] args) {
        ShoesFactory shoesFactory = new NikeShoeFactory();
        Shoelace nikeLace = shoesFactory.createShoelace();
        Sole nikeSole = shoesFactory.createSole();
        nikeLace.length();
        nikeSole.getMaterial();
    }
}
