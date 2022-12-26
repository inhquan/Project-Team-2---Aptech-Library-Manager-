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
public class Borrow {
    private int borrowId,bookID,readerId,borrowNo;
    private String borrowDate,bookReturnAppointmentDate,bookReturnDate;
    private String status;

    public Borrow() {
        
    }

    public Borrow(int borrowId, int bookID, int readerId, int borrowNo, String borrowDate, String bookReturnAppointmentDate, String bookReturnDate, String status) {
        this.borrowId = borrowId;
        this.bookID = bookID;
        this.readerId = readerId;
        this.borrowNo = borrowNo;
        this.borrowDate = borrowDate;
        this.bookReturnAppointmentDate = bookReturnAppointmentDate;
        this.bookReturnDate = bookReturnDate;
        this.status = status;
    }

    public int getborrowId() {
        return borrowId;
    }

    public void setborrowId(int borrowId) {
        this.borrowId = borrowId;
    }

    public int getbookID() {
        return bookID;
    }

    public void setbookID(int bookID) {
        this.bookID = bookID;
    }

    public int getreaderId() {
        return readerId;
    }

    public void setreaderId(int readerId) {
        this.readerId = readerId;
    }

    public int getborrowNo() {
        return borrowNo;
    }

    public void setborrowNo(int borrowNo) {
        this.borrowNo = borrowNo;
    }

    public String getborrowDate() {
        return borrowDate;
    }

    public void setborrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getbookReturnAppointmentDate() {
        return bookReturnAppointmentDate;
    }

    public void setbookReturnAppointmentDate(String bookReturnAppointmentDate) {
        this.bookReturnAppointmentDate = bookReturnAppointmentDate;
    }

    public String getbookReturnDate() {
        return bookReturnDate;
    }

    public void setbookReturnDate(String bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    
    
    
}
