/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebook.reader.display;
import java.net.URL;
import java.util.*;
/**
 *
 * @author Alex Blocker and Wilson Hayward
 */
public class Book {
    private ArrayList<Integer> bookmarks;
    private Page[] text = new Page[100];
    public String title;
    public String author;
    public String url;
    public int curPage;
    
    public Book(String url, String title, String author){
        this.title = title;
        this.author = author;
        this.url = url;
        curPage = 1;
        
        URL bookUrl = null;
        try {
            bookUrl = new URL(url);
        } catch (Exception e) {
            System.out.println("Improper URL " + url);
            System.exit(-1);
        }
        
        Scanner scan = null;
        try {
            scan = new Scanner(bookUrl.openStream());
        } catch (Exception e) {
            System.out.println("Could not connect to " + url);
            System.exit(-1);
        }
        
        //Split the book into pages
        String str = new String();
        while (scan.hasNext()) {
            int x = 1;
            for(int i = 0; i < 38; i++){
                if (scan.hasNextLine()){                
                    str = scan.nextLine() + "\n";
                }
                Page p = new Page(str, x);
                this.addPage(p);
            }
            x++;
        }
        scan.close();
    }
    
    //add a page to the book
    public void addPage(Page p){
        for(int i = 0; i < text.length - 1; i++){
            if(text[i] != null){
                text[i] = p;
            }
            break;
        }
        
    }
    
    //turn to the next page
    public void nextPage(){
        curPage = curPage + 1;
    }
    
    //turn to the previous page
    public void prevPage(){
        curPage = curPage - 1;
    }
    
    public void goToStart(){
        curPage = 1;
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
    
    public Page[] getText(){
        return text;
    }
    
    public void addBookmark(int page){
        bookmarks.add(page);
    }
}
