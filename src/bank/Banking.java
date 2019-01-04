/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 *
 * @author chris
 */
public class Banking {
        
        public static void main(String[] args) throws BackingStoreException {
        // TODO code application logic here
        SplashScreen sp = new SplashScreen();
        sp.setVisible(true);
        Preferences prefs = Preferences.userNodeForPackage(Banking.class);
        
        for(int i = 0; i <= 100; i++){
            try {
                Thread.sleep(40);
                sp.countings.setText(Integer.toString(i)+"%");
                if(i == 100){
                    //create tables
                    //new DBTables();
                    sp.dispose();
                    
                    //check if DB setup
                    if(!prefs.get("host_name", "").isEmpty() && !prefs.get("db_name", "").isEmpty() && !prefs.get("db_username", "").isEmpty()){
                        Login l = new Login();
                        l.show();
                    }else{
                        //setup ne if not existed
                        new DBSettings().setVisible(true);
                    }
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Banking.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
