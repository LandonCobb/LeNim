package com.example.lenim;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label errorMessage;

    @FXML
    private Button btnStart;

    @FXML
    private ToggleGroup difficulty;

    @FXML
    private TextField maximinToken;

    @FXML
    private TextField minimumToken;

    @FXML
    private ToggleGroup opponent;

    @FXML
    private RadioButton rbtnComputer;

    @FXML
    private RadioButton rbtnDiffEasy;

    @FXML
    private RadioButton rbtnDiffHard;

    @FXML
    private RadioButton rbtnDiffMedium;
    @FXML
    private RadioButton rbtnHuman;

    @FXML
    private TextField txtfPlayer1Name;

    @FXML
    private TextField txtfPlayer2Name;

    static GameInter gi;
    static Stage st;
    static Scene gameScene;

    public static void start(GameInter gm, Scene gb, Stage stage){
        gi = gm;
        st = stage;
        gameScene = gb;
    }

    @FXML
    public void startGame(Event event) throws IOException, InterruptedException {
        if (txtfPlayer1Name.getText().equals("") || txtfPlayer2Name.getText().equals("")) {
            errorMessage.setText("Please provide names for both players");

        } else if (opponent.getSelectedToggle().toString().contains("rbtnHuman")) {
            Player human = new Player(txtfPlayer1Name.getText()); //gets p1 name and makes player object with that value
            Player player2 = new Player(txtfPlayer2Name.getText());
            st.setScene(gameScene);
            gi.Start(human.getName(), player2.getName());


        } else if (opponent.getSelectedToggle().toString().contains("rbtnComputer")) {
            Player human = new Player(txtfPlayer1Name.getText());
            AI player2 = new AI(txtfPlayer2Name.getText(), 0, 0);
            st.setScene(gameScene);
            gi.Start(human.getName(), player2.getName());

        }
    }
}