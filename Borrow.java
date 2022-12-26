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
    private int BorrowId,bookID,ReaderId,BorrowNo;
    private String BorrowDate,BookReturnAppointmentDate,BookReturnDate,Status;

    public Borrow() {
    }

    public Borrow(int BorrowId, int bookID, int ReaderId, int BorrowNo, String BorrowDate, String BookReturnAppointmentDate, String BookReturnDate, String Status) {
        this.BorrowId = BorrowId;
        this.bookID = bookID;
        this.ReaderId = ReaderId;
        this.BorrowNo = BorrowNo;
        this.BorrowDate = BorrowDate;
        this.BookReturnAppointmentDate = BookReturnAppointmentDate;
        this.BookReturnDate = BookReturnDate;
        this.Status = Status;
    }

    public int getBorrowId() {
        return BorrowId;
    }

    public void setBorrowId(int BorrowId) {
        this.BorrowId = BorrowId;
    }

    public int getbookID() {
        return bookID;
    }

    public void setbookID(int bookID) {
        this.bookID = bookID;
    }

    public int getReaderId() {
        return ReaderId;
    }

    public void setReaderId(int ReaderId) {
        this.ReaderId = ReaderId;
    }

    public int getBorrowNo() {
        return BorrowNo;
    }

    public void setBorrowNo(int BorrowNo) {
        this.BorrowNo = BorrowNo;
    }

    public String getBorrowDate() {
        return BorrowDate;
    }

    public void setBorrowDate(String BorrowDate) {
        this.BorrowDate = BorrowDate;
    }

    public String getBookReturnAppointmentDate() {
        return BookReturnAppointmentDate;
    }

    public void setBookReturnAppointmentDate(String BookReturnAppointmentDate) {
        this.BookReturnAppointmentDate = BookReturnAppointmentDate;
    }

    public String getBookReturnDate() {
        return BookReturnDate;
    }

    public void setBookReturnDate(String BookReturnDate) {
        this.BookReturnDate = BookReturnDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    
    
}
