package com.nanyin.pattern.decorator;

public class App {
    public static void main(String[] args) {
        AbstractGirl normalGirl = new NormalGirl();
        normalGirl.dyeHair();
        AbstractGirl fashionHair = new FashionGirl(normalGirl);
        fashionHair.pack();
        AbstractGirl workClose = new WorkGirl(fashionHair);
        workClose.wearClothes();
    }
}
