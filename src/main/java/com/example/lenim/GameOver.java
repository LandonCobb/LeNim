package com.example.lenim;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameOver {

    @FXML
    private Button btnExit;

    @FXML
    private Button btnNewOpponent;

    @FXML
    private Button btnRematch;

    @FXML
    private ImageView imgWin1;

    @FXML
    private ImageView imgWin2;

    @FXML
    private Text txtPlayerWin;
    static GameInter gi;
    static Stage st;
    static Scene gameScene;

    public static void start(GameInter gm, Scene gb, Stage stage){
        gi = gm;
        st = stage;
        gameScene = gb;
    }

}
