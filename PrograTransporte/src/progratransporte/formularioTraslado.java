/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progratransporte;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author claudio
 */
public class formularioTraslado extends javax.swing.JInternalFrame {
conectar con;
DefaultTableModel mod=new DefaultTableModel();

    /**
     * Creates new form formularioTraslado
     */
    public formularioTraslado() {
        initComponents();
         con=new conectar();
         mod.addColumn("codigo");
         mod.addColumn("rut");
         mod.addColumn("patente ");
         mod.addColumn("dia ");
         mod.addColumn("hora_salida");
      
         reporte.setModel(mod);
         
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jdia = new javax.swing.JComboBox();
        jsalida = new javax.swing.JComboBox();
        jllegada = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        agregar = new javax.swing.JButton();
        jCpasajero = new javax.swing.JComboBox();
        jCbus = new javax.swing.JComboBox();
        txtdia = new javax.swing.JTextField();
        reportar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reporte = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Bus");

        jLabel2.setText("pasajero");

        jLabel3.setText("Dia");

        jLabel4.setText("Hora Salida");

        jLabel5.setText("Hora llegada");

        jdia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "lunes", "martes", "miercoles", "jueves", "viernes" }));

        jsalida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7:30", "7:45", "8:15" }));

        jllegada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "13:00", "13:30", "15:00", "16:45", "17:00" }));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        reportar.setText("reportar");
        reportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportarActionPerformed(evt);
            }
        });

        reporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(reporte);

        jLabel6.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jsalida, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdia, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jllegada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(64, 64, 64)
                                .addComponent(agregar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCpasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCbus, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reportar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jCbus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jCpasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(agregar)
                        .addGap(16, 16, 16)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jsalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jllegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportar)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        
         
        String dia = (String)jdia.getSelectedItem();      
        String hs = (String)jsalida.getSelectedItem();  
        String hll = (String)jllegada.getSelectedItem();
           
        //ta.registrar( dia, hs, hll);        
        updateTable();
    }//GEN-LAST:event_agregarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        updateTable();
        try {
             PreparedStatement pstm = con.getConection().prepareStatement("select PATENTE from ROOT.BUS");
         ResultSet rs = pstm.executeQuery();
         PreparedStatement pstm1 = con.getConection().prepareStatement("select * from ROOT.PASAJEROS");
         ResultSet rs1 = pstm1.executeQuery();
         while(rs.next()){       
             this.jCbus.addItem(rs.getString("PATENTE"));
             
         }
         while(rs1.next()){
             this.jCpasajero.addItem(rs1.getString("RUT"));
         }
         } catch (SQLException ex) {
             Logger.getLogger(FRMacceso.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_formInternalFrameOpened

    private void reportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportarActionPerformed
    try {
        // TODO add your handling code here:
        String co =txtdia.getText();
        PreparedStatement pstm=con.getConection().prepareStatement("SELECT *  FROM traslado where dia ='" + co + "'"+"order by hora_salida" );
        ResultSet  res = pstm.executeQuery();
        while(res.next()){
            if(co.equals("lunes")||co.equals("martes")||co.equals("miercoles")||co.equals("jueves")||co.equals("viernes")){
                String []dato = new String [5];
                dato[0]=res.getString(1);
                dato[1]=res.getString(2);
                dato[2]=res.getString(3);
                dato[3]=res.getString(4);
                dato[4]=res.getString(5);
               
                mod.addRow(dato);
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(formularioTraslado.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_reportarActionPerformed
 traslado ta=new traslado();
 Object[][] per; 
    int fila = -1;
  
   
            
 public void updateTable(){
        String [] colum={"codigo","rut","patente", "dia", "hora_salida", "hora_llegada"};
        per = ta.getDatos();
               
        // se colocan los datos en la tabla
        DefaultTableModel datos = new DefaultTableModel(per,colum);                        
        tabla.setModel(datos); 
        //ajustamos tamaño de la celda ID
        TableColumn columna = tabla.getColumn("codigo");        
        columna.setPreferredWidth(50);
        columna.setMinWidth(10);
        columna.setMaxWidth(30);
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JComboBox jCbus;
    private javax.swing.JComboBox jCpasajero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jdia;
    private javax.swing.JComboBox jllegada;
    private javax.swing.JComboBox jsalida;
    private javax.swing.JButton reportar;
    private javax.swing.JTable reporte;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtdia;
    // End of variables declaration//GEN-END:variables
}
