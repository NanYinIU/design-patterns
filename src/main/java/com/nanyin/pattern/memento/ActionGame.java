package com.nanyin.pattern.memento;
/**
 * 继承于Game的ActionGame
 * @Author nanyin
 * @Date 17:30 2019-06-26
 **/
public class ActionGame implements Game {

    private Memento memento;
    /**
     * 存档记录
     * @Author nanyin
     * @Date 17:31 2019-06-26
     * @param memento 1
     * @return void
     **/
    @Override
    public void storeGamePoint(Memento memento) {
        this.memento = memento;
    }
    /**
     * 还原记录点
     * @Author nanyin
     * @Date 17:32 2019-06-26
     * @return Memento
     **/
    @Override
    public Memento retrieveGamePoint() {
        return this.memento;
    }
}
