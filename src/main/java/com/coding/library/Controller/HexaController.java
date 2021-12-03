package com.coding.library.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HexaController implements Initializable {

    @FXML
    private TextField txtDec;

    @FXML
    private TextField txtHexa;

    public static String DecToHex(int dec) {
        int tmp;
        String hexa = ""; // get the character of the hexadecimal array
        char hexchars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (dec > 0) { // Until it's divisible by 16
            tmp = dec % 16; // Get the rest of the divided by 16
            hexa = hexchars[tmp] + hexa; // Add the result and the character
            dec = dec / 16; // divide by 16
        }
        return hexa;
    }

    public static String HexToDec(String hex) {
        String Hexa = "0123456789ABCDEF"; // recognize the hexa character
        hex = hex.toUpperCase(); // put in capital letters for the case
        int val = 0;
        for (int i = 0; i < hex.length(); i++) { // get the lenght of what is type
            char c = hex.charAt(i); // get what is type in the length
            int index = Hexa.indexOf(c); // get the index of c in the array ex: A = 10
            val = 16 * val + index; // ex: 2D = 16 * 2 = 32 + D = 13 , 32 + 13 = 45
        }

        return val + "";
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtDec.setOnKeyReleased(ActKey -> { // When an entry is made in the text field of decimal
            if (txtDec.getText() == "") { // If the text field of decimal is empty
                txtHexa.setText(""); // Delete what's inside the text field of the hexadecimal
            } else {
                txtHexa.setText(DecToHex(Integer.parseInt(txtDec.getText()))); // Convert with the function
            }

        });

        txtHexa.setOnKeyReleased(ActKey -> { // When an entry is made in the text field of hexadecimal
            if (txtHexa.getText() == "") { // If the text field of hexadecimal is empty
                txtDec.setText(""); // Delete what's inside the text field of decimal
            } else {
                txtDec.setText(HexToDec(String.valueOf(txtHexa.getText()))); // Convert with the function
            }
        });
    }
}