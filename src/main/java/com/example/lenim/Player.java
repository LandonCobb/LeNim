package com.example.lenim;

import java.io.Serializable;

public class Player implements Serializable, Comparable<Player>{
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    static GameInter gameInter = new GameInter();

    @Override
    public int compareTo(Player p)
    {
        if (this.score != p.getScore()) {
            return p.getScore() - this.score;
        }
        return 0;
    }

    @Override
    public String toString() {
        return name + "<==>" + score;
    }
}
