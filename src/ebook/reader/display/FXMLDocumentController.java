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
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Scanner userInput = new Scanner(System.in);
        //get earl
        String s = null;
        System.out.println("URL yo");
        s = userInput.next();
        //get title
        String t = null;
        System.out.println("What the title yo");
        t = userInput.next();
        //get auth
        String a = null;
        System.out.println("What the auth yo");
        a = userInput.next();
                
        Book b = new Book(s, t, a);
        try {
            url = new URL(s);
        } catch (Exception e) {
            System.out.println("Improper URL " + s);
            System.exit(-1);
        }
     
        // read from the URL
        Scanner scan = null;
        try {
            scan = new Scanner(url.openStream());
        } catch (Exception e) {
            System.out.println("Could not connect to " + s);
            System.exit(-1);
        }
        
        String str = new String();
        while (scan.hasNext()) {
            int x = 1;
            for(int i = 0; i < 38; i++){
                str += scan.nextLine() + "\n";
            }
            Page p = new Page(str, x);
            b.addPage(p);
            x++;
        }
        scan.close();
    }    
    
}