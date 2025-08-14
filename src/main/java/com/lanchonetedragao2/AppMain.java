package com.lanchonetedragao2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class AppMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppMain.class.getResource("telaPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());
        stage.setResizable(false);
        stage.setTitle("Lanchonete Dragão");
        Image icon = new Image(getClass().getResourceAsStream("/images/icone restaurante.png"));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}