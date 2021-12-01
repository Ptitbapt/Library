package com.coding.library.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnConvertisseur.setOnMouseClicked(btnConvertisseurAction -> {
            if (!pageCenter.getChildren().contains(form1)) {
                pageCenter.getChildren().addAll(form1);
                pageCenter.getChildren().removeAll(form2);
            }
        });



    }

}