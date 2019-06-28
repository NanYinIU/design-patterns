package com.nanyin.pattern.bridge;

public class ShapeSquare extends Shape {
    public ShapeSquare (Colors colors) {
        super(colors);
    }

    @Override
    public void buildShape() {
        System.out.println("\n first step : build Square\n and second step:");
        colors.paint();
    }
}
