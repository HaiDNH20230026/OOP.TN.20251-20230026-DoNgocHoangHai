package com.hust.kstn.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;
    private boolean eraserMode = false;

    @FXML
    private void drawingAreaMouseDragged(MouseEvent event) {
        Circle newCircle = new Circle(event.getX(), event.getY(), 4);
        if (eraserMode) {
            newCircle.setFill(Color.WHITE);
        } else {
            newCircle.setFill(Color.BLACK);
        }
        drawingAreaPane.getChildren().add(newCircle);
    }
    @FXML
    private void penSelected() {
        eraserMode = false;
    }
    @FXML
    private void eraserSelected() {
        eraserMode = true;
    }
    @FXML
    private void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }
}
