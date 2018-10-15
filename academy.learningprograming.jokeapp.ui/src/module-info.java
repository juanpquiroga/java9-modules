module academy.learningprograming.jokeapp.ui {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;

    requires academy.learnprogramming.jokeserver;
    uses academy.learnprogramming.jokeserver.JokeServer;

    opens academy.learningprogramming.jokeapp.ui
            to javafx.graphics,javafx.fxml;
}