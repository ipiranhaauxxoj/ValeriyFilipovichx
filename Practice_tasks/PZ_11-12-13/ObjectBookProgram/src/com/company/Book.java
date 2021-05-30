package com.company;
import java.lang.*;
public class Book {
    private String title;
    private String author;
    private int pagesNumber;
    public Book(String title, String author,
                int pagesNumber) {
        super();
        this.title = title;
        this.author = author;
        this.pagesNumber = pagesNumber;
    }
    public static void main(String[] args) {
        Book book = new Book("Java2","Sun",1000);
        System.out.println("object is: " + book);
    }
    public String toString(){
        return "Book: " + title + " ( " + author +
                ", " + pagesNumber + " pages )";
    }
}
