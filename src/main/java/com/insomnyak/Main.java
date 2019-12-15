package com.insomnyak;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        // scene which is the "root" of the application
        Scene scene = new Scene(JavaFxExample.getHolder(), 400, 300);

        // top level JavaJX container
        primaryStage.setTitle("Minimal JavaFx 11 application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
