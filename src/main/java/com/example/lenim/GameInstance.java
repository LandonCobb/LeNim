package com.example.lenim;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class GameInstance {
    private static ArrayList<Player> players = new ArrayList<>();
    private static int playerTurn = 0;

    public static void Start(){
        boolean done = false;
        do {
            //set players
            GenerateTokens();
            if ((playerTurn % 2 == 0)){
                //player 1 turn (players[(playerTurn % 2)].name)
            } else {
                //player 2 turn (players[(playerTurn % 2)].name)
            }
            //select token
            done = CheckWin();
            playerTurn++;

        }while (!done);
    }


    public static void GenerateTokens(){
        //generate random # tokens
    }

    public static boolean CheckWin(){
        //if statement for player 1 winning
        //if statement for player 2 winning
        return false;
    }
}
