package com.example.lenim;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameInter {

    private List<Player> playerList = new ArrayList<>();
    static GameBoard gb;
    static GameOver go;

    public static void init(GameBoard game, GameOver gameOver){
        gb = game;
        go = gameOver;
    }

    public void Start(){
        gb.init(((int) (Math.random()*12)+5), playerList);
    }

    public void Start(Player p1, Player p2) {
        playerList = new ArrayList<>();
        playerList.add(p1);
        playerList.add(p2);
        gb.init(((int) (Math.random()*12)+5), playerList);
    }
    public void Save(Player winner){
        try {
            Player[] players = Leaderboard();
            winner.setScore(1);
            if (players == null) {
                players = new Player[]{winner};
            }else{
                boolean exists = false;
                for (Player p: players){
                    if(p.getName().equals(winner.getName())){
                        p.setScore(p.getScore()+1);
                        exists = true;
                        break;
                    }
                }
                if (!exists){
                    Player[] temp = new Player[players.length+1];
                    System.arraycopy(players, 0, temp, 0, players.length);
                    temp[temp.length-1] = winner;
                    players = temp;
                }
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/scores/leader.txt"));
            objectOutputStream.writeObject(players);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        go.endGame(winner.getName());
    }

    public String LeaderStrings(){
        Player[] players = Leaderboard();
        Arrays.sort(players);
        int length = Math.min(players.length, 5);
        StringBuilder result = new StringBuilder();
        for (int top5 = 0; top5 < length;top5++){
            result.append(players[top5].toString()).append("\n");
        }
        return result.toString();
    }

    public Player[] Leaderboard(){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/scores/leader.txt"));
            Player[] players = (Player[]) objectInputStream.readObject();
            objectInputStream.close();
            return players;
        }catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
            return null;
        }
    }

}
