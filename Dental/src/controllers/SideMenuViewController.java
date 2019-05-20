/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import utils.Constants;

/**
 * FXML Controller class
 *
 * @author Mr. ASH
 */
public class SideMenuViewController implements Initializable {

    @FXML
    private JFXButton btnDashboard;
    @FXML
    private JFXButton btnPatients;
    @FXML
    private JFXButton btnDoctors;
    @FXML
    private JFXButton btnAppoinments;
    @FXML
    private JFXButton btnCarriers;
    @FXML
    private JFXButton btnInvoice;
    @FXML
    private JFXButton btnLogout;
    @FXML
    private JFXButton btnExit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            StackPane dashboard = FXMLLoader.load(getClass().getResource(Constants.DASHBOARDVIEW));
            MainViewController.temporaryPane.getChildren().setAll(dashboard);
        } catch (IOException ex) {
            Logger.getLogger(SideMenuViewController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void openDashboard(ActionEvent event) {
        switchPane(Constants.DASHBOARDVIEW);
    }

    @FXML
    private void openDoctors(ActionEvent event) {
        switchPane(Constants.DOCTORVIEW);
    }

    @FXML
    private void openAppointmens(ActionEvent event) {

    }

    @FXML
    private void openCarriers(ActionEvent event) {
        switchPane(Constants.CARRIERSVIEW);
    }

    @FXML
    private void openInvoice(ActionEvent event) {
        switchPane(Constants.INVOICEVIEW);
    }

    @FXML
    private void openLogout(ActionEvent event) {
    }

    @FXML
    private void exit(ActionEvent event) {
    }

    private void switchPane(String pane) {
        try {
            MainViewController.temporaryPane.getChildren().clear();
            StackPane pane2 = FXMLLoader.load(getClass().getResource(pane));
            ObservableList<Node> elements = pane2.getChildren();
            MainViewController.temporaryPane.getChildren().setAll(elements);

        } catch (IOException ex) {
            Logger.getLogger(SideMenuViewController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void openPatients(ActionEvent event) {
        switchPane(Constants.PATTIENTSVIEW);
    }

}
