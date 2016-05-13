/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Author: Wilson Hayward
 */
package ebook.reader.display;
public class Page {
    private int pageNumber;
    private String pageText;
    
    public Page(String pageT, int pageN){
        this.pageNumber = pageN;
        this.pageText = pageT;
    }
    
    public int getPageNumber(){
        return pageNumber;
    }
    
    public String getPageText(){
        return pageText;
    }
    
}
