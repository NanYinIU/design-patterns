package com.nanyin.pattern.v2.chain;

/**
 * @author nanyin
 * @class LeaveHandler.java
 * @description 请假申请抽象接口
 * @create 09:28 2020-03-31
 */
public abstract class LeaveHandler {
    // 设置下一个处理人
    public LeaveHandler next;
    // 构造函数
    public LeaveHandler(LeaveHandler next) {
        this.next = next;
    }
   // 抽象方法，处理请假方法
    public abstract LeaveHandler handle(LeaveRequest request);
}
