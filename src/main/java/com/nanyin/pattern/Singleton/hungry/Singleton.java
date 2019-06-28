package com.nanyin.pattern.Singleton.hungry;
/**
 * 饿汉模式
 * @Author nanyin
 * @Date 16:56 2019-04-21
 **/
public class Singleton {
    private Singleton(){};
    //1. 使用静态变量
//    private static Singleton singleton = new Singleton();
    //2.使用静态代码块 未使用时造成内存空间浪费
    private static Singleton singleton;
    static {
        singleton = new Singleton();
    }
    public Singleton newInstance(){
        return singleton;
    }
}
