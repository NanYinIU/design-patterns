package com.nanyin.pattern.memento;

public interface Game {
    void storeGamePoint(Memento memento);
    Memento retrieveGamePoint();
}
