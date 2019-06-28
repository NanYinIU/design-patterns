package com.nanyin.pattern.visitor;

public class VisitorA implements Visitor {
    // 需要对实施人员增加路上的考勤时间 模式为2
    private static final int BASIC = 2;
    @Override
    public void visit(OperateNodeA operateNodeA) {
        // 行政人员
        int att = operateNodeA.attendance();
        System.out.println("本月该研发人员考勤为"+att + "天");
    }

    @Override
    public void visit(OperateNodeB operateNodeB) {
        int att =operateNodeB.attendance() + BASIC;
        System.out.println("本月该实施人员考勤为"+att + "天");
    }
}
