package com.example.lenim;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game-setup.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Le Nim");
        stage.setScene(scene);
        GameInter gm = new GameInter();
        FXMLLoader gameboard = new FXMLLoader(HelloApplication.class.getResource("game-board.fxml"));
        Scene gScene = new Scene(gameboard.load());
        GameBoard gb = (GameBoard)gameboard.getController();
        gm.init(gb);
        HelloController.start(gm, gScene, stage);
        stage.show();
        //make fullscreen :D
    }

    public static void main(String[] args) {
        launch();
    }
    static GameInter gameInter = new GameInter();
}