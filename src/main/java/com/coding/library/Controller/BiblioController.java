package com.coding.library.Controller;


import com.coding.library.Model.Book;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;


public class BiblioController implements Initializable {




    @FXML
    private TableView<Book> tbData;

    @FXML
    private TableColumn<Book, String> colTitre;

    @FXML
    private TableColumn<Book, String> colAuteur;

    @FXML
    private TableColumn<Book, Integer> colParution;

    @FXML
    private TableColumn<Book, Integer> colRange;

    @FXML
    private TableColumn<Book, String> colResume;

    @FXML
    private TableColumn<Book, Integer> colColonne;




    @Override
    public void initialize(java.net.URL location, java.util.ResourceBundle resources) {

        colTitre.setCellValueFactory(new PropertyValueFactory<>("Titre"));
        colAuteur.setCellValueFactory(new PropertyValueFactory<>("Auteur"));
        colColonne.setCellValueFactory(new PropertyValueFactory<>("Colonne"));
        colRange.setCellValueFactory(new PropertyValueFactory<>("Rangee"));
        colParution.setCellValueFactory(new PropertyValueFactory<>("Parution"));
        colResume.setCellValueFactory(new PropertyValueFactory<>("Resume"));
        tbData.setItems(books);


    }
    private ObservableList<Book> books = FXCollections.observableArrayList(
            new Book("Titre 1", "Auteur 1", 1, 1, 1, "Resume 1"),
            new Book("Titre 2", "Auteur 2", 2, 2, 1, "Resume 2"),
            new Book("Titre 3", "Auteur 3", 3, 3, 1, "Resume 3"),
            new Book("Titre 4", "Auteur 4", 4, 4, 1, "Resume 4"),
            new Book("Titre 5", "Auteur 5", 5, 5, 1, "Resume 5")
    );

}

