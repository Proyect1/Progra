/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progratransporte;

/**
 *
 * @author claudio
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jMenuItem9 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jButton1 = new javax.swing.JButton();
        escritorio = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        vercolegio = new javax.swing.JMenuItem();
        verchofer = new javax.swing.JMenuItem();
        verpersonal = new javax.swing.JMenuItem();
        verpasajero = new javax.swing.JMenuItem();
        verbus = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        tablamensualidad = new javax.swing.JMenuItem();
        formulariotars = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnadministrativo = new javax.swing.JMenu();
        actuachofer = new javax.swing.JMenuItem();
        actuacolegio = new javax.swing.JMenuItem();
        actuapersonal = new javax.swing.JMenuItem();
        btnadministrativo1 = new javax.swing.JMenu();
        agregarchofer = new javax.swing.JMenuItem();
        agregarcolegio = new javax.swing.JMenuItem();
        agregarpersonal = new javax.swing.JMenuItem();
        btnadministrativo2 = new javax.swing.JMenu();
        eliminarchofer = new javax.swing.JMenuItem();
        eliminarcolegio = new javax.swing.JMenuItem();
        eliminarpersonal = new javax.swing.JMenuItem();

        jMenuItem9.setText("jMenuItem9");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu7.setText("jMenu7");

        jMenuItem10.setText("jMenuItem10");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Eye-icon.png"))); // NOI18N
        jMenu1.setText("Ver");

        vercolegio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reseller_account.png"))); // NOI18N
        vercolegio.setText("colegio");
        vercolegio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vercolegioActionPerformed(evt);
            }
        });
        jMenu1.add(vercolegio);

        verchofer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_red.png"))); // NOI18N
        verchofer.setText("chofer");
        verchofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verchoferActionPerformed(evt);
            }
        });
        jMenu1.add(verchofer);

        verpersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_green.png"))); // NOI18N
        verpersonal.setText("personal");
        verpersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verpersonalActionPerformed(evt);
            }
        });
        jMenu1.add(verpersonal);

        verpasajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_silhouette.png"))); // NOI18N
        verpasajero.setText("pasajero");
        verpasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verpasajeroActionPerformed(evt);
            }
        });
        jMenu1.add(verpasajero);

        verbus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/metro.png"))); // NOI18N
        verbus.setText("bus");
        verbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verbusActionPerformed(evt);
            }
        });
        jMenu1.add(verbus);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/table_edit.png"))); // NOI18N
        jMenu3.setText("Tablas");

        tablamensualidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/table.png"))); // NOI18N
        tablamensualidad.setText("tablamensualidad");
        tablamensualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablamensualidadActionPerformed(evt);
            }
        });
        jMenu3.add(tablamensualidad);

        formulariotars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/font_red.png"))); // NOI18N
        formulariotars.setText("formularioTraslado");
        formulariotars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formulariotarsActionPerformed(evt);
            }
        });
        jMenu3.add(formulariotars);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/application-settings-icon.png"))); // NOI18N
        jMenu4.setText("CRUD");

        btnadministrativo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnadministrativo.setText("Actualizar");

        actuachofer.setText("chofer");
        actuachofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actuachoferActionPerformed(evt);
            }
        });
        btnadministrativo.add(actuachofer);

        actuacolegio.setText("colegio");
        actuacolegio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actuacolegioActionPerformed(evt);
            }
        });
        btnadministrativo.add(actuacolegio);

        actuapersonal.setText("personal");
        actuapersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actuapersonalActionPerformed(evt);
            }
        });
        btnadministrativo.add(actuapersonal);

        jMenu4.add(btnadministrativo);

        btnadministrativo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnadministrativo1.setText("Agregar");

        agregarchofer.setText("chofer");
        agregarchofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarchoferActionPerformed(evt);
            }
        });
        btnadministrativo1.add(agregarchofer);

        agregarcolegio.setText("colegio");
        agregarcolegio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarcolegioActionPerformed(evt);
            }
        });
        btnadministrativo1.add(agregarcolegio);

        agregarpersonal.setText("personal");
        agregarpersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarpersonalActionPerformed(evt);
            }
        });
        btnadministrativo1.add(agregarpersonal);

        jMenu4.add(btnadministrativo1);

        btnadministrativo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnadministrativo2.setText("Eliminar");

        eliminarchofer.setText("chofer");
        btnadministrativo2.add(eliminarchofer);

        eliminarcolegio.setText("colegio");
        eliminarcolegio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarcolegioActionPerformed(evt);
            }
        });
        btnadministrativo2.add(eliminarcolegio);

        eliminarpersonal.setText("personal");
        btnadministrativo2.add(eliminarpersonal);

        jMenu4.add(btnadministrativo2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vercolegioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vercolegioActionPerformed
        // TODO add your handling code here:
        colegio col=new colegio();
        escritorio.add(col);
        col.setVisible(true);
    }//GEN-LAST:event_vercolegioActionPerformed

    private void verpasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verpasajeroActionPerformed
        // TODO add your handling code here:
        pasajero pas=new pasajero();
        escritorio.add(pas);
        pas.setVisible(true);
    }//GEN-LAST:event_verpasajeroActionPerformed

    private void formulariotarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formulariotarsActionPerformed
        // TODO add your handling code here:
        formularioTraslado fr=new formularioTraslado();
        fr.setVisible(true);
        escritorio.add(fr);
    }//GEN-LAST:event_formulariotarsActionPerformed

    private void tablamensualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablamensualidadActionPerformed
        // TODO add your handling code here:
        
        Tablamensualidad ta=new Tablamensualidad();
        ta.setVisible(true);
        escritorio.add(ta);
    }//GEN-LAST:event_tablamensualidadActionPerformed

    private void actuachoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actuachoferActionPerformed
        // TODO add your handling code here:
        chofer ch=new chofer();
        escritorio.add(ch);
        ch.setVisible(true);
        ch.show();
    }//GEN-LAST:event_actuachoferActionPerformed

    private void agregarpersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarpersonalActionPerformed
        // TODO add your handling code here:
        Agregarpersonal per= new Agregarpersonal();
        escritorio.add(per);
        per.setVisible(true);
        per.show();
    }//GEN-LAST:event_agregarpersonalActionPerformed

    private void eliminarcolegioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarcolegioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarcolegioActionPerformed

    private void actuacolegioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actuacolegioActionPerformed
        // TODO add your handling code here:
        colegio co=new colegio();
        escritorio.add(co);
        co.setVisible(true);
        co.show();
    }//GEN-LAST:event_actuacolegioActionPerformed

    private void actuapersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actuapersonalActionPerformed
        // TODO add your handling code here:
        personal per=new personal();
        escritorio.add(per);
        per.setVisible(true);
        per.show();
    }//GEN-LAST:event_actuapersonalActionPerformed

    private void agregarchoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarchoferActionPerformed
        // TODO add your handling code here
        Agregarchofer cho=new Agregarchofer();
        escritorio.add(cho);
        cho.setVisible(true);
        cho.show();
        
    }//GEN-LAST:event_agregarchoferActionPerformed

    private void agregarcolegioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarcolegioActionPerformed
        // TODO add your handling code here:
        Agregarcolegio ol=new Agregarcolegio();
        escritorio.add(ol);
        ol.setVisible(true);
        ol.show();
        
                
    }//GEN-LAST:event_agregarcolegioActionPerformed

    private void verpersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verpersonalActionPerformed
        // TODO add your handling code here:
        personal per=new personal();
        escritorio.add(per);
        per.setVisible(true);
    }//GEN-LAST:event_verpersonalActionPerformed

    private void verchoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verchoferActionPerformed
        // TODO add your handling code here:
        chofer ch=new chofer();
        escritorio.add(ch);
        ch.setVisible(true);
        
    }//GEN-LAST:event_verchoferActionPerformed

    private void verbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verbusActionPerformed
        // TODO add your handling code here:
        bus bu=new bus();
        escritorio.add(bu);
        bu.setVisible(true);
    }//GEN-LAST:event_verbusActionPerformed
 String rut ;
 String nombre;
 String apellido;
 String movil;
 String sexo;
 String direccion;
 int clave;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actuachofer;
    private javax.swing.JMenuItem actuacolegio;
    private javax.swing.JMenuItem actuapersonal;
    private javax.swing.JMenuItem agregarchofer;
    private javax.swing.JMenuItem agregarcolegio;
    private javax.swing.JMenuItem agregarpersonal;
    private javax.swing.JMenu btnadministrativo;
    private javax.swing.JMenu btnadministrativo1;
    private javax.swing.JMenu btnadministrativo2;
    private javax.swing.JMenuItem eliminarchofer;
    private javax.swing.JMenuItem eliminarcolegio;
    private javax.swing.JMenuItem eliminarpersonal;
    private javax.swing.JPanel escritorio;
    private javax.swing.JMenuItem formulariotars;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem tablamensualidad;
    private javax.swing.JMenuItem verbus;
    private javax.swing.JMenuItem verchofer;
    private javax.swing.JMenuItem vercolegio;
    private javax.swing.JMenuItem verpasajero;
    private javax.swing.JMenuItem verpersonal;
    // End of variables declaration//GEN-END:variables
}
