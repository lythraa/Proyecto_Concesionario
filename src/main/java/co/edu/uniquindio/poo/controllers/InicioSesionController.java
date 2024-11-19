package co.edu.uniquindio.poo.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.app.App;
import co.edu.uniquindio.poo.controllers.Sesion.Rol;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InicioSesionController {

    private Concesionario concesionario = Concesionario.getInstancia();// concesionario.java

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField contraseñaCampo;

    @FXML
    private TextField emailField;

    @FXML
    private Button iniciarSesionBoton;

    @FXML
    private Hyperlink olvideContraseniaLink;

    @FXML
    private TextField usuarioCampo;

    @FXML
    void enviarCorreoDeRecuperacion(ActionEvent event) {

    }

    @FXML
    void iniciarSesionAccion(ActionEvent event) {
        Empleado empleado = concesionario.verificarCredenciales(usuarioCampo.getText(), contraseñaCampo.getText());

        if (empleado != null) {
            if (empleado instanceof Administrador) {
                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/co/edu/uniquindio/poo/administradorView.fxml"));
                try {
                    Parent root = loader.load();
                    Stage stage = App.getStage();
                    stage.setScene(new Scene(root));
                    stage.setTitle("Vista administrador");
                    stage.show();
                    Sesion.setRol(Rol.ADMIN);
                } catch (IOException e) {
                    e.printStackTrace();
                } 
                return;
            }
            if (empleado instanceof Empleado) {
                FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/empleadoView.fxml"));
                try {
                    Parent root = loader1.load();
                    Stage stage = App.getStage();
                    stage.setScene(new Scene(root));
                    stage.setTitle("Vista empleado");
                    stage.show();
                    Sesion.setRol(Rol.EMPLEADO);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } 
        }else {
            mostrarAlerta("Alerta", "Empleado no encontrado o campos vacios");
        }
    }

    @FXML
    void olvidoContraseniaAccion(ActionEvent event) {
        
    }

    @FXML
    void initialize() {
        assert contraseñaCampo != null
                : "fx:id=\"contraseñaCampo\" was not injected: check your FXML file 'inicioSesion.fxml'.";
        assert emailField != null : "fx:id=\"emailField\" was not injected: check your FXML file 'inicioSesion.fxml'.";
        assert iniciarSesionBoton != null
                : "fx:id=\"iniciarSesionBoton\" was not injected: check your FXML file 'inicioSesion.fxml'.";
        assert olvideContraseniaLink != null
                : "fx:id=\"olvideContraseniaLink\" was not injected: check your FXML file 'inicioSesion.fxml'.";
        assert usuarioCampo != null
                : "fx:id=\"usuarioCampo\" was not injected: check your FXML file 'inicioSesion.fxml'.";

    }


    public static void mostrarAlerta( String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle(titulo);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    public static void mostrarAlertaInfo(String mensaje){
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Alerta");
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}