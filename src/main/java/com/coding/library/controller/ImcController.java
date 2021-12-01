package com.coding.library.controller;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class ImcController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtPoids.setOnKeyTyped(txtTailleAction -> {
            if(!txtPoids.getText().isEmpty()){
                double maValue = Double.parseDouble(txtPoids.getText());
                txtImc.setText(poidsVersImc(maValue));
            }else{
                txtimc.setText("");
            }

        });

    }
    public String poidsVersImc (double txtPoids,double txtTaille) {
        double imcResult = txtPoids / (txtTaille * txtTaille);
        return Double.toString(imcResult);
    }

}
