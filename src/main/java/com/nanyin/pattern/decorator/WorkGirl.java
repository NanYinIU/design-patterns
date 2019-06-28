package com.nanyin.pattern.decorator;
/**
 * 工作时只穿正装
 * @Author nanyin
 * @Date 18:19 2019-06-10
 **/
public class WorkGirl extends AbstractGirl {

    AbstractGirl abstractGirl;

    public WorkGirl(AbstractGirl abstractGirl) {
        this.abstractGirl = abstractGirl;
    }

    @Override
    public void wearClothes() {
        abstractGirl.wearClothes();
        System.out.println("wearClothes after : ");
        System.out.println("wear formal clothes");
    }
}
