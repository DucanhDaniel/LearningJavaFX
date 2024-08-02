package jfx.learnjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class FirstJavaFXApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //Create a button:
        Button btn1 = new Button("Say, Hello World!");

        //Create an event handler for the button:
        btn1.setOnAction(event -> {
            System.out.println("Hello, World!");
        });

        //Create a root node and add the button to it:
        StackPane root = new StackPane();
        root.getChildren().add(btn1);

        //Create a scene and set it to the stage:
        Scene scene = new Scene(root, 600, 400);
        scene.setFill(javafx.scene.paint.Color.YELLOW);
        primaryStage.setTitle("First JavaFX Application!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
