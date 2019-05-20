/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dental;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr. ASH
 */
public class LoginViewController implements Initializable {

    private Label label;
    @FXML
    private JFXPasswordField txtPassword;
    @FXML
    private JFXTextField txtUsername;
    @FXML
    private JFXButton btnLogin;

    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void goToMainPage(ActionEvent event) {
        if(isLoginDetailsCorrect()){
            //Grant access to open main page
            System.out.println("Login Success");
        }
        else {
            //deny access to main, and show a login error
            System.out.println("Login Details are not Correct");
        }
    }

    //method to check login details
    private boolean isLoginDetailsCorrect() {
        return txtUsername.getText().equals("username") && txtPassword.getText().equals("password");
    }

}
