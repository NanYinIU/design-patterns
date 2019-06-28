package com.nanyin.pattern.proxy;

public class MaleBathRoom extends BathRoom {
    @Override
    public BathRoom enterBathroom(Person p) {
        String sexName = "";
        if(SexEnum.MALE.equals(p.getSex())){
            sexName = SexEnum.MALE.toString();
            System.out.println("name : "+ p.getName() +" sex: "+ sexName +" go bath for male !");
        }
        return this;
    }
}
