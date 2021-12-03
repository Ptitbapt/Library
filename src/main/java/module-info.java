module com.coding.library {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.coding.library to javafx.fxml;
    exports com.coding.library;
    exports com.coding.library.Controller;
    opens com.coding.library.Controller to javafx.fxml;
    exports com.coding.library.Model;
    opens com.coding.library.Model to javafx.fxml;
}