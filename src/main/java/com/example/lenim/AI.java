package com.example.lenim;

import java.util.Random;

public class AI extends Player{
    private final int difficulty;

    public AI(String name, int score, int difficulty) {
        super(name/*,score*/);
        this.difficulty = difficulty;
    }

    public int calcTurn(int tokensLeft, boolean isStartingPlayer) {
        Random random = new Random();
        switch (difficulty) { //
            case 1: {
                return (tokensLeft > 1 ? random.nextInt(1,3 ) : 1);
            }
            case 2: {
                int estTurns = tokensLeft / 2 + tokensLeft % 2;
                return (estTurns % 2 == 1 ? 2 : 1);
            }
            case 3: {
                if (tokensLeft % 4 == 1 || tokensLeft % 4 == 2) {
                    return (isStartingPlayer ? 2 : 1);
                } else {
                    return (isStartingPlayer ? 1 : 2);
                }
            }
        }
    }
}
