package com.nanyin.pattern.memento;

public class Player {
    // 游戏状态
    private GameState gameState;

    Player(GameState gameState) {
        this.gameState = gameState;
    }

    // 设置状态
    void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    //获取状态
    GameState getGameState() {
        return gameState;
    }

    // 创建存档记录
    Memento createMemento(){
        return new Memento(gameState);
    }
    // 回退存档记录
    void retrieveMemento(Memento memento){
        this.gameState = memento.getGameState();
    }

}
