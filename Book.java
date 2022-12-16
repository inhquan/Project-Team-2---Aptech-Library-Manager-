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
    private int bookID,pageNo,price,publishYear;
    private String bookName,language,amount,type,author,publisher;

    public Book() {
    }

    public Book(int bookID, String bookName, int pageNo, String language, int price, String amount, int publishYear, String type, String author, String publisher) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.pageNo = pageNo;
        this.language = language;
        this.price = price;
        this.amount = amount;
        this.publishYear = publishYear;
        this.type = type;
        this.author = author;
        this.publisher = publisher;
    }

    public Book(String bookName, int pageNo, String language, int price, String amount, int publishYear, String type, String author, String publisher) {
        this.bookName = bookName;
        this.pageNo = pageNo;
        this.language = language;
        this.price = price;
        this.amount = amount;
        this.publishYear = publishYear;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
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