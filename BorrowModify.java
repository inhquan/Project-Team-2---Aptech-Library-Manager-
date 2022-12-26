/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class BorrowModify {
    
    static public List<Borrow> findAll() {
        List<Borrow> borrowList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            //lấy tất cả danh sách
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_c2109i", "root", "");
            //query
            String sql = "select * from borrow";
           
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
                Borrow borrow= new Borrow(
                        resultSet.getInt("borrowId"),
                        resultSet.getInt("bookID"),
                        resultSet.getInt("readerId"), 
                        resultSet.getInt("borrowNo"), 
                        resultSet.getString("borrowDate"),
                        resultSet.getString("bookReturnAppointmentDate"),
                        resultSet.getString("bookReturnDate"),
                        resultSet.getString("status")  
                );
                borrowList.add(borrow);
                        
            }
        } catch (SQLException ex) {
            Logger.getLogger(BorrowModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BorrowModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BorrowModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
        return borrowList;
    }
    
    public static void insert(Borrow borrow){
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lấy tất cả danh sách
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_c2109i", "root", "");
            //query
            String sql ="insert into borrow(borrowId,bookID,readerId,borrowNo,borrowDate,bookReturnAppointmentDate,bookReturnDat,status) value(?,?,?,?,?,?,?,?)";
            statement = connection.prepareCall(sql);
            statement.setInt(1,borrow.getborrowId());
            statement.setInt(2,borrow.getbookID());
            statement.setInt(3,borrow.getreaderId());
            statement.setInt(4,borrow.getborrowNo());
            statement.setString(5,borrow.getborrowDate());
            statement.setString(6,borrow.getbookReturnAppointmentDate());
            statement.setString(7,borrow.getbookReturnDate());
            statement.setString(8,borrow.getstatus());
            
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(BorrowModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BorrowModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BorrowModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
    }
    

    

}
