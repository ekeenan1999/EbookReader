/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebook.reader.display;
import java.util.*;
/**
 *
 * @author csstudent
 */
public class Book {
    private ArrayList<Integer> bookmarks;
    private Page[] text;
    public String title;
    public String author;
    public String url;
    
    public Book(String url, String title, String author){
        this.title = title;
        this.author = author;
        this.url = url;
    }
    
    public String getUrl() {
        return url;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
}
