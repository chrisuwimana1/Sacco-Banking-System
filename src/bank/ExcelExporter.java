/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author chris
 */
class ExcelExporter {

    public ExcelExporter() {
    }

    public void exportTable(JTable table, File file) throws IOException {
        TableModel model = table.getModel();
        FileWriter out = new FileWriter(file);

        for (int i = 0; i < model.getColumnCount(); i++) {
            out.write(model.getColumnName(i) + "\t");
        }
        out.write("\n");
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                if (model.getValueAt(i, j) != null) {
                    out.write(model.getValueAt(i, j).toString() + "\t");
                }else{
                    out.write("\t");
                }
                
                //System.out.println(model.getValueAt(i, j).toString());
            }
            out.write("\n");
        }
        out.close();
        JOptionPane.showMessageDialog(null, "File is successfull saved");
    }
}
