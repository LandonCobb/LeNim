package com.example.lenim;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class HelloController {
        @FXML
        private Button onePlayerBtn;

        @FXML
        private Button twoPlayerBtn;

        @FXML
        void onePlayer(Event event) throws IOException {
                ChangeScene.changeScene(event, "one-Player.fxml");
        }

        @FXML
        void twoPlayer(Event event) throws IOException {
                ChangeScene.changeScene(event, "two-Player.fxml");
        }
}