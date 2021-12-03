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

    @FXML
    private Button btnValiderBiblio;

    @FXML
    private TextField txtAuteur;

    @FXML
    private TextField txtColonne;

    @FXML
    private TextField txtParution;

    @FXML
    private TextField txtRangee;

    @FXML
    private TextArea txtResume;

    @FXML
    private TextField txtTitre;



    @Override
    public void initialize(java.net.URL location, java.util.ResourceBundle resources) {

        colTitre.setCellValueFactory(new PropertyValueFactory<>("Titre"));
        colAuteur.setCellValueFactory(new PropertyValueFactory<>("Auteur"));
        colColonne.setCellValueFactory(new PropertyValueFactory<>("Colonne"));
        colRange.setCellValueFactory(new PropertyValueFactory<>("Rangee"));
        colParution.setCellValueFactory(new PropertyValueFactory<>("Parution"));
        colResume.setCellValueFactory(new PropertyValueFactory<>("Resume"));
        tbData.setItems(books);


        btnValiderBiblio.setOnAction(event -> {
           books.add(new Book(txtTitre.getText(),txtAuteur.getText(),Integer.parseInt(txtColonne.getText()),Integer.parseInt(txtRangee.getText()),Integer.parseInt(txtParution.getText()),txtResume.getText()));
        });

    }
    private ObservableList<Book> books = FXCollections.observableArrayList(
            new Book("Test", "Auteur 1", 1, 1, 1, "Resume 1")
    );

}

