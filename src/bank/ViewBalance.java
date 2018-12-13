/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chris
 */
public class ViewBalance extends javax.swing.JFrame {

    /**
     * Creates new form ViewBalance
     */
    String account_number;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DBConnection conn;
    PleaseWait pl = new PleaseWait();
    Preferences prefs = Preferences.userNodeForPackage(Teller_Dashboard.class);
    DefaultTableModel model = new DefaultTableModel();
    String customer_name;
    DecimalFormat formatter = new DecimalFormat("#,###.00");

    public ViewBalance(String accountNumber) {
        initComponents();
        conn = new DBConnection();
        account_number = accountNumber;
        MyBalance(account_number);
        //customer_name = prefs.get("customer_name", "");  
    }

    private ViewBalance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listbalance = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        deposit = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        withdraw = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        print = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listbalance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Account No", "Customer Name", "Balance", "Last Update"
            }
        ));
        jScrollPane1.setViewportView(listbalance);
        if (listbalance.getColumnModel().getColumnCount() > 0) {
            listbalance.getColumnModel().getColumn(0).setResizable(false);
            listbalance.getColumnModel().getColumn(0).setPreferredWidth(20);
            listbalance.getColumnModel().getColumn(2).setResizable(false);
            listbalance.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        jToolBar1.setRollover(true);

        deposit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/wizard-icon.png"))); // NOI18N
        deposit.setText("DEPOSIT");
        deposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositMouseClicked(evt);
            }
        });
        jToolBar1.add(deposit);
        jToolBar1.add(jSeparator1);

        withdraw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        withdraw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/web-icon.png"))); // NOI18N
        withdraw.setText("WITHDRAW");
        withdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawMouseClicked(evt);
            }
        });
        jToolBar1.add(withdraw);
        jToolBar1.add(jSeparator2);

        print.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/print-icon.png"))); // NOI18N
        print.setText("PRINT");
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        jToolBar1.add(print);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String formatFloat(String s) {
        double stringToDouble = Float.parseFloat(s);
        return String.valueOf(formatter.format(stringToDouble));
    }

    private void MyBalance(String accountNumber) {
        String sql = "SELECT c.Customer_Name, balance.`Account_Number`,`current_balance`, `date_changed` FROM `balance` INNER JOIN customer_information c ON c.Account_Number = balance.Account_Number WHERE balance.Account_Number = ?";

        //clear all rows
        DefaultTableModel dtm = (DefaultTableModel) listbalance.getModel();
        dtm.setRowCount(0);
        dtm.setColumnCount(0);
        
        System.out.println("Account Number "+ accountNumber);
        try {
            pst = conn.connection.prepareStatement(sql);
            pst.setString(1, accountNumber);
            rs = pst.executeQuery();
            //int count = 0;
            listbalance.setModel(model);
            model.addColumn("Account No");
            model.addColumn("Customer Name");
            model.addColumn("Balance");
            model.addColumn("Last Update");

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("Account_Number"), rs.getString("Customer_Name"), 
                    formatFloat(rs.getString("current_balance")), rs.getString("date_changed")});
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void depositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositMouseClicked
        // TODO add your handling code here:
        new Deposit().setVisible(true);
    }//GEN-LAST:event_depositMouseClicked

    private void withdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawMouseClicked
        // TODO add your handling code here:
        new Withdraw().setVisible(true);
    }//GEN-LAST:event_withdrawMouseClicked

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to print this document?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                String fileName = "Sacco/";
                String directoryName = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "/Documents/".concat(fileName);
                File dir = new File(directoryName);
                if (!dir.exists()) {
                    dir.mkdirs();
                }

                ExcelExporter exp = new ExcelExporter();
                exp.exportTable(listbalance, new File(directoryName + account_number + "_balance.xls"));
            } catch (IOException ex) {
                Logger.getLogger(ViewBalance.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_printMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBalance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deposit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable listbalance;
    private javax.swing.JLabel print;
    private javax.swing.JLabel withdraw;
    // End of variables declaration//GEN-END:variables
}
