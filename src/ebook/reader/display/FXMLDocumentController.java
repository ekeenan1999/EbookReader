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
        b = Singleton.recallBook();
        textArea.appendText(b.text[b.curPage].getPageText());
        pageN.appendText(String.valueOf(b.curPage));
    }
    
    @FXML
    public void nextP(){
        if (b.getText()[b.curPage+1] != null){
            b.nextPage();
            textArea.appendText(b.text[b.curPage].getPageText());
            pageN.appendText(String.valueOf(b.curPage));
        }
    }
    
    @FXML
    public void prevP(){
        if (b.getText()[b.curPage-1] != null){
            b.prevPage();
            textArea.appendText(b.text[b.curPage].getPageText());
            pageN.appendText(String.valueOf(b.curPage));
        }
    }
    

}
