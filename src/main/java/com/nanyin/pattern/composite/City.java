package com.nanyin.pattern.composite;

public class City extends Component {

    public City(String name, Integer areaLevel) {
        super(name, areaLevel);
    }

    @Override
    public void printName() {
        System.out.println("City Name :" + this.name);
    }

    @Override
    public void printLevel() {
        System.out.println("City Level " + this.areaLevel);
    }

    public void printAll(){
        System.out.println("组件："+ this.name);
    }
}
