/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssa.limpieza;

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
public class LimpiezaCoordinador {
    //new JRadioButton(), new JComboBox(), "Sergio Alan", "Betancourt", "Almanza", "BEAS910215", "15-02-1991", "M", "29-09-2015", "BEAS910215"
    
    private LimpiezaVista vista;
    private LimpiezaModelo modelo;
    
    public void iniciarPantalla(){
        
        //Instanciamos las clases unicas
        vista = new LimpiezaVista();
        modelo = new LimpiezaModelo();
        
        //Relacionamos las clases con el Coordinador
        this.setVista(vista);
        this.setModelo(modelo);
        
        //Relacionamos el Coordinador con las clases
        vista.setCoordinador(this);
        modelo.setCoordinador(this);
        
        vista.setVisible(true);
        llenaCampos(LimpiezaVista.tblDatos);
        
    }
    
    /**
     * 
     * @param tabla Tabla a la que se le quieren poner datos
     */
    public void llenaCampos(JTable tabla){
        //int columnas = tabla.getColumnCount();
        
        ButtonGroup grupo1 = new ButtonGroup();
        DefaultTableModel tblMomodelo = (DefaultTableModel) tabla.getModel();
        
        //Información de los tipos de persona que se cargarán en el listBox
        String[] datoListBox = modelo.getTipoPersona();
        // Se cargan los nombres de las personas que son posibles duplicados
        String[] personas = modelo.getPersonasDuplicadas();
        
        //Se llena la tabla con la informacion recabada
        for (int i = 0; i < 10; i++) {
            
            tblMomodelo.addRow(new Object[]{
                new JRadioButton(), new JComboBox(datoListBox),
                personas[0], personas[1] + " " + i, personas[2] + " " + i,
                personas[3] + " " + i, personas[4] + " " + i, personas[5] + " " + i, 
                personas[6] + " " + i, personas[7] + " " + i, personas[8] + " " + i, 
                personas[9] + " " + i, personas[10] + " " + i, personas[11] + " " + i, 
                personas[12] + " " + i, personas[13] + " " + i, personas[14] + " " + i,   
                personas[15] + " " + i, personas[16] + " " + i, personas[17] + " " + i,
                personas[18] + " " + i, personas[19] + " " + i, personas[20] + " " + i});
            grupo1.add((JRadioButton) tblMomodelo.getValueAt(i, 0));
            
        }
        
        tabla.getColumn("Base").setCellRenderer(new ComponentRenderer());
        tabla.getColumn("Base").setCellEditor(new ComponentEditor(new JCheckBox()));
        
        tabla.getColumn("Relación con registro base").setCellRenderer(new ComponentRenderer());
        tabla.getColumn("Relación con registro base").setCellEditor(new ComponentEditor(new JCheckBox()));
    }

    private void setVista(LimpiezaVista vista) {
        this.vista = vista;
    }

    private void setModelo(LimpiezaModelo modelo) {
        this.modelo = modelo;
    }
    
    
}
