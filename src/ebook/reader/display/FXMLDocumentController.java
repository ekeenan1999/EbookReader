/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebook.reader.display;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


/**
 *
 * @author Alex Blocker and Wilson Hayward
 */
public class FXMLDocumentController implements Initializable {
    
   private Book b = null;
    
    @FXML
    private TextArea textArea;
    
    @FXML
    private Button nextPage;
    
    @FXML
    private Button prevPage;
    
    @FXML
    private TextArea pageN;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Scanner userInput = new Scanner(System.in);
        //get user input
        String s = null;
        System.out.println("URL of the text file: ");
        s = userInput.next();
        //get title
        String t = null;
        System.out.println("Book title: ");
        t = userInput.next();
        //get auth
        String a = null;
        System.out.println("Author: ");
        a = userInput.next();
        
        //create book using user input
        b = new Book(s, t, a);
        
        textArea.appendText(b.text[b.curPage].getPageText());
        pageN.appendText(String.valueOf(b.curPage));
    }
    @FXML
    public void nextP(){
        b.nextPage();
    }
    
    @FXML
    public void prevP(){    
        b.prevPage();
    }
    

}
