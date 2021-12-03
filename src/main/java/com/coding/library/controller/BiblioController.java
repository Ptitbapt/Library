package com.coding.library.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class BiblioController implements Initializable {

    @FXML
    private Button btnAjouter;

    @FXML
    private Button btnSupprimer;

    @FXML
    private Button btnValider;

    @FXML
    private TextField txtAuteur;

    @FXML
    private TextField txtColonne;

    @FXML
    private TextField txtParution;

    @FXML
    private TableView<TableUser> tableView;


    @FXML
    private TableColumn<TableUser, String> colonneAuteur;

    @FXML
    private TableColumn<TableUser, Integer> colonneColonne;

    @FXML
    private TableColumn<TableUser, Integer> colonneParution;

    @FXML
    private TableColumn<TableUser, Integer> colonneRangee;

    @FXML
    private TableColumn<TableUser, String> colonneResume;

    @FXML
    private TableColumn<TableUser, String> colonneTitre;

    @FXML
    private TextField txtRangee;

    @FXML
    private TextArea txtResume;

    @FXML
    private TextField txtTitre;


    ObservableList<TableUser> Tableau = FXCollections.observableArrayList(
            new TableUser("Livre","Moi",1,1,13,"de la merde"),
            new TableUser("Livre","Moi",1,1,13,"de la merde"),
            new TableUser("Livre","Moi",1,1,13,"de la merde"),
            new TableUser("Livre","Moi",1,1,13,"de la merde")
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colonneTitre.setCellValueFactory(new PropertyValueFactory<TableUser, String>("Titre"));
        colonneAuteur.setCellValueFactory(new PropertyValueFactory<TableUser, String>("Auteur"));
        colonneColonne.setCellValueFactory(new PropertyValueFactory<TableUser, Integer>("Colonne"));
        colonneRangee.setCellValueFactory(new PropertyValueFactory<TableUser, Integer>("Rangee"));
        colonneParution.setCellValueFactory(new PropertyValueFactory<TableUser, Integer>("Parution"));
        colonneResume.setCellValueFactory(new PropertyValueFactory<TableUser, String>("Resume"));

        tableView.setItems(Tableau);

    }


}

