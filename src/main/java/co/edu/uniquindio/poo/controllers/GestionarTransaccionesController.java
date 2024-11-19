package co.edu.uniquindio.poo.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.app.App;
import co.edu.uniquindio.poo.controllers.Sesion.Rol;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GestionarTransaccionesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField busquedaCampo;

    @FXML
    private Pagination paginacionTabla;

    @FXML
    private VBox alquilarPanel;

    @FXML
    private ComboBox<?> atributoABuscarCombo;

    @FXML
    private TextField ClienteIDCampo;

    @FXML
    private Button eliminarBoton;

    @FXML
    private ComboBox<?> tipoTransaccionCombo;

    @FXML
    private TableColumn<?, ?> diasColumna;

    @FXML
    private DatePicker fechaCompraFecha;

    @FXML
    private TextField valorCompraCampo;

    @FXML
    private ComboBox<?> revisionTecnicaCombo;

    @FXML
    private TableColumn<?, ?> valorColumna;

    @FXML
    private Button crearTransaccionBoton;

    @FXML
    private TableColumn<?, ?> tipoTransaccionColumna;

    @FXML
    private TableColumn<?, ?> clienteColumna;

    @FXML
    private TableView<?> transaccionesDelEmpleadoTabla;

    @FXML
    private TableColumn<?, ?> fechaColumna;

    @FXML
    private TableColumn<?, ?> placaVehiculoColumna;

    @FXML
    private VBox compraPanel;

    @FXML
    private Button buscarBoton;

    @FXML
    private TextField diasCampo;

    @FXML
    private TextField matriculaCampo;

    @FXML
    private Button atrasButton;

    @FXML
    void atrasAccion(ActionEvent event) {
        if (Rol.ADMIN.equals(Sesion.getRol())) {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/co/edu/uniquindio/poo/administradorView.fxml"));
            try {
                Parent root = loader.load();
                Stage stage = App.getStage();
                stage.setScene(new Scene(root));
                stage.setTitle("Vista Administrador");
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {









            
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/co/edu/uniquindio/poo/empleadoView.fxml"));
            try {
                Parent root = loader.load();
                Stage stage = App.getStage();
                stage.setScene(new Scene(root));
                stage.setTitle("Vista Empleado");
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    

    @FXML
    void crearTransaccionAccion(ActionEvent event) {

    }

    @FXML
    void buscarAccion(ActionEvent event) {

    }

    @FXML
    void eliminarAccion(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert busquedaCampo != null
                : "fx:id=\"busquedaCampo\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert paginacionTabla != null
                : "fx:id=\"paginacionTabla\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert alquilarPanel != null
                : "fx:id=\"alquilarPanel\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert atributoABuscarCombo != null
                : "fx:id=\"atributoABuscarCombo\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert ClienteIDCampo != null
                : "fx:id=\"ClienteIDCampo\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert eliminarBoton != null
                : "fx:id=\"eliminarBoton\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert tipoTransaccionCombo != null
                : "fx:id=\"tipoTransaccionCombo\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert diasColumna != null
                : "fx:id=\"diasColumna\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert fechaCompraFecha != null
                : "fx:id=\"fechaCompraFecha\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert valorCompraCampo != null
                : "fx:id=\"valorCompraCampo\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert revisionTecnicaCombo != null
                : "fx:id=\"revisionTecnicaCombo\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert valorColumna != null
                : "fx:id=\"valorColumna\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert crearTransaccionBoton != null
                : "fx:id=\"crearTransaccionBoton\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert tipoTransaccionColumna != null
                : "fx:id=\"tipoTransaccionColumna\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert clienteColumna != null
                : "fx:id=\"clienteColumna\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert transaccionesDelEmpleadoTabla != null
                : "fx:id=\"transaccionesDelEmpleadoTabla\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert fechaColumna != null
                : "fx:id=\"fechaColumna\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert placaVehiculoColumna != null
                : "fx:id=\"placaVehiculoColumna\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert compraPanel != null
                : "fx:id=\"compraPanel\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert buscarBoton != null
                : "fx:id=\"buscarBoton\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert diasCampo != null
                : "fx:id=\"diasCampo\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";
        assert matriculaCampo != null
                : "fx:id=\"matriculaCampo\" was not injected: check your FXML file 'gestionarTransaccionesView.fxml'.";

    }
}
