/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author asus
 */
public class connection {
    private static java.sql.Connection conn;
    
    public static java.sql.Connection getconnection(){
        if (conn == null){
            try{
                String url = "jdbc:mysql://localhost:3306/game";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Succesfull");
                
            }catch (Exception e){
                System.out.println("Error");
            }
        }
        return conn;
    }
    
    public static void main (String args[]){
        getconnection();
    }
}
