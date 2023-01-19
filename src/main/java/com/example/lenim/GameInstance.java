package com.example.lenim;
import java.util.Random;

public class GameInstance {
    private int gameTokens;
    private Player[] players;
    private int playerTurn;


    public GameInstance(int gameTokens, int playerTurn) {
        this.gameTokens = gameTokens;
        this.players = new Player[2];
        this.playerTurn = playerTurn;
    }
}
