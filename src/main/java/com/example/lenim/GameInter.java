package com.example.lenim;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameInter {

    private List<Player> playerList = new ArrayList<>();
    static GameBoard gb;

    public int aiGarbage(){
        return 1;
    }
    public static void init(GameBoard game){
        gb = game;
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
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/saves/leader.txt"));
            Player[] players = (Player[]) objectInputStream.readObject();
            for (Player p: players) {
                if (p.getName().equals(winner.getName())){
                    p.setScore(p.getScore()+1);
                }
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/scores/leader.txt"));
            objectOutputStream.writeObject(players);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Player[] Leaderboard(){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/saves/leader.txt"));
            Player[] players = (Player[]) objectInputStream.readObject();
            objectInputStream.close();
            return players;
        }catch (IOException | ClassNotFoundException ignored){
            return null;
        }
    }

}
