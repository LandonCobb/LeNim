package com.example.lenim;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

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

    @FXML
    public void startGame(Event event) throws IOException {
        if (txtfPlayer1Name.getText().equals("") || txtfPlayer2Name.getText().equals("")) {
            errorMessage.setText("Please provide names for both players");
        } else if (opponent.getSelectedToggle().toString().contains("rbtnHuman")) {
            Player human = new Player(txtfPlayer1Name.getText()); //gets p1 name and makes player object with that value
            Player player2 = new Player(txtfPlayer2Name.getText());
            ChangeScene.changeScene(event, "game-board.fxml");

        } else if (opponent.getSelectedToggle().toString().contains("rbtnComputer")) {
            Player human = new Player(txtfPlayer1Name.getText());
            AI player2 = new AI(txtfPlayer2Name.getText(), 0, 0);
            ChangeScene.changeScene(event, "game-board.fxml");

        }

        //onMouseClicked for the image views
    }
}