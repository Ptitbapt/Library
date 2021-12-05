package com.coding.library.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ConversionController implements Initializable {

    @FXML
    private SplitPane containerAll;
    @FXML
    private AnchorPane anchorPaneLeft;
    @FXML
    private AnchorPane anchorPaneRight;
    @FXML
    private Button btnToBinaire;
    @FXML
    private Button btnToHexa;
    @FXML
    private Button btnToRom;
    @FXML
    private AnchorPane BinaryBox2;
    @FXML
    private HBox imcBox;
    @FXML
    private Button btnIMC;

    @FXML
    private HBox HexaBox;

    @FXML
    private Button btnDeciChRom;

    @FXML
    private VBox RomainBox;
    @Override
    public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
        anchorPaneRight.getChildren().removeAll(BinaryBox2,HexaBox,imcBox,RomainBox);           //supprime les box inutiles

        btnToBinaire.setOnAction(event -> {
            anchorPaneRight.getChildren().removeAll(HexaBox,imcBox,RomainBox);                  //supprime les box inutiles quand on clique sur le bouton binaire
            anchorPaneRight.getChildren().add(BinaryBox2);                                     //ajoute la box binaire quand on appuis sur le bouton binaire
        });
        btnToHexa.setOnAction(event -> {
            anchorPaneRight.getChildren().removeAll(BinaryBox2,imcBox,RomainBox);               //supprime les box inutiles quand on clique sur le bouton hexa
            anchorPaneRight.getChildren().add(HexaBox);                                        //ajoute la box hexa quand on appuis sur le bouton hexa
        });
        btnIMC.setOnAction(event -> {
            anchorPaneRight.getChildren().removeAll(BinaryBox2,HexaBox,RomainBox);              //supprime les box inutiles quand on clique sur le bouton IMC
            anchorPaneRight.getChildren().add(imcBox);                                          //ajoute la box IMC quand on appuis sur le bouton IMC
        });
        btnDeciChRom.setOnAction(event -> {
            anchorPaneRight.getChildren().removeAll(BinaryBox2,HexaBox,imcBox);                 //supprime les box inutiles quand on clique sur le bouton DeciChRom
            anchorPaneRight.getChildren().add(RomainBox);                                    //ajoute la box DeciChRom quand on appuis sur le bouton DeciChRom
        });


    }
}
