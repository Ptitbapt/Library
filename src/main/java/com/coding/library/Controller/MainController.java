package com.coding.library.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import com.coding.library.Controller.*;
public class MainController implements Initializable {





    @FXML
    private VBox menuBiblio;

    @FXML
    private VBox menuConversion;

    @FXML
    private Button btnBiblio;

    @FXML
    private Button btnConversion;

    @FXML
    private Button btnImc;

    @FXML
    private VBox buttonBox;

    @FXML
    private VBox menuApp;

    @FXML
    private Button btnLibrary;

    @FXML
    private VBox mainMenu;

    @FXML
    private Button btnConv;

    @FXML
    private MenuItem menuItemMain;

    @FXML
    private MenuItem menuItemConv;

    @FXML
    private MenuItem menuItemBiblio;

    @FXML
    private MenuItem itemQuit;
    @FXML
    private Button btnQuit;


    @Override
    public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
        menuApp.getChildren().removeAll( menuBiblio, menuConversion);

        btnLibrary.setOnAction(event -> {
            menuApp.getChildren().add(menuBiblio);
            menuApp.getChildren().remove(mainMenu);
        });
        menuItemConv.setOnAction(event -> {
            menuApp.getChildren().removeAll(menuBiblio,mainMenu);
            menuApp.getChildren().add(menuConversion);
        });
        btnConv.setOnAction(event -> {
            menuApp.getChildren().removeAll(mainMenu, menuBiblio);
            menuApp.getChildren().add(menuConversion);
        });
        menuItemMain.setOnAction(event -> {
            menuApp.getChildren().removeAll(menuConversion, menuBiblio);
            menuApp.getChildren().add(mainMenu);
        });
        menuItemBiblio.setOnAction(event -> {
            menuApp.getChildren().removeAll(menuConversion, mainMenu);
            menuApp.getChildren().add(menuBiblio);
        });
        itemQuit.setOnAction(event -> {
            System.exit(0);
        });
        btnQuit.setOnAction(event -> {
            System.exit(0);
        });

    }
}
