package com.nanyin.pattern.flyweight;


import java.util.HashMap;
import java.util.Map;

public class FlyWeight {
    Map<InstanceType,MyString> store;

    FlyWeight() {
        store = new HashMap<>();
    }

    public MyString factory(InstanceType instanceType){
        MyString curr = store.get(instanceType);
        if(curr == null){
            if(instanceType.equals(InstanceType.INSTANCE1)){
                curr= new StringIns1(instanceType.toString());
            } else if(instanceType.equals(InstanceType.INSTANCE2)){
                curr= new StringIns2(instanceType.toString());
            }
        }
        store.put(instanceType,curr);
        return curr;
    }
}
