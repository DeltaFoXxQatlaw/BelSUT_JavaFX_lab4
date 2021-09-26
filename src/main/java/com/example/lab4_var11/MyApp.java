package com.example.lab4_var11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * This class is the main executable class of this project
 * @author Evgeny Litvinov
 * @version 1.0.0
 */
public class MyApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(MyApp.class.getResource("StartScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 546, 380);
        stage.setTitle("LabWork");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}