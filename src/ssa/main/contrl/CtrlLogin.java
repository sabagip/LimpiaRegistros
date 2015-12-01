/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssa.main.contrl;

import helpers.jtable.ComponentEditor;
import helpers.jtable.ComponentRenderer;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sergio
 */
public class CtrlLogin {
    //new JRadioButton(), new JComboBox(), "Sergio Alan", "Betancourt", "Almanza", "BEAS910215", "15-02-1991", "M", "29-09-2015", "BEAS910215"
    
    public void llenaCampos(JTable tabla){
        //int columnas = tabla.getColumnCount();
        
        ButtonGroup grupo1 = new ButtonGroup();
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        
        String[] datoListBox = {"Misma Persona",  "Datos insuficientes", "Persona distinta"};
        for (int i = 0; i < 10; i++) {
            /*modelo.addRow(new Object[]{
                new JRadioButton(), "ListBox", "Sergio Alan " + i, "Betancourt " + i, 
                "Almanza " + i, "BEAS910215 " + i, "15-02-15 " + i, "M " + i, 
                "15-02-15 " + i, "BEAS910215" + i});*/
            modelo.addRow(new Object[]{
                new JRadioButton(), new JComboBox(datoListBox),
                        "Sergio Alan " + i, "Betancourt " + i, "Almanza " + i, 
                        "BEAS910215 " + i, "15-02-15 " + i, "M " + i, 
                        "15-02-15 " + i, "BEAS910215" + i});
            grupo1.add((JRadioButton) modelo.getValueAt(i, 0));
            
        }
        
        tabla.getColumn("Base").setCellRenderer(new ComponentRenderer());
        tabla.getColumn("Base").setCellEditor(new ComponentEditor(new JCheckBox()));
        
        tabla.getColumn("Relación con registro base").setCellRenderer(new ComponentRenderer());
        tabla.getColumn("Relación con registro base").setCellEditor(new ComponentEditor(new JCheckBox()));        
    }
    
    
}
