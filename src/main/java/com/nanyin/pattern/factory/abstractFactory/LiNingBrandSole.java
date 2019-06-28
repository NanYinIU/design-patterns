package com.nanyin.pattern.factory.abstractFactory;

public class LiNingBrandSole implements Sole {
    @Override
    public void getMaterial() {
        System.out.println("air cushion");
    }
}
