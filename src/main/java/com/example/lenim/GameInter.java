package com.example.lenim;

import java.util.ArrayList;
import java.util.List;

public class GameInter {

    private List<Player> playerList = new ArrayList<>();
    GameBoard gb = new GameBoard();

    public void Start(String p1Name, String p2Name) {
        playerList = new ArrayList<>();
        playerList.add(new Player(p1Name));
        playerList.add(new Player(p2Name));
        gb.init(((int) (Math.random()*12)+5), playerList);
    }

    public void Start(String p1Name){
        Start(p1Name, "AI");
    }
}