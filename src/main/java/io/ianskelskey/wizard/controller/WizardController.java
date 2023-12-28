package io.ianskelskey.wizard.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class WizardController {

    private String primaryColor = "#3379b7";

    public HBox topNavigation;
    public HBox bottomNavigation;

    @FXML
    protected void initialize() {
        Color backgroundColor = Color.web(primaryColor);
        Background background = new Background(new BackgroundFill(backgroundColor, null, null));
        topNavigation.setBackground(background);
        bottomNavigation.setBackground(background);
    }


}