package zajecia9;/**
 * Created by Krzysztof Podlaski on 25.05.2018.
 * based on https://www.jetbrains.com/help/idea/preparing-for-javafx-application-development.html#create_project_from_scratch
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(
                getClass().getResource("sample.fxml")
        );
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(
           new Scene(root, 300, 275)
        );
        primaryStage.show();
    }
}
