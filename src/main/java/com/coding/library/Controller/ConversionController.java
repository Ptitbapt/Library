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
        anchorPaneRight.getChildren().removeAll(BinaryBox2,HexaBox,imcBox,RomainBox);

        btnToBinaire.setOnAction(event -> {
            anchorPaneRight.getChildren().removeAll(HexaBox,imcBox,RomainBox);
            anchorPaneRight.getChildren().add(BinaryBox2);
        });
        btnToHexa.setOnAction(event -> {
            anchorPaneRight.getChildren().removeAll(BinaryBox2,imcBox,RomainBox);
            anchorPaneRight.getChildren().add(HexaBox);
        });
        btnIMC.setOnAction(event -> {
            anchorPaneRight.getChildren().removeAll(BinaryBox2,HexaBox,RomainBox);
            anchorPaneRight.getChildren().add(imcBox);
        });
        btnDeciChRom.setOnAction(event -> {
            anchorPaneRight.getChildren().removeAll(BinaryBox2,HexaBox,imcBox);
            anchorPaneRight.getChildren().add(RomainBox);
        });


    }
}
