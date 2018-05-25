package zajecia9;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class MainController {
    public Label helloWorld;

    public void sayHelloWorld(ActionEvent actionEvent) {
        helloWorld.setText("Hello :-)");
    }
}
