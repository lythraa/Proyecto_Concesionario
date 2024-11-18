package co.edu.uniquindio.poo.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class GestionarClientesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button añadirClienteBoton;

    @FXML
    private TableView<?> vehiculosTabla;

    @FXML
    private TextField clienteEmailCampo;

    @FXML
    private TableColumn<?, ?> iDColumna;

    @FXML
    private TextField clienteCedulaCampo;

    @FXML
    private Button eliminarBoton;

    @FXML
    private TableColumn<?, ?> nombreColumna;

    @FXML
    private Button buscarBoton;

    @FXML
    private TextField busquedaNombreOrIDCampo;

    @FXML
    private TableColumn<?, ?> contactoColumna;

    @FXML
    private TextField clienteNombreCampo;

    @FXML
    void buscarAccion(ActionEvent event) {

    }

    @FXML
    void eliminarAccion(ActionEvent event) {

    }

    @FXML
    void añadirClienteAccion(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert añadirClienteBoton != null : "fx:id=\"añadirClienteBoton\" was not injected: check your FXML file 'gestionarClientesView.fxml'.";
        assert vehiculosTabla != null : "fx:id=\"vehiculosTabla\" was not injected: check your FXML file 'gestionarClientesView.fxml'.";
        assert clienteEmailCampo != null : "fx:id=\"clienteEmailCampo\" was not injected: check your FXML file 'gestionarClientesView.fxml'.";
        assert iDColumna != null : "fx:id=\"iDColumna\" was not injected: check your FXML file 'gestionarClientesView.fxml'.";
        assert clienteCedulaCampo != null : "fx:id=\"clienteCedulaCampo\" was not injected: check your FXML file 'gestionarClientesView.fxml'.";
        assert eliminarBoton != null : "fx:id=\"eliminarBoton\" was not injected: check your FXML file 'gestionarClientesView.fxml'.";
        assert nombreColumna != null : "fx:id=\"nombreColumna\" was not injected: check your FXML file 'gestionarClientesView.fxml'.";
        assert buscarBoton != null : "fx:id=\"buscarBoton\" was not injected: check your FXML file 'gestionarClientesView.fxml'.";
        assert busquedaNombreOrIDCampo != null : "fx:id=\"busquedaNombreOrIDCampo\" was not injected: check your FXML file 'gestionarClientesView.fxml'.";
        assert contactoColumna != null : "fx:id=\"contactoColumna\" was not injected: check your FXML file 'gestionarClientesView.fxml'.";
        assert clienteNombreCampo != null : "fx:id=\"clienteNombreCampo\" was not injected: check your FXML file 'gestionarClientesView.fxml'.";

    }
}
