package co.edu.uniquindio.poo.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EmpleadoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button historialTransaccionesBoton;

    @FXML
    private Button cerrarSesionBoton;

    @FXML
    private Button realizarTransaccionBoton;

    @FXML
    private Button gestionarClientesBoton;

    @FXML
    private Button gestionarVehiculosBoton;

    @FXML
    void gestionarClientesAccion(ActionEvent event) {

    }

    @FXML
    void realizarTransaccionAccion(ActionEvent event) {

    }

    @FXML
    void gestionarVehiculosAccion(ActionEvent event) {

    }

    @FXML
    void historialTransaccionesAccion(ActionEvent event) {

    }

    @FXML
    void cerrarSesionAccion(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert historialTransaccionesBoton != null : "fx:id=\"historialTransaccionesBoton\" was not injected: check your FXML file 'empleadoView.fxml'.";
        assert cerrarSesionBoton != null : "fx:id=\"cerrarSesionBoton\" was not injected: check your FXML file 'empleadoView.fxml'.";
        assert realizarTransaccionBoton != null : "fx:id=\"realizarTransaccionBoton\" was not injected: check your FXML file 'empleadoView.fxml'.";
        assert gestionarClientesBoton != null : "fx:id=\"gestionarClientesBoton\" was not injected: check your FXML file 'empleadoView.fxml'.";
        assert gestionarVehiculosBoton != null : "fx:id=\"gestionarVehiculosBoton\" was not injected: check your FXML file 'empleadoView.fxml'.";

    }
}
