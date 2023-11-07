import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LinkShortenerApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("URL Shortener");
        TextField longURLInput = new TextField();
        Button shortenButton = new Button("Shorten URL");
        Label shortenedURLLabel = new Label();

        shortenButton.setOnAction(event -> {
            String longURL = longURLInput.getText();
            String shortURL = URLShortener.shortenURL(longURL);
            shortenedURLLabel.setText("Shortened URL: " + shortURL);
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(new Label("Enter Long URL:"), longURLInput, shortenButton, shortenedURLLabel);
        Scene scene = new Scene(layout, 300, 150);
        stage.setScene(scene);
        stage.show();
    }
}

    
