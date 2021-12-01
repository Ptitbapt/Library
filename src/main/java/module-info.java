module com.coding.library {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.coding.library to javafx.fxml;
    exports com.coding.library;
    exports com.coding.library.controller;
    opens com.coding.library.controller to javafx.fxml;
    exports com.coding.library.model;
    opens com.coding.library.model to javafx.fxml;
}