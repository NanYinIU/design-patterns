package com.nanyin.pattern.bridge;

public class ShapeCircle extends Shape {

    public ShapeCircle(Colors colors) {
        super(colors);
    }

    @Override
    public void buildShape() {
        System.out.println("\n first step : build circle\n and second step:");
        colors.paint();
    }
}
