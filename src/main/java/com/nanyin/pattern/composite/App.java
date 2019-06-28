package com.nanyin.pattern.composite;

public class App {
    public static void main(String[] args) {
        Country zhongguo = new Country("china", 0);
        City langfang = new City("langfang", 2);
        Province hebei = new Province("hebei", 1);
        zhongguo.add(hebei);
        hebei.add(langfang);
        zhongguo.printAll();
    }
}
