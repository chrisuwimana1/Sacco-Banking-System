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
<<<<<<< HEAD
=======
import java.awt.Desktop;
>>>>>>> d48411c8b541cbb001b25c42b3a3a3aa6a82c7a8
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import java.text.DecimalFormat;
import java.util.prefs.BackingStoreException;

public class Template_Financial_Monthly extends javax.swing.JFrame {

    /**
     * Creates new form Template_Loan_Application_Analysis
     */
    PreparedStatement pst = null;
    ResultSet rs = null;
    DBConnection conn;
    DefaultTableModel model = new DefaultTableModel();
    String input_date;
    DecimalFormat formatter = new DecimalFormat("#,###.00");

    public Template_Financial_Monthly() {
        initComponents();
        try {
            conn = new DBConnection();
        } catch (BackingStoreException ex) {
            Logger.getLogger(Template_Financial_Monthly.class.getName()).log(Level.SEVERE, null, ex);
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
        financial_date = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        generate = new javax.swing.JButton();
        export = new javax.swing.JButton();
        year_month = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        financial_date.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Country", "LE_Book", "Year_Month", "Customer_ID", "Account_No", "Office_Account", "Vision_OUC", "Vision_GL", "Currency", "Amount_FCY", "Amount_LCY"
            }
        ));
        jScrollPane1.setViewportView(financial_date);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
<<<<<<< HEAD
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(357, Short.MAX_VALUE))
=======
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
>>>>>>> d48411c8b541cbb001b25c42b3a3a3aa6a82c7a8
        );

        jScrollPane2.setViewportView(jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("YEAR MONTH:");

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

        year_month.setText("201809");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                        .addComponent(year_month, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
=======
                        .addComponent(year_month, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
>>>>>>> d48411c8b541cbb001b25c42b3a3a3aa6a82c7a8
                        .addComponent(generate)
                        .addGap(44, 44, 44)
                        .addComponent(export)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(export, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
<<<<<<< HEAD
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(year_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(generate, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
=======
                        .addComponent(generate)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(year_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
>>>>>>> d48411c8b541cbb001b25c42b3a3a3aa6a82c7a8
    }// </editor-fold>//GEN-END:initComponents

    private String formatFloat(String s) {
        double stringToDouble = Float.parseFloat(s);
<<<<<<< HEAD
        return String.valueOf(formatter.format(stringToDouble));
=======
        return String.valueOf(formatter.format(stringToDouble)).equals(".00") ? "0.0" : String.valueOf(formatter.format(stringToDouble));
>>>>>>> d48411c8b541cbb001b25c42b3a3a3aa6a82c7a8
    }

    private void generateTemplate(String inputDate) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) financial_date.getModel();
            dtm.setRowCount(0);
            dtm.setColumnCount(0);
            String sql = "select Country, LE_Book, Customer_ID, cu.Account_Number,ba.current_balance from customer_information cu inner join balance ba on cu.Account_Number = ba.Account_Number";
            pst = conn.connection.prepareStatement(sql);
            rs = pst.executeQuery();
            financial_date.setModel(model);

            model.addColumn("Country");
            model.addColumn("LE_Book");
            model.addColumn("Year_Month");
            model.addColumn("Customer_ID");
            model.addColumn("Account_No");
            model.addColumn("Office_Account");
            model.addColumn("Vision_GL");
            model.addColumn("Vision_OUC");
            model.addColumn("Currency");
            model.addColumn("Amount_FCY");
            model.addColumn("Amount_LCY");

            while (rs.next()) {
<<<<<<< HEAD
                model.addRow(new Object[]{rs.getString("Country"), rs.getString("LE_Book"),
                    year_month.getText(), rs.getString("Customer_ID"), rs.getString("Customer_ID"),
                    "", "200080", "001", "RWF", formatFloat(rs.getString("ba.current_balance")), 
                    formatFloat(rs.getString("ba.current_balance"))});
=======
                model.addRow(new Object[]{
                    rs.getString("Country"), rs.getString("LE_Book"),
                    year_month.getText(), rs.getString("Customer_ID"), 
                    rs.getString("Customer_ID"),
                    "", "200080", "001", "RWF", 
                    formatFloat(rs.getString("ba.current_balance")), 
                    formatFloat(rs.getString("ba.current_balance"))
                });
>>>>>>> d48411c8b541cbb001b25c42b3a3a3aa6a82c7a8
            }
            export.setEnabled(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void exportTable() {
<<<<<<< HEAD

        SXSSFWorkbook wb = new SXSSFWorkbook(-1);
        SXSSFSheet sh = (SXSSFSheet) wb.createSheet("Report");
        Row row = sh.createRow(0);
        for (int i = 0; i < model.getColumnCount(); i++) {
            Cell cell = row.createCell(i);
            cell.setCellValue(model.getColumnName(i));
        }
        for (int i = 0; i < model.getRowCount(); i++) {
            row = sh.createRow(i + 1);
            for (int j = 0; j < model.getColumnCount(); j++) {
                Cell cell = row.createCell(j);
                if (model.getValueAt(i, j) != null) {
                    cell.setCellValue(model.getValueAt(i, j).toString());
                } else {
                    cell.setCellValue("");
                }
            }
        }

        try {
            String fileName = "Sacco/";
            String directoryName = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "/".concat(fileName);
            File dir = new File(directoryName);
            if (!dir.exists()) {
                dir.mkdirs();
            }

            FileOutputStream excel = new FileOutputStream(directoryName + year_month.getText() + "_FINMTH.xlsx");
            wb.write(excel);
            excel.flush();
            excel.close();
            JOptionPane.showMessageDialog(null, "The template was successfuly saved!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Template_Account_Information.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Template_Account_Information.class.getName()).log(Level.SEVERE, null, ex);
        }
=======
          try {
            String fileName = "Sacco/";
            String directoryName = FileSystemView.getFileSystemView().getDefaultDirectory().getPath()+"/Documents/".concat(fileName);
            File dir = new File(directoryName);
             if (!dir.exists()) dir.mkdirs();
            
            ExcelExporter exp = new ExcelExporter();
            exp.exportTable(financial_date, new File(directoryName+year_month.getText()+"_FINMTH.xls"));
            
            //OPEN FILE
            File tmpDir = new File(directoryName+year_month.getText()+"_FINMTH.xls");
            boolean exists = tmpDir.exists();
              if (exists) {
                  Desktop dt = Desktop.getDesktop();
                  dt.open(new File(directoryName+year_month.getText()+"_FINMTH.xls"));
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
//            FileOutputStream excel = new FileOutputStream(directoryName + year_month.getText() + "_FINMTH.xlsx");
//            wb.write(excel);
//            excel.flush();
//            excel.close();
//            JOptionPane.showMessageDialog(null, "The template was successfuly saved!");
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Template_Account_Information.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Template_Account_Information.class.getName()).log(Level.SEVERE, null, ex);
//        }
>>>>>>> d48411c8b541cbb001b25c42b3a3a3aa6a82c7a8
    }

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // TODO add your handling code here:
        if (year_month.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The YearMonth field is required for this filter!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String businessDate = year_month.getText();
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
            java.util.logging.Logger.getLogger(Template_Financial_Monthly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Template_Financial_Monthly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Template_Financial_Monthly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Template_Financial_Monthly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Template_Financial_Monthly().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton export;
    private javax.swing.JTable financial_date;
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField year_month;
    // End of variables declaration//GEN-END:variables
}
