package com.fauzan.mybooklist;

public class BookData {

    private String bookName;
    private String bookWriter;
    private String bookDescription;
    private String bookPages;
    private String bookPublished;
    private int bookImage;

    public BookData(String bookName, String bookWriter, String bookDescription, String bookPages, String bookPublished, int bookImage) {
        this.bookName = bookName;
        this.bookWriter = bookWriter;
        this.bookImage = bookImage;
        this.bookDescription = bookDescription;
        this.bookPages = bookPages;
        this.bookPublished = bookPublished;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookWriter() {
        return bookWriter;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public String getBookPages(){
        return bookPages;
    }

    public String getBookPublished(){
        return bookPublished;
    }

    public int getBookImage() {
        return bookImage;
    }
}
