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

public class Template_Contract_Loans extends javax.swing.JFrame {

    /**
     * Creates new form Template_Contract_Information
     */
    PreparedStatement pst = null;
    ResultSet rs = null;
    DBConnection conn;
    DefaultTableModel model = new DefaultTableModel();
    String input_date;

    public Template_Contract_Loans() {
        initComponents();
        try {
            conn = new DBConnection();
        } catch (BackingStoreException ex) {
            Logger.getLogger(Template_Contract_Loans.class.getName()).log(Level.SEVERE, null, ex);
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
        contract_loans = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        generate = new javax.swing.JButton();
        export = new javax.swing.JButton();
        year_month = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        contract_loans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Country", "LE_Book", "Year_Month ", "Contract_ID", "Performance_Class", "Disbursed_Amount", "Prin_Outstanding_Amt_FCY", "Prin_Outstanding_Amt_LCY", "Interest_Due_FCY", "Interest_Due_LCY", "Regulatory_Provision", "Provision_Held", "Date_Of_Provision", "Loan_Includ_Interest", "Other_CR_Penalties", "Other_Charges", "Suspense_Interest", "Repayment_Frequency", "EMI_Amount", "Date_Past_Due", "Due_Amount", "Grace_Period_Accorded", "Instalments_In_Arrears", "Num_of_Instalments", "Total_Instalments_Paid", "Total_Instalments_Outstanding"
            }
        ));
        jScrollPane1.setViewportView(contract_loans);

        jLabel1.setText("Year Month:");

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
        export.setEnabled(false);
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 5343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year_month, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(generate)
                        .addGap(44, 44, 44)
                        .addComponent(export)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(generate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(year_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(export, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateTemplate(int yearMonth) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) contract_loans.getModel();
            dtm.setRowCount(0);
            dtm.setColumnCount(0);
 
            String sql = "SELECT `Country`, "
                    + "`LE_Book`, "
                    + "`Contract_ID`, "
                    + "`Performance_Class`, "
                    + "`Disbursed_Amount`, "
                    + "`Prin_Outstanding_Amt_FCY`, "
                    + "`Prin_Outstanding_Amt_LCY`, "
                    + "`Interest_Due_FCY`, "
                    + "`Interest_Due_LCY`, "
                    + "`Regulatory_Provision`, "
                    + "`Provision_Held`, "
                    + " DATE_FORMAT(Date_Of_Provision, '%d-%b-%Y') AS Date_Of_Provision, "
                    + "`Loan_Includ_Interest`, "
                    + "`Other_CR_Penalties`, "
                    + "`Other_Charges`, "
                    + "`Suspense_Interest`, "
                    + "`Repayment_Frequency`, "
                    + "`EMI_Amount`, "
                    + "`Date_Past_Due`, "
                    + "`Due_Amount`, "
                    + "`Grace_Period_Accorded`, "
                    + "`Instalments_In_Arrears`, "
                    + "`Num_of_Instalments`, "   
                    + "`Total_Instalments_Paid`, "
                    + "`Total_Instalments_Outstanding` FROM contract_loans";
            pst = conn.connection.prepareStatement(sql);
            rs = pst.executeQuery();
            contract_loans.setModel(model);
            model.addColumn("Country");
            model.addColumn("LE_Book");
            model.addColumn("Year_Month");
            model.addColumn("Contract_ID");
            model.addColumn("Performance_Class");
            model.addColumn("Disbursed_Amount");
            model.addColumn("Prin_Outstanding_Amt_FCY");
            model.addColumn("Prin_Outstanding_Amt_LCY");
            model.addColumn("Interest_Due_FCY");
            model.addColumn("Interest_Due_LCY");
            model.addColumn("Regulatory_Provision");
            model.addColumn("Provision_Held");
            model.addColumn("Date_Of_Provision");
            model.addColumn("Loan_Includ_Interest");
            model.addColumn("Other_CR_Penalties");
            model.addColumn("Other_Charges");
            model.addColumn("Suspense_Interest");
            model.addColumn("Repayment_Frequency");
            model.addColumn("EMI_Amount");
            model.addColumn("Date_Past_Due");
            model.addColumn("Due_Amount");
            model.addColumn("Grace_Period_Accorded");
            model.addColumn("Instalments_In_Arrears");
            model.addColumn("Num_of_Instalments");
            model.addColumn("Total_Instalments_Paid");
            model.addColumn("Total_Instalments_Outstanding");

            while (rs.next()) {
                //count++;
                model.addRow(new Object[]{rs.getString("Country"), rs.getString("LE_Book"),
                    year_month.getText().trim(), rs.getString("Contract_ID"),
                    rs.getString("Performance_Class"), rs.getString("Disbursed_Amount"),
                    rs.getString("Prin_Outstanding_Amt_FCY"), rs.getString("Prin_Outstanding_Amt_LCY"),
                    rs.getString("Interest_Due_FCY"), rs.getString("Interest_Due_LCY"),
                    rs.getString("Regulatory_Provision"), rs.getString("Provision_Held"),
                    rs.getString("Date_Of_Provision"),
                    rs.getString("Loan_Includ_Interest"), rs.getString("Other_CR_Penalties"),
                    rs.getString("Other_Charges"), rs.getString("Suspense_Interest"),
                    rs.getString("Repayment_Frequency"), rs.getString("EMI_Amount"),
                    rs.getString("Date_Past_Due"), rs.getString("Due_Amount"),
                    rs.getString("Grace_Period_Accorded"), rs.getString("Instalments_In_Arrears"),
                    rs.getString("Num_of_Instalments"), rs.getString("Total_Instalments_Paid"),
                    rs.getString("Total_Instalments_Outstanding")});
            }
            export.setEnabled(true);
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
                exp.exportTable(contract_loans, new File(directoryName+year_month.getText()+"_CONTLOAN.xls"));

                //OPEN FILE
                File tmpDir = new File(directoryName+year_month.getText()+"_CONTLOAN.xls");
                boolean exists = tmpDir.exists();
                  if (exists) {
                      Desktop dt = Desktop.getDesktop();
                      dt.open(new File(directoryName+year_month.getText()+"_CONTLOAN.xls"));
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
//        try {
//            String fileName = "Sacco/";
//            String directoryName = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "/".concat(fileName);
//            File dir = new File(directoryName);
//            if (!dir.exists()) {
//                dir.mkdirs();
//            }
//
//            FileOutputStream excel = new FileOutputStream(directoryName + year_month.getText() + "_CONTLOAN.xlsx");
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
        if (year_month.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The year month is required for this filter!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int yearMonth = Integer.parseInt(year_month.getText());
            generateTemplate(yearMonth);
        }
    }//GEN-LAST:event_generateActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to export this document?");
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
            java.util.logging.Logger.getLogger(Template_Contract_Loans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Template_Contract_Loans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Template_Contract_Loans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Template_Contract_Loans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Template_Contract_Loans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable contract_loans;
    private javax.swing.JButton export;
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFormattedTextField year_month;
    // End of variables declaration//GEN-END:variables
}