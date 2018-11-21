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
import com.placeholder.PlaceHolder;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;



public class LoanRecoveryDashboard extends javax.swing.JFrame {

    /**
     * Creates new form LoanRecoveryDashboard
     */
    PlaceHolder holder;
    PleaseWait pl = new PleaseWait();
    Preferences prefs = Preferences.userNodeForPackage(LoanRecoveryDashboard.class);
    PreparedStatement pst = null;
    ResultSet rs = null;
    DBConnection conn;

    public LoanRecoveryDashboard() {
        initComponents();
        conn = new DBConnection();
        //myinfo.setText(prefs.get("title", "") + ": " + prefs.get("firstname", "") + " " + prefs.get("lastname", "").charAt(0) + ".");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        new_loan_application = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        due_today = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        myinfo = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        exit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        loan_amortization = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        contract_id = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        search_field_choice = new javax.swing.JComboBox<>();
        search_contract_id = new javax.swing.JButton();
        search_field = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        initial_loan_amount = new javax.swing.JTextField();
        interest_amount_paid = new javax.swing.JTextField();
        interest_amount_due = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        principal_amount_paid = new javax.swing.JTextField();
        principal_amount_due = new javax.swing.JTextField();
        outstanding_amount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jToolBar1.setRollover(true);

        new_loan_application.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        new_loan_application.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/Actions-view-pim-notes-icon.png"))); // NOI18N
        new_loan_application.setText("VIEW LOANS");
        new_loan_application.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_loan_applicationMouseClicked(evt);
            }
        });
        jToolBar1.add(new_loan_application);
        jToolBar1.add(jSeparator1);

        due_today.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        due_today.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/Due-2-icon.png"))); // NOI18N
        due_today.setText("DUE TODAY");
        due_today.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                due_todayMouseClicked(evt);
            }
        });
        jToolBar1.add(due_today);
        jToolBar1.add(jSeparator2);

        myinfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        myinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/user-icon.png"))); // NOI18N
        jToolBar1.add(myinfo);
        jToolBar1.add(jSeparator4);

        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/stop-icon.png"))); // NOI18N
        exit.setText("EXIT");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jToolBar1.add(exit);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        loan_amortization.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loan_amortization.setText("Loan Amortization Schedule");
        loan_amortization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loan_amortizationActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Loan  Details"));

        contract_id.setEnabled(false);

        jLabel80.setText("Contract ID:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contract_id, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(contract_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Search Contract ID"));

        search_field_choice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contract ID" }));
        search_field_choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_field_choiceActionPerformed(evt);
            }
        });

        search_contract_id.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/search-icon.png"))); // NOI18N
        search_contract_id.setText("Search");
        search_contract_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_contract_idActionPerformed(evt);
            }
        });

        search_field.setText("0000000008L");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_contract_id)
                    .addComponent(search_field_choice, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_field_choice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search_contract_id)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Loan Payment Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Principal Amount Paid:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Interest Amount Due:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Principal Amount Due:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Interest Amount Paid:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Outstanding Amount:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Initial Loan Amount:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(principal_amount_due)
                            .addComponent(interest_amount_due)
                            .addComponent(principal_amount_paid)
                            .addComponent(initial_loan_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(interest_amount_paid))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outstanding_amount)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(initial_loan_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(principal_amount_due, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interest_amount_due, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(principal_amount_paid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(interest_amount_paid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(outstanding_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loan_amortization)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(loan_amortization)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE))
                .addGap(0, 112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchLoanContract(String contractId) {

        try {
            String sql = "SELECT `Contract_ID`, `Principal`, `Interest`, `Principal_Paid`, "
                    + "`Interest_Paid`, `Accumulated_Amount`, `Principal_Outstanding`, "
                    + "`Interest_Outstanding`, `Outstanding_Amount` FROM `loan_table` where Contract_ID = ?";
            pst = conn.connection.prepareStatement(sql);
            pst.setString(1, contractId);
            rs = pst.executeQuery();
            if (rs.next()) {
                contract_id.setText(rs.getString("Contract_ID"));
                initial_loan_amount.setText(rs.getString("Principal"));
                principal_amount_due.setText(rs.getString("Principal_Outstanding"));
                interest_amount_due.setText(rs.getString("Interest_Outstanding"));
                principal_amount_paid.setText(rs.getString("Principal_Paid"));
                interest_amount_paid.setText(rs.getString("Interest_Paid"));
                outstanding_amount.setText(rs.getString("Outstanding_Amount"));
            } else {
                JOptionPane.showMessageDialog(null, "The contract ID does not exist!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoanRecoveryDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void search_field_choiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_field_choiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_field_choiceActionPerformed

    private void loan_amortizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loan_amortizationActionPerformed
        // TODO add your handling code here:
        if (contract_id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the contract ID", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            new ViewLoanAmortization(contract_id.getText()).setVisible(true);
        }
    }//GEN-LAST:event_loan_amortizationActionPerformed

    private void search_contract_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_contract_idActionPerformed
        // TODO add your handling code here:
        if (search_field.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter contract's ID Number", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            searchLoanContract(search_field.getText());

        }
    }//GEN-LAST:event_search_contract_idActionPerformed

    private void new_loan_applicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_loan_applicationMouseClicked
        // TODO add your handling code here:
        new LoanApplication().setVisible(true);
    }//GEN-LAST:event_new_loan_applicationMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            prefs.clear();
        } catch (BackingStoreException ex) {
            Logger.getLogger(Teller_Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_exitMouseClicked

    private void due_todayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_due_todayMouseClicked
        // TODO add your handling code here:
        
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date=new java.util.Date();  
        java.sql.Date sqlDueDate = new java.sql.Date(date.getTime());
         
        new DueToday(sqlDueDate.toString()).setVisible(true);
        System.out.println(formatDate.format(date));
        
        
     
    }//GEN-LAST:event_due_todayMouseClicked

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
            java.util.logging.Logger.getLogger(LoanRecoveryDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanRecoveryDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanRecoveryDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanRecoveryDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanRecoveryDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contract_id;
    private javax.swing.JLabel due_today;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField initial_loan_amount;
    private javax.swing.JTextField interest_amount_due;
    private javax.swing.JTextField interest_amount_paid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton loan_amortization;
    private javax.swing.JLabel myinfo;
    private javax.swing.JLabel new_loan_application;
    private javax.swing.JTextField outstanding_amount;
    private javax.swing.JTextField principal_amount_due;
    private javax.swing.JTextField principal_amount_paid;
    private javax.swing.JButton search_contract_id;
    private javax.swing.JTextField search_field;
    private javax.swing.JComboBox<String> search_field_choice;
    // End of variables declaration//GEN-END:variables
}
