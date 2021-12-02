package com.coding.library.Controller;



import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import com.coding.library.Controller.MainController;
import javafx.scene.layout.VBox;

public class MenuAppController implements Initializable {
    @FXML
    private Button btnLibrary;

    @FXML
    private VBox menuApp;

    @FXML
    private VBox menuBiblio;

    @FXML
    private VBox menuConversion;


    @Override
    public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
        menuApp.getChildren().removeAll(menuBiblio, menuConversion);
        btnLibrary.setOnAction(event -> {

        });
    }
}

