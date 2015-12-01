/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers.jtable;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;

/**
 *
 * @author sergio
 */
public class ComponentEditor extends DefaultCellEditor implements ItemListener{
    
    private JRadioButton button;
    private JComboBox combo;

  public ComponentEditor(JCheckBox checkBox) {
    super(checkBox);
  }
  
  public ComponentEditor(JComboBox comboBox) {
      super(comboBox);
  }

  public Component getTableCellEditorComponent(JTable table, Object value,
      boolean isSelected, int row, int column) {
    if (value == null)
      return null;
    
    if(value instanceof JRadioButton){
        button = (JRadioButton) value;
        button.addItemListener(this);
    }
    if(value instanceof JComboBox){
        combo = (JComboBox) value;
        combo.addItemListener(this);
    }
    
    return (Component) value;
  }

  public Object getCellEditorValue() {
      Object componente = null;
    if(button != null){
        button.removeItemListener(this);
        componente = button;
        //return button;
    }
    if(combo != null){
        combo.removeItemListener(this);
        componente = combo;
        //return combo;
    }
        return componente;
  }

  public void itemStateChanged(ItemEvent e) {
    super.fireEditingStopped();
  }
    
}
