/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chris
 */
public class Banking {
        public static void main(String[] args) {
        // TODO code application logic here
        SplashScreen sp = new SplashScreen();
        sp.setVisible(true);
        
        for(int i = 0; i <= 100; i++){
            try {
                Thread.sleep(40);
                sp.countings.setText(Integer.toString(i)+"%");
                if(i == 100){
                    //create tables
                    //new DBTables();
                    Login l = new Login();
                    sp.dispose();
                    l.show();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Banking.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
