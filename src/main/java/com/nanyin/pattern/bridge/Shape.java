package com.nanyin.pattern.bridge;

public abstract class Shape {

    Colors colors;

    Shape(Colors colors) {
        this.colors = colors;
    }

    public abstract void buildShape();
}
