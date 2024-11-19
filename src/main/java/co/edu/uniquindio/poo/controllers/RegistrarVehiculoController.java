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
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RegistrarVehiculoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> EsHibridoLigeroCombo;

    @FXML
    private ComboBox<?> EsUsadoCombo;

    @FXML
    private Button atrasButton;

    @FXML
    private TextField autonomiaCampo;

    @FXML
    private HBox busPanel;

    @FXML
    private HBox busPanel2;

    @FXML
    private HBox busPanel3;

    @FXML
    private HBox busPanel4;

    @FXML
    private HBox busPanel5;

    @FXML
    private HBox busPanel6;

    @FXML
    private HBox busPanel7;

    @FXML
    private HBox busPanel8;

    @FXML
    private HBox camionesPanel;

    @FXML
    private TextField cilindrajeCampo;

    @FXML
    private VBox combustibleElectricoPanel;

    @FXML
    private VBox combustibleHibridoPanel;

    @FXML
    private ComboBox<?> esEnchufableCombo;

    @FXML
    private TextField marcaCampo;

    @FXML
    private TextField matriculaCampo;

    @FXML
    private TextField modeloCampo;

    @FXML
    private TextField numeroCambiosCampo;

    @FXML
    private TextField precioCampo;

    @FXML
    private TextField precioDiaAlquilerCampo;

    @FXML
    private TextField tiempoCargaCampo;

    @FXML
    private ComboBox<?> tipoCombustibleCombo;

    @FXML
    private ComboBox<?> tipoVehiculoCombo;

    @FXML
    private ComboBox<?> transmisionCombo;

    @FXML
    private TextField valocidadMaximaCampo;

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
    void initialize() {
        assert EsHibridoLigeroCombo != null : "fx:id=\"EsHibridoLigeroCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert EsUsadoCombo != null : "fx:id=\"EsUsadoCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert atrasButton != null : "fx:id=\"atrasButton\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert autonomiaCampo != null : "fx:id=\"autonomiaCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert busPanel != null : "fx:id=\"busPanel\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert busPanel2 != null : "fx:id=\"busPanel2\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert busPanel3 != null : "fx:id=\"busPanel3\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert busPanel4 != null : "fx:id=\"busPanel4\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert busPanel5 != null : "fx:id=\"busPanel5\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert busPanel6 != null : "fx:id=\"busPanel6\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert busPanel7 != null : "fx:id=\"busPanel7\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert busPanel8 != null : "fx:id=\"busPanel8\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert camionesPanel != null : "fx:id=\"camionesPanel\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert cilindrajeCampo != null : "fx:id=\"cilindrajeCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert combustibleElectricoPanel != null : "fx:id=\"combustibleElectricoPanel\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert combustibleHibridoPanel != null : "fx:id=\"combustibleHibridoPanel\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert esEnchufableCombo != null : "fx:id=\"esEnchufableCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert marcaCampo != null : "fx:id=\"marcaCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert matriculaCampo != null : "fx:id=\"matriculaCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert modeloCampo != null : "fx:id=\"modeloCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert numeroCambiosCampo != null : "fx:id=\"numeroCambiosCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert precioCampo != null : "fx:id=\"precioCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert precioDiaAlquilerCampo != null : "fx:id=\"precioDiaAlquilerCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert tiempoCargaCampo != null : "fx:id=\"tiempoCargaCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert tipoCombustibleCombo != null : "fx:id=\"tipoCombustibleCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert tipoVehiculoCombo != null : "fx:id=\"tipoVehiculoCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert transmisionCombo != null : "fx:id=\"transmisionCombo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";
        assert valocidadMaximaCampo != null : "fx:id=\"valocidadMaximaCampo\" was not injected: check your FXML file 'registrarVehiculoView.fxml'.";

    }

}

