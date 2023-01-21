package com.example.lenim;

public class AI extends Player{
    private final int difficulty;

    public AI(String name, int score, int difficulty) {
        super(name/*,score*/);
        this.difficulty = difficulty;
    }
}
