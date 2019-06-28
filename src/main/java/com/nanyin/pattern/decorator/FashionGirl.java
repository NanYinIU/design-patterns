package com.nanyin.pattern.decorator;
/**
 * 一个时尚的女孩子
 * @Author nanyin
 * @Date 18:19 2019-06-10
 **/
public class FashionGirl extends AbstractGirl {

    AbstractGirl abstractGirl;

    public FashionGirl(AbstractGirl abstractGirl) {
        this.abstractGirl = abstractGirl;
    }

    @Override
    public void dyeHair() {
        abstractGirl.dyeHair();
        System.out.println("dyeHair after : ");
        System.out.println("dye blue hair");
    }

    @Override
    public void wearClothes() {
        abstractGirl.wearClothes();
        System.out.println("wearClothes after : " );
        System.out.println("wear rock type clothes");
    }

    @Override
    public void pack() {
        abstractGirl.pack();
        System.out.println("wearClothes after : " );
        System.out.println("take fashion pack");
    }
}
