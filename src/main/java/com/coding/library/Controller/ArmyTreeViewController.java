package com.coding.library.Controller;

import com.coding.library.Model.General;
import com.coding.library.Model.Soldier;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicInteger;

public class ArmyTreeViewController implements Initializable {

    @FXML
    private Button btnCreate;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnModify;

    @FXML
    private TreeView<String> treeView;

    @FXML
    private VBox creatorMenu;

    @FXML
    private TextField healthCharacter;

    @FXML
    private TextField nameCharacter;

    @FXML
    private HBox treeViewPrinter;

    @FXML
    private Label labelCreator;

    @FXML
    private VBox healthField;

    @FXML
    private Button validateBtn;

    @FXML
    private Label nbrSoldiers;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // Create a rot for our tree and set it

        TreeItem<String> rootItem = new TreeItem<>("Army");
        treeView.setRoot(rootItem);

        // Sysout that there was no problem in the creation of our root (and our tree)

        System.out.println("Root instanciÃ©e");

        // Remove the menu to get it only when we want to get it

        treeViewPrinter.getChildren().removeAll(creatorMenu);

        // When we click on our button Creator

        btnCreate.setOnMouseClicked(createWindow -> {

            // Check if our div contains our menu of creation

            if (!treeViewPrinter.getChildren().contains(creatorMenu)) {

                // If it doesn't then get the value of the Item that we clicked on

                if (treeView.getSelectionModel().getSelectedItem().getValue() == "Army") {

                    // If it contains "Army"

                    // Open the menu to create a General

                    labelCreator.setText("Create your General");

                    // Health isn't necessary for a general so hide the field corresponding to health

                    healthField.setVisible(false);

                } else if (treeView.getSelectionModel().getSelectedItem().getValue().contains("General")) {

                    // But if it contains "General" (that means that a general exist and that we clicked on)

                    // Print that we want to create a soldier
                    labelCreator.setText("Create your Soldier");

                    // Show the health field

                    healthField.setVisible(true);

                }

                // Anyway , print the menu of Creation

                treeViewPrinter.getChildren().addAll(creatorMenu);
            }
        });

        // When we want to create the soldier or a general click on the validate button

        validateBtn.setOnMouseClicked(createArmy -> {

            //Check if we click on a general

            if (treeView.getSelectionModel().getSelectedItem().getValue().contains("General")) {

                // Creation of a soldier

                // If we do then save into variables Name, Grade & Health of our soldier

                String nameS = nameCharacter.getText();
                String gradeS = "Soldier";
                int healthS = Integer.parseInt(healthCharacter.getText());

                // Instantiate our new Soldier by using Soldier Class

                Soldier soldier = new Soldier(nameS, gradeS, healthS);

                // At the end of the creation remove our menu Creator

                treeViewPrinter.getChildren().removeAll(creatorMenu);

                // Remove the textFields for a new creation if we want to create a new soldier or character

                nameCharacter.setText("");
                healthCharacter.setText((""));

                // Create an item that will stock our soldier's datas

                TreeItem<String> itemChildSoldier = new TreeItem<>(soldier.toString());

                // Add to our general a new branch that is our soldier

                treeView.getSelectionModel().getSelectedItem().getChildren().add(itemChildSoldier);

            } else if (treeView.getSelectionModel().getSelectedItem().getValue().contains("Army")) {

                // Creation of a soldier

                // If we do then save into variables Name of our general

                String name = nameCharacter.getText();

                // Instantiate our new General by using General Class

                General general = new General(name, "0");

                // Create an item that will stock our general's datas

                TreeItem<String> itemChild = new TreeItem<>(general.toString());


                rootItem.getChildren().add(itemChild);

                // At the end of the creation remove our menu Creator

                treeViewPrinter.getChildren().removeAll(creatorMenu);

                // Remove the textFields for a new creation if we want to create a new soldier or character

                nameCharacter.setText("");




            }

        });

        // When we want to delete an Item

        btnDelete.setOnMouseClicked(deleteArmy -> {

            // Get our TreeItem that we clicked on

            TreeItem<String> deleteElement = treeView.getSelectionModel().getSelectedItem();

            // Delete our element (getParent().get.Children to select him)

            deleteElement.getParent().getChildren().remove(deleteElement);

        });
    }



}
