package com.example.lenim;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class GameSetup {

    @FXML
    private HBox aiSettings;

    @FXML
    private HBox player2NameBox;

    @FXML
    private Label errorMessage;

    @FXML
    private ToggleGroup difficulty;

    @FXML
    private ToggleGroup opponent;

    @FXML
    private TextField txtfPlayer1Name;

    @FXML
    private TextField txtfPlayer2Name;

    static GameInter gi;
    static Stage st;
    static Scene gameScene;

    public static void start(GameInter gm, Scene gb, Stage stage) {
        gi = gm;
        st = stage;
        gameScene = gb;
    }

    @FXML
    public void startGame(Event event) throws IOException, InterruptedException {
        if (txtfPlayer1Name.getText().equals("")/* || txtfPlayer2Name.getText().equals("")*/) {
            errorMessage.setText("Please provide names for both players");
            difficulty();
        }
//        else if (txtfPlayer2Name.getText().equals(txtfPlayer1Name.getText())) {
//            errorMessage.setText("Bro... DIFFERENT NAMES");
//}
        else if (opponent.getSelectedToggle().toString().contains("rbtnHuman")) {
            Player human = new Player(txtfPlayer1Name.getText()); //gets p1 name and makes player object with that value
            Player player2 = new Player(txtfPlayer2Name.getText());
            st.setScene(gameScene);
            gi.Start(human, player2);


        } else if (opponent.getSelectedToggle().toString().contains("rbtnComputer")) {
            Player human = new Player(txtfPlayer1Name.getText());
            AI player2 = new AI("Mr. AI", 0, difficulty());
            st.setScene(gameScene);
            gi.Start(human, player2);

        }
    }


    @FXML
    public void toggleView(Event event) throws IOException {
        if (event.getTarget().toString().contains("Computer")) {
            aiSettings.setVisible(true);
            player2NameBox.setVisible(false);
        } else if (event.getTarget().toString().contains("Human")) {
            aiSettings.setVisible(false);
            player2NameBox.setVisible(true);
        }
    }

    public int difficulty() {
        if (difficulty.getSelectedToggle().toString().contains("Easy")) {
            System.out.println("1");
            return 1;
        } else if (difficulty.getSelectedToggle().toString().contains("Medium")) {
            System.out.println("2");
            return 2;
        } else if (difficulty.getSelectedToggle().toString().contains("Hard")) {
            System.out.println("3");
            return 3;
        }
        return 0;
    }
}