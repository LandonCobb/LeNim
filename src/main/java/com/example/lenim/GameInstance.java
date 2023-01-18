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

    public void Start(int minTokens, int maxTokens, String player1Name, String player2Name) {
        /*
            Going to move the GameInstance declaration outside into a parent class once the JavaFX infra
            is setup. Planning on refactoring code into separate functions at a later date!
         */
        Random rand = new Random();

        GameInstance gm = new GameInstance();
        gm.gameTokens = rand.nextInt(minTokens, maxTokens + 1);
        gm.players = new Player[]{ new Player(player1Name), new Player(player2Name) };
        gm.playerTurn = rand.nextInt(gm.players.length);

        do {

        } while (gm.gameTokens > 0);
    }





}
