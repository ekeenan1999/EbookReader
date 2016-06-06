/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebook.reader.display;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ekeenan
 */
public class LibraryGUIController implements Initializable {
    
    private Book book;
    
    private Stage mainWindow;
    
    private boolean b1pressed = false;
    
    private boolean b2pressed = false;
     
    private boolean b3pressed = false;
      
    private boolean b4pressed = false;
       
    private boolean b5pressed = false;
        
    private boolean b6pressed = false;
    
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
        if(b1pressed == true) {
            book = Singleton.recallBook();
            b1Label.setText(book.getTitle() + " by " + book.getAuthor());
        }
    }
    
    
    
    @FXML
    public void handleBackToBook() {
        try {
            EbookReaderDisplay.getAppInstance().showBookView();
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML 
    public void onMouseClickedB1() {
        if(b1pressed == false){
            Scanner userInput = new Scanner(System.in);
            String url = null;
            System.out.println("Please enter in the url of the book you want to add.");
            url = userInput.nextLine();
            userInput.nextLine();
            String title = null;
            System.out.println("Please enter the title of the book");
            title = userInput.nextLine();
            String author = null;
            System.out.println("Please enter the author of the book");
            author = userInput.nextLine();
            Book newBook = new Book(url, title, author);
            b1Label.setText(newBook.getTitle() + " by " + newBook.getAuthor());
            book = newBook;
            Singleton.saveBook(book);
            b1pressed = true;
        } else if (b1pressed == true) {
            book = Singleton.recallBook();
            b1Label.setText(book.getTitle() + " by " + book.getAuthor());
            handleBackToBook();
            
            //OPEN BOOK THAT IS SAVED IN THE LIBRARY
        }
    }
    
    @FXML 
    public void onMouseClickedB2() {
        if(b2pressed ==false) {
            Scanner userInput = new Scanner(System.in);
            String url = null;
            System.out.println("Please enter in the url of the book you want to add.");
            url = userInput.nextLine();
            userInput.nextLine();
            String title = null;
            System.out.println("Please enter the title of the book");
            title = userInput.nextLine();
            String author = null;
            System.out.println("Please enter the author of the book");
            author = userInput.nextLine();
            Book newBook = new Book(url, title, author);
            b1Label.setText(newBook.getTitle() + " by " + newBook.getAuthor());
            Singleton.saveBook(newBook);
            b2pressed = true;
        } else if (b2pressed == true) {
            //Singleton.recallBook();
            handleBackToBook();
            
            //OPEN BOOK THAT IS SAVED IN THE LIBRARY
        }
    }
    
     @FXML 
    public void onMouseClickedB3() {
        if(b3pressed ==false) {
            Scanner userInput = new Scanner(System.in);
            String url = null;
            System.out.println("Please enter in the url of the book you want to add.");
            url = userInput.nextLine();
            userInput.nextLine();
            String title = null;
            System.out.println("Please enter the title of the book");
            title = userInput.nextLine();
            String author = null;
            System.out.println("Please enter the author of the book");
            author = userInput.nextLine();
            Book newBook = new Book(url, title, author);
            b1Label.setText(newBook.getTitle() + " by " + newBook.getAuthor());
            Singleton.saveBook(newBook);
            b3pressed = true;
        } else if (b3pressed == true) {
            //Singleton.recallBook();
            handleBackToBook();
            
            //OPEN BOOK THAT IS SAVED IN THE LIBRARY
        }
    }
    
     @FXML 
    public void onMouseClickedB4() {
        if(b4pressed ==false) {
            Scanner userInput = new Scanner(System.in);
            String url = null;
            System.out.println("Please enter in the url of the book you want to add.");
            url = userInput.nextLine();
            userInput.nextLine();
            String title = null;
            System.out.println("Please enter the title of the book");
            title = userInput.nextLine();
            String author = null;
            System.out.println("Please enter the author of the book");
            author = userInput.nextLine();
            Book newBook = new Book(url, title, author);
            b1Label.setText(newBook.getTitle() + " by " + newBook.getAuthor());
            Singleton.saveBook(newBook);
            b4pressed = true;
        } else if (b4pressed == true) {
            //Singleton.recallBook();
            handleBackToBook();
            
            //OPEN BOOK THAT IS SAVED IN THE LIBRARY
        }
    }
    
     @FXML 
    public void onMouseClickedB5() {
        if(b5pressed ==false) {
            Scanner userInput = new Scanner(System.in);
            String url = null;
            System.out.println("Please enter in the url of the book you want to add.");
            url = userInput.nextLine();
            userInput.nextLine();
            String title = null;
            System.out.println("Please enter the title of the book");
            title = userInput.nextLine();
            String author = null;
            System.out.println("Please enter the author of the book");
            author = userInput.nextLine();
            Book newBook = new Book(url, title, author);
            b1Label.setText(newBook.getTitle() + " by " + newBook.getAuthor());
            Singleton.saveBook(newBook);
            b5pressed = true;
        } else if (b5pressed == true) {
            //Singleton.recallBook();
            handleBackToBook();
            
            //OPEN BOOK THAT IS SAVED IN THE LIBRARY
        }
    }
    
     @FXML 
    public void onMouseClickedB6() {
        if(b6pressed ==false) {
            Scanner userInput = new Scanner(System.in);
            String url = null;
            System.out.println("Please enter in the url of the book you want to add.");
            url = userInput.nextLine();
            userInput.nextLine();
            String title = null;
            System.out.println("Please enter the title of the book");
            title = userInput.nextLine();
            String author = null;
            System.out.println("Please enter the author of the book");
            author = userInput.nextLine();
            Book newBook = new Book(url, title, author);
            b1Label.setText(newBook.getTitle() + " by " + newBook.getAuthor());
            Singleton.saveBook(newBook);
            b6pressed = true;
        } else if (b6pressed == true) {
            //Singleton.recallBook();
            handleBackToBook();
            
            //OPEN BOOK THAT IS SAVED IN THE LIBRARY
        }
    }
}

