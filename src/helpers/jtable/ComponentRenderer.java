/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers.jtable;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author sergio
 */
public class ComponentRenderer implements TableCellRenderer {

    public JRadioButton btn = new JRadioButton();
    public JComboBox combo = new JComboBox();
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
        boolean isSelected, boolean hasFocus, int row, int column) {
        if (value == null)
          return null;
        return (Component) value;
    }
    
}
