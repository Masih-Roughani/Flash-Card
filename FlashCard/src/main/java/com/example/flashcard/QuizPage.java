package com.example.flashcard;

import controller.FlashCardController;
import controller.JsonController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import model.FlashCard;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class QuizPage implements Initializable {
    public static int n;
    public static int index = 0;

    @FXML
    private Button answerNextButton;

    @FXML
    private Button learnedButton;

    @FXML
    private Text answerText;

    @FXML
    private Text wordText;

    @FXML
    void answerNextButtonClicked(MouseEvent event) {
        if (Objects.equals(answerNextButton.getText(), "Answer")) {
            answerText.setText(FlashCardController.getInstance().getFlashCards().get(index).getMeaning());
            answerText.setVisible(true);
            answerNextButton.setText("Next");
        } else {
            if (index + 1 == FlashCardController.getInstance().getFlashCards().size()) {
                index = -1;
            }
            wordText.setText(FlashCardController.getInstance().getFlashCards().get(++index).getWord());
            answerText.setVisible(false);
            answerNextButton.setText("Answer");
        }
    }

    @FXML
    void addPageButtonClicked(MouseEvent event) throws IOException {
        AddPage.n = n;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("add-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960, 720);
        HelloApplication.primaryStage.setScene(scene);
    }

    @FXML
    void backButtonClicked(MouseEvent event) throws IOException {
        index = 0;
        n = -1;
        AddPage.n = -1;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960, 720);
        HelloApplication.primaryStage.setScene(scene);
    }

    @FXML
    void learnedButtonClicked(MouseEvent event) throws IOException {
        FlashCard flashCard = FlashCardController.getInstance().getFlashCards().get(index);
        JsonController.getInstance().changeLearnedWord(index, n);
        if (index + 1 == FlashCardController.getInstance().getFlashCards().size()) {
            index = -1;
        }
        wordText.setText(FlashCardController.getInstance().getFlashCards().get(++index).getWord());
        answerText.setVisible(false);
        answerNextButton.setText("Answer");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            JsonController.getInstance().readFromJson(n);
        } catch (IOException e) {
            FlashCardController.getInstance().setFlashCards(new ArrayList<>());
            System.out.println(e.getMessage());
        }
        wordText.setText(FlashCardController.getInstance().getFlashCards().get(index).getWord());
        answerText.setVisible(false);
    }
}
