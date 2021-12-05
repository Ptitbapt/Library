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

    @FXML
    private AnchorPane MenuArmyBox;

    @FXML
    private VBox armyBox;

    @FXML
    private MenuItem armyButton;


    
    @Override
    public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
        menuApp.getChildren().removeAll( menuBiblio, menuConversion , MenuArmyBox, armyBox);             //remove toute les vbox inutiles

        btnBiblio.setOnAction(event -> {
            menuApp.getChildren().add(menuBiblio);                                              //ajoute la vbox de biblio quand on appuie sur le bouton biblio
            menuApp.getChildren().remove(mainMenu);                                             //enleve la vbox de menu principal quand on appuie sur le bouton biblio
        });
        btnConv.setOnAction(event -> {
            menuApp.getChildren().removeAll(menuBiblio,mainMenu,armyBox);                               //enleve les vbox de biblio et de menu principal quand on appuie sur le bouton conversion
            menuApp.getChildren().add(menuConversion);                                          //ajoute la vbox de conversion quand on appuie sur le bouton conversion
        });
        btnConv.setOnAction(event -> {
            menuApp.getChildren().removeAll(mainMenu, menuBiblio,armyBox);                              //enleve les vbox de menu principal et de biblio quand on appuie sur le bouton conversion
            menuApp.getChildren().add(menuConversion);                                          //ajoute la vbox de conversion quand on appuie sur le bouton conversion
        });
        menuItemMain.setOnAction(event -> {
            menuApp.getChildren().removeAll(menuConversion, menuBiblio,armyBox);                        //enleve les vbox de conversion et de biblio quand on appuie sur le menu principal
            menuApp.getChildren().add(mainMenu);                                                //ajoute la vbox de menu principal quand on appuie sur le menu principal
        });
        menuItemBiblio.setOnAction(event -> {
            menuApp.getChildren().removeAll(menuConversion, mainMenu,armyBox);                          //enleve les vbox de conversion et de menu principal quand on appuie sur le menu biblio
            menuApp.getChildren().add(menuBiblio);                                              //ajoute la vbox de biblio quand on appuie sur le menu biblio
        });

        menuItemConv.setOnAction(event -> {
            menuApp.getChildren().removeAll(mainMenu, menuBiblio,armyBox);                             //enleve les vbox de menu principal et de biblio quand on appuie sur le menu conversion
            menuApp.getChildren().add(menuConversion);                                          //ajoute la vbox de conversion quand on appuie sur le menu conversion
        });
        itemQuit.setOnAction(event -> {
            System.exit(0);                                                              //quitte l'application quand on appuie sur le menu quitter
        });
        btnQuit.setOnAction(event -> {
            System.exit(0);                                                             //quitte l'application quand on appuie sur le bouton quitter
        });
        armyButton.setOnAction(event -> {
            menuApp.getChildren().removeAll(mainMenu, menuBiblio,menuConversion);               //enleve les vbox de menu principal et de biblio quand on appuie sur le menu army
            menuApp.getChildren().addAll(armyBox);                                              //ajoute la vbox de army quand on appuie sur le menu army
        });


    }
}
