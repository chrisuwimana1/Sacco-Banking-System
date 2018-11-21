/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




package bank;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author chris
 */
public class DBConnection {
    
     public Connection connection = null;
     
     public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sacco","root","");
            System.out.println("Connection DB: success");
        }catch (ClassNotFoundException | SQLException ex) {
              JOptionPane.showMessageDialog(null, ex);
        }
     }
    
}
    

