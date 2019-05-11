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

public class Template_Contract_Information extends javax.swing.JFrame {

    /**
     * Creates new form Template_Contract_Information
     */
    PreparedStatement pst = null;
    ResultSet rs = null;
    DBConnection conn;
    DefaultTableModel model = new DefaultTableModel();
    String input_date;

    public Template_Contract_Information() {
        initComponents();
        try {
            conn = new DBConnection();
        } catch (BackingStoreException ex) {
            Logger.getLogger(Template_Contract_Information.class.getName()).log(Level.SEVERE, null, ex);
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
        contracts_information = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        business_date = new com.toedter.calendar.JDateChooser();
        generate = new javax.swing.JButton();
        export = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        contracts_information.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Country", "LE_Book", "Contract_ID", "Customer_ID", "Vision_OUC", "Vision_SBU", "Start_Date", "Maturity_Date", "Settlement_Date", "Deal_Type", "Deal_Sub_Type", "Govt_Schemes_Flag", "Govt_Schemes_Desc", "Interest_Rate_Method", "Interest_Rate_DR", "Interest_Rate_CR", "APR_Rate", "Contract_Application_Fee", "Contract_Administrative_Fee", "Other_Contract_Charges", "Commissions", "Insured_Flag", "Contract_Insurance_Charges", "Ins_Expiry_Date", "Currency", "Principal_GL", "Interest_GL", "Principal_Amount_FCY", "Principal_Amount_LCY", "Interest_Amount_FCY", "Interest_Amount_LCY", "Loan_Application_Id", "Contract_Status", "Date_Last_Modified"
            }
        ));
        jScrollPane1.setViewportView(contracts_information);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Date Last Modified:");

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 5343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(business_date, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(generate)
                        .addGap(44, 44, 44)
                        .addComponent(export)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(generate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(export, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(business_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void generateTemplate(String inputDate) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) contracts_information.getModel();
            dtm.setRowCount(0);
            dtm.setColumnCount(0);
            String sql = "SELECT `Country`, `LE_Book`, `Contract_ID`, `Customer_ID`, `Vision_OUC`, `Vision_SBU`, DATE_FORMAT(Start_Date, '%d-%b-%Y') AS Start_Date, DATE_FORMAT(Maturity_Date, '%d-%b-%Y') AS Maturity_Date, DATE_FORMAT(Settlement_Date, '%d-%b-%Y') AS Settlement_Date, `Deal_Type`, `Deal_Sub_Type`, `Govt_Schemes_Flag`, `Govt_Schemes_Desc`, `Interest_Rate_Method`, `Interest_Rate_DR`, `Interest_Rate_CR`, `APR_Rate`, `Contract_Application_Fee`, `Contract_Administrative_Fee`, `Other_Contract_Charges`, `Commissions`, `Insured_Flag`, `Contract_Insurance_Charges`, DATE_FORMAT(Ins_Expiry_Date, '%d-%b-%Y') AS Ins_Expiry_Date, `Currency`, `Principal_GL`, `Interest_GL`, `Principal_Amount_FCY`, `Principal_Amount_LCY`, `Interest_Amount_FCY`, `Interest_Amount_LCY`, `Loan_Application_Id`, `Contract_Status`, DATE_FORMAT(Date_Last_Modified, '%d-%m-%Y %T') AS Date_Last_Modified FROM `contract_information` WHERE DATE (Date_Last_Modified) =?";
            pst = conn.connection.prepareStatement(sql);
            pst.setString(1, inputDate);
            rs = pst.executeQuery();
            contracts_information.setModel(model);
            model.addColumn("Country");
            model.addColumn("LE_Book");
            model.addColumn("Contract_ID");
            model.addColumn("Customer_ID");
            model.addColumn("Vision_OUC");
            model.addColumn("Vision_SBU");
            model.addColumn("Start_Date");
            model.addColumn("Maturity_Date");
            model.addColumn("Settlement_Date");
            model.addColumn("Deal_Type");
            model.addColumn("Deal_Sub_Type");
            model.addColumn("Govt_Schemes_Flag");
            model.addColumn("Govt_Schemes_Desc");
            model.addColumn("Interest_Rate_Method");
            model.addColumn("Interest_Rate_DR");
            model.addColumn("Interest_Rate_CR");
            model.addColumn("APR_Rate");
            model.addColumn("Contract_Application_Fee");
            model.addColumn("Contract_Administrative_Fee");
            model.addColumn("Other_Contract_Charges");
            model.addColumn("Commissions");
            model.addColumn("Insured_Flag");
            model.addColumn("Contract_Insurance_Charges");
            model.addColumn("Ins_Expiry_Date");
            model.addColumn("Currency");
            model.addColumn("Principal_GL");
            model.addColumn("Interest_GL");
            model.addColumn("Principal_Amount_FCY");
            model.addColumn("Principal_Amount_LCY");
            model.addColumn("Interest_Amount_FCY");
            model.addColumn("Interest_Amount_LCY");
            model.addColumn("Loan_Application_Id");
            model.addColumn("Contract_Status");
            model.addColumn("Date_Last_Modified");

            while (rs.next()) {
                //count++;
                model.addRow(new Object[]{rs.getString("Country"), rs.getString("LE_Book"),
                    rs.getString("Contract_ID"), rs.getString("Customer_ID"),
                    rs.getString("Vision_OUC"), rs.getString("Vision_SBU"),
                    rs.getString("Start_Date"), rs.getString("Maturity_Date"),
                    rs.getString("Settlement_Date"), rs.getString("Deal_Type"),
                    rs.getString("Deal_Sub_Type"), rs.getString("Govt_Schemes_Flag"),
                    rs.getString("Govt_Schemes_Desc"), rs.getString("Interest_Rate_Method"),
                    rs.getString("Interest_Rate_DR"), rs.getString("Interest_Rate_CR"),
                    rs.getString("APR_Rate"), rs.getString("Contract_Application_Fee"),
                    rs.getString("Contract_Administrative_Fee"), rs.getString("Other_Contract_Charges"),
                    rs.getString("Commissions"), rs.getString("Insured_Flag"),
                    rs.getString("Contract_Insurance_Charges"), rs.getString("Ins_Expiry_Date"),
                    rs.getString("Currency"), rs.getString("Principal_GL"),
                    rs.getString("Interest_GL"), rs.getString("Principal_Amount_FCY"),
                    rs.getString("Principal_Amount_LCY"), rs.getString("Interest_Amount_FCY"),
                    rs.getString("Interest_Amount_LCY"), rs.getString("Loan_Application_Id"),
                    rs.getString("Contract_Status"), rs.getString("Date_Last_Modified")});
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
                exp.exportTable(contracts_information, new File(directoryName+input_date+"_CONT.xls"));

                //OPEN FILE
                File tmpDir = new File(directoryName+input_date+"_CONT.xls");
                boolean exists = tmpDir.exists();
                  if (exists) {
                      Desktop dt = Desktop.getDesktop();
                      dt.open(new File(directoryName+input_date+"_CONT.xls"));
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
//            FileOutputStream excel = new FileOutputStream(directoryName + input_date + "_CONT.xlsx");
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
        if (business_date.getDate() == null) {
            JOptionPane.showMessageDialog(null, "The specific date is required for this filter!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            java.util.Date specificDate = business_date.getDate();
            java.sql.Date specificDateSql = new java.sql.Date(specificDate.getTime());
            String inputDate = specificDateSql.toString();
            input_date = inputDate;
            generateTemplate(inputDate);
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
            java.util.logging.Logger.getLogger(Template_Contract_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Template_Contract_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Template_Contract_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Template_Contract_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Template_Contract_Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser business_date;
    private javax.swing.JTable contracts_information;
    private javax.swing.JButton export;
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
