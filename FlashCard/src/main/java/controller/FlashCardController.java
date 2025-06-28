package controller;

import model.FlashCard;

import java.util.ArrayList;
import java.util.List;

public class FlashCardController {
    private List<FlashCard> flashCards = new ArrayList<FlashCard>();
    public static FlashCardController instance = new FlashCardController();

    private FlashCardController() {
    }

    public static FlashCardController getInstance() {
        return instance;
    }

    public void addFlashCard(String word, String meaning) {
        FlashCard card = new FlashCard(word, meaning);
        flashCards.add(card);
    }

    public List<FlashCard> getFlashCards() {
        return flashCards;
    }

    public void setFlashCards(List<FlashCard> flashCards) {
        this.flashCards = flashCards;
    }
}
