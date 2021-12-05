package com.coding.library.Controller;


import com.coding.library.Model.Book;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


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

    @FXML
    private Button btnValiderBiblio;

    @FXML
    private Button btnAjouter;

    @FXML
    private VBox nomCase;

    @FXML
    private VBox colonneText;

    @FXML
    private HBox hboxContainer;

    @FXML
    private Button btnSupprimer;



    @Override
    public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
        hboxContainer.getChildren().removeAll(nomCase,colonneText); // on supprime les vbox qui ne sont pas utiles


        colTitre.setCellValueFactory(new PropertyValueFactory<>("Titre")); // on associe les colonnes avec les attributs de la classe
        colAuteur.setCellValueFactory(new PropertyValueFactory<>("Auteur"));
        colColonne.setCellValueFactory(new PropertyValueFactory<>("Colonne"));
        colRange.setCellValueFactory(new PropertyValueFactory<>("Rangee"));
        colParution.setCellValueFactory(new PropertyValueFactory<>("Parution"));
        colResume.setCellValueFactory(new PropertyValueFactory<>("Resume"));
        tbData.setItems(books);

        btnValiderBiblio.setOnAction(event -> {
            books.add(new Book(txtTitre.getText(),txtAuteur.getText(),Integer.parseInt(txtColonne.getText()),Integer.parseInt(txtRangee.getText()),Integer.parseInt(txtParution.getText()),txtResume.getText()));// on ajoute les données dans la liste
            hboxContainer.getChildren().removeAll(nomCase,colonneText);// on supprime les vbox qui ne sont pas utiles
            txtTitre.clear();// on vide les champs
            txtAuteur.clear();
            txtColonne.clear();
            txtRangee.clear();
            txtParution.clear();
            txtResume.clear();
        });
        btnAjouter.setOnAction(event -> {                                   // on ajoute les vbox lorsqu'on clique sur le bouton ajouter
            hboxContainer.getChildren().addAll(nomCase,colonneText);
        });
        btnSupprimer.setOnAction(event -> {                                 // on supprime les vbox quand on appuis sur le bouton supprimer
            Book book = tbData.getSelectionModel().getSelectedItem();
            books.remove(book);
        });

    }
    private ObservableList<Book> books = FXCollections.observableArrayList(
            new Book("Titre 1", "Auteur 1", 1, 1, 2021, "Resume 1")     // on ajoute des données dans la liste "book"
    );


}

