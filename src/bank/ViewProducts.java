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
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewProducts extends javax.swing.JFrame {

    /**
     * Creates new form ViewProducts
     */
    PreparedStatement pst = null;
    ResultSet rs = null;
    DBConnection conn;
    DefaultTableModel model = new DefaultTableModel();

    public ViewProducts() {
        initComponents();
        conn = new DBConnection();
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
        list_of_products = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        to_date = new com.toedter.calendar.JDateChooser();
        go = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        from_date = new com.toedter.calendar.JDateChooser();
        date_choice = new javax.swing.JComboBox<>();
        specific_date = new com.toedter.calendar.JDateChooser();
        date_range_label = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        to_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        list_of_products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product Name", "Amount", "From Account Number", "Date"
            }
        ));
        jScrollPane1.setViewportView(list_of_products);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Products Filter"));

        to_date.setEnabled(false);

        go.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/Button-Next-icon.png"))); // NOI18N
        go.setText("GO");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });

        jLabel3.setText("Date Choice:");

        from_date.setEnabled(false);

        date_choice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Specific Date", "Date Range" }));
        date_choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_choiceActionPerformed(evt);
            }
        });

        specific_date.setEnabled(false);

        date_range_label.setText("Date Range:");

        date_label.setText("Date:");

        to_label.setText("To");
        to_label.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date_label)
                                    .addComponent(date_range_label))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(from_date, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(to_label)
                                        .addGap(16, 16, 16)
                                        .addComponent(to_date, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(specific_date, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(38, 38, 38)
                                .addComponent(date_choice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(go)
                        .addGap(186, 186, 186))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(date_choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date_label, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(specific_date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_range_label)
                    .addComponent(to_date, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(from_date, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to_label))
                .addGap(18, 18, 18)
                .addComponent(go)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filterData() throws ParseException {

        if (specific_date.getDate() == null) {
            JOptionPane.showMessageDialog(null, "The specific date is required for this filter!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            java.util.Date specificDate = specific_date.getDate();
            java.sql.Date specificDateSql = new java.sql.Date(specificDate.getTime());
            String transactionDate = specificDateSql.toString();

            try {
                DefaultTableModel dtm = (DefaultTableModel) list_of_products.getModel();
                dtm.setRowCount(0);
                dtm.setColumnCount(0);

                String sql = "SELECT `description`, `amount`, `Account_Number`, `product_date`  FROM `product` WHERE product_date = ?";
                pst = conn.connection.prepareStatement(sql);
                pst.setString(1, transactionDate);
                rs = pst.executeQuery();
                //int count = 0;
                list_of_products.setModel(model);
                model.addColumn("Product Name");
                model.addColumn("Amount");
                model.addColumn("From Account Number");
                model.addColumn("Date");

                while (rs.next()) {
                    //count++;
                    model.addRow(new Object[]{rs.getString("description"), rs.getString("amount"),
                        rs.getString("Account_Number"), rs.getString("product_date")
                    });
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void filterDataByDate() throws ParseException {

        if (from_date.getDate() == null || to_date.getDate() == null) {
            JOptionPane.showMessageDialog(null, "The start and end dates are required for this filter!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            java.util.Date fromDate = from_date.getDate();
            java.util.Date toDate = to_date.getDate();

            java.sql.Date sqlFromDate = new java.sql.Date(fromDate.getTime());
            java.sql.Date sqlToDate = new java.sql.Date(toDate.getTime());

            try {
                DefaultTableModel dtm = (DefaultTableModel) list_of_products.getModel();
                dtm.setRowCount(0);
                dtm.setColumnCount(0);

                String sql = "SELECT `description`, `amount`, `Account_Number`, `product_date`  FROM `product` WHERE product_date BETWEEN ? AND ?";
                pst = conn.connection.prepareStatement(sql);
                pst.setString(1, sqlFromDate.toString());
                pst.setString(2, sqlToDate.toString());
                rs = pst.executeQuery();
                //int count = 0;
                list_of_products.setModel(model);
                model.addColumn("Product Name");
                model.addColumn("Amount");
                model.addColumn("From Account Number");
                model.addColumn("Date");

                while (rs.next()) {
                    //count++;
                    model.addRow(new Object[]{rs.getString("description"), rs.getString("amount"),
                        rs.getString("Account_Number"), rs.getString("product_date")
                    });
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        // TODO add your handling code here:
        // String accountNumber = account_number.getText();
        //String transactionType = (String) transaction_type.getSelectedItem();
        String dateChoice = (String) date_choice.getSelectedItem();
        //java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());

        if (dateChoice.equalsIgnoreCase("Specific Date")) {

            try {
                filterData();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (dateChoice.equalsIgnoreCase("Date Range")) {
            //populateTransactions(accountNumber);

            try {
                filterDataByDate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please pick the date choice Filter!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_goActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> date_choice;
    private javax.swing.JLabel date_label;
    private javax.swing.JLabel date_range_label;
    private com.toedter.calendar.JDateChooser from_date;
    private javax.swing.JButton go;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable list_of_products;
    private com.toedter.calendar.JDateChooser specific_date;
    private com.toedter.calendar.JDateChooser to_date;
    private javax.swing.JLabel to_label;
    // End of variables declaration//GEN-END:variables
}
