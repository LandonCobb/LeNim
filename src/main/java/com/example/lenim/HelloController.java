package com.example.lenim;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.io.IOException;


public class HelloController {

        @FXML
        private Button onePlayerBtn;

        @FXML
        private TextField player1Name;

        @FXML
        private Button start;

        @FXML
        private TextField player2Name;

        @FXML
        private Button twoPlayerBtn;
        @FXML
        void onePlayer(MouseEvent event) {
                player1Name.setVisible(true);
                start.setVisible(true);
                player2Name.setVisible(false);
                player1Name.setText("");
                player2Name.setText("");
        }

        @FXML
        void twoPlayer(MouseEvent event) {
                player1Name.setVisible(true);
                start.setVisible(true);
                player2Name.setVisible(true);
                player1Name.setText("");
        }

        @FXML
        void proceed(Event event) throws IOException {
                ChangeScene.changeScene(event, "game-board.fxml");
        }
}