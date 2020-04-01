/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 *
 * @author mahmoud ennouri
 */

    public class GestionPlatController implements Initializable {
    
    @FXML
    private TableView<Plat> tv;
    @FXML
    private TableColumn<Plat, String> nomPlat;
    @FXML
    private TableColumn<Plat, String> photoPlat;
    @FXML
    private TableColumn<Plat, Float> date;
    @FXML
    private TableColumn<Plat, Integer> description;
    @FXML
    private Button ajouter;
    @FXML
    private Button modifier;
    @FXML
    private Button afficher;
    @FXML
    private Button supprimer;
    private static Plat p;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Plat {

        public Plat() {
        }
        
    }
    
    
    
    
    
}
