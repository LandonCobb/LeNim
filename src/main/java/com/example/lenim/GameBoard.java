package com.example.lenim;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameBoard {
    @FXML
    private ImageView token1, token2, token3, token4, token5, token6, token7, token8, token9, token10, token11, token12, token13, token14, token15, token16, token17;
    @FXML
    Button finishButton;
    @FXML
    Label gameLbl;
    int turn = 0;
    int tokensPicked = 0;

    List<ImageView> imgList = new ArrayList<>();
    List<Player> playerList = new ArrayList<>();

    @FXML
    public void init(int amountTokens, List<Player> pList){
        playerList = pList;
        imgList.add(token1);
        imgList.add(token2);
        imgList.add(token3);
        imgList.add(token4);
        imgList.add(token5);
        imgList.add(token6);
        imgList.add(token7);
        imgList.add(token8);
        imgList.add(token9);
        imgList.add(token10);
        imgList.add(token11);
        imgList.add(token12);
        imgList.add(token13);
        imgList.add(token14);
        imgList.add(token15);
        imgList.add(token16);
        imgList.add(token17);
        Collections.shuffle(imgList);
        for (ImageView view: imgList) {
            view.setVisible(false);
        }
        for (int count = 0; count < amountTokens; count++){
            imgList.get(count).setVisible(true);
        }
        turn = -1;
        turn();
    }

    @FXML
    public void finishTurn(){
        if (tokensPicked == 1){
            turn();
        }
    }

    public void turn(){
        turn++;
        tokensPicked = 0;
        if(!checkFinish()) {
            if(playerList.get(turn%2).getName().equals("AI")) {
                //do ai here
            }else{
                gameLbl.setText(playerList.get(turn%2).getName() + " please choose token(s).");
            }
        }else{
            System.out.println("fin");
            //endgame
        }
    }

    public boolean checkFinish(){
        int invisible = 0;
        for (ImageView view: imgList) {
            if(!view.isVisible()){
                invisible++;
            }
        }
        return invisible == 17;
    }

    @FXML
    public void selectToken(MouseEvent event){
        ImageView view = checkView(event);
        System.out.println(view);
        if(view != null && view.isVisible()){
            view.setVisible(false);
            tokensPicked++;
            if(tokensPicked == 2){
                turn();
            }
        }
    }

    public ImageView checkView(MouseEvent event){
        for (ImageView view: imgList) {
            if (event.getTarget() == view){
                return view;
            }
        }
        return null;
    }

}
