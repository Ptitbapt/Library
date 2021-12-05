package com.coding.library.Controller;

import com.coding.library.Model.DecToRom;
import com.coding.library.Model.RomToDec;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class RomController implements Initializable {
    @FXML
    private TextField txtDecimal;

    @FXML
    private TextField txtRomain;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtDecimal.setOnKeyReleased(event -> {
            if (!Objects.equals(txtDecimal.getText(), "") && Integer.parseInt(txtDecimal.getText()) <= 3999) {
                DecToRom decimalToRoman = new DecToRom(Integer.parseInt(txtDecimal.getText()));

                txtRomain.setText(decimalToRoman.result());
            } else {
                txtRomain.setText("");
            }
        });

        txtRomain.setOnKeyReleased(event -> {
                if (!Objects.equals(txtRomain.getText(), "") && txtRomain.getText().length() <= 3999) {         //si le nombre de caractère est inférieur à 3999
                   RomToDec romanToDecimal = new RomToDec(txtRomain.getText());                                    //on crée un objet RomToDec
                  txtDecimal.setText(String.valueOf(romanToDecimal.result()));                                    //le résultat est fait en fonction de la valeur dans txtDecimal


                         } else {
                            txtDecimal.setText("Cant convert");
                        }


            });
        }
    }


