package co.edu.uniquindio.poo.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class VisualizadorVehiculosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pagination paginacionTabla;

    @FXML
    private ComboBox<String> seleccionarAtributoCombo;

    @FXML
    private TextField buscarEnTablaCampo;

    @FXML
    private TableColumn<?, ?> modeloColumna;

    @FXML
    private ImageView imagenVehiculo1;

    @FXML
    private TableColumn<?, ?> precioColumna;

    @FXML
    private ImageView imagenVehiculo2;

    @FXML
    private Button imagenSiguienteBoton;

    @FXML
    private TableView<?> vehiculosTabla;

    @FXML
    private TableColumn<?, ?> marcaColumna;

    @FXML
    private ImageView imagenVehiculo3;

    @FXML
    private TextArea informacionAdicionalTexto;

    @FXML
    private TableColumn<?, ?> matriculaColumna;

    @FXML
    private Button filtrarBoton;

    @FXML
    private TableColumn<?, ?> precioporDiaColumna;

    @FXML
    private Button imagenAnteriorBoton;

    @FXML
    void filtrarAccion(ActionEvent event) {
        
    }

    @FXML
    void ImagenAnteriorAccion(ActionEvent event) {

    }

    @FXML
    void ImagenSiguienteAccion(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert paginacionTabla != null : "fx:id=\"paginacionTabla\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert seleccionarAtributoCombo != null : "fx:id=\"seleccionarAtributoCombo\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert buscarEnTablaCampo != null : "fx:id=\"buscarEnTablaCampo\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert modeloColumna != null : "fx:id=\"modeloColumna\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert imagenVehiculo1 != null : "fx:id=\"imagenVehiculo1\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert precioColumna != null : "fx:id=\"precioColumna\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert imagenVehiculo2 != null : "fx:id=\"imagenVehiculo2\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert imagenSiguienteBoton != null : "fx:id=\"imagenSiguienteBoton\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert vehiculosTabla != null : "fx:id=\"vehiculosTabla\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert marcaColumna != null : "fx:id=\"marcaColumna\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert imagenVehiculo3 != null : "fx:id=\"imagenVehiculo3\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert informacionAdicionalTexto != null : "fx:id=\"informacionAdicionalTexto\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert matriculaColumna != null : "fx:id=\"matriculaColumna\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert filtrarBoton != null : "fx:id=\"filtrarBoton\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert precioporDiaColumna != null : "fx:id=\"precioporDiaColumna\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert imagenAnteriorBoton != null : "fx:id=\"imagenAnteriorBoton\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";

    }
}
