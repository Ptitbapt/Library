package com.coding.library.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


    public class ImcController implements Initializable {


            @FXML
            private TextField txtImc;

            @FXML
            private TextField txtPoids;

            @FXML
            private TextField txtTaille;

            @FXML
            private Button btnValiderIMC;

            @FXML
            private TextField txtImcRep;




            @Override
            public void initialize(URL url, ResourceBundle resourceBundle) {
                btnValiderIMC.setOnMouseClicked(btnConvertisseurAction -> {
                    int poids = Integer.parseInt(txtPoids.getText());
                    double taille = Double.parseDouble(txtTaille.getText());

                    double imc = poids / (taille * taille);
                    txtImc.setText(String.valueOf(Math.round(imc * 100.0)/100.0));

                    if (imc < 18.4) {
                        txtImcRep.setText("Vous êtes maigre");
                    }else if (imc < 24.9 && imc > 18.5) {
                        txtImcRep.setText("Vous êtes de corpulence normale");
                    }else if (imc < 29.9 && imc > 25) {
                        txtImcRep.setText("Vous êtes en surpoids");
                    }else if (imc < 34.9 && imc > 30) {
                        txtImcRep.setText("Vous êtes en obésité modérée");
                    }else if (imc < 39.9 && imc > 35) {
                        txtImcRep.setText("Vous êtes en obésité sévère");
                    }else if (imc > 40) {
                        txtImcRep.setText("Vous êtes en obésité morbide");
                    }


                });






            }
        }