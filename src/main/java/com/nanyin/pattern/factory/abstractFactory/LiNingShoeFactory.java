package com.nanyin.pattern.factory.abstractFactory;

public class LiNingShoeFactory implements ShoesFactory {
    @Override
    public Sole createSole() {
        return new LiNingBrandSole();
    }

    @Override
    public Shoelace createShoelace() {
        return new LiNingBrandShoelace();
    }
}
