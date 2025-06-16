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
        changeLabelTextColor(Color.BLUE);
    }

    @FXML
    private void redClick() {
        changeLabelTextColor(Color.RED);
    }

    @FXML
    private void purpleClick() {
        changeLabelTextColor(Color.PURPLE);
    }

    @FXML
    private void greenClick() {
        changeLabelTextColor(Color.GREEN);
    }

    private void changeLabelTextColor(Color color) {
        errorLabel.setVisible(false);
        if (label.getTextFill().equals(color)) {
            errorLabel.setVisible(true);
        }
        label.setTextFill(color);
    }
}