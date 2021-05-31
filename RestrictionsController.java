/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiect;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author alladeenPC
 */
public class RestrictionsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Label titlu;
    
    @FXML
    private Label continut;
    
    @FXML
    public void show(){
        String title = MainController.country;
        title = title.substring(0, 1).toUpperCase() + title.substring(1);
        String titluInt = "Restrictions for: " + title;
        titlu.setText(titluInt);
        
        String continutInt = FavouritesController.countryRestr.get(FavouritesController.countryText);
        continut.setText(continutInt);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    public void goBack(){
        NewFXMain.set_pane(1);
        titlu.setText("");
        continut.setText("");
    }
}
