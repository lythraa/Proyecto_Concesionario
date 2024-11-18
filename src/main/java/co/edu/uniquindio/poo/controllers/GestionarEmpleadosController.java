package co.edu.uniquindio.poo.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Pagination;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class GestionarEmpleadosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> estadoColumna;

    @FXML
    private TextField busquedaCampo;

    @FXML
    private Button añadirEmpleadoBoton;

    @FXML
    private TableColumn<?, ?> emailColumna;

    @FXML
    private Pagination paginacionTabla;

    @FXML
    private TableColumn<?, ?> iDColumna;

    @FXML
    private ComboBox<?> atributoABuscarCombo;

    @FXML
    private Button eliminarBoton;

    @FXML
    private TextField EmpleadoCedulaCampo;

    @FXML
    private TextField EmpleadoEmailCampo;

    @FXML
    private TableColumn<?, ?> usuarioColumna;

    @FXML
    private Button desbloquearBoton;

    @FXML
    private TextField EmpleadoNombreCampo;

    @FXML
    private TextField EmpleadoUsuarioCampo;

    @FXML
    private TableColumn<?, ?> nombreColumna;

    @FXML
    private Button buscarBoton;

    @FXML
    private TableView<?> empleadosTabla;

    @FXML
    private PasswordField EmpleadoContraseñaCampo;

    @FXML
    private Button bloquearBoton;

    @FXML
    void añadirEmpleadoAccion(ActionEvent event) {

    }

    @FXML
    void buscarAccion(ActionEvent event) {

    }

    @FXML
    void bloquearAccion(ActionEvent event) {

    }

    @FXML
    void desbloquearAccion(ActionEvent event) {

    }

    @FXML
    void eliminarAccion(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert estadoColumna != null : "fx:id=\"estadoColumna\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert busquedaCampo != null : "fx:id=\"busquedaCampo\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert añadirEmpleadoBoton != null : "fx:id=\"añadirEmpleadoBoton\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert emailColumna != null : "fx:id=\"emailColumna\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert paginacionTabla != null : "fx:id=\"paginacionTabla\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert iDColumna != null : "fx:id=\"iDColumna\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert atributoABuscarCombo != null : "fx:id=\"atributoABuscarCombo\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert eliminarBoton != null : "fx:id=\"eliminarBoton\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert EmpleadoCedulaCampo != null : "fx:id=\"EmpleadoCedulaCampo\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert EmpleadoEmailCampo != null : "fx:id=\"EmpleadoEmailCampo\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert usuarioColumna != null : "fx:id=\"usuarioColumna\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert desbloquearBoton != null : "fx:id=\"desbloquearBoton\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert EmpleadoNombreCampo != null : "fx:id=\"EmpleadoNombreCampo\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert EmpleadoUsuarioCampo != null : "fx:id=\"EmpleadoUsuarioCampo\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert nombreColumna != null : "fx:id=\"nombreColumna\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert buscarBoton != null : "fx:id=\"buscarBoton\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert empleadosTabla != null : "fx:id=\"empleadosTabla\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert EmpleadoContraseñaCampo != null : "fx:id=\"EmpleadoContraseñaCampo\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";
        assert bloquearBoton != null : "fx:id=\"bloquearBoton\" was not injected: check your FXML file 'gestionarEmpleadosView.fxml'.";

    }
}
