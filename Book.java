/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author student
 */
public class Book {
    private int bookID;
    private String bookName;
    private int pageNo,price,amount,publishYear;
    private String language,type,author,publisher;

    public Book() {
    }

    public Book(int bookID, String bookName, int pageNo, int price, int amount, int publishYear, String language, String type, String author, String publisher) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.pageNo = pageNo;
        this.price = price;
        this.amount = amount;
        this.publishYear = publishYear;
        this.language = language;
        this.type = type;
        this.author = author;
        this.publisher = publisher;
    }

    public Book(String bookName, int pageNo, int price, int amount, int publishYear, String language, String type, String author, String publisher) {
        this.bookName = bookName;
        this.pageNo = pageNo;
        this.price = price;
        this.amount = amount;
        this.publishYear = publishYear;
        this.language = language;
        this.type = type;
        this.author = author;
        this.publisher = publisher;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    


    

    
}