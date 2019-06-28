package com.nanyin.pattern.bridge;

public class App {
    public static void main(String[] args) {
        Shape circle = new ShapeCircle(new ColorBlue());
        circle.buildShape();
        Shape square = new ShapeSquare(new ColorRed());
        square.buildShape();
    }
}
