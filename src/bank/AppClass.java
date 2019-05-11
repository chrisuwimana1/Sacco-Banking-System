/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author limitlessapps
 */
public class AppClass {
    float balance = 0;
    public float getTellerTotalCurrentBalance(DBConnection conn, PreparedStatement pst,ResultSet rs, String teller, String from_transaction_date, String to_transaction_date) {
        if (!to_transaction_date.isEmpty()) {
            String sql = "SELECT `teller`, `currentBalance` FROM `teller_balance` WHERE addedDate BETWEEN '" + from_transaction_date + "%' AND '" + to_transaction_date + "%' and teller=?";
        
            try {
                pst = conn.connection.prepareStatement(sql);
                pst.setString(1, teller);
                rs = pst.executeQuery();
                while (rs.next()) {
                    balance += rs.getFloat("currentBalance");
                }

            } catch (SQLException e1) {
                JOptionPane.showMessageDialog(null, e1);
            }
            System.err.println(balance);
            return balance;
        }else{
            String sql = "SELECT `teller`, `currentBalance` FROM `teller_balance` WHERE addedDate =? and teller=?";
        
            try {
                pst = conn.connection.prepareStatement(sql);
                pst.setString(1, from_transaction_date);
                pst.setString(2, teller);
                rs = pst.executeQuery();
                if (rs.next()) {
                    balance += rs.getFloat("currentBalance");
                }

            } catch (SQLException e1) {
                JOptionPane.showMessageDialog(null, e1);
            }
            return balance;
        }
    }
    public float getTellerTotalStartingBalance(DBConnection conn, PreparedStatement pst,ResultSet rs, String teller, String from_transaction_date, String to_transaction_date) {
        if (!to_transaction_date.isEmpty()) {
            String sql = "SELECT `teller`, `StartingBalance` FROM `teller_balance` WHERE addedDate BETWEEN '" + from_transaction_date + "%' AND '" + to_transaction_date + "%' and teller=?";
        
            try {
                pst = conn.connection.prepareStatement(sql);
                pst.setString(1, teller);
                rs = pst.executeQuery();
                while (rs.next()) {
                    balance += rs.getFloat("StartingBalance");
                }

            } catch (SQLException e1) {
                JOptionPane.showMessageDialog(null, e1);
            }
            System.err.println(balance);
            return balance;
        }else{
            String sql = "SELECT `teller`, `currentBalance` FROM `teller_balance` WHERE addedDate =? and teller=?";
        
            try {
                pst = conn.connection.prepareStatement(sql);
                pst.setString(1, from_transaction_date);
                pst.setString(2, teller);
                rs = pst.executeQuery();
                if (rs.next()) {
                    balance += rs.getFloat("currentBalance");
                }

            } catch (SQLException e1) {
                JOptionPane.showMessageDialog(null, e1);
            }
            return balance;
        }
    }
    public float getTellerStartingBalance(DBConnection conn, PreparedStatement pst,ResultSet rs, String teller, String transaction_date) {
        String sql = "SELECT `teller`, `StartingBalance` FROM `teller_balance` WHERE addedDate=? and teller=?";
        balance = 0;
        try {
            pst = conn.connection.prepareStatement(sql);
            pst.setString(1, transaction_date);
            pst.setString(2, teller);
            rs = pst.executeQuery();
            if (rs.next()) {
                balance = rs.getFloat("StartingBalance");
            }
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null, e1);
        }
        return balance;
    }
    public float getTellerBalance(DBConnection conn, PreparedStatement pst,ResultSet rs, String teller, String transaction_date) {
        String sql = "SELECT `teller`, `StartingBalance`, `currentBalance`, `addedDate` FROM `teller_balance` WHERE addedDate=? and teller=?";
        balance = 0;
        try {
            pst = conn.connection.prepareStatement(sql);
            pst.setString(1, transaction_date);
            pst.setString(2, teller);
            rs = pst.executeQuery();
            if (rs.next()) {
                balance = rs.getFloat("currentBalance");
            }
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null, e1);
        }
        return balance;
    }
    public void modifyTellerBalance(DBConnection conn, PreparedStatement pst,ResultSet rs, String teller, float transaction_amount, String transaction_date, String transaction_type){
        
        String check_exist = "SELECT `teller`, `StartingBalance`, `currentBalance`, `addedDate` FROM `teller_balance` WHERE addedDate=? and teller=?";
        try {
            pst = conn.connection.prepareStatement(check_exist);
            pst.setString(1, transaction_date);
            pst.setString(2, teller);
            rs = pst.executeQuery();
            if (rs.next()) {
                String sql = "UPDATE `teller_balance` SET `currentBalance`=? WHERE addedDate=? and teller=?";
                float old_c_b=rs.getFloat("currentBalance");
                if (transaction_type.equalsIgnoreCase("Withdraw")) {
                    float new_current_balance = 0;
                    if (old_c_b >= transaction_amount) {
                        new_current_balance = old_c_b - transaction_amount;
                    }
                   
                    try {
                        pst = conn.connection.prepareStatement(sql);

                        pst.setFloat(1, new_current_balance);
                        pst.setString(2, transaction_date);
                        pst.setString(3, teller);

                        pst.execute();
                        
                    }catch (HeadlessException | SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }else if (transaction_type.equalsIgnoreCase("Deposit")) {
                    float new_current_balance = old_c_b + transaction_amount;
                    try {
                        pst = conn.connection.prepareStatement(sql);

                        pst.setFloat(1, new_current_balance);
                        pst.setString(2, transaction_date);
                        pst.setString(3, teller);
                        pst.execute();
                        
                    }catch (HeadlessException | SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null, e1);
        }
    }
}
