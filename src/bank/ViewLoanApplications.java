/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author chris
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewLoanApplications extends javax.swing.JFrame {

    /**
     * Creates new form ViewLoanApplications
     */
    PreparedStatement pst = null;
    ResultSet rs = null;
    DBConnection conn;
    DefaultTableModel model = new DefaultTableModel();
    DecimalFormat formatter = new DecimalFormat("#,###.00");
    int rowSelected = -1;
    String loan_Application_Id = "";
    boolean loanContractExists = false;

    public ViewLoanApplications() {
        initComponents();
        try {
            conn = new DBConnection();
        } catch (BackingStoreException ex) {
            Logger.getLogger(ViewLoanApplications.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        loan_applications = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        from_date = new com.toedter.calendar.JDateChooser();
        date_label = new javax.swing.JLabel();
        to_date = new com.toedter.calendar.JDateChooser();
        date_range_label = new javax.swing.JLabel();
        date_choice = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        to_label = new javax.swing.JLabel();
        specific_date = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        application_status = new javax.swing.JComboBox<>();
        go = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        create_loan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        loan_applications.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Application ID", "Account Number", "Customer Name", "Applied Amount", "Approved Amount", "Application Status", "Application Date"
            }
        ));
        jScrollPane1.setViewportView(loan_applications);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Loan Applications Filter"));

        from_date.setEnabled(false);

        date_label.setText("Application Date:");

        to_date.setEnabled(false);

        date_range_label.setText("Date Range:");

        date_choice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Specific Date", "Date Range" }));
        date_choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_choiceActionPerformed(evt);
            }
        });

        jLabel3.setText("Date Choice:");

        to_label.setText("To");
        to_label.setEnabled(false);

        specific_date.setEnabled(false);

        jLabel2.setText("Application Status:");

        application_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", "Rejected" }));

        go.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/Button-Next-icon.png"))); // NOI18N
        go.setText("GO");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(42, 42, 42)
                                .addComponent(date_choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(date_label)
                                .addGap(18, 18, 18)
                                .addComponent(specific_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(100, 100, 100))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(go, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(application_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(date_range_label)
                        .addGap(42, 42, 42)
                        .addComponent(from_date, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(to_label)
                        .addGap(36, 36, 36)
                        .addComponent(to_date, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(date_choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date_label, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(specific_date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date_range_label)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(to_date, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(from_date, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(to_label)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(application_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(go)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        edit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/Actions-document-edit-icon.png"))); // NOI18N
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/delete-icon.png"))); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        create_loan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        create_loan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/Create-New-icon.png"))); // NOI18N
        create_loan.setText("CREATE LOAN");
        create_loan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_loanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(create_loan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(edit)
                        .addGap(34, 34, 34)
                        .addComponent(delete)
                        .addGap(40, 40, 40)
                        .addComponent(create_loan))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 227, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filterDataBySpecificDate(String applicationStatus) {

        if (specific_date.getDate() == null) {
            JOptionPane.showMessageDialog(null, "The specific date is required for this filter!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            java.util.Date specificDate = specific_date.getDate();
            java.sql.Date specificDateSql = new java.sql.Date(specificDate.getTime());
            String applicatonDate = specificDateSql.toString();

            try {
                DefaultTableModel dtm = (DefaultTableModel) loan_applications.getModel();
                dtm.setRowCount(0);
                dtm.setColumnCount(0);
                String sql = "";
                if (applicationStatus.equalsIgnoreCase("Approved")) {

                    sql = "SELECT Loan_Application_Id, ci.Account_Number, loan_application_analysis.Customer_Name,Applied_Amount_LCY,Approved_Amount_LCY,Application_Status,Application_Date FROM `loan_application_analysis` INNER JOIN customer_information ci on ci.Customer_ID = loan_application_analysis.Customer_ID WHERE Application_Date LIKE ? AND Application_Status= 'A' ORDER BY Application_Date DESC";
                    pst = conn.connection.prepareStatement(sql);
                    pst.setString(1, applicatonDate);
                    rs = pst.executeQuery();
                    //int count = 0;
                    loan_applications.setModel(model);
                    model.addColumn("Application ID");
                    model.addColumn("Account Number");
                    model.addColumn("Customer Name");
                    model.addColumn("Applied Amount");
                    model.addColumn("Approved Amount");
                    model.addColumn("Application Status");
                    model.addColumn("Application Date");
                    while (rs.next()) {
                        model.addRow(new Object[]{rs.getString("Loan_Application_Id"), rs.getString("Account_Number"),
                            rs.getString("Customer_Name"), rs.getString("Applied_Amount_LCY"),
                            rs.getString("Approved_Amount_LCY"), rs.getString("Application_Status"),
                            rs.getString("Application_Date")});
                    }

                } else {
                    sql = "SELECT Loan_Application_Id, ci.Account_Number, loan_application_analysis.Customer_Name,Applied_Amount_LCY,Approved_Amount_LCY,Application_Status,Application_Date FROM `loan_application_analysis` INNER JOIN customer_information ci on ci.Customer_ID = loan_application_analysis.Customer_ID WHERE Application_Date LIKE ? AND Application_Status= 'R' ORDER BY Application_Date DESC";
                    pst = conn.connection.prepareStatement(sql);
                    pst.setString(1, applicatonDate);
                    rs = pst.executeQuery();
                    //int count = 0;
                    loan_applications.setModel(model);
                    model.addColumn("Application ID");
                    model.addColumn("Account Number");
                    model.addColumn("Customer Name");
                    model.addColumn("Applied Amount");
                    model.addColumn("Approved Amount");
                    model.addColumn("Application Status");
                    model.addColumn("Application Date");
                    while (rs.next()) {
                        model.addRow(new Object[]{rs.getString("Loan_Application_Id"), rs.getString("Account_Number"),
                            rs.getString("Customer_Name"), rs.getString("Applied_Amount_LCY"),
                            rs.getString("Approved_Amount_LCY"), rs.getString("Application_Status"),
                            rs.getString("Application_Date")});
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }

    private void filterDataByDateRange(String applicationStatus) {
        if (from_date.getDate() == null || to_date.getDate() == null) {
            JOptionPane.showMessageDialog(null, "The start and end dates are required for this filter!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            java.util.Date fromDate = from_date.getDate();
            java.util.Date toDate = to_date.getDate();

            java.sql.Date sqlFromDate = new java.sql.Date(fromDate.getTime());
            java.sql.Date sqlToDate = new java.sql.Date(toDate.getTime());
            String sql = null;
            try {
                DefaultTableModel dtm = (DefaultTableModel) loan_applications.getModel();
                dtm.setRowCount(0);
                dtm.setColumnCount(0);
                if (applicationStatus.equalsIgnoreCase("Approved")) {

                    sql = "SELECT Loan_Application_Id, ci.Account_Number, loan_application_analysis.Customer_Name,Applied_Amount_LCY,Approved_Amount_LCY,Application_Status,Application_Date FROM `loan_application_analysis` INNER JOIN customer_information ci on ci.Customer_ID = loan_application_analysis.Customer_ID WHERE Application_Date BETWEEN '" + sqlFromDate.toString() + "%' AND '" + sqlToDate.toString() + "%' AND Application_Status= 'A' ORDER BY Application_Date DESC";
                    pst = conn.connection.prepareStatement(sql);
                    rs = pst.executeQuery(sql);
                    //int count = 0;
                    loan_applications.setModel(model);
                    model.addColumn("Application ID");
                    model.addColumn("Account Number");
                    model.addColumn("Customer Name");
                    model.addColumn("Applied Amount");
                    model.addColumn("Approved Amount");
                    model.addColumn("Application Status");
                    model.addColumn("Application Date");
                    while (rs.next()) {
                        model.addRow(new Object[]{rs.getString("Loan_Application_Id"), rs.getString("Account_Number"),
                            rs.getString("Customer_Name"), rs.getString("Applied_Amount_LCY"),
                            rs.getString("Approved_Amount_LCY"), rs.getString("Application_Status"),
                            rs.getString("Application_Date")});
                    }

                } else {
                    sql = "SELECT Loan_Application_Id, ci.Account_Number, loan_application_analysis.Customer_Name,Applied_Amount_LCY,Approved_Amount_LCY,Application_Status,Application_Date FROM `loan_application_analysis` INNER JOIN customer_information ci on ci.Customer_ID = loan_application_analysis.Customer_ID WHERE Application_Date BETWEEN '" + sqlFromDate.toString() + "%' AND '" + sqlToDate.toString() + "%' AND Application_Status= 'R' ORDER BY Application_Date DESC";
                    pst = conn.connection.prepareStatement(sql);
                    rs = pst.executeQuery(sql);
                    //int count = 0;
                    loan_applications.setModel(model);
                    model.addColumn("Application ID");
                    model.addColumn("Account Number");
                    model.addColumn("Customer Name");
                    model.addColumn("Applied Amount");
                    model.addColumn("Approved Amount");
                    model.addColumn("Application Status");
                    model.addColumn("Application Date");
                    while (rs.next()) {
                        model.addRow(new Object[]{rs.getString("Loan_Application_Id"), rs.getString("Account_Number"),
                            rs.getString("Customer_Name"), rs.getString("Applied_Amount_LCY"),
                            rs.getString("Approved_Amount_LCY"), rs.getString("Application_Status"),
                            rs.getString("Application_Date")});
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }

    private void editLoanApplication(int rowSelected) {

        DefaultTableModel model = (DefaultTableModel) loan_applications.getModel();
        loan_Application_Id = model.getValueAt(rowSelected, 0).toString().trim();
        new EditLoanApplication(loan_Application_Id).setVisible(true);

    }

    private void deleteLoanApplication(int rowSelected) {

        DefaultTableModel model = (DefaultTableModel) loan_applications.getModel();
        loan_Application_Id = model.getValueAt(rowSelected, 0).toString().trim();

        try {
            String sql = "DELETE FROM `loan_application_analysis` WHERE Loan_Application_Id=?";
            pst = conn.connection.prepareStatement(sql);
            pst.setString(1, loan_Application_Id);
            int deleteLoanApp = pst.executeUpdate();
            if (deleteLoanApp > 0) {
                JOptionPane.showMessageDialog(null, "The loan application was deleted successfully!", "DELETE ACCOUNT", JOptionPane.CANCEL_OPTION);
                model.removeRow(rowSelected);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void doesLoanContractExist(int rowSelected) {
        DefaultTableModel model = (DefaultTableModel) loan_applications.getModel();
        loan_Application_Id = model.getValueAt(rowSelected, 0).toString().trim();
        System.out.println(loan_Application_Id);
        try {
            String sql = "SELECT `Loan_Application_Id` FROM `contract_information` WHERE Loan_Application_Id = ?";
            pst = conn.connection.prepareStatement(sql);
            pst.setString(1, loan_Application_Id);
            rs = pst.executeQuery();
            if (rs.next()) {
                loanContractExists = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        System.out.println(loanContractExists);
    }

    private void createContractLoan(int rowSelected) {
        DefaultTableModel model = (DefaultTableModel) loan_applications.getModel();
        loan_Application_Id = model.getValueAt(rowSelected, 0).toString().trim();
        doesLoanContractExist(rowSelected);
        if (!loanContractExists) {
            new CreateContractInformation(loan_Application_Id).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "The contract loan for this application ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void date_choiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_choiceActionPerformed
        String dateChoice = (String) date_choice.getSelectedItem();
        if (dateChoice.equals("Specific Date")) {
            date_label.setEnabled(true);
            specific_date.setEnabled(true);
            date_range_label.setEnabled(false);
            from_date.setEnabled(false);
            to_date.setEnabled(false);
            to_label.setEnabled(false);
        } else if (dateChoice.equals("Date Range")) {
            date_label.setEnabled(false);
            specific_date.setEnabled(false);
            date_range_label.setEnabled(true);
            from_date.setEnabled(true);
            to_date.setEnabled(true);
            to_label.setEnabled(true);
        }
    }//GEN-LAST:event_date_choiceActionPerformed

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        // TODO add your handling code here:
        // String accountNumber = account_number.getText();
        String applicationStatus = (String) application_status.getSelectedItem();
        String dateChoice = (String) date_choice.getSelectedItem();
        //java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());

        if (dateChoice.equalsIgnoreCase("Specific Date")) {
            try {
                filterDataBySpecificDate(applicationStatus);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (dateChoice.equalsIgnoreCase("Date Range")) {
            //populateTransactions(accountNumber);
            try {
                filterDataByDateRange(applicationStatus);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please pick the date choice Filter!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_goActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) loan_applications.getModel();
        rowSelected = loan_applications.getSelectedRow();
        if (rowSelected == -1) {
            JOptionPane.showMessageDialog(null, "No row was selected!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            editLoanApplication(rowSelected);
        }
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) loan_applications.getModel();
        rowSelected = loan_applications.getSelectedRow();
        if (rowSelected == -1) {
            JOptionPane.showMessageDialog(null, "No row was selected!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete this customer?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                deleteLoanApplication(rowSelected);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void create_loanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_loanActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) loan_applications.getModel();
        rowSelected = loan_applications.getSelectedRow();
        if (rowSelected == -1) {
            JOptionPane.showMessageDialog(null, "No row was selected!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
                createContractLoan(rowSelected);   
        }
    }//GEN-LAST:event_create_loanActionPerformed

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
            java.util.logging.Logger.getLogger(ViewLoanApplications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLoanApplications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLoanApplications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLoanApplications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLoanApplications().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> application_status;
    private javax.swing.JButton create_loan;
    private javax.swing.JComboBox<String> date_choice;
    private javax.swing.JLabel date_label;
    private javax.swing.JLabel date_range_label;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private com.toedter.calendar.JDateChooser from_date;
    private javax.swing.JButton go;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable loan_applications;
    private com.toedter.calendar.JDateChooser specific_date;
    private com.toedter.calendar.JDateChooser to_date;
    private javax.swing.JLabel to_label;
    // End of variables declaration//GEN-END:variables
}
