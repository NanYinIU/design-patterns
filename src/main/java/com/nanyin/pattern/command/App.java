package com.nanyin.pattern.command;

public class App {
    public static void main(String[] args) {
        King king = new King();
        Soldier soldier = new Soldier();
        king.invoke(new AttackCommand(soldier));
        king.action();
        king.invoke(new RetreatCommand(soldier));
        king.action();
    }
}
