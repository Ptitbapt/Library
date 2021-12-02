package com.coding.library.Controller;

import com.coding.library.Model.Book;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class LibraryController implements Initializable {

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
    private TableView<Book> tableView;

    @FXML
    private TextField txtRangee;

    @FXML
    private TextArea txtResume;

    @FXML
    private TextField txtTitre;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        TableColumn titre = new TableColumn("Titre");
        TableColumn auteur = new TableColumn("Auteur");
        TableColumn colonne = new TableColumn("Colonne");
        TableColumn rangee = new TableColumn("Rangée");
        TableColumn parution = new TableColumn("Parution");
        TableColumn resume = new TableColumn("Résume");

        tableView.getColumns().addAll(titre,auteur,colonne,rangee,parution,resume);

        final ObservableList<Book> data = FXCollections.observableArrayList(
                new Book(" a","b","c","d","e","f"),
                new Book(" a","b","c","d","e","f"),
                new Book(" a","b","c","d","e","f")

        );

        tableView.setItems(data);

        titre.setCellValueFactory(new PropertyValueFactory<Book, String>("titre"));
        auteur.setCellValueFactory(new PropertyValueFactory<Book, String>("auteur"));
        colonne.setCellValueFactory(new PropertyValueFactory<Book, String>("colonne"));
        rangee.setCellValueFactory(new PropertyValueFactory<Book, String>("rangee"));
        parution.setCellValueFactory(new PropertyValueFactory<Book, String>("parution"));
        resume.setCellValueFactory(new PropertyValueFactory<Book, String>("resume"));
        
       // });

    }
}
