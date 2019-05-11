/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 *
 * @author Didier
 */
public class SmallReceipt implements Printable{

    String accountNumber = "", transaction_d = "", employee_name = "", transactionType, description = "", deposited_by = "";
    String customerName = "";
    float previousBalance = 0;
    float transactionAmount = 0;
    float transactionCharges = 0;
    float currentBalance = 0;
    int transaction_reference = 0;
    String amounti_word;
    
    SmallReceipt(String _transactionType, String _accountNumber, String _customerName, float _previousBalance, float _transactionAmount, String _amounti_word,
            float _transactionCharges, float _currentBalance, String _transaction_d, String _employee_name, int _transaction_reference, String _description, String _deposited_by) {
        accountNumber=_accountNumber;
        customerName=_customerName;
        previousBalance=_previousBalance;
        transactionAmount=_transactionAmount;
        transactionCharges=_transactionCharges;
        currentBalance=_currentBalance;
        transaction_d=_transaction_d;
        employee_name=_employee_name;
        transaction_reference=_transaction_reference;
        transactionType= _transactionType;
        description = _description;
        deposited_by = _deposited_by;
        amounti_word = _amounti_word;
        
        PrinterJob pjob = PrinterJob.getPrinterJob();
        PageFormat preformat = pjob.defaultPage();
        preformat.setOrientation(PageFormat.PORTRAIT);
        PageFormat postformat = pjob.pageDialog(preformat);
        //If user does not hit cancel then print.
        if (preformat != postformat) {
            //Set print component
            if (pjob.printDialog()) { 
                PrinterJob pj = PrinterJob.getPrinterJob();        
                pj.setPrintable(this,getPageFormat(pj));
                try {
                     pj.print();

                }
                 catch (PrinterException ex) {
                         ex.printStackTrace();
                }
            }
        }
    }

    public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) throws PrinterException 
  {    
     int result = NO_SUCH_PAGE;    
        if (pageIndex == 0) {                    
        
            Graphics2D g2d = (Graphics2D) graphics;                    

            double width = pageFormat.getImageableWidth();                    
           
            g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY()); 

            ////////// code by Didier//////////////

            FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7)); 
        try{
            /*Draw Header*/
            int y=20;
            int yShift = 10;
            int headerRectHeight=15;
                
            g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
            g2d.drawString("--------------------------------------------",12,y);y+=yShift;
            g2d.drawString("Sacco Kacyiru             ",12,y);y+=yShift;
            g2d.drawString("Cash "+transactionType+"              ",12,y);y+=yShift;
            g2d.drawString("--------------------------------------------",12,y);y+=headerRectHeight;
      
            g2d.drawString("Transaction Date:       "+transaction_d+"  ",10,y);y+=yShift;
            g2d.drawString("Transaction Reference:  "+transaction_reference+"  ",10,y);y+=yShift;
            g2d.drawString("Account Name(s)         "+customerName+"  ",10,y);y+=yShift;
            g2d.drawString("Account Number:         "+accountNumber+"  ",10,y);y+=yShift;
            g2d.drawString("Reason:                 "+description+"  ",10,y);y+=yShift;
            g2d.drawString("Deposited By:           "+deposited_by+"  ",10,y);y+=yShift;
            g2d.drawString("--------------------------------------------",10,y);y+=yShift;
            g2d.drawString("Amount:                 "+transactionAmount+" RWF ",10,y);y+=yShift;
            if (!amounti_word.isEmpty()) {
                g2d.drawString("Amount in word:     "+amounti_word,10,y);y+=yShift;
            }
            g2d.drawString("                        ",10,y);y+=yShift;
            g2d.drawString("                        ",10,y);y+=yShift;
            g2d.drawString("Served By:              .................",10,y);y+=yShift;
            g2d.drawString("............            Customer Signature",10,y);y+=yShift;
            g2d.drawString("                          ",10,y);y+=yShift;
            g2d.drawString("                          ",10,y);y+=yShift;
            g2d.drawString("*********************************************",10,y);y+=yShift;
            g2d.drawString("    Thank you for banking with us   ",10,y);y+=yShift;
            g2d.drawString("*********************************************",10,y);y+=yShift;
                   
    }
    catch(Exception r){
            r.printStackTrace();
        }

              result = PAGE_EXISTS;    
          }    
          return result;    
    }
    
    public PageFormat getPageFormat(PrinterJob pj)
    {

        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();    

        double middleHeight =8.0;  
        double headerHeight = 2.0;                  
        double footerHeight = 2.0;                  
        double width = convert_CM_To_PPI(8);      //printer know only point per inch.default value is 72ppi
        double height = convert_CM_To_PPI(headerHeight+middleHeight+footerHeight); 
        paper.setSize(width, height);

        pf.setOrientation(PageFormat.PORTRAIT);           //select orientation portrait or landscape but for this time portrait
        pf.setPaper(paper);    

        return pf;
    }

        protected static double convert_CM_To_PPI(double cm) {            
                    return toPPI(cm * 0.393600787);            
    }

    protected static double toPPI(double inch) {            
                    return inch * 72d;            
    }
}
