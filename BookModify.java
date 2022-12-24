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
 *insert update delete findAll
 * @author student
 */
public class BookModify {
    
     public static List<Book> findAll() {
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
                        resultSet.getString("bookID"),
                        resultSet.getString("bookName"),
                        resultSet.getString("pageNo"),
                        resultSet.getString("price"),
                        resultSet.getString("amount"),
                        resultSet.getString("publishYear"),
                        resultSet.getString("language"),
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
            String sql ="insert into book(bookName,pageNo,price,amount,publishYear,language,type,author,publisher) values(?,?,?,?,?,?,?,?,?)";
            statement = connection.prepareCall(sql);
            
            
            statement.setString(1,book.getBookName());
            statement.setString(2,book.getPageNo());
            statement.setString(3,book.getPrice());
            statement.setString(4,book.getAmount());
            statement.setString(5,book.getPublishYear());
            statement.setString(6,book.getLanguage());
            statement.setString(7,book.getType());
            statement.setString(8,book.getAuthor());
            statement.setString(9,book.getPublisher());
            
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
            String sql ="update book set bookName=?,pageNo=?,language=?,price=?,amount=?,publishYear=?,type=?,author=?,publisher=? where bookID=?";
            statement = connection.prepareStatement(sql);
            
            statement.setString(1,book.getBookName());
            statement.setString(2,book.getPageNo());
            statement.setString(3,book.getPrice());
            statement.setString(4,book.getAmount());
            statement.setString(5,book.getPublishYear());
            statement.setString(6,book.getLanguage());
            statement.setString(7,book.getType());
            statement.setString(8,book.getAuthor());
            statement.setString(9,book.getPublisher());
            statement.setString(10,book.getBookID());
            
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
    
        public static void delete(String bookID){
            Connection connection = null;
            PreparedStatement statement = null;
         try {
             //lays danh sách
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_c2109i", "root", "");             
             
             String sql="delete from book where bookID =?";
             
             statement = connection.prepareCall(sql);
            
             statement.setString(1,bookID);
            
             statement.execute();
             
         } catch (SQLException ex) {
             Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
         
        }finally{
            if(statement !=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }   
        
}
        public static List<Book> findByBookName(String bookName){
            List<Book> bookList = new ArrayList<>();
            Connection connection = null;
            PreparedStatement statement = null;
            
         try {             
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_c2109i", "root", "");
            String sql ="select * from book where bookName like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+bookName+"%");
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                Book book = new Book(
                        resultSet.getString("bookID"),
                        resultSet.getString("bookName"),
                        resultSet.getString("pageNo"),
                        resultSet.getString("price"),
                        resultSet.getString("amount"),
                        resultSet.getString("publishYear"),
                        resultSet.getString("language"),
                        resultSet.getString("type"),
                        resultSet.getString("author"),
                        resultSet.getString("publisher")
                );
                bookList.add(book);
            }
            
         } catch (SQLException ex) {
             Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
            if(statement !=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        }
        return bookList;
   }
        
}
