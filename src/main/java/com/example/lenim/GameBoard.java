package com.example.lenim;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    @FXML
    ImageView token1, token2, token3, token4, token5, token6, token7, token8, token9, token10, token11, token12, token13, token14, token15, token16, token17;
    @FXML
    Button finishButton;
    @FXML
    Label gameLbl;
    int turn = 0;
    int tokensPicked = 0;

    List<ImageView> imgList = new ArrayList<>();

    @FXML
    public void init(int amountTokens){
        imgList = List.of(token1, token2, token3, token4, token5, token6, token7, token8, token9, token10, token11, token12, token13, token14, token15, token16, token17);
        //Randomize token list order
        for (ImageView view: imgList) {
            view.setVisible(false);
        }
        for (int count = 0; count < amountTokens; count++){
            imgList.get(count).setVisible(true);
        }
    }

    public void turn(){
        turn++;
        tokensPicked = 0;
        if(!checkFinish()) {
            gameLbl.setText("Playername should do some shit");
        }else{
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
    public void selectToken(ImageView view){
        if(!view.isVisible()){
            view.setVisible(false);
            tokensPicked++;
            if(tokensPicked == 2){
                turn();
            }
        }
    }

}
