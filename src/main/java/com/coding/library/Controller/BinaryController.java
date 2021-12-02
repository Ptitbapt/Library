package com.coding.library.Controller;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
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
        int[] binary = new int[30];
        int j = 0;

        while (num > 0) {
            binary[j++] = num % 2;
            num = num / 2;
        }


        return Arrays.toString(binary) ;


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

        txtDecimal.setOnKeyTyped(event -> {
            txtBinaire.setText(convertDecimalToBinary(Integer.parseInt(txtDecimal.getText())));

        });

        txtBinaire.setOnKeyTyped(event -> {
            txtDecimal.setText(convertBinaryToDecimal(Integer.parseInt(txtBinaire.getText())));
        });
        btnDelete.setOnMouseClicked(event -> {
            txtBinaire.setText("");
            txtDecimal.setText("");
        });
        }

    }

