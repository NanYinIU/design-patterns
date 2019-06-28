package com.nanyin.pattern.visitor;

public class VisitorB implements Visitor {
    // 研发需要添加额外绩效
    private static final int EXTRA = 2;
    @Override
    public void visit(OperateNodeA operateNodeA) {
        double att = operateNodeA.performance() + EXTRA;
        System.out.println("本月该研发人员绩效为 :"+att );
    }

    @Override
    public void visit(OperateNodeB operateNodeB) {
        double att =operateNodeB.performance() ;
        System.out.println("本月该研发人员绩效为 :"+att );
    }
}
