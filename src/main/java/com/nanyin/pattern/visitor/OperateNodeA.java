package com.nanyin.pattern.visitor;

class OperateNodeA extends OperateNode {

    private static final double COEFFICIENT = 1.2;

    private int workDate;

    OperateNodeA(int workDate) {
        this.workDate = workDate;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }

    int attendance(){
        return workDate;
    }

    double performance(){
        return workDate * COEFFICIENT;
    }
}
