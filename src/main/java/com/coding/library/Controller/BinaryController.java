package com.coding.library.Controller;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;


public class BinaryController implements Initializable {


    @FXML
    private TextArea txtBinaire;

    @FXML
    private TextArea txtDecimal;

    @FXML
    private Button btnDelete;

    public String convertDecimalToBinary(int num) {
        ArrayList<String> list = new ArrayList<>();
        int j = 0;

        while (num > 0) {
            list.add(j++, num % 2 + "");
            num = num / 2;
        }

        String result = "";

        for (int i = list.size()-1; i >= 0; i--) {
            result += list.get(i);
        }

        return result ;
    }

    public String convertBinaryToDecimal(int num) {
        int result;
        int ki = 0;
        int pi = 0;

        while (num != 0) {
                result = num % 10;
                ki += result * Math.pow(2, pi);
                num = num / 10;
                pi++;
            }
        return ki + "";

        }






    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        txtDecimal.setOnKeyTyped(event1 -> {
            int decimal = Integer.parseInt(txtDecimal.getText());
            txtBinaire.setText(String.valueOf(convertDecimalToBinary(decimal)));

        });

        txtBinaire.setOnKeyTyped(event2 -> {
            int binaire = Integer.parseInt(txtBinaire.getText());
            txtDecimal.setText(String.valueOf(convertBinaryToDecimal(binaire)));
        });

        btnDelete.setOnMouseClicked(event -> {
            txtBinaire.setText("");
            txtDecimal.setText("");
        });
        }

    }

