/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebook.reader.display;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author ekeenan
 */
public class LibraryGUIController implements Initializable {
    
    private Book book;
    
    private boolean b1pressed = false;
    
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
    
    @FXML
    private Label b1Label;
    
    @FXML
    private Label b2Label;
    
    @FXML
    private Label b3Label;
  
    @FXML
    private Label b4Label;       
   
    @FXML
    private Label b5Label;
            
    @FXML
    private Label b6Label;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML 
    public void onMouseClickedB1() {
        if(b1pressed ==false) {
            Scanner userInput = new Scanner(System.in);
            String url = null;
            System.out.println("Please enter in the url of the book you want to add.");
            url = userInput.next();
            String title = null;
            System.out.println("Please enter the title of the book");
            title = userInput.nextLine();
            String author = null;
            System.out.println("Please enter the author of the book");
            author = userInput.nextLine();
            Book newBook = new Book(url, title, author);
            b1Label.setText(newBook.getTitle() + " by " + newBook.getAuthor());
            Singleton.saveBook(newBook);
            b1pressed = true;
        } else if (b1pressed == true) {
            Singleton.recallBook();
            //OPEN BOOK THAT IS SAVED IN THE PANEL
        }
    }
    
}

//Add labels to scene builder in imageviews... then add image of book to imageviews.. change label onMouseClicked
