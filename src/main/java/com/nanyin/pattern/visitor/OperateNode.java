package com.nanyin.pattern.visitor;

public abstract class OperateNode {
    abstract void accept(Visitor visitor);
}
