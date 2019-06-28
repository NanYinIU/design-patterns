package com.nanyin.pattern.factory.abstractFactory;

public interface ShoesFactory {
    public Sole createSole();
    public Shoelace createShoelace();
}
