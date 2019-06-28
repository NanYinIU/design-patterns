package com.nanyin.pattern.Singleton.lazy;
/**
 * 懒汉模式
 * @Author nanyin
 * @Date 17:04 2019-04-21
 **/
public class Singleton {
    private void Singleton(){}
    private static Singleton singleton;

    // 普通的线程不安全的
    public Singleton newInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    //2.静态内部类 一方面能够达到lazy-loading的效果，另一方面能够保证线程安全，因为jvm保证初始化的时候别的线程是不能进入的
   private static class newSingleton{
        private static final Singleton INSTANCE = new Singleton();
    }

    public Singleton newInstanceInnerClass(){
        return newSingleton.INSTANCE;
    }


}
