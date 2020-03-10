package tsi;

import java.io.IOException;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    public Label myLable;
    public TextField userName;

    public void initialize() {

        myLable.textProperty().bind(Bindings.createStringBinding(() -> {
            String txt = userName.getText();
            if (txt.isBlank()) {
                return "Hello, World!";
            } else {
                return "Hello, " + txt + "!";
            }
            }, userName.textProperty()));
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
