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

    
    
}
