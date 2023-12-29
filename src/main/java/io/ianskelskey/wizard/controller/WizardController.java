package io.ianskelskey.wizard.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class WizardController {

    private final StringProperty primaryColor = new SimpleStringProperty("#3379b7");

    public HBox topNavigation;
    public HBox bottomNavigation;

    @FXML
    protected void initialize() {
        styleComponents();
    }

    private void styleComponents() {
        Color backgroundColor = Color.web(getPrimaryColor());
        Background background = new Background(new BackgroundFill(backgroundColor, null, null));
        topNavigation.setBackground(background);
        bottomNavigation.setBackground(background);
    }

    public void setPrimaryColor(String color) {
        primaryColor.set(color);
    }

    public String getPrimaryColor() {
        return primaryColor.get();
    }

}