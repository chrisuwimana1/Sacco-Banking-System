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
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public class Template_Loan_Application_Analysis extends javax.swing.JFrame {

    /**
     * Creates new form Template_Loan_Application_Analysis
     */
    
    PreparedStatement pst = null;
    ResultSet rs = null;
    DBConnection conn;
    DefaultTableModel model = new DefaultTableModel();
    String input_date;

    public Template_Loan_Application_Analysis() {
        initComponents();
        try {
            conn = new DBConnection();
        } catch (BackingStoreException ex) {
            Logger.getLogger(Template_Loan_Application_Analysis.class.getName()).log(Level.SEVERE, null, ex);
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
        loan_applications = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        generate = new javax.swing.JButton();
        export = new javax.swing.JButton();
        business_date = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        loan_applications.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Country", "LE_Book", "Loan_Application_Id", "Loan_Application_Type", "Business_Date", "Customer_Id", "Customer_Name", "Customer_Gender", "Vision_OUC", "Loan_Purpose", "Loan_Utilization_Location", "Vision_SBU", "Economic_Sector_Code", "Application_Date", "Application_Status", "Currency", "Applied_Amount_LCY", "Applied_Amount_FCY", "Applied_Amount_FCY", "Approved_Amount_LCY", "Approved_Amount_FCY", "Rejection_Reason", "Prev_Loan_Paid", "Loan_In_Other_Institutions"
            }
        ));
        jScrollPane1.setViewportView(loan_applications);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 3458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(357, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("BUSINESS DATE:");

        generate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/Generate-tables-icon.png"))); // NOI18N
        generate.setText("GENERATE");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        export.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        export.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/Export-To-File-icon.png"))); // NOI18N
        export.setText("EXPORT");
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });

        business_date.setText("201809");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(business_date, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(generate)
                        .addGap(44, 44, 44)
                        .addComponent(export)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(export, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(business_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(generate, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateTemplate(String inputDate) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) loan_applications.getModel();
            dtm.setRowCount(0);
            dtm.setColumnCount(0);
            String sql = "SELECT  `Country`, `LE_Book`, `Loan_Application_Id`, `Loan_Application_Type`, DATE_FORMAT(Business_Date, '%Y%m') AS Business_Date, `Customer_ID`, `Customer_Name`, `Customer_Gender`, `Vision_OUC`, `Loan_Purpose`, `Loan_Utilization_Location`, `Vision_SBU`, `Economic_Sector_Code`, DATE_FORMAT(Application_Date, '%d-%b-%Y') AS Application_Date , `Application_Status`, `Currency`, `Applied_Amount_LCY`, `Applied_Amount_FCY`, `Approved_Amount_LCY`, `Approved_Amount_FCY`, `Rejection_Reason`, `Prev_Loan_Paid`, `Loan_In_Other_Institutions` FROM `loan_application_analysis` WHERE DATE_FORMAT(Business_Date, '%Y%m') =?";
            pst = conn.connection.prepareStatement(sql);
            pst.setString(1, inputDate);
            rs = pst.executeQuery();
            loan_applications.setModel(model);
            model.addColumn("Country");
            model.addColumn("LE_Book");
            model.addColumn("Loan_Application_Id");
            model.addColumn("Loan_Application_Type");
            model.addColumn("Business_Date");
            model.addColumn("Customer_Id");
            model.addColumn("Customer_Name");
            model.addColumn("Customer_Gender");
            model.addColumn("Vision_OUC");
            model.addColumn("Loan_Purpose");
            model.addColumn("Loan_Utilization_Location");
            model.addColumn("Vision_SBU");
            model.addColumn("Economic_Sector_Code");
            model.addColumn("Application_Date");
            model.addColumn("Application_Status");
            model.addColumn("Currency");
            model.addColumn("Applied_Amount_LCY");
            model.addColumn("Applied_Amount_FCY");
            model.addColumn("Approved_Amount_LCY");
            model.addColumn("Approved_Amount_FCY");
            model.addColumn("Rejection_Reason");
            model.addColumn("Prev_Loan_Paid");
            model.addColumn("Loan_In_Other_Institutions");

            while (rs.next()) {
                //count++;
                model.addRow(new Object[]{rs.getString("Country"), rs.getString("LE_Book"),
                    rs.getString("Loan_Application_Id"), rs.getString("Loan_Application_Type"),
                    rs.getString("Business_Date"), rs.getString("Customer_Id"),
                    rs.getString("Customer_Name"), rs.getString("Customer_Gender"),
                    rs.getString("Vision_OUC"), rs.getString("Loan_Purpose"),
                    rs.getString("Loan_Utilization_Location"), rs.getString("Vision_SBU"),
                    rs.getString("Economic_Sector_Code"), rs.getString("Application_Date"),
                    rs.getString("Application_Status"), rs.getString("Currency"),
                    rs.getString("Applied_Amount_LCY"), rs.getString("Applied_Amount_FCY"),
                    rs.getString("Approved_Amount_LCY"), rs.getString("Approved_Amount_FCY"),
                    rs.getString("Rejection_Reason"), rs.getString("Prev_Loan_Paid"),
                    rs.getString("Loan_In_Other_Institutions")});
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void exportTable() {
        try {
                String fileName = "Sacco/";
                String directoryName = FileSystemView.getFileSystemView().getDefaultDirectory().getPath()+"/Documents/".concat(fileName);
                File dir = new File(directoryName);
                 if (!dir.exists()) dir.mkdirs();

                ExcelExporter exp = new ExcelExporter();
                exp.exportTable(loan_applications, new File(directoryName+business_date.getText()+"_LOANAPP2.xls"));

                //OPEN FILE
                File tmpDir = new File(directoryName+business_date.getText()+"_LOANAPP2.xls");
                boolean exists = tmpDir.exists();
                  if (exists) {
                      Desktop dt = Desktop.getDesktop();
                      dt.open(new File(directoryName+business_date.getText()+"_LOANAPP2.xls"));
                  }
              } catch (IOException ex) {
                Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
              }
//        SXSSFWorkbook wb = new SXSSFWorkbook(-1);
//        SXSSFSheet sh = (SXSSFSheet) wb.createSheet("Report");
//        Row row = sh.createRow(0);
//        for (int i = 0; i < model.getColumnCount(); i++) {
//            Cell cell = row.createCell(i);
//            cell.setCellValue(model.getColumnName(i));
//        }
//
//        for (int i = 0; i < model.getRowCount(); i++) {
//            row = sh.createRow(i + 1);
//            for (int j = 0; j < model.getColumnCount(); j++) {
//                Cell cell = row.createCell(j);
//                if (model.getValueAt(i, j) != null) {
//                    cell.setCellValue(model.getValueAt(i, j).toString());
//                } else {
//                    cell.setCellValue("");
//                }
//            }
//        }
//
//        try {
//            String fileName = "Sacco/";
//            String directoryName = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "/".concat(fileName);
//            File dir = new File(directoryName);
//            if (!dir.exists()) {
//                dir.mkdirs();
//            }
//
//            FileOutputStream excel = new FileOutputStream(directoryName + business_date.getText() + "_LOANAPP2.xlsx");
//            wb.write(excel);
//            excel.flush();
//            excel.close();
//            JOptionPane.showMessageDialog(null, "The template was successfuly saved!");
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Template_Account_Information.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Template_Account_Information.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // TODO add your handling code here:
        if (business_date.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The business date is required for this filter!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String businessDate = business_date.getText();
            generateTemplate(businessDate);
        }
    }//GEN-LAST:event_generateActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to export this table?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            exportTable();
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
            java.util.logging.Logger.getLogger(Template_Loan_Application_Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Template_Loan_Application_Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Template_Loan_Application_Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Template_Loan_Application_Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Template_Loan_Application_Analysis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField business_date;
    private javax.swing.JButton export;
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable loan_applications;
    // End of variables declaration//GEN-END:variables
}
