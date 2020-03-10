module tsi {
    requires javafx.controls;
    requires javafx.fxml;

    opens tsi to javafx.fxml;
    exports tsi;
}