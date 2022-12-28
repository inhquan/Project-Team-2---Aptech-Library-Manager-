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
public class ReaderModify {
    
    static public List<Reader> findAll() {
        List<Reader> readerList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            //lấy tất cả danh sách
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_c2109i", "root", "");
            //query
            String sql ="select * from reader";
            statement = connection.createStatement();
            
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            
            while(resultSet.next()){
                Reader reader= new Reader(
                        resultSet.getInt("readerid"),
                        resultSet.getString("name"), 
                        resultSet.getString("identityCard"),
                        resultSet.getString("phoneNo"),
                        resultSet.getString("cardIssueDate"),
                        resultSet.getString("job")
                          
                );
                readerList.add(reader);
                        
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReaderModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ReaderModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ReaderModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
        return readerList;
    }
    
    public static void insert(Reader reader){
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lấy tất cả danh sách
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_c2109i", "root", "");
            //query
            String sql ="insert into reader(readerid,surname,identityCard,phoneNo,cardIssueDate,job) value(?,?,?,?,?,?)";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1,reader.getReaderId());
            statement.setString(2,reader.getname());
            statement.setString(3,reader.getIdentityCard());
            statement.setString(4,reader.getPhoneNo());
            statement.setString(5,reader.getCardIssueDate());
            statement.setString(6,reader.getJob());
            
            
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(ReaderModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ReaderModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ReaderModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
    }
    
    public static void update(Reader reader){
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lấy tất cả danh sách
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_c2109i", "root", "");
            //query
            String sql ="update book set readerId=?,surName=?,=?,identityCard=?,phoneNo=?,cardIssueDate=?,job=?,";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1,reader.getReaderId());
            statement.setString(2,reader.getname());
            statement.setString(3,reader.getIdentityCard());
            statement.setString(4,reader.getPhoneNo());
            statement.setString(5,reader.getCardIssueDate());
            statement.setString(6,reader.getJob());
            
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(ReaderModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ReaderModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ReaderModify.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ReaderModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ReaderModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ReaderModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
    }

    static List<Reader> findByReaderId(String input) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
