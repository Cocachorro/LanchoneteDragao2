package com.lanchonetedragao2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControlerMain {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}