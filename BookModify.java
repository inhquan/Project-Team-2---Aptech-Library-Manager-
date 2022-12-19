/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Result;
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
 *insert update delete findAll
 * @author student
 */
public class BookModify {
    
    static public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
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
                Book book = new Book(
                        resultSet.getInt("bookID"),
                        resultSet.getString("bookName"),
                        resultSet.getInt("pageNo"), 
                        resultSet.getString("language"),
                        resultSet.getInt("price"),
                        resultSet.getString("amount"),
                        resultSet.getInt("publishYear"),
                        resultSet.getString("type"),
                        resultSet.getString("author"),
                        resultSet.getString("publisher")
                );
                bookList.add(book);
                        
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
        return bookList;
    }
    
    public static void insert(Book book){
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lấy tất cả danh sách
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_c2109i", "root", "");
            //query
            String sql ="insert into book(bookID,bookName,pageNo,language,price,amount,publishYear,type,author,publisher) value(?,?,?,?,?,?,?,?,?,?)";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1,book.getBookID());
            statement.setString(2,book.getBookName());
            statement.setInt(3,book.getPageNo());
            statement.setString(4,book.getLanguage());
            statement.setInt(5,book.getPrice());
            statement.setString(6,book.getAmount());
            statement.setInt(7,book.getPublishYear());
            statement.setString(8,book.getType());
            statement.setString(9,book.getAuthor());
            statement.setString(10,book.getPublisher());
            
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
    }
    
    public static void update(Book book){
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lấy tất cả danh sách
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_c2109i", "root", "");
            //query
            String sql ="update book set bookID=?,bookName=?,pageNo=?,language=?,price=?,amount=?,publishYear=?,type=?,author=?,publisher=?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1,book.getBookID());
            statement.setString(2,book.getBookName());
            statement.setInt(3,book.getPageNo());
            statement.setString(4,book.getLanguage());
            statement.setInt(5,book.getPrice());
            statement.setString(6,book.getAmount());
            statement.setInt(7,book.getPublishYear());
            statement.setString(8,book.getType());
            statement.setString(9,book.getAuthor());
            statement.setString(10,book.getPublisher());
            
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
    }
}
