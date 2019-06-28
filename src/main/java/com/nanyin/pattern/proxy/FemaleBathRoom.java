package com.nanyin.pattern.proxy;

public class FemaleBathRoom extends BathRoom {
    @Override
    public BathRoom enterBathroom(Person p) {
        String sexName = "";
        if(SexEnum.FEMALE.equals(p.getSex())){
            sexName = SexEnum.FEMALE.toString();
            System.out.println("name : "+ p.getName() +" sex: "+ sexName +" go bath for female !");
        }
        return this;
    }
}
