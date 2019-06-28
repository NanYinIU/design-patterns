package com.nanyin.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class OperateStructure {
    private List<OperateNode> list = new ArrayList<>();

    void add(OperateNode operateNode){
        list.add(operateNode);
    }

    void action(Visitor visitor){
        for (OperateNode operateNode : list){
            operateNode.accept(visitor);
        }
    }
}
