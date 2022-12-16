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
            String sql ="select * from book";
            statement = connection.createStatement();
            
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            
            while(resultSet.next()){
                Borrow borrow= new Borrow(
                        resultSet.getInt("BorrowId"),
                        resultSet.getInt("BookId"),
                        resultSet.getInt("ReaderId"), 
                        resultSet.getInt("BorrowNo"),
                        resultSet.getString("BorrowDate"),
                        resultSet.getString("BookReturnAppointmentDate"),
                        resultSet.getString("BookReturnDate"),
                        resultSet.getString("Status")  
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
            String sql ="insert into borrow(BorrowId,BookId,ReaderId,BorrowNo,BorrowDate,BookReturnAppointmentDate,BookReturnDat,Status) value(?,?,?,?,?,?,?,?)";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1,borrow.getBorrowId());
            statement.setInt(2,borrow.getBookId());
            statement.setInt(3,borrow.getReaderId());
            statement.setInt(4,borrow.getBorrowNo());
            statement.setString(5,borrow.getBorrowDate());
            statement.setString(6,borrow.getBookReturnAppointmentDate());
            statement.setString(7,borrow.getBookReturnDate());
            statement.setString(8,borrow.getStatus());
            
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
    
    public static void update(Borrow borrow){
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lấy tất cả danh sách
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_c2109i", "root", "");
            //query
            String sql ="update book set BorrowID=?,BookId=?,ReaderId=?,BorrowNo=?,BorrowDate=?,BookReturnAppointmentDate=?,BookReturnDate=?,Status=?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1,borrow.getBorrowId());
            statement.setInt(2,borrow.getBookId());
            statement.setInt(3,borrow.getReaderId());
            statement.setInt(4,borrow.getBorrowNo());
            statement.setString(5,borrow.getBorrowDate());
            statement.setString(6,borrow.getBookReturnAppointmentDate());
            statement.setString(7,borrow.getBookReturnDate());
            statement.setString(8,borrow.getStatus());
            
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
    
        public static void delete(int id){
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lấy tất cả danh sách
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_c2109i", "root", "");
            //query
            String sql ="delete from book where id=?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1,id);
            
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
