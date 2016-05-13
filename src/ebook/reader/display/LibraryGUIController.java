/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebook.reader.display;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 * @author ekeenan
 */
public class LibraryGUIController implements Initializable {

    @FXML
    private Pane book1;
    
    @FXML
    private Pane book2;
     
    @FXML
    private Pane book3;
    
    @FXML
    private Pane book4;
    
    @FXML
    private Pane book5;
    
    @FXML
    private Pane book6;
    
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML 
    public void onMouseClicked() {
        
    }
    
}
