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
                if (!Objects.equals(txtRomain.getText(), "") && txtRomain.getText().length() <= 3999) {
                   RomToDec romanToDecimal = new RomToDec(txtRomain.getText());

                  txtDecimal.setText(String.valueOf(romanToDecimal.result()));


              //  }
                  //  if (!txtRomain.contains("IIII") && !txtRomain.contains("VVVV") && !txtRomain.contains("XXXX") && !txtRomain.contains("LLLL") && !txtRomain.contains("CCCC") && !txtRomain.contains("DDDD") && !txtRomain.contains("MMMM") && !txtRomain.contains("VX") && !txtRomain.contains("VL") && !txtRomain.contains("VC") && !txtRomain.contains("VD") && !txtRomain.contains("VM") && !txtRomain.contains("LC") && !txtRomain.contains("LD") && !txtRomain.contains("LM") && !txtRomain.contains("XD") && !txtRomain.contains("DM") && !txtRomain.contains("IL") && !txtRomain.contains("IC") && !txtRomain.contains("ID") && !txtRomain.contains("IM") && !txtRomain.contains("XM") && !txtRomain.contains("XCX") && !txtRomain.contains("XMX") && !txtRomain.contains("XDX") && (txtRomain.contains("I") || txtRomain.contains("V")|| txtRomain.contains("X")|| txtRomain.contains("L")|| txtRomain.contains("C")|| txtRomain.contains("D")|| txtRomain.contains("M"))) {

                    // }

                         } else {
                            txtDecimal.setText("");
                        }


            });
        }
    }


