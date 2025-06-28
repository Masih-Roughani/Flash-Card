package com.example.flashcard;

import controller.JsonController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class AddPage {

    public static int n;

    @FXML
    private TextField meaningTextField;

    @FXML
    private TextField wordTextField;

    @FXML
    void addButtonClicked(MouseEvent event) throws Exception {
        if (!meaningTextField.getText().isEmpty() && !wordTextField.getText().isEmpty()) {
            String word = wordTextField.getText();
            String meaning = meaningTextField.getText();
            JsonController.getInstance().writeToJson(word, meaning, n);
            wordTextField.clear();
            meaningTextField.clear();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the fields");
            alert.showAndWait();
        }
    }

    @FXML
    void backButtonClicked(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("quiz-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960, 720);
        HelloApplication.primaryStage.setScene(scene);
    }

}
