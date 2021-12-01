package com.coding.library.controller;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class ImcController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtTaille.setOnKeyTyped(txtTailleAction -> {
            if(!txtTaille.getText().isEmpty()){
                double maValue = Double.parseDouble(txtTaille.getText());
                txtImc.setText(tailleVersimc(maValue));
            }else{
                txtimc.setText("");
            }

        });
    }
}
