/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssa.limpieza;

import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;


/**
 *
 * @author sergio
 */
public class LimpiezaVista extends javax.swing.JFrame {

    private LimpiezaCoordinador coordinador;

    /**
     * Creates new form Login
     */
    public LimpiezaVista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTotalRegistros = new javax.swing.JTextField();
        txtRegProcesados = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRegPendientes = new javax.swing.JTextField();
        pnlDatos = new javax.swing.JPanel();
        scrollTblDatos = new javax.swing.JScrollPane();
        DefaultTableModel tblDatosModel = new DefaultTableModel();
        tblDatosModel.setDataVector(null,
            new String [] {
                "Base", "Relación con registro base", "Número de derechohabiencia",
                "Ap. paterno", "Ap. materno", " Nombre(s)", "Fecha de nacimiento",
                "Sexo", "Dirección", "Número exterior", "Número interior" , "Colonia",
                "Código postal", "Teléfono", "CURP", "RFC", "Estado civil",
                "Estado de nacimiento", "Fecha de ingreso al padron", "Clave localidad donde vive",
                "Clave municipio donde vive", "Clave estado donde vive", "Vigencia de la derechohabiencia"});
        tblDatos = new javax.swing.JTable(){
            public void tableChanged(TableModelEvent e){
                super.tableChanged(e);
                repaint();
            }
        };
        btnSiguiente = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asociación de expedientes");

        pnlInfo.setForeground(new java.awt.Color(248, 45, 13));

        jLabel1.setText("Total de Registros encontrados con posible duplicidad:");

        jLabel2.setText("Registros procesados:");

        txtTotalRegistros.setText("0");

        txtRegProcesados.setText("0");

        jLabel3.setText("Registros pendientes:");

        txtRegPendientes.setText("0");

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalRegistros))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegProcesados, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRegProcesados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtRegPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDatos.setMinimumSize(new java.awt.Dimension(537, 531));

        tblDatos.setModel(tblDatosModel);
        tblDatos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        /**
        * Tamaño de las columnas
        */
        //Columna Base
        tblDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
        //Columna Relación con registro base
        tblDatos.getColumnModel().getColumn(1).setPreferredWidth(150);
        //Columna Número de derechohabiencia
        tblDatos.getColumnModel().getColumn(2).setPreferredWidth(180);
        //Columna Apellido Paterno
        tblDatos.getColumnModel().getColumn(3).setPreferredWidth(120);
        //Columna Apellido Materno
        tblDatos.getColumnModel().getColumn(4).setPreferredWidth(120);
        //Columna Nombre(s)
        tblDatos.getColumnModel().getColumn(5).setPreferredWidth(100);
        //Columna Fecha de nacimiento
        tblDatos.getColumnModel().getColumn(6).setPreferredWidth(100);
        //Columna Sexo
        //tblDatos.getColumnModel().getColumn(7).setPreferredWidth(50);
        //Columna Dirección
        tblDatos.getColumnModel().getColumn(8).setPreferredWidth(150);
        //Columna Número exterior
        tblDatos.getColumnModel().getColumn(9).setPreferredWidth(120);
        //Columna Número Interior
        tblDatos.getColumnModel().getColumn(10).setPreferredWidth(120);
        //Columna Colonia
        tblDatos.getColumnModel().getColumn(11).setPreferredWidth(120);
        //Columna Codigo Postal
        tblDatos.getColumnModel().getColumn(12).setPreferredWidth(120);
        //Columna Telefono
        tblDatos.getColumnModel().getColumn(13).setPreferredWidth(120);
        //Columna CURP
        tblDatos.getColumnModel().getColumn(14).setPreferredWidth(120);
        //Columna RFC
        tblDatos.getColumnModel().getColumn(15).setPreferredWidth(120);
        //Columna Estado civil
        tblDatos.getColumnModel().getColumn(16).setPreferredWidth(120);
        //Columna Estado de nacimiento
        tblDatos.getColumnModel().getColumn(17).setPreferredWidth(120);
        //Columna Fecha de ingreso al padron
        tblDatos.getColumnModel().getColumn(18).setPreferredWidth(120);
        //Columna Clave localidad donde vive
        tblDatos.getColumnModel().getColumn(19).setPreferredWidth(120);
        //Columna Clave municipio donde vive
        tblDatos.getColumnModel().getColumn(20).setPreferredWidth(120);
        //Columna Clave estado donde vive
        tblDatos.getColumnModel().getColumn(21).setPreferredWidth(150);
        //Columna Clave Vigencia de derechohabiencia
        tblDatos.getColumnModel().getColumn(22).setPreferredWidth(150);

        /**
        * Termina tamaño de columnas
        */

        /**
        * Inicia el tamaño de los renglones
        */
        tblDatos.setRowHeight(25);
        /**
        * Termina tamaño de los renglones
        */
        tblDatos.setColumnSelectionAllowed(true);
        tblDatos.getTableHeader().setReorderingAllowed(false);
        scrollTblDatos.setViewportView(tblDatos);
        tblDatos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnSiguiente.setText("Siguiente");

        btnGuardar1.setText("Guardar y salir");

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTblDatos)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar1)
                        .addGap(48, 48, 48)
                        .addComponent(btnSiguiente)))
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addComponent(scrollTblDatos)
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente)
                    .addComponent(btnGuardar1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 536, Short.MAX_VALUE))
                    .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JScrollPane scrollTblDatos;
    protected static javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtRegPendientes;
    private javax.swing.JTextField txtRegProcesados;
    private javax.swing.JTextField txtTotalRegistros;
    // End of variables declaration//GEN-END:variables

    public void setCoordinador(LimpiezaCoordinador coordinador) {
        this.coordinador = coordinador;
    }
}
