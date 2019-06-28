package com.nanyin.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Province extends Component{

   List<City> cityList = new ArrayList<>();

    public Province(String name, Integer areaLevel) {
        super(name, areaLevel);
    }

    @Override
    public void printName() {
        System.out.println("Province Name :" +this.name);
    }

    public void add(City city){
       cityList.add(city);
    }

    public void printAll(){
        System.out.println("当前组件:"+name + "等级："+ areaLevel);
        for (City p:cityList
        ) {
            p.printAll();
        }
    }
    @Override
    public void printLevel() {
        System.out.println("");
    }
}
