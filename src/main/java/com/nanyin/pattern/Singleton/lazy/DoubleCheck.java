package com.nanyin.pattern.Singleton.lazy;
/**
 *
 * @Author nanyin
 * @Date 17:15 2019-04-21
 **/
public class DoubleCheck {
    private void DoubleCheck(){}
    private volatile DoubleCheck doubleCheck;
    public DoubleCheck newInstance(){
        if(doubleCheck == null){
            // 当两个线程同时到这步 a先进同步块，在a进入后获得instance后，b获得锁，进入同步块，
            // 这时候下一个判断就起到作用了，这时候的doubleCheck不为空，直接return，否则又️新建了一个对象
            synchronized (DoubleCheck.class){
                if(doubleCheck == null){
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}
