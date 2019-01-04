/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import com.placeholder.PlaceHolder;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class EditLoanApplication extends javax.swing.JFrame {

    /**
     * Creates new form EditLoanApplication
     */
    PreparedStatement pst = null;
    ResultSet rs = null;
    DBConnection conn;
    PlaceHolder holder;

    public EditLoanApplication(String loanApplicationId) {
        initComponents();
        try {
            conn = new DBConnection();
        } catch (BackingStoreException ex) {
            Logger.getLogger(EditLoanApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        getLoanApplicationFields(loanApplicationId);

    }

    private EditLoanApplication() {
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

        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        business_date = new com.toedter.calendar.JDateChooser();
        applied_amount = new javax.swing.JTextField();
        approved_amount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        loan_purpose = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        loan_application_date = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        loan_application_id = new javax.swing.JFormattedTextField();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Application Details"));

        jLabel9.setText("Loan Application Date (*):");

        jLabel5.setText("Loan Purpose (*):");

        jLabel7.setText("Approved Amount (*):");

        loan_purpose.setColumns(20);
        loan_purpose.setRows(5);
        jScrollPane5.setViewportView(loan_purpose);

        jLabel6.setText("Applied Amount (*):");

        jLabel18.setText("Business Date (*):");

        jLabel16.setText("Loan Application ID (*):");

        loan_application_id.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(loan_application_date, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(applied_amount)
                                    .addComponent(approved_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel16))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loan_application_id, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(business_date, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(228, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 81, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(loan_application_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(business_date, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(applied_amount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(approved_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(loan_application_date, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(549, 549, 549))
        );

        jScrollPane4.setViewportView(jPanel2);

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/Save-icon 2.png"))); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(save)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateLoanApplication(String applicationID) {
        if (business_date.getDate() == null) {
            JOptionPane.showMessageDialog(null, "The Business date is required", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (loan_purpose.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The loan purpose is required", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (applied_amount.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The applied amount is required", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (approved_amount.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The approved amount is required", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (approved_amount.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The approved amount is required", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (loan_application_date.getDate() == null) {
            JOptionPane.showMessageDialog(null, "The application date is required", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {

                java.util.Date businessDate = business_date.getDate();
                java.util.Date applicationDate = loan_application_date.getDate();

                java.sql.Date sqlBusinessDate = new java.sql.Date(businessDate.getTime());
                java.sql.Date sqlApplicationDate = new java.sql.Date(applicationDate.getTime());

                String sql = "UPDATE `loan_application_analysis` SET `Business_Date` = ?,"
                        + "`Loan_Purpose` = ?, "
                        + "`Application_Date`= ?, "
                        + "`Applied_Amount_LCY`= ?, "
                        + "`Approved_Amount_LCY`= ?, `Date_Last_Modified` = NOW() WHERE Loan_Application_Id= ?";
                pst = conn.connection.prepareStatement(sql);
                pst.setString(1, sqlBusinessDate.toString());
                pst.setString(2, loan_purpose.getText());
                pst.setString(3, sqlApplicationDate.toString());
                pst.setFloat(4, Float.parseFloat(applied_amount.getText()));
                pst.setFloat(5, Float.parseFloat(approved_amount.getText()));
                pst.setString(6, loan_application_id.getText());
                int update = pst.executeUpdate();
                if (update > 0) {
                    JOptionPane.showMessageDialog(null, "The loan Amortization Schedule was updated!");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to update this account?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            updateLoanApplication(loan_application_id.getText());
        }
    }//GEN-LAST:event_saveActionPerformed

    private void getLoanApplicationFields(String loanApplicationId) {
        try {
            String sql = "SELECT `Loan_Application_Id`, "
                    + "`Business_Date`, "
                    + " `Loan_Purpose`,"
                    + " `Loan_Utilization_Location`,"
                    + " `Application_Date`, `Application_Status`, "
                    + " `Applied_Amount_LCY`, "
                    + "`Approved_Amount_LCY`  FROM `loan_application_analysis` where Loan_Application_Id = ?";
            pst = conn.connection.prepareStatement(sql);
            pst.setString(1, loanApplicationId);
            rs = pst.executeQuery();
            if (rs.next()) {
                loan_application_id.setText(rs.getString("Loan_Application_Id"));
                business_date.setDate(rs.getDate("Business_Date"));
                loan_application_date.setDate(rs.getDate("Application_Date"));
                loan_purpose.setText(rs.getString("Loan_Purpose"));
                applied_amount.setText(rs.getString("Applied_Amount_LCY"));
                approved_amount.setText(rs.getString("Approved_Amount_LCY"));
             
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(EditLoanApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditLoanApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditLoanApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditLoanApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditLoanApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField applied_amount;
    private javax.swing.JTextField approved_amount;
    private com.toedter.calendar.JDateChooser business_date;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private com.toedter.calendar.JDateChooser loan_application_date;
    private javax.swing.JFormattedTextField loan_application_id;
    private javax.swing.JTextArea loan_purpose;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables

}
