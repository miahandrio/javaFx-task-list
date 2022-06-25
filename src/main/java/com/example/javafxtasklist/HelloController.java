package com.example.javafxtasklist;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ListView<String> listView;

    @FXML
    private TextField textField;

    @FXML
    protected void onAddButtonClick() {
        if (textField.getText().length() > 0) {
            listView.getItems().add(textField.getText());
            textField.clear();
        }
    }

    @FXML
    protected void onTextFieldClick() {
        System.out.println("worked");
//        listView.
    }

    @FXML
    protected void exit() {
        Platform.exit();
    }

}