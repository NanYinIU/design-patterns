package com.nanyin.pattern.composite;

import java.util.LinkedList;
import java.util.List;

public class Country extends Component {
    List<Province> provinceList = new LinkedList<>();

    public Country(String name, Integer areaLevel) {
        super(name, areaLevel);
    }

    @Override
    public void printName() {
        System.out.println("Country Name :" + this.name);;
    }

    public void add(Province province){
        provinceList.add(province);
    }

     public void printAll(){
         System.out.println("当前组件:"+name + "等级："+ areaLevel);
        for (Province p:provinceList
        ) {
            p.printAll();
        }
    }
    @Override
    public void printLevel() {
        System.out.println("Country Level :" + this.areaLevel);
    }
}
