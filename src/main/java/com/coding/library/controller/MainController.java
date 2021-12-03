package com.coding.library.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {



    @FXML
    private Button btnConvertisseur;

    @FXML
    private TextField imcResult;

    @FXML
    private TextField txtPoids;

    @FXML
    private TextField txtTaille;

    double taille = Double.parseDouble(txtPoids.getText());
    double poids = Double.parseDouble(txtPoids.getText());





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



        btnConvertisseur.setOnMouseClicked(btnConvertisseurAction -> {
            System.out.println("marche");
            double Result = poids / (taille * taille);
            String Result2 = String.valueOf(Result);
            imcResult.setText(Result2);



        });



    }



}

