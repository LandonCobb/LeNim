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

    List<ImageView> imgList = new ArrayList<>();

    @FXML
    public void init(int amountTokens){
        imgList = List.of(token1, token2, token3, token4, token5, token6, token7, token8, token9, token10, token11, token12, token13, token14, token15, token16, token17);
        for (ImageView view: imgList) {

        }
        for (int count = 0; count < amountTokens; count++){
            imgList.get(count).isVisible();
        }
    }

    public void selectToken(){

    }

}
