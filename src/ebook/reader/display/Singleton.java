/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebook.reader.display;
import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author csstudent
 */
public class Singleton implements java.io.Serializable{
    private Book book;
    private String bookUrl;
    public static Singleton instance;
    
    private Singleton(){
        this.bookUrl = book.getUrl();
    }
    
    private static void init(){
        if(instance == null){
            try{
                FileInputStream fileIn = new FileInputStream("bookInfo.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                instance = (Singleton) in.readObject();
                in.close();
                fileIn.close();
            }
            catch(IOException i){
                i.printStackTrace();
            }
            catch(ClassNotFoundException c) {
                System.out.println("Singleton class not found");
                c.printStackTrace();
            } 
        }
    }
    
    public static void saveBook(Book b){
        init();
        ArrayList<Page> pages = new ArrayList<Page>();
        for(Page p : b.getText()){
            pages.add(p);
        }
        String author = b.getAuthor();
        String title = b.getTitle();
        
        try{
            FileOutputStream fileOut = new FileOutputStream("bookInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(instance);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in bookInfo.ser");
        }
        catch(IOException i){
            
        } 
    }
    
    private static void setURL(String url){
        init();
        instance.bookUrl = url;
    }
}
