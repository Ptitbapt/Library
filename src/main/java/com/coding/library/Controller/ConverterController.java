package com.coding.library.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ConverterController implements Initializable {
    @FXML
    private TextField txtBinaire;

    @FXML
    private TextField txtDecimal;


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
    public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
        txtDecimal.setOnKeyTyped(event1 -> {
            if (txtDecimal.getText() == "") { // If the text field of decimal is empty
                txtBinaire.setText(""); // Delete what's inside the text field of the hexadecimal
            } else {
                int decimal = Integer.parseInt(txtDecimal.getText());
                txtBinaire.setText(String.valueOf(convertDecimalToBinary(decimal)));
            }
        });

        txtBinaire.setOnKeyTyped(event2 -> {
            if (txtBinaire.getText() == "") { // If the text field of decimal is empty
                txtDecimal.setText(""); // Delete what's inside the text field of the hexadecimal
            } else {
                int binaire = Integer.parseInt(txtBinaire.getText());
                txtDecimal.setText(String.valueOf(convertBinaryToDecimal(binaire)));
            }
        });

    }

}


