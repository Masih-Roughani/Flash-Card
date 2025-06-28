package controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.FlashCard;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JsonController {
    private static final ObjectMapper mapper = new ObjectMapper();
    public static JsonController instance = new JsonController();

    private JsonController() {
    }

    public static JsonController getInstance() {
        return instance;
    }

    public void readFromJson(int n) throws IOException {
        switch (n) {
            case 0 -> {
                File file = new File("sources/flash-cards-preface.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
            case 1 -> {
                File file = new File("sources/flash-cards-unit1.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
            case 2 -> {
                File file = new File("sources/flash-cards-unit2.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
            case 3 -> {
                File file = new File("sources/flash-cards-unit3.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
            case 4 -> {
                File file = new File("sources/flash-cards-unit4.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
            case 5 -> {
                File file = new File("sources/flash-cards-unit5.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
            case 6 -> {
                File file = new File("sources/flash-cards-unit6.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
            case 7 -> {
                File file = new File("sources/flash-cards-unit7.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
            case 8 -> {
                File file = new File("sources/flash-cards-unit8.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
            case 9 -> {
                File file = new File("sources/flash-cards-unit9.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
            case 10 -> {
                File file = new File("sources/flash-cards-unit10.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
            case 11 -> {
                File file = new File("sources/flash-cards-unit11.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
            case 12 -> {
                File file = new File("sources/flash-cards-unit12.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
            case 13 -> {
                File file = new File("sources/flash-cards-unit13.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
            case 14 -> {
                File file = new File("sources/flash-cards-unit14.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
            case 15 -> {
                File file = new File("sources/flash-cards-unit15.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
            case 16 -> {
                File file = new File("sources/flash-cards-unit16.json");
                List<FlashCard> flashCards = mapper.readValue(file, new TypeReference<>() {
                });
                FlashCardController.getInstance().setFlashCards(flashCards.stream().filter((card -> !card.isLearned())).collect(Collectors.toCollection(ArrayList::new)));
            }
        }
    }

    public void writeToJson(String word, String meaning, int n) throws Exception {
        switch (n) {
            case 0 -> {
                File file = getFile(0);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
            case 1 -> {
                File file = getFile(1);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
            case 2 -> {
                File file = getFile(2);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
            case 3 -> {
                File file = getFile(3);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
            case 4 -> {
                File file = getFile(4);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
            case 5 -> {
                File file = getFile(5);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
            case 6 -> {
                File file = getFile(6);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
            case 7 -> {
                File file = getFile(7);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
            case 8 -> {
                File file = getFile(8);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
            case 9 -> {
                File file = getFile(9);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
            case 10 -> {
                File file = getFile(10);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
            case 11 -> {
                File file = getFile(11);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
            case 12 -> {
                File file = getFile(12);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
            case 13 -> {
                File file = getFile(13);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
            case 14 -> {
                File file = getFile(14);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
            case 15 -> {
                File file = getFile(15);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
            case 16 -> {
                File file = getFile(16);
                List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
                cards.add(new FlashCard(word, meaning));
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
            }
        }
    }

    public void changeLearnedWord(int index, int n) throws IOException {
        List<FlashCard> cards = FlashCardController.getInstance().getFlashCards();
        FlashCard card = cards.get(index);
        card.setLearned(true);
        File file = getFile(n);
        mapper.writerWithDefaultPrettyPrinter().writeValue(file, cards);
    }

    public File getFile(int n) {
        switch (n) {
            case 0 -> {
                return new File("sources/flash-cards-preface.json");
            }
            case 1 -> {
                return new File("sources/flash-cards-unit1.json");
            }
            case 2 -> {
                return new File("sources/flash-cards-unit2.json");
            }
            case 3 -> {
                return new File("sources/flash-cards-unit3.json");
            }
            case 4 -> {
                return new File("sources/flash-cards-unit4.json");
            }
            case 5 -> {
                return new File("sources/flash-cards-unit5.json");
            }
            case 6 -> {
                return new File("sources/flash-cards-unit6.json");
            }
            case 7 -> {
                return new File("sources/flash-cards-unit7.json");
            }
            case 8 -> {
                return new File("sources/flash-cards-unit8.json");
            }
            case 9 -> {
                return new File("sources/flash-cards-unit9.json");
            }
            case 10 -> {
                return new File("sources/flash-cards-unit10.json");
            }
            case 11 -> {
                return new File("sources/flash-cards-unit11.json");
            }
            case 12 -> {
                return new File("sources/flash-cards-unit12.json");
            }
            case 13 -> {
                return new File("sources/flash-cards-unit13.json");
            }
            case 14 -> {
                return new File("sources/flash-cards-unit14.json");
            }
            case 15 -> {
                return new File("sources/flash-cards-unit15.json");
            }
            case 16 -> {
                return new File("sources/flash-cards-unit16.json");
            }
        }
        return null;
    }
}
