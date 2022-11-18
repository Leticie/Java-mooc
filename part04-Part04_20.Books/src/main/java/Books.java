/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leticie
 */
public class Books {
    private String title;
    private int pages;
    private int year;
    
    public Books (String userTitle, int userPages, int userYear) {
        this.title = userTitle;
        this.pages = userPages;
        this.year = userYear;
    }
    
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
    
    public String getName() {
        return this.title;
    }
    
}
