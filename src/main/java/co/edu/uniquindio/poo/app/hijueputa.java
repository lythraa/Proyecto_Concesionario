package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.controllers.VisualizadorVehiculosController;
import co.edu.uniquindio.poo.model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class hijueputa extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear instancias de vehículos
        Combustible combustiblegenerico = new CombustibleElectrico(2, 12);
        Deportivo deportivo = new Deportivo("ABC123", "Ferrari", "488 GTB", true, 7, 330.0, "3.9L", 300000.0, 1200.0, true, Transmision.AUTOMATICA, combustiblegenerico, 2, 2, 200.0, true, true, 6, true, 2, 2, 6, 670, 3.0);
        SUV suv = new SUV("XYZ789", "Toyota", "Land Cruiser", false, 6, 180.0, "4.6L", 80000.0, 300.0, true, Transmision.MANUAL, combustiblegenerico, 7, 5, 600.0, true, true, 8, true, true, true, true, true, true);
        Bus bus = new Bus("LMN456", "Mercedes", "Sprinter", true, 5, 120.0, "2.1L", 50000.0, 200.0, true, Transmision.MANUAL, combustiblegenerico, 30, 2, 1000.0, true, true, 6, true, 2, 4);

  // Cargar FXML
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/fxml/visualizadorVehiculos.fxml"));
            VisualizadorVehiculosController controller = new VisualizadorVehiculosController();
            loader.setController(controller);

            // Cargar el archivo FXML
            StackPane root = loader.load();

            Scene scene = new Scene(root, 800, 600);
            primaryStage.setTitle("Gestión de Vehículos");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
