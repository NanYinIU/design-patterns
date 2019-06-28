package com.nanyin.pattern.proxy;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("1",SexEnum.MALE,0);
        Person p2 = new Person("2",SexEnum.MALE,1);

        BathRoomProxy bathRoomProxy = new BathRoomProxy(new MaleBathRoom());
        bathRoomProxy.enterBathroom(p1).enterBathroom(p2);
    }
}
