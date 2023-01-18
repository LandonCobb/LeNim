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
        private TextField onePlayerName;

        @FXML
        private Button start;

        @FXML
        private TextField twoPlayer1;

        @FXML
        private TextField twoPlayer2;

        @FXML
        private Button twoPlayerBtn;

        @FXML
        void onePlayer(MouseEvent event) {
                onePlayerName.setVisible(true);
                start.setVisible(true);
                twoPlayer1.setVisible(false);
                twoPlayer2.setVisible(false);
                twoPlayer1.setText("");
                twoPlayer2.setText("");
        }

        @FXML
        void twoPlayer(MouseEvent event) {
                onePlayerName.setVisible(false);
                start.setVisible(true);
                twoPlayer1.setVisible(true);
                twoPlayer2.setVisible(true);
                onePlayerName.setText("");
        }

        @FXML
        void proceed(Event event) throws IOException {
                ChangeScene.changeScene(event, "game-board.fxml");
        }
}