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

    @FXML
    private Text tLeader;
    static GameInter gi;
    static Stage st;
    static Scene gameScene;
    static Scene setupScene;

    public static void start(GameInter gm, Scene gb, Stage stage, Scene gs){
        gi = gm;
        st = stage;
        gameScene = gb;
        setupScene = gs;
    }

    public void endGame(String winnerName){
        txtPlayerWin.setText(winnerName + " won!");
        tLeader.setText(gi.LeaderStrings());
    }

    public void startGame() {
        st.setScene(gameScene);
        gi.Start();
    }

    public void restartGame(){
        st.setScene(setupScene);
    }

    public void exit(){
        st.close();
    }
}
