package com.nanyin.pattern.proxy;

public class BathRoomProxy extends BathRoom {

    BathRoom bathRoom;

    public BathRoomProxy(BathRoom bathRoom) {
        this.bathRoom = bathRoom;
    }

    @Override
    public BathRoom enterBathroom(Person person) {
        if (person.getHasSkinDisease() == 0) {
                this.bathRoom.enterBathroom(person);
        } else {
            System.out.println(person.getName() + " has disease.");
        }
        return this;
    }
}
