package com.example.lenim;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;

public class HelloController {

        @FXML
        private Button btnStart;

        @FXML
        private TextField maximinToken;

        @FXML
        private TextField minimumToken;
        @FXML
        private RadioButton rbtnHuman;
        @FXML
        private RadioButton rbtnComputer;
        @FXML
        private RadioButton rbtnDiffEasy;

        @FXML
        private RadioButton rbtnDiffHard;

        @FXML
        private RadioButton rbtnDiffMedium;
        @FXML
        private TextField txtfPlayer1Name;

        @FXML
        private TextField txtfPlayer2Name;

        @FXML
        public void startGame(Event event) throws IOException{

        }



}