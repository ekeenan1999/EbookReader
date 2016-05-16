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
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author ekeenan
 */
public class LibraryGUIController implements Initializable {

    @FXML
    private ImageView book1;
    
    @FXML
    private ImageView book2;
     
    @FXML
    private ImageView book3;
    
    @FXML
    private ImageView book4;
    
    @FXML
    private ImageView book5;
    
    @FXML
    private ImageView book6;
    
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML 
    public void onMouseClickedB1() {
        book1.setImage();
    }
    
}

//Add labels to scene builder in imageviews... then add image of book to imageviews.. change label onMouseClicked
