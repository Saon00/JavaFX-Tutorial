package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Main extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("JavaFX Project");
        window.setResizable(false);

        Parent pane = FXMLLoader.load(Main.class.getResource("practise.fxml"));

        Scene scene = new Scene(pane);
        window.setScene(scene);
        window.show();
    }
    public static void main(String[] args){ launch(args);
    }

}