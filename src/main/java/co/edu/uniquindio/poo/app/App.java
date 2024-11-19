package co.edu.uniquindio.poo.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Stage stage;  // Declaramos una referencia estática al Stage

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;  // Guardamos la referencia del Stage
        scene = new Scene(loadFXML("Inicio"));
        stage.setScene(scene);
        stage.show();
    }

    public static Stage getStage() {
        return stage;  // Método para obtener la referencia del Stage
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/co/edu/uniquindio/poo/registrarAdministradorView.fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}
