package bank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author chris
 */

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;

public class Template_Contract_Schedules extends javax.swing.JFrame {

    /**
     * Creates new form Template_Contract_Schedules
     */
    PreparedStatement pst = null;
    ResultSet rs = null;
    DBConnection conn;
    DefaultTableModel model = new DefaultTableModel();
    String input_date;

    public Template_Contract_Schedules() {
        initComponents();
        try {
            conn = new DBConnection();
        } catch (BackingStoreException ex) {
            Logger.getLogger(Template_Contract_Schedules.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contract_schedules = new javax.swing.JTable();
        generate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        year_month = new javax.swing.JTextField();
        export = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        contract_schedules.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Country", "LE_Book", "Year_Month", "Contract_ID", "Schedule_Date", "Payment_Date ", "Principal_Amount_Due_LCY ", "Principal_Amount_Due_FCY ", "Int_Amount_Due_LCY ", "Int_Amount_Due_FCY ", "Principal_Amount_Paid_LCY", "Principal_Amount_Paid_FCY ", "Int_Amount_Paid_LCY", "Int_Amount_Paid_FCY ", "Outstanding_Amount_LCY ", "Outstanding_Amount_FCY "
            }
        ));
        jScrollPane1.setViewportView(contract_schedules);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 2929, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        generate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/Generate-tables-icon.png"))); // NOI18N
        generate.setText("GENERATE");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        jLabel2.setText("Year Month:");

        export.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        export.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/Export-To-File-icon.png"))); // NOI18N
        export.setText("EXPORT");
        export.setEnabled(false);
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(year_month, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(generate)
                .addGap(26, 26, 26)
                .addComponent(export, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(year_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(generate)
                        .addComponent(export)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateTemplate() {

        try {
            DefaultTableModel dtm = (DefaultTableModel) contract_schedules.getModel();
            dtm.setRowCount(0);
            dtm.setColumnCount(0);
            String sql = "SELECT `Country`, `LE_Book`, `Contract_ID`, `Schedule_Date`, `Payment_Date`, `Principal_Amount_Due_LCY`, `Principal_Amount_Due_FCY`, `Int_Amount_Due_LCY`, `Int_Amount_Due_FCY`, `Principal_Amount_Paid_LCY`, `Principal_Amount_Paid_FCY`, `Int_Amount_Paid_LCY`, `Int_Amount_Paid_FCY`, `Outstanding_Amount_LCY`, `Outstanding_Amount_FCY` FROM `contract_schedules`";
            pst = conn.connection.prepareStatement(sql);
            rs = pst.executeQuery();
            contract_schedules.setModel(model);
            model.addColumn("Country");
            model.addColumn("LE_Book");
            model.addColumn("Year_Month");
            model.addColumn("Contract_ID");
            model.addColumn("Schedule_Date");
            model.addColumn("Payment_Date");
            model.addColumn("Principal_Amount_Due_LCY");
            model.addColumn("Principal_Amount_Due_FCY");
            model.addColumn("Int_Amount_Due_LCY");
            model.addColumn("Int_Amount_Due_FCY");
            model.addColumn("Principal_Amount_Paid_LCY");
            model.addColumn("Principal_Amount_Paid_FCY");
            model.addColumn("Int_Amount_Paid_LCY");
            model.addColumn("Int_Amount_Paid_FCY");
            model.addColumn("Outstanding_Amount_LCY");
            model.addColumn("Outstanding_Amount_FCY");

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("Country"), rs.getString("LE_Book"),
                    year_month.getText(), rs.getString("Contract_ID"),
                    rs.getString("Schedule_Date"), rs.getString("Payment_Date"),
                    rs.getString("Principal_Amount_Due_LCY"), rs.getString("Principal_Amount_Due_FCY"),
                    rs.getString("Int_Amount_Due_LCY"), rs.getString("Int_Amount_Due_FCY"),
                    rs.getString("Principal_Amount_Paid_LCY"), rs.getString("Principal_Amount_Paid_FCY"),
                    rs.getString("Int_Amount_Paid_LCY"), rs.getString("Int_Amount_Paid_FCY"),
                    rs.getString("Outstanding_Amount_LCY"), rs.getString("Outstanding_Amount_FCY"),});
            }
            export.setEnabled(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // TODO add your handling code here:
        if (year_month.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The year month is required for this filter!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (year_month.getText().length()!= 6){
            JOptionPane.showMessageDialog(null, "Incorrect value for the year month!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            int yearMonth = Integer.parseInt(year_month.getText());
            generateTemplate();
        }
    }//GEN-LAST:event_generateActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to export this document?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                String fileName = "Sacco/";
                String directoryName = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "/".concat(fileName);
                File dir = new File(directoryName);
                if (!dir.exists()) {
                    dir.mkdirs();
                }

                ExcelExporter exp = new ExcelExporter();
                exp.exportTable(contract_schedules, new File(directoryName + year_month + "_CONTSCHE.xls"));
                //OPEN FILE
                File tmpDir = new File(directoryName + year_month + "_CONTSCHE.xls");
                boolean exists = tmpDir.exists();
                  if (exists) {
                      Desktop dt = Desktop.getDesktop();
                      dt.open(new File(directoryName + year_month + "_CONTSCHE.xls"));
                  }
            } catch (IOException ex) {
                Logger.getLogger(Template_Account_Information.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_exportActionPerformed

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
            java.util.logging.Logger.getLogger(Template_Contract_Schedules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Template_Contract_Schedules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Template_Contract_Schedules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Template_Contract_Schedules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Template_Contract_Schedules().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable contract_schedules;
    private javax.swing.JButton export;
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField year_month;
    // End of variables declaration//GEN-END:variables
}
