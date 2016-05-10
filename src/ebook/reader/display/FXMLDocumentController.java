/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebook.reader.display;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;


/**
 *
 * @author ekeenan
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private WebView bookUrl;
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Scanner userInput = new Scanner(System.in);
        String s = null;
        System.out.println("Please enter in the url of the book you want to read.");
        s = userInput.next();
        bookUrl.getEngine().load(s);
    }    
    
}
