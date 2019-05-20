/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXToolbar;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import utils.Constants;

/**
 * FXML Controller class
 *
 * @author Mr. ASH
 */
public class MainViewController implements Initializable {

    @FXML
    private StackPane mainStackPane;
    @FXML
    private JFXToolbar toolbar;
    @FXML
    private JFXHamburger hamburger;
    @FXML
    private AnchorPane contentPane;
    @FXML
    private JFXDrawer drawer;
    public static AnchorPane temporaryPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        temporaryPane=contentPane;
        initDrawer();
    }

    private void initDrawer() {
        drawer.setMinWidth(150);
        try {
            VBox menu = FXMLLoader.load(getClass().getResource(Constants.SIDEMENUVIEW));
            drawer.setSidePane(menu);

            HamburgerBackArrowBasicTransition transition 
                    = new HamburgerBackArrowBasicTransition(hamburger);

            transition.setRate(-1);
            hamburger.addEventHandler(MouseEvent.MOUSE_CLICKED, (Event event) -> {
                transition.setRate(transition.getRate() * -1);
                transition.play();
                if (drawer.isClosed()) {
                    drawer.open();
                } else {
                    drawer.close();
                }

            });
        } catch (IOException ex) {
            Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
