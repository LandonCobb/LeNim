package com.example.lenim;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

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

    public void startGame(ActionEvent actionEvent) throws IOException, InterruptedException {
        HelloController hc = new HelloController();
        ChangeScene.changeScene(actionEvent, "game-board.fxml");
        hc.startGame(actionEvent);
    }
}
