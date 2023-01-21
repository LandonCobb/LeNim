package com.example.lenim;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

import java.io.IOException;

public class HelloController {

        @FXML
        private Text errorMessage;

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

        @FXML
        public void startGame(Event event) throws IOException{
                Player human = new Player(txtfPlayer1Name.getText()); //gets p1 name and makes player object with that value

                //if the radio button for human is selected make human

                //ChangeScene.changeScene(event, "game-board.fxml");
        }



}