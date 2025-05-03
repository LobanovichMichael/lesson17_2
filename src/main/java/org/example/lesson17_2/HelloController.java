package org.example.lesson17_2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private Label label;

    @FXML
    private Label errorLabel;

    @FXML
    private void blueClick() {
        errorLabel.setVisible(false);
        if (label.getTextFill().equals(Color.BLUE)) {
            errorLabel.setVisible(true);
        }
        label.setTextFill(Color.BLUE);
    }

    @FXML
    private void greenClick() {
        errorLabel.setVisible(false);
        if (label.getTextFill().equals(Color.GREEN)) {
            errorLabel.setVisible(true);
        }
        label.setTextFill(Color.GREEN);
    }
}