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
    private int BorrowId,BookId,ReaderId,BorrowNo;
    private String BorrowDate,BookReturnAppointmentDate,BookReturnDate,Status;

    public Borrow() {
    }

    public Borrow(int BorrowId, int BookId, int ReaderId, int BorrowNo, String BorrowDate, String BookReturnAppointmentDate, String BookReturnDate, String Status) {
        this.BorrowId = BorrowId;
        this.BookId = BookId;
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

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int BookId) {
        this.BookId = BookId;
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
