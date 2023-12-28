package io.ianskelskey.wizard;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WizardController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}