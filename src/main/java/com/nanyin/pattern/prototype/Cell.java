package com.nanyin.pattern.prototype;
/**
 * 一个细胞
 * @Author nanyin
 * @Date 23:49 2019-06-01
 **/
public class Cell implements Cloneable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cell(){
    }

    private Cell(String name) {
        this.name = name;
    }

    @Override
    protected Cell clone() throws CloneNotSupportedException {
        super.clone();
        return new Cell(name);
    }
}
