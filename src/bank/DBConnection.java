/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




package bank;
import java.sql.*;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.*;

/**
 *
 * @author chris
 */
public class DBConnection {
    
     public Connection connection = null;
     Preferences prefs = Preferences.userNodeForPackage(DBConnection.class);
     
     public DBConnection() throws BackingStoreException {
         System.out.println("Server name:"+prefs.get("host_name", ""));
         System.out.println("Database Name:"+prefs.get("db_name", ""));
         System.out.println("Database Username:"+prefs.get("db_username", ""));
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://"+prefs.get("host_name", "")+"/"+prefs.get("db_name", ""),prefs.get("db_username", ""),"");
            System.out.println("Connection DB: success");
        }catch (ClassNotFoundException | SQLException ex) {
              JOptionPane.showMessageDialog(null, ex);
        }
     }
    
}
    

