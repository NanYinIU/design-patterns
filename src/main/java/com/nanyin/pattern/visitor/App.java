package com.nanyin.pattern.visitor;
/**
 * 将 visitorA 作为公司中的行政部人员，visitorB作为财政人员
 * 其中 nodeA 和 nodeB 分别表示为 研发人员 和 实施人员
 * 行政人员根据考勤打卡记录对 研发人员和实施人员绩效考核
 * 财政人员根据绩效，为研发人员和实施人员发放工资
 *
 * @Author nanyin
 * @Date 23:55 2019-06-15
 **/
public class App {
    public static void main(String[] args) {
        Visitor visitorA = new VisitorA();
        Visitor visitorB = new VisitorB();
        OperateStructure structure = new OperateStructure();
        structure.add(new OperateNodeA(22));
        structure.add(new OperateNodeB(22));
        structure.action(visitorA);
        structure.action(visitorB);
    }
}
