package co.edu.uniquindio.poo.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import co.edu.uniquindio.poo.model.Vehiculo;

public class VisualizadorVehiculosController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="paginacionTabla"
    private Pagination paginacionTabla; // Value injected by FXMLLoader

    @FXML // fx:id="comboSeleccionarAtributo"
    private ComboBox<String> comboSeleccionarAtributo; // Value injected by FXMLLoader

    @FXML // fx:id="columnaMatricula"
    private TableColumn<?, ?> columnaMatricula; // Value injected by FXMLLoader

    @FXML // fx:id="columnaPrecio"
    private TableColumn<?, ?> columnaPrecio; // Value injected by FXMLLoader

    @FXML // fx:id="tablaVehiculos"
    private TableView<Vehiculo> tablaVehiculos; // Value injected by FXMLLoader

    @FXML // fx:id="columnaMarca"
    private TableColumn<?, ?> columnaMarca; // Value injected by FXMLLoader

    @FXML // fx:id="imagenVehiculo1"
    private ImageView imagenVehiculo1; // Value injected by FXMLLoader

    @FXML // fx:id="botonImagenSiguiente"
    private Button botonImagenSiguiente; // Value injected by FXMLLoader

    @FXML // fx:id="imagenVehiculo2"
    private ImageView imagenVehiculo2; // Value injected by FXMLLoader

    @FXML // fx:id="imagenVehiculo3"
    private ImageView imagenVehiculo3; // Value injected by FXMLLoader

    @FXML // fx:id="campoBuscarEnTabla"
    private TextField campoBuscarEnTabla; // Value injected by FXMLLoader

    @FXML // fx:id="informacionAdicionalTexto"
    private TextArea informacionAdicionalTexto; // Value injected by FXMLLoader

    @FXML // fx:id="botonImagenAnterior"
    private Button botonImagenAnterior; // Value injected by FXMLLoader

    @FXML // fx:id="columnaPrecioporDia"
    private TableColumn<?, ?> columnaPrecioporDia; // Value injected by FXMLLoader

    @FXML // fx:id="botonFiltrar"
    private Button botonFiltrar; // Value injected by FXMLLoader

    @FXML // fx:id="columnaModelo"
    private TableColumn<?, ?> columnaModelo; // Value injected by FXMLLoader

    private int indiceImagen = 0; // Controla la imagen actual
    private ObservableList<Vehiculo> vehiculos = FXCollections.observableArrayList();
    private ObservableList<Vehiculo> vehiculosFiltrados = FXCollections.observableArrayList();

    @FXML
    void SeleccionarAtributoAccion(ActionEvent event) {
        // Lógica para seleccionar un atributo (por ejemplo, cargar el ComboBox con atributos)
    }

    @FXML
    void buscarEnTablaAccion(ActionEvent event) {
        // Acción de búsqueda cuando se presiona "Enter" en el campo de búsqueda
        aplicarFiltro();
    }

    @FXML
    void filtrarAccion(ActionEvent event) {
        // Acción de filtro cuando se presiona el botón "Filtrar"
        aplicarFiltro();
    }

    private void aplicarFiltro() {
        // Limpiar lista de vehículos filtrados
        vehiculosFiltrados.clear();

        // Obtener el texto de búsqueda y el atributo seleccionado
        String atributoSeleccionado = comboSeleccionarAtributo.getValue();
        String textoBuscar = campoBuscarEnTabla.getText().toLowerCase();

        // Filtrar vehículos según el atributo y el texto de búsqueda
        for (Vehiculo vehiculo : vehiculos) {
            boolean coincide = false;
            switch (atributoSeleccionado) {
                case "Marca":
                    coincide = vehiculo.getMarca().toLowerCase().contains(textoBuscar);
                    break;
                case "Modelo":
                    coincide = vehiculo.getModelo().toLowerCase().contains(textoBuscar);
                    break;
                case "Matricula":
                    coincide = vehiculo.getMatricula().toLowerCase().contains(textoBuscar);
                    break;
                case "Precio":
                    try {
                        double precioBusqueda = Double.parseDouble(textoBuscar);
                        coincide = vehiculo.getPrecio() == precioBusqueda;
                    } catch (NumberFormatException e) {
                        coincide = false; // Si no es un número válido, no filtramos por precio
                    }
                    break;
                case "Precio por Día":
                    try {
                        double precioDiaBusqueda = Double.parseDouble(textoBuscar);
                        coincide = vehiculo.getPrecioDia() == precioDiaBusqueda;
                    } catch (NumberFormatException e) {
                        coincide = false; // Si no es un número válido, no filtramos por precio por día
                    }
                    break;
                // Agregar más casos para otros atributos si es necesario
            }
            if (coincide) {
                vehiculosFiltrados.add(vehiculo);
            }
        }

        // Actualizar la tabla con los vehículos filtrados
        tablaVehiculos.setItems(vehiculosFiltrados);
    }

    @FXML
    void ImagenAnteriorAccion(ActionEvent event) {
        if (indiceImagen > 0) {
            indiceImagen--; // Decrementa el índice de la imagen
        } else {
            indiceImagen = 2; // Si es la primera, vuelve a la última
        }
        mostrarImagen(indiceImagen);
    }

    @FXML
    void ImagenSiguienteAccion(ActionEvent event) {
        if (indiceImagen < 2) {
            indiceImagen++; // Incrementa el índice de la imagen
        } else {
            indiceImagen = 0; // Si es la última, vuelve a la primera
        }
        mostrarImagen(indiceImagen);
    }

    // Muestra la imagen correspondiente
    private void mostrarImagen(int indice) {
        // Oculta todas las imágenes
        imagenVehiculo1.setVisible(false);
        imagenVehiculo2.setVisible(false);
        imagenVehiculo3.setVisible(false);

        // Muestra la imagen según el índice
        if (indice == 0) {
            imagenVehiculo1.setVisible(true);
        } else if (indice == 1) {
            imagenVehiculo2.setVisible(true);
        } else {
            imagenVehiculo3.setVisible(true);
        }

        // Actualiza el texto de la información adicional según la imagen
        actualizarInformacion(indice);
    }

    // Actualiza el texto de la información adicional según la imagen
    private void actualizarInformacion(int indice) {
        if (indice == 0) {
            informacionAdicionalTexto.setText("Información adicional sobre el Vehículo 1...");
        } else if (indice == 1) {
            informacionAdicionalTexto.setText("Información adicional sobre el Vehículo 2...");
        } else {
            informacionAdicionalTexto.setText("Información adicional sobre el Vehículo 3...");
        }
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert paginacionTabla != null : "fx:id=\"paginacionTabla\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert comboSeleccionarAtributo != null : "fx:id=\"comboSeleccionarAtributo\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert columnaMatricula != null : "fx:id=\"columnaMatricula\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert columnaPrecio != null : "fx:id=\"columnaPrecio\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert tablaVehiculos != null : "fx:id=\"tablaVehiculos\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert columnaMarca != null : "fx:id=\"columnaMarca\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert imagenVehiculo1 != null : "fx:id=\"imagenVehiculo1\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert botonImagenSiguiente != null : "fx:id=\"botonImagenSiguiente\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert imagenVehiculo2 != null : "fx:id=\"imagenVehiculo2\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert imagenVehiculo3 != null : "fx:id=\"imagenVehiculo3\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert campoBuscarEnTabla != null : "fx:id=\"campoBuscarEnTabla\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert informacionAdicionalTexto != null : "fx:id=\"informacionAdicionalTexto\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert botonImagenAnterior != null : "fx:id=\"botonImagenAnterior\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert columnaPrecioporDia != null : "fx:id=\"columnaPrecioporDia\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert botonFiltrar != null : "fx:id=\"botonFiltrar\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";
        assert columnaModelo != null : "fx:id=\"columnaModelo\" was not injected: check your FXML file 'visualizadorVehiculos.fxml'.";

        // Inicializa mostrando solo la primera imagen
        mostrarImagen(indiceImagen);

    
    }
        
}