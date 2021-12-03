package com.coding.library.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
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
    @Override
    public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
        anchorPaneRight.getChildren().removeAll(BinaryBox2);

        btnToBinaire.setOnAction(event -> {
            anchorPaneRight.getChildren().add(BinaryBox2);
        });

    }
}
