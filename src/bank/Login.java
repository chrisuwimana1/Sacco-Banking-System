/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import com.placeholder.PlaceHolder;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;
/**
 *
 * @author limitlessapps
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    //DBTables tb;
    DBConnection conn;
    private DatabaseMetaData databaseMetaData;
    private ResultSet rs;
    PreparedStatement pst;
    Boolean IsLogin;
    PlaceHolder holder;
    // Preference key name
    Preferences prefs = Preferences.userNodeForPackage(Login.class);
    
    public Login() {
        initComponents();

        try {
            conn = new DBConnection();
        } catch (BackingStoreException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        holder = new PlaceHolder(username, "Enter Username");
        holder = new PlaceHolder(password, "Password");
    }
    
    private void updateLastLogin(String employee_key) {
        String sql = "UPDATE `employees` SET `last_login`=? WHERE employee_key=?";
        java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
        try {
            pst = conn.connection.prepareStatement(sql);
            pst.setTimestamp(1, (Timestamp) date);
            pst.setString(2, employee_key);

            int updated = pst.executeUpdate();
            if (updated > 0) {
                System.out.println("Last login " + date.toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void authenticateData(Object empl_title, String uname, String pass) {
        // TODO Auto-generated method stub
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        String sql = "SELECT `id`, `employee_key`, `title`, `firstname`, `lastname`, `username`, `email`, `password`,`salt`, `last_login`, `date_created` FROM `employees` WHERE username = ?";
        try {
            pst = conn.connection.prepareStatement(sql);
            pst.setString(1, uname);
            ResultSet set = pst.executeQuery();

            if (set.next()) {
                boolean passwordMatch = PasswordUtils.verifyUserPassword(pass, set.getString("password"), set.getString("salt"));
                
                //for tellers
                if (empl_title.toString().equalsIgnoreCase("Teller") && set.getString("title").equalsIgnoreCase(empl_title.toString())) {
                    if (passwordMatch) {
                        this.setCursor(Cursor.getDefaultCursor());
                        IsLogin = true;
                        String employee_key = set.getString("employee_key");
                        String firstname = set.getString("firstname");
                        String lastname = set.getString("lastname");
                        String username = set.getString("username");
                        String email = set.getString("email");
                        String title = set.getString("title");

                        prefs.put("employee_key", employee_key);
                        prefs.put("firstname", firstname);
                        prefs.put("lastname", lastname);
                        prefs.put("username", username);
                        prefs.put("email", email);
                        prefs.put("title", title);

                        //System.out.println(username);
                        new Teller_Dashboard().setVisible(true);
                        this.dispose();
                    } else {
                        System.out.println(username);
                        JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                        this.setCursor(Cursor.getDefaultCursor());
                    }
                } //loan officers
                else if (empl_title.toString().equalsIgnoreCase("Loan officer") && set.getString("title").equalsIgnoreCase(empl_title.toString())) {
                    if (passwordMatch) {
                        this.setCursor(Cursor.getDefaultCursor());
                        IsLogin = true;
                        String employee_key = set.getString("employee_key");
                        String firstname = set.getString("firstname");
                        String lastname = set.getString("lastname");
                        String username = set.getString("username");
                        String email = set.getString("email");
                        String title = set.getString("title");

                        prefs.put("employee_key", employee_key);
                        prefs.put("firstname", firstname);
                        prefs.put("lastname", lastname);
                        prefs.put("username", username);
                        prefs.put("email", email);
                        prefs.put("title", title);

                        //update last login
                        updateLastLogin(employee_key);

                        new LoanOfficerDashboard().setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                        this.setCursor(Cursor.getDefaultCursor());
                    }
                } else if (empl_title.toString().equalsIgnoreCase("Customer Care") && set.getString("title").equalsIgnoreCase(empl_title.toString())) {
                    if (passwordMatch) {
                        this.setCursor(Cursor.getDefaultCursor());
                        IsLogin = true;
                        String employee_key = set.getString("employee_key");
                        String firstname = set.getString("firstname");
                        String lastname = set.getString("lastname");
                        String username = set.getString("username");
                        String email = set.getString("email");
                        String title = set.getString("title");

                        prefs.put("employee_key", employee_key);
                        prefs.put("firstname", firstname);
                        prefs.put("lastname", lastname);
                        prefs.put("username", username);
                        prefs.put("email", email);
                        prefs.put("title", title);

                        //update last login
                        updateLastLogin(employee_key);

                        new Teller_Dashboard().setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                        this.setCursor(Cursor.getDefaultCursor());
                    }
                } else if (empl_title.toString().equalsIgnoreCase("Accountant") && set.getString("title").equalsIgnoreCase(empl_title.toString())) {
                    if (passwordMatch) {
                        this.setCursor(Cursor.getDefaultCursor());
                        IsLogin = true;
                        String employee_key = set.getString("employee_key");
                        String firstname = set.getString("firstname");
                        String lastname = set.getString("lastname");
                        String username = set.getString("username");
                        String email = set.getString("email");
                        String title = set.getString("title");

                        prefs.put("employee_key", employee_key);
                        prefs.put("firstname", firstname);
                        prefs.put("lastname", lastname);
                        prefs.put("username", username);
                        prefs.put("email", email);
                        prefs.put("title", title);

                        //update last login
                        updateLastLogin(employee_key);

                        new AccountantDashboard().setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                        this.setCursor(Cursor.getDefaultCursor());
                    }
                } else if (empl_title.toString().equalsIgnoreCase("Adminstrator") && set.getString("title").equalsIgnoreCase(empl_title.toString())) {
                    if (passwordMatch) {
                        this.setCursor(Cursor.getDefaultCursor());
                        IsLogin = true;
                        String employee_key = set.getString("employee_key");
                        String firstname = set.getString("firstname");
                        String lastname = set.getString("lastname");
                        String username = set.getString("username");
                        String email = set.getString("email");
                        String title = set.getString("title");

                        prefs.put("employee_key", employee_key);
                        prefs.put("firstname", firstname);
                        prefs.put("lastname", lastname);
                        prefs.put("username", username);
                        prefs.put("email", email);
                        prefs.put("title", title);

                        //update last login
                        updateLastLogin(employee_key);

                        new AdminDashboard().setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                        this.setCursor(Cursor.getDefaultCursor());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Login failed, please try again", "Error", JOptionPane.ERROR_MESSAGE);
                    this.setCursor(Cursor.getDefaultCursor());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                this.setCursor(Cursor.getDefaultCursor());
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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

        jPanel4 = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        empl_title = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        connect_db = new javax.swing.JButton();
        change_password = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bgcover = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true)));

        login.setText("Log In");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginloginActionPerformed(evt);
            }
        });

        jLabel10.setText("Title:");

        jLabel11.setText("Username:");

        empl_title.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teller", "Adminstrator", "Loan Officer", "Accountant", "Customer Care", "Manager" }));

        jLabel12.setText("Password:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(27, 27, 27)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username)
                            .addComponent(empl_title, 0, 257, Short.MAX_VALUE))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(empl_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(26, 26, 26)
                .addComponent(login)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        connect_db.setText("Connect Database");
        connect_db.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connect_dbActionPerformed(evt);
            }
        });

        change_password.setText("Change Password");
        change_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_passwordActionPerformed(evt);
            }
        });

        bgcover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/images/blue-background-large.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgcover, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgcover, javax.swing.GroupLayout.PREFERRED_SIZE, 167, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(connect_db)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(change_password))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connect_db)
                    .addComponent(change_password))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginloginActionPerformed
        // TODO add your handling code here:
        if (username.getText().isEmpty() || password.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "All fields are required", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            //System.out.println();
            authenticateData(empl_title.getSelectedItem().toString(), username.getText(), password.getText().toString());
        }
    }//GEN-LAST:event_loginloginActionPerformed

    private void connect_dbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connect_dbActionPerformed
        // TODO add your handling code here:
        prefs.remove("host_name");
        prefs.remove("db_name");
        prefs.remove("db_username");
        prefs.remove("db_password");
        
        new DBSettings().setVisible(true);
    }//GEN-LAST:event_connect_dbActionPerformed

    private void change_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_passwordActionPerformed
        // TODO add your handling code here:
        new ChangePassword().setVisible(true);
    }//GEN-LAST:event_change_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgcover;
    private javax.swing.JButton change_password;
    private javax.swing.JButton connect_db;
    private javax.swing.JComboBox<String> empl_title;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
