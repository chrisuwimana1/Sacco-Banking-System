/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
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

/**
 *
 * @author chris
 */
public class LoanAmortizationSchedule extends javax.swing.JFrame {

    /**
     * Creates new form LoanAmortizationSchedule
     */
    PreparedStatement pst = null;
    ResultSet rs = null;
    DBConnection conn;
    float loanAmountFloat;
    int loanPeriodInt;
    int numberOfPaymentsInt;
    float annualInterestRateFloat;
    Date startDateDate;
    String contractIDString;
    String interest_rate_method;
    boolean contractLoanExists = false;
    DecimalFormat formatter = new DecimalFormat("#,###.00");
    DefaultTableModel model = new DefaultTableModel();

    public LoanAmortizationSchedule(String contractID, float loanAmount, int loanPeriod, int numberOfPayments, float annualInterestRate, Date startDate, String interestRateMethod) {
        initComponents();
        try {
            conn = new DBConnection();
        } catch (BackingStoreException ex) {
            Logger.getLogger(LoanAmortizationSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(true);
        loanAmountFloat = loanAmount;
        loanPeriodInt = loanPeriod;
        numberOfPaymentsInt = numberOfPayments;
        annualInterestRateFloat = annualInterestRate;
        startDateDate = startDate;
        contractIDString = contractID;
        interest_rate_method = interestRateMethod;
        interest_method.getModel().setSelectedItem(interestRateMethod);
        generateLoanAmortizationSchedule(loanAmount, loanPeriod, numberOfPayments, annualInterestRate, startDateDate, interestRateMethod);
    }

    private LoanAmortizationSchedule() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        loan_amortization_schedule_table = new javax.swing.JTable();
        export = new javax.swing.JButton();
        print = new javax.swing.JButton();
        interest_method = new javax.swing.JComboBox<>();
        refresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        loan_amortization_schedule_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PmtNo", "Payment Date", "Beginning Balance", "Total Payment", "Principal", "Interest", "Ending Balance"
            }
        ));
        loan_amortization_schedule_table.setGridColor(new java.awt.Color(0, 0, 0));
        loan_amortization_schedule_table.setSelectionBackground(new java.awt.Color(34, 162, 86));
        jScrollPane2.setViewportView(loan_amortization_schedule_table);

        export.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        export.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/Export-To-File-icon.png"))); // NOI18N
        export.setText("EXPORT");
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });

        print.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/printer-icon.png"))); // NOI18N
        print.setText("PRINT");

        interest_method.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        interest_method.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flat", "Declining" }));
        interest_method.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interest_methodActionPerformed(evt);
            }
        });

        refresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/Button-Refresh-icon.png"))); // NOI18N
        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Interest Method:");

        save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(interest_method, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(refresh))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(save)
                        .addGap(68, 68, 68)
                        .addComponent(export)
                        .addGap(53, 53, 53)
                        .addComponent(print)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interest_method, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(export)
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Calendar toCalendar(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }

    //generate loan amoritization
    public void generateLoanAmortizationSchedule(float loanAmount, int loanPeriod, int numberOfPayments, float annualInterestRate, Date newsubmitted_on, String interestRateMethod) {

        float beginningBalance = loanAmount;
        float totalPayment;
        float interest;
        float principal;
        float endingBalance = beginningBalance;
        float monthlyInterestRate = annualInterestRate / 1200;

        if (interestRateMethod.equalsIgnoreCase("Flat")) {
            float totalInterest = calculateTotalInterest(loanAmount, loanPeriod, annualInterestRate);
            float flatInterestRate = calculateFlatInterestRate(loanAmount, loanPeriod, numberOfPayments, annualInterestRate);
            float emi = calculateEMI(loanAmount, loanPeriod, numberOfPayments, annualInterestRate);

            //table header
            //clear all rows
            DefaultTableModel dtm = (DefaultTableModel) loan_amortization_schedule_table.getModel();
            dtm.setRowCount(0);
            dtm.setColumnCount(0);
            loan_amortization_schedule_table.setModel(model);
            model.addColumn("PmtNo");
            model.addColumn("Payment Date");
            model.addColumn("Beginning Balance");
            model.addColumn("Total Payment");
            model.addColumn("Principal");
            model.addColumn("Interest");
            model.addColumn("Ending Balance");

            Calendar startingDateCalendar = toCalendar(newsubmitted_on);

            //get loan amortization scheduling for flat method
            for (int i = 1; i <= numberOfPayments; i++) {
                totalPayment = calculateEMI(loanAmount, loanPeriod, numberOfPayments, annualInterestRate);
                interest = calculateFlatInterestRate(loanAmount, loanPeriod, numberOfPayments, annualInterestRate);
                principal = totalPayment - interest;

                endingBalance = beginningBalance - principal;

                startingDateCalendar.add(Calendar.MONTH, 1);
                java.util.Date utilDate = startingDateCalendar.getTime();
                SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
                String dueDate = format.format(utilDate.getTime());

                model.addRow(new Object[]{i, dueDate, formatter.format(Math.round(beginningBalance)),
                    formatter.format(Math.round(totalPayment)), formatter.format(Math.round(principal)),
                    formatter.format(Math.round(interest)), formatter.format(Math.round(endingBalance))});
                beginningBalance = endingBalance;
            }
        } else if (interestRateMethod.equalsIgnoreCase("Declining")) {
            float loanOutstandingAmount = loanAmount;
            float interestSum = 0;

            //table header
            //clear all rows
            DefaultTableModel dtm = (DefaultTableModel) loan_amortization_schedule_table.getModel();
            dtm.setRowCount(0);
            dtm.setColumnCount(0);
            loan_amortization_schedule_table.setModel(model);
            model.addColumn("PmtNo");
            model.addColumn("Payment Date");
            model.addColumn("Beginning Balance");
            model.addColumn("Total Payment");
            model.addColumn("Principal");
            model.addColumn("Interest");
            model.addColumn("Ending Balance");

            Calendar startingDateCalendar = toCalendar(newsubmitted_on);

            for (int i = 1; i <= numberOfPayments; i++) {

                principal = loanAmount / numberOfPayments;
                interest = loanOutstandingAmount * monthlyInterestRate;
                interestSum += interest;
                totalPayment = principal + interest;
                endingBalance = beginningBalance - principal;

                startingDateCalendar.add(Calendar.MONTH, 1);
                java.util.Date utilDate = startingDateCalendar.getTime();
                SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
                String dueDate = format.format(utilDate.getTime());

                model.addRow(new Object[]{i, dueDate, formatter.format(Math.round(beginningBalance)),
                    formatter.format(Math.round(totalPayment)), formatter.format(Math.round(principal)), formatter.format(Math.round(interest)), formatter.format(Math.round(endingBalance))});
                beginningBalance = endingBalance;
                loanOutstandingAmount = loanOutstandingAmount - principal;
            }
        }

    }

    private void doesContractLoanExist(String contractID) {

        // TODO Auto-generated method stub
        if (!contractID.isEmpty()) {
            try {
                String sql;
                sql = "SELECT `Contract_ID` FROM `loan_amortization` WHERE Contract_ID = ?";
                pst = conn.connection.prepareStatement(sql);
                pst.setString(1, contractID);
                rs = pst.executeQuery();
                if (rs.next()) {
                    contractLoanExists = true;
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void saveLoanAmortizationSchedule() throws ParseException {

        doesContractLoanExist(contractIDString);

        if (contractLoanExists == false) {

            int rows = loan_amortization_schedule_table.getRowCount();
            try {
                for (int row = 0; row < rows; row++) {
                    NumberFormat myNumForm = NumberFormat.getInstance(Locale.ENGLISH);
                    String dueDate = (String) loan_amortization_schedule_table.getValueAt(row, 1);

                    float beginningBalance = myNumForm.parse((String) loan_amortization_schedule_table.getValueAt(row, 2)).floatValue();
                    float totalPayment = myNumForm.parse((String) loan_amortization_schedule_table.getValueAt(row, 3)).floatValue();
                    float principal = myNumForm.parse((String) loan_amortization_schedule_table.getValueAt(row, 4)).floatValue();
                    float interest = myNumForm.parse((String) loan_amortization_schedule_table.getValueAt(row, 5)).floatValue();
                    float endingBalance = myNumForm.parse((String) loan_amortization_schedule_table.getValueAt(row, 6)).floatValue();

                    String sql = "insert into loan_amortization(Contract_ID,"
                            + "Payment_Number,"
                            + "DueDate,"
                            + "Beginning_Balance,"
                            + "Total_Payment,"
                            + "Principal,"
                            + "Interest,"
                            + "Ending_Balance,"
                            + "Amount_Paid,"
                            + "Principal_Paid,"
                            + "Interest_Paid,"
                            + "Charges) values (?,?,?,?,?,?,?,?,?,?,?,?)";
                    pst = conn.connection.prepareStatement(sql);
                    pst.setString(1, contractIDString);
                    pst.setInt(2, row + 1);
                    pst.setString(3, dueDate);
                    pst.setFloat(4, beginningBalance);
                    pst.setFloat(5, totalPayment);
                    pst.setFloat(6, principal);
                    pst.setFloat(7, interest);
                    pst.setFloat(8, endingBalance);
                    pst.setFloat(9, 0);
                    pst.setFloat(10, 0);
                    pst.setFloat(11, 0);
                    pst.setFloat(12, 0);
                    pst.execute();
                }
                JOptionPane.showMessageDialog(null, "The contract loan amortization schedule has been Created!");
                this.dispose();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "The loan amortization schedule for this contract loan already exists!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static float calculateEMI(float loanAmount, int loanPeriod, int numberOfPayments, float annualInterestRate) {

        return (loanAmount + (loanAmount * (loanPeriod / 12) * (annualInterestRate / 100))) / numberOfPayments;
    }

    public static float calculateFlatInterestRate(float loanAmount, int loanPeriod, int numberOfPayments, float annualInterestRate) {

        return (loanAmount * (loanPeriod / 12) * (annualInterestRate / 100)) / numberOfPayments;
    }

    public static float calculateTotalInterest(float loanAmount, int loanPeriod, float annualInterestRate) {

        return (loanAmount * (loanPeriod / 12) * (annualInterestRate / 100));
    }

    public void exportTable() {

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
            String directoryName = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "/Documents/".concat(fileName);
            File dir = new File(directoryName);
            if (!dir.exists()) {
                dir.mkdirs();
            }

            FileOutputStream excel = new FileOutputStream(directoryName + contractIDString + "_Loan_Amortization_Schedule.xlsx");
            wb.write(excel);
            excel.flush();
            excel.close();
            JOptionPane.showMessageDialog(null, "The amortization schedule was successfuly saved!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Template_Account_Information.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Template_Account_Information.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to export this table?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            exportTable();
        }
    }//GEN-LAST:event_exportActionPerformed

    private void interest_methodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interest_methodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_interest_methodActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:

        generateLoanAmortizationSchedule(loanAmountFloat, loanPeriodInt, numberOfPaymentsInt, annualInterestRateFloat, startDateDate, interest_method.getSelectedItem().toString());

    }//GEN-LAST:event_refreshActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            // TODO add your handling code here:
            saveLoanAmortizationSchedule();

        } catch (ParseException ex) {
            Logger.getLogger(LoanAmortizationSchedule.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(LoanAmortizationSchedule.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanAmortizationSchedule.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanAmortizationSchedule.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanAmortizationSchedule.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanAmortizationSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton export;
    private javax.swing.JComboBox<String> interest_method;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable loan_amortization_schedule_table;
    private javax.swing.JButton print;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
