package View;

import Model.Cilindro;
import Model.Cone;
import Model.Esfera;
import Model.FiguraGeo3D;
import Model.Material;
import Model.Paralelepipedo;
import Model.Piramede;
import Model.Prisma;
import java.net.URL;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class PrincipalController implements Initializable {

    private final char separadorDecimal
            = new DecimalFormatSymbols(Locale.getDefault(
                    Locale.Category.FORMAT)).getDecimalSeparator();

    private List<Material> lstMaterial = new ArrayList<>();
    private List<FiguraGeo3D> lstObj = new ArrayList<FiguraGeo3D>();

    @FXML
    private RadioButton rdBtnCone;

    @FXML
    private RadioButton rdBtnCilindro;

    @FXML
    private RadioButton rdBtnEsfera;

    @FXML
    private RadioButton rdBtnPrisma;

    @FXML
    private ComboBox<Material> cmbMaterial;

    @FXML
    private Label lbParametro1;
    @FXML
    private TextField txtFldParametro1;

    @FXML
    private Label lbParametro2;
    @FXML
    private TextField txtFldParametro2;

    @FXML
    private Label lbParametro3;
    @FXML
    private TextField txtFldParametro3;

    @FXML
    private Label lbParametro4;
    @FXML
    private TextField txtFldParametro4;

    @FXML
    private Label lbQtdObj;

    @FXML
    private Label lbMaiorPeso;

    @FXML
    private Label lbMaiorVolume;

    @FXML
    private void btnIncluirClick(ActionEvent event) {
        if (rdBtnCone.isSelected()) {
            lstObj.add(new Cone(Double.valueOf(txtFldParametro1.getText()), Double.valueOf(txtFldParametro2.getText()),
                    cmbMaterial.valueProperty().getValue(), "IdCone"));
        }
        if (rdBtnCilindro.isSelected()) {
            lstObj.add(new Cilindro(Double.valueOf(txtFldParametro1.getText()), Double.valueOf(txtFldParametro2.getText()),
                    cmbMaterial.valueProperty().getValue(), "IdCilindro"));
        }
        if (rdBtnEsfera.isSelected()) {
            lstObj.add(new Esfera(Double.valueOf(txtFldParametro2.getText()),
                    cmbMaterial.valueProperty().getValue(), "IdEsfera"));
        }
        if (rdBtnPrisma.isSelected()) {
            lstObj.add(new Prisma(Double.valueOf(txtFldParametro1.getText()), Double.valueOf(txtFldParametro2.getText()),
                    Integer.valueOf(txtFldParametro3.getText()), Double.valueOf(txtFldParametro4.getText()),
                    cmbMaterial.valueProperty().getValue(), "IdPrisma"));
        }

        double aux1 = lstObj.get(0).getPeso();
        String aux2 = "";

        for (FiguraGeo3D c : lstObj) {
            if (c.getPeso() > aux1) {
                aux1 = c.getPeso();
                aux2 = c.toString();

            }

            if (!aux2.isEmpty()) {
                lbMaiorPeso.setText(aux2);
            } else {
                lbMaiorPeso.setText(lstObj.get(0).toString());
            }
        }

        double aux3 = lstObj.get(0).getVolume();
        String aux4 = "";

        for (FiguraGeo3D o : lstObj) {
            if (o.getVolume() > aux1) {
                aux3 = o.getVolume();
                aux4 = o.toString();

            }

            if (!aux4.isEmpty()) {
                lbMaiorVolume.setText(aux4);
            } else {
                lbMaiorVolume.setText(lstObj.get(0).toString());
            }
        }
        lbQtdObj.setText(String.valueOf(lstObj.size()));
    }

    public void rdBtnMaterialClick(ActionEvent event) {

        if (rdBtnCone.isSelected()) {
            lbParametro1.setText("Raio:");
            txtFldParametro1.getText();
            lbParametro2.setText("Altura:");
            txtFldParametro2.getText();

            lbParametro3.setVisible(false);
            txtFldParametro3.setVisible(false);
            lbParametro4.setVisible(false);
            txtFldParametro4.setVisible(false);

            lbParametro1.setVisible(true);
            txtFldParametro1.setVisible(true);
            lbParametro2.setVisible(true);
            txtFldParametro2.setVisible(true);
        }
        if (rdBtnCilindro.isSelected()) {
            lbParametro1.setText("Raio:");
            txtFldParametro1.getText();
            lbParametro2.setText("Altura:");
            txtFldParametro2.getText();

            lbParametro3.setVisible(false);
            txtFldParametro3.setVisible(false);
            lbParametro4.setVisible(false);
            txtFldParametro4.setVisible(false);

            lbParametro1.setVisible(true);
            txtFldParametro1.setVisible(true);
            lbParametro2.setVisible(true);
            txtFldParametro2.setVisible(true);
        }
        if (rdBtnEsfera.isSelected()) {
            lbParametro1.setText("Diâmetro:");
            txtFldParametro1.getText();

            lbParametro2.setVisible(false);
            txtFldParametro2.setVisible(false);
            lbParametro3.setVisible(false);
            txtFldParametro3.setVisible(false);
            lbParametro4.setVisible(false);
            txtFldParametro4.setVisible(false);

            lbParametro1.setVisible(true);
            txtFldParametro1.setVisible(true);
        }
        if (rdBtnPrisma.isSelected()) {
            lbParametro1.setText("Raio:");
            txtFldParametro1.getText();
            lbParametro2.setText("Tam. Lado:");
            txtFldParametro2.getText();
            lbParametro3.setText("Qtd. Lado:");
            txtFldParametro3.getText();
            lbParametro4.setText("Altura");
            txtFldParametro4.getText();

            lbParametro1.setVisible(true);
            txtFldParametro1.setVisible(true);
            lbParametro2.setVisible(true);
            txtFldParametro2.setVisible(true);
            lbParametro3.setVisible(true);
            txtFldParametro3.setVisible(true);
            lbParametro4.setVisible(true);
            txtFldParametro4.setVisible(true);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        lstMaterial.add(new Material("Aço", 1.5));
        lstMaterial.add(new Material("Chumbo", 5));
        lstMaterial.add(new Material("Cobre", 2));
        lstMaterial.add(new Material("Aluminio", 3));
        lstMaterial.add(new Material("Gesso", 0.001));

        cmbMaterial.setItems(FXCollections.observableList(lstMaterial));
        cmbMaterial.getSelectionModel().selectFirst();

        //        TYPECAST = direcionador para especialização de classe
    }
}