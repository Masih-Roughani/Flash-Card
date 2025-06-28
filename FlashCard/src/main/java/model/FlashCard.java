package model;

public class FlashCard {
    private String word;
    private String meaning;
    private boolean learned;

    public FlashCard() {
    }

    public FlashCard(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
        learned = false;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public boolean isLearned() {
        return learned;
    }

    public void setLearned(boolean learned) {
        this.learned = learned;
    }
}
