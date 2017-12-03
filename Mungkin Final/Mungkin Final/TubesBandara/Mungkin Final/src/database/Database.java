/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Badrus
 */
public class Database {
    private String server = "jdbc:mysql://localhost/pesawat";//nama database
    private String dbuser = "root";
    private String dbpasswd = "";
    private Statement statement = null;
    private Connection connection = null;
    private ResultSet rs = null;
    
    public Database() { //constructor untuk mengkoneksikan database
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void connect() { //method untuk mengkoneksikan database 
        try {
            connection = DriverManager.getConnection(server, dbuser, dbpasswd);
            statement = connection.createStatement();
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat koneksi");
        }
        //ini dah benar
    }
    
    public ResultSet getData(String str) { //string disini merupakan query
        try{
            rs = statement.executeQuery(str);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return rs;
    }
    
    public void query(String str) { //string disini merupakan query
        try{
            statement.executeUpdate(str);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
