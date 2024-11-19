package co.edu.uniquindio.poo.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class RegistrarVehiculoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> TieneSensoresColisionSedanCombo;

    @FXML
    private ComboBox<String> EsUsadoCombo;

    @FXML
    private TextField TiempoAlcanzar100KmHDeportivoCampo;

    @FXML
    private TextField NumcaballosFuerzaDeportivoCampo;

    @FXML
    private ComboBox<String> TieneSensorTraficoCruzadoSedanCombo;

    @FXML
    private TextField tiempoCargaCampo;

    @FXML
    private TextField NumEjesBusCampo;

    @FXML
    private TextField cilindrajeCampo;

    @FXML
    private ComboBox<String> TieneAbsCarroCombo;

    @FXML
    private ComboBox<String> EsHibridoLigeroCombo;

    @FXML
    private ComboBox<String> EsLindaVanCombo;

    @FXML
    private ComboBox<String> TieneAireAcondicionadoCarroCombo;

    @FXML
    private TextField NumcaballosFuerzaCamionCampo;

    @FXML
    private ComboBox<String> Es4x4PickUpCombo;

    @FXML
    private HBox deportivoPanel;

    @FXML
    private TextField NumPasajerosCarroCampo;

    @FXML
    private ComboBox<String> tipoCombustibleCombo;

    @FXML
    private HBox pickUpPanel;

    @FXML
    private ComboBox<String> TieneVelocidadCruceroSUVCombo;

    @FXML
    private TextField CapacidadMaleteroCarroCampo;

    @FXML
    private ComboBox<String> TieneSensoresColisionSUVCombo;

    @FXML
    private TextField CapacidadCargaPickUpCampo;

    @FXML
    private ComboBox<String> tipoVehiculoCombo;

    @FXML
    private TextField NumBolsasCarroCampo;

    @FXML
    private ComboBox<String> TieneVelocidadCruceroSedanCombo;

    @FXML
    private HBox InformacionAdicionalPanel;

    @FXML
    private ComboBox<String> TieneAsistenciaPermanenciaCarrilSedanCombo;

    @FXML
    private HBox sedanPanel;

    @FXML
    private TextField numeroCambiosCampo;

    @FXML
    private HBox camionPanel;

    @FXML
    private ComboBox<String> TieneSensorTraficoCruzadoSUVCombo;

    @FXML
    private Text TituloInformacionAdicional;

    @FXML
    private Button atrasButton;

    @FXML
    private TextField NumPuertasCarroCampo;

    @FXML
    private HBox carroPanel;

    @FXML
    private TextField marcaCampo;

    @FXML
    private ComboBox<String> TieneAsistenciaPermanenciaCarrilSUVCombo;

    @FXML
    private HBox busPanel;

    @FXML
    private ComboBox<String> esEnchufableCombo;

    @FXML
    private TextField precioDiaAlquilerCampo;

    @FXML
    private TextField matriculaCampo;

    @FXML
    private TextField NumSalidasEmergenciaBusCampo;

    @FXML
    private ComboBox<String> transmisionCombo;

    @FXML
    private ComboBox<String> Es4x4SUVCombo;

    @FXML
    private TextField precioCampo;

    @FXML
    private TextField valocidadMaximaCampo;

    @FXML
    private ComboBox<String> TieneCamaraReversaCarroCombo;

    @FXML
    private HBox VanPanel;

    @FXML
    private VBox combustibleHibridoPanel;

    @FXML
    private Button añadirBoton;

    @FXML
    private VBox combustibleElectricoPanel;

    @FXML
    private TextField autonomiaCampo;

    @FXML
    private HBox SUVPanel;

    @FXML
    private TextField modeloCampo;

    @FXML
    private TextField TiempoAlcanzar100KmHCamionCampo;

    private void inicializarComboBox(ComboBox<String> comboBox) {
        comboBox.getItems().addAll("Sí", "No");
    }

    private void mostrarPanelPorVehiculo(ActionEvent event) {
        desactivarTodosLosPaneles();
        String tipoVehiculo = tipoVehiculoCombo.getValue();

        switch (tipoVehiculo) {
            case "Sedán":
                sedanPanel.setVisible(true);
                break;
            case "SUV":
                SUVPanel.setVisible(true);
                break;
            case "Deportivo":
                deportivoPanel.setVisible(true);
                break;
            case "PickUp":
                pickUpPanel.setVisible(true);
                break;
            case "Camión":
                camionPanel.setVisible(true);
                break;
            case "Van":
                VanPanel.setVisible(true);
                break;
            case "Bus":
                busPanel.setVisible(true);
                break;
        }
    }

    private void desactivarTodosLosPaneles() {
        // Desactivamos todos los paneles
        sedanPanel.setVisible(false);
        SUVPanel.setVisible(false);
        deportivoPanel.setVisible(false);
        pickUpPanel.setVisible(false);
        camionPanel.setVisible(false);
        VanPanel.setVisible(false);
        busPanel.setVisible(false);
    }

    @FXML
    void añadirAccion(ActionEvent event) {

    }

    @FXML
    void atrasAccion(ActionEvent event) {

    }

    @FXML
    void initialize() {
        inicializarComboBox(TieneSensoresColisionSedanCombo);
        inicializarComboBox(EsUsadoCombo);
        inicializarComboBox(TieneSensorTraficoCruzadoSedanCombo);
        inicializarComboBox(TieneAbsCarroCombo);
        inicializarComboBox(EsHibridoLigeroCombo);
        inicializarComboBox(EsLindaVanCombo);
        inicializarComboBox(TieneAireAcondicionadoCarroCombo);
        inicializarComboBox(Es4x4PickUpCombo);
        inicializarComboBox(tipoCombustibleCombo);
        inicializarComboBox(TieneVelocidadCruceroSUVCombo);
        inicializarComboBox(TieneSensoresColisionSUVCombo);
        inicializarComboBox(TieneVelocidadCruceroSedanCombo);
        inicializarComboBox(TieneAsistenciaPermanenciaCarrilSedanCombo);
        inicializarComboBox(TieneSensorTraficoCruzadoSUVCombo);
        inicializarComboBox(TieneAsistenciaPermanenciaCarrilSUVCombo);
        inicializarComboBox(esEnchufableCombo);
        inicializarComboBox(transmisionCombo);
        inicializarComboBox(Es4x4SUVCombo);
        tipoVehiculoCombo.getItems().addAll("Sedán", "SUV", "Deportivo", "PickUp", "Camión", "Van", "Bus");
        tipoVehiculoCombo.setOnAction(this::mostrarPanelPorVehiculo);

        assert TieneSensoresColisionSedanCombo != null
                : "fx:id=\"TieneSensoresColisionSedanCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert EsUsadoCombo != null
                : "fx:id=\"EsUsadoCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert TiempoAlcanzar100KmHDeportivoCampo != null
                : "fx:id=\"TiempoAlcanzar100KmHDeportivoCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert NumcaballosFuerzaDeportivoCampo != null
                : "fx:id=\"NumcaballosFuerzaDeportivoCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert TieneSensorTraficoCruzadoSedanCombo != null
                : "fx:id=\"TieneSensorTraficoCruzadoSedanCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert tiempoCargaCampo != null
                : "fx:id=\"tiempoCargaCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert NumEjesBusCampo != null
                : "fx:id=\"NumEjesBusCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert cilindrajeCampo != null
                : "fx:id=\"cilindrajeCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert TieneAbsCarroCombo != null
                : "fx:id=\"TieneAbsCarroCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert EsHibridoLigeroCombo != null
                : "fx:id=\"EsHibridoLigeroCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert EsLindaVanCombo != null
                : "fx:id=\"EsLindaVanCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert TieneAireAcondicionadoCarroCombo != null
                : "fx:id=\"TieneAireAcondicionadoCarroCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert NumcaballosFuerzaCamionCampo != null
                : "fx:id=\"NumcaballosFuerzaCamionCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert Es4x4PickUpCombo != null
                : "fx:id=\"Es4x4PickUpCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert deportivoPanel != null
                : "fx:id=\"deportivoPanel\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert NumPasajerosCarroCampo != null
                : "fx:id=\"NumPasajerosCarroCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert tipoCombustibleCombo != null
                : "fx:id=\"tipoCombustibleCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert pickUpPanel != null
                : "fx:id=\"pickUpPanel\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert TieneVelocidadCruceroSUVCombo != null
                : "fx:id=\"TieneVelocidadCruceroSUVCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert CapacidadMaleteroCarroCampo != null
                : "fx:id=\"CapacidadMaleteroCarroCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert TieneSensoresColisionSUVCombo != null
                : "fx:id=\"TieneSensoresColisionSUVCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert CapacidadCargaPickUpCampo != null
                : "fx:id=\"CapacidadCargaPickUpCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert tipoVehiculoCombo != null
                : "fx:id=\"tipoVehiculoCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert NumBolsasCarroCampo != null
                : "fx:id=\"NumBolsasCarroCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert TieneVelocidadCruceroSedanCombo != null
                : "fx:id=\"TieneVelocidadCruceroSedanCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert InformacionAdicionalPanel != null
                : "fx:id=\"InformacionAdicionalPanel\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert TieneAsistenciaPermanenciaCarrilSedanCombo != null
                : "fx:id=\"TieneAsistenciaPermanenciaCarrilSedanCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert sedanPanel != null
                : "fx:id=\"sedanPanel\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert numeroCambiosCampo != null
                : "fx:id=\"numeroCambiosCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert camionPanel != null
                : "fx:id=\"camionPanel\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert TieneSensorTraficoCruzadoSUVCombo != null
                : "fx:id=\"TieneSensorTraficoCruzadoSUVCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert TituloInformacionAdicional != null
                : "fx:id=\"TituloInformacionAdicional\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert atrasButton != null
                : "fx:id=\"atrasButton\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert NumPuertasCarroCampo != null
                : "fx:id=\"NumPuertasCarroCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert carroPanel != null
                : "fx:id=\"carroPanel\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert marcaCampo != null
                : "fx:id=\"marcaCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert TieneAsistenciaPermanenciaCarrilSUVCombo != null
                : "fx:id=\"TieneAsistenciaPermanenciaCarrilSUVCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert busPanel != null
                : "fx:id=\"busPanel\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert esEnchufableCombo != null
                : "fx:id=\"esEnchufableCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert precioDiaAlquilerCampo != null
                : "fx:id=\"precioDiaAlquilerCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert matriculaCampo != null
                : "fx:id=\"matriculaCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert NumSalidasEmergenciaBusCampo != null
                : "fx:id=\"NumSalidasEmergenciaBusCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert transmisionCombo != null
                : "fx:id=\"transmisionCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert Es4x4SUVCombo != null
                : "fx:id=\"Es4x4SUVCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert precioCampo != null
                : "fx:id=\"precioCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert valocidadMaximaCampo != null
                : "fx:id=\"valocidadMaximaCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert TieneCamaraReversaCarroCombo != null
                : "fx:id=\"TieneCamaraReversaCarroCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert VanPanel != null
                : "fx:id=\"VanPanel\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert combustibleHibridoPanel != null
                : "fx:id=\"combustibleHibridoPanel\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert añadirBoton != null
                : "fx:id=\"añadirBoton\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert combustibleElectricoPanel != null
                : "fx:id=\"combustibleElectricoPanel\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert autonomiaCampo != null
                : "fx:id=\"autonomiaCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert SUVPanel != null
                : "fx:id=\"SUVPanel\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert modeloCampo != null
                : "fx:id=\"modeloCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert TiempoAlcanzar100KmHCamionCampo != null
                : "fx:id=\"TiempoAlcanzar100KmHCamionCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";

    }
}
