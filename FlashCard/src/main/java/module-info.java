module com.example.flashcard {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;

    opens com.example.flashcard to javafx.fxml;
    opens model to com.fasterxml.jackson.databind;

    exports com.example.flashcard;
}
