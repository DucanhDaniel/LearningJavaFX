package jfx.learnjfx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import static javafx.scene.input.KeyCode.F11;


public class JavaFXStage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        Group root = new Group();
        Scene scene = new Scene(root);

        scene.setFill(javafx.scene.paint.Color.YELLOW);

        Image icon = new Image("icon.jpg");
        primaryStage.getIcons().add(icon);

//        primaryStage.setWidth(300);
//        primaryStage.setHeight(200);
//        primaryStage.setResizable(false);

//        primaryStage.setX(100);
//        primaryStage.setY(100);

        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf(String.valueOf(F11)));
        primaryStage.setFullScreenExitHint("Type F11 to exit fullscreen");

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Stage");
        primaryStage.show();
    }
}
