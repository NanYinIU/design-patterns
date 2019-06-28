package com.nanyin.pattern.visitor;

class OperateNodeB extends OperateNode {

    private static final int COEFFICIENT = 1;

    private int workDate;

    OperateNodeB(int workDate) {
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
