/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinggit;

/**
 *
 * @author tawashy
 */
public class Movie {
    
    private String title;
    private String author;
    private int nummberPages;

    public Movie(String title, String author, int nummberPages) {
        this.title = title;
        this.author = author;
        this.nummberPages = nummberPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNummberPages() {
        return nummberPages;
    }

    public void setNummberPages(int nummberPages) {
        this.nummberPages = nummberPages;
    }
    
    
    
    
}
