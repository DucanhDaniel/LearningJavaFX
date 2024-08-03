package jfx.learnjfx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class JavaFXScenes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.SKYBLUE);

        Text text = new Text("Hello, JavaFX!");

        text.setX(100);
        text.setY(100);
        text.setFont(Font.font("Arial", 24));
        text.setFill(Color.GREEN);
        root.getChildren().add(text);


        Line line = new Line(100, 300, 400, 300);
        root.getChildren().add(line);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        line.setRotate(45);

        Rectangle rectangle = new Rectangle(400, 400, 100, 100);
        root.getChildren().add(rectangle);
        rectangle.setFill(Color.YELLOW);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(5);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0,200.0,
                300.0,300.0,
                200.0,300.0
        );
        triangle.setFill(Color.GREEN);
        root.getChildren().add(triangle);

        Circle circle = new Circle();
        circle.setCenterX(400.0);
        circle.setCenterY(400.0);
        circle.setRadius(100);
        circle.setFill(Color.VIOLET);
        root.getChildren().add(circle);

        Image image = new Image("icon.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setX(300);
        imageView.setY(50);
        root.getChildren().add(imageView);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Scenes");
        primaryStage.show();
    }
}
