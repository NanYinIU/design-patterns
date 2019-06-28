package com.nanyin.pattern.memento;

public class App {
    public static void main(String[] args) {
        //创建一个动作类型的游戏
        Game actionGame = new ActionGame();
        //玩家通关
        Player player = new Player(GameState.SUCCESS);
        //存档
        Memento memento = player.createMemento();
        actionGame.storeGamePoint(memento);
        //此时玩家阵亡
        player.setGameState(GameState.DIE);
        System.out.println(player.getGameState());
        //需要从上一次游戏存档中加载原来的玩家状态
        player.retrieveMemento(actionGame.retrieveGamePoint());
        System.out.println(player.getGameState());
    }
}
