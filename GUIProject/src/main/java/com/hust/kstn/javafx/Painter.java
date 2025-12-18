package com.hust.kstn.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Painter extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("Painter.fxml")
        );
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Painter");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
