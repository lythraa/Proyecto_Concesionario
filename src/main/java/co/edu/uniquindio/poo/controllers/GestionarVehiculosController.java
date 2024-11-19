package co.edu.uniquindio.poo.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.app.App;
import co.edu.uniquindio.poo.controllers.Sesion.Rol;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class GestionarVehiculosController {

    private Concesionario concesionario = Concesionario.getInstancia();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pagination paginacionTabla;

    @FXML
    private TextField buscarEnTablaCampo;

    @FXML
    private Button eliminarVehiculoBoton;

    @FXML
    private Hyperlink registrarVehiculoLink;

    @FXML
    private TableColumn<Vehiculo, String> modeloColumna;

    @FXML
    private ImageView imagenVehiculo1;

    @FXML
    private TableColumn<Vehiculo, String> precioColumna;

    @FXML
    private ImageView imagenVehiculo2;

    @FXML
    private Button imagenSiguienteBoton;

    @FXML
    private TableView<Vehiculo> vehiculosTabla;

    @FXML
    private TableColumn<Vehiculo, String> marcaColumna;

    @FXML
    private ImageView imagenVehiculo3;

    @FXML
    private TextArea informacionAdicionalTexto;

    @FXML
    private TableColumn<Vehiculo, String> matriculaColumna;

    @FXML
    private Button buscarBoton;

    @FXML
    private TableColumn<Vehiculo, String> precioporDiaColumna;

    @FXML
    private Button imagenAnteriorBoton;

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
    void buscarAccion(ActionEvent event) {
        if (buscarEnTablaCampo != null) {
            String busqueda = buscarEnTablaCampo.getText();
            LinkedList<Vehiculo> resultados = new LinkedList<>();

            for (Vehiculo vehiculo : concesionario.getListaVehiculos()) {
                if (vehiculo.getMatricula().equalsIgnoreCase(busqueda) ||
                        vehiculo.getMarca().equalsIgnoreCase(busqueda)
                        || vehiculo.getModelo().equalsIgnoreCase(busqueda)) {
                    resultados.add(vehiculo);
                }
            }

            if (resultados.isEmpty()) {
                InicioSesionController.mostrarAlertaInfo("No se encontró");
            } else {
                vehiculosTabla.getItems().setAll(resultados);
            }
        }
    }

    @FXML
    void ImagenAnteriorAccion(ActionEvent event) {

    }

    @FXML
    void ImagenSiguienteAccion(ActionEvent event) {

    }

    @FXML
    void registrarVehiculoAccion(ActionEvent event) {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/co/edu/uniquindio/poo/registrarVehiculoView.fxml"));
        try {
            Parent root = loader.load();
            Stage stage = App.getStage();
            stage.setScene(new Scene(root));
            stage.setTitle("Gestion Vehiculo");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void eliminarVehiculoAccion(ActionEvent event) {
        Vehiculo vehiculoSelecconado = vehiculosTabla.getSelectionModel().getSelectedItem();
        
        if (vehiculoSelecconado == null) {
            InicioSesionController.mostrarAlerta("Alerta", "Debe seleccionar un empleado");
            return;
        }

        concesionario.eliminarVehiculo(vehiculoSelecconado);
        InicioSesionController.mostrarAlertaInfo("Eliminado con exito");
        cargarTabla();
    }

    private void cargarTabla() {

        vehiculosTabla.getItems().setAll(concesionario.getListaVehiculos());
    }
    
    @FXML
    void recargarAccion(ActionEvent event) {
        cargarTabla();
    }


    @FXML
    void initialize() {
        cargarTabla();
        matriculaColumna.setCellValueFactory(new PropertyValueFactory<>("matricula"));
        marcaColumna.setCellValueFactory(new PropertyValueFactory<>("marca"));
        modeloColumna.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        precioporDiaColumna.setCellValueFactory(new PropertyValueFactory<>("precio por dia"));
        precioColumna.setCellValueFactory(new PropertyValueFactory<>("precio"));

        assert atrasButton != null
                : "fx:id=\"atrasButton\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert buscarBoton != null
                : "fx:id=\"buscarBoton\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert buscarEnTablaCampo != null
                : "fx:id=\"buscarEnTablaCampo\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert eliminarVehiculoBoton != null
                : "fx:id=\"eliminarVehiculoBoton\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert imagenAnteriorBoton != null
                : "fx:id=\"imagenAnteriorBoton\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert imagenSiguienteBoton != null
                : "fx:id=\"imagenSiguienteBoton\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert imagenVehiculo1 != null
                : "fx:id=\"imagenVehiculo1\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert imagenVehiculo2 != null
                : "fx:id=\"imagenVehiculo2\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert imagenVehiculo3 != null
                : "fx:id=\"imagenVehiculo3\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert informacionAdicionalTexto != null
                : "fx:id=\"informacionAdicionalTexto\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert marcaColumna != null
                : "fx:id=\"marcaColumna\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert matriculaColumna != null
                : "fx:id=\"matriculaColumna\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert modeloColumna != null
                : "fx:id=\"modeloColumna\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert paginacionTabla != null
                : "fx:id=\"paginacionTabla\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert precioColumna != null
                : "fx:id=\"precioColumna\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert precioporDiaColumna != null
                : "fx:id=\"precioporDiaColumna\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert registrarVehiculoLink != null
                : "fx:id=\"registrarVehiculoLink\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";
        assert vehiculosTabla != null
                : "fx:id=\"vehiculosTabla\" was not injected: check your FXML file 'gestionarVehiculosView.fxml'.";

    }

}
