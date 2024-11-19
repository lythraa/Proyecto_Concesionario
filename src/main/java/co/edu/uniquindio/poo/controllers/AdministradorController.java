package co.edu.uniquindio.poo.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AdministradorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button historialTransaccionesBoton;

    @FXML
    private Button gestionarEmpleadosBoton1;

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

        FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("co/edu/uniquindio/gestionarClientesView.fxml"));
                try {
                    Parent root = loader.load();
                    Stage stage = (Stage) cerrarSesionBoton.getScene().getWindow();
                    stage.setScene(new Scene(root));
                    stage.setTitle("Gestión clientes");
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
    }

    @FXML
    void realizarTransaccionAccion(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/co/edu/uniquindio/poo/gestionarTransaccionesView.fxml"));
                try {
                    Parent root = loader.load();
                    Stage stage = (Stage) cerrarSesionBoton.getScene().getWindow();
                    stage.setScene(new Scene(root));
                    stage.setTitle("Gestión transacciones");
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
    }
    @FXML
    void gestionarVehiculosAccion(ActionEvent event) {

        FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/co/edu/uniquindio/poo/gestionarVehiculosView.fxml"));
                try {
                    Parent root = loader.load();
                    Stage stage = (Stage) cerrarSesionBoton.getScene().getWindow();
                    stage.setScene(new Scene(root));
                    stage.setTitle("Gestión Vehiculos");
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
    }

    @FXML
    void historialTransaccionesAccion(ActionEvent event) {

    }

    @FXML
    void cerrarSesionAccion(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/co/edu/uniquindio/poo/inicioSesion.fxml"));
                try {
                    Parent root = loader.load();
                    Stage stage = (Stage) cerrarSesionBoton.getScene().getWindow();
                    stage.setScene(new Scene(root));
                    stage.setTitle("Inicio Sesión");
                    stage.show();
                    Sesion.setRol(null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
    }

    @FXML
    void gestionarEmpleadosAccion(ActionEvent event) {

        FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/co/edu/uniquindio/poo/gestionarEmpleadosView.fxml"));
                try {
                    Parent root = loader.load();
                    Stage stage = (Stage) cerrarSesionBoton.getScene().getWindow();
                    stage.setScene(new Scene(root));
                    stage.setTitle("Gestión empleados");
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
    }

    @FXML
    void initialize() {
        assert historialTransaccionesBoton != null : "fx:id=\"historialTransaccionesBoton\" was not injected: check your FXML file 'administradorView.fxml'.";
        assert gestionarEmpleadosBoton1 != null : "fx:id=\"gestionarEmpleadosBoton1\" was not injected: check your FXML file 'administradorView.fxml'.";
        assert cerrarSesionBoton != null : "fx:id=\"cerrarSesionBoton\" was not injected: check your FXML file 'administradorView.fxml'.";
        assert realizarTransaccionBoton != null : "fx:id=\"realizarTransaccionBoton\" was not injected: check your FXML file 'administradorView.fxml'.";
        assert gestionarClientesBoton != null : "fx:id=\"gestionarClientesBoton\" was not injected: check your FXML file 'administradorView.fxml'.";
        assert gestionarVehiculosBoton != null : "fx:id=\"gestionarVehiculosBoton\" was not injected: check your FXML file 'administradorView.fxml'.";

    }
}
