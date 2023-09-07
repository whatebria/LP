
package gui;

public class FrmMain extends javax.swing.JFrame {

    FrmAbout frmAbout = new FrmAbout();
    FrmJugar frmApuesta = new FrmJugar();
    FrmJugador frmJugador = new FrmJugador();
    FrmReglas frmReglas = new FrmReglas();
    FrmDatos frmDatos = new FrmDatos();
    
    public FrmMain() {
        initComponents();
        
        desk.add(frmAbout);
        desk.add(frmApuesta);
        desk.add(frmJugador);
        desk.add(frmReglas);
        desk.add(frmDatos);
        
        this.pack();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desk = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuConfiguracion = new javax.swing.JMenu();
        mnuJugador = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuApostar = new javax.swing.JMenu();
        mnuApuesta = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuDatos = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mnuDescripcion = new javax.swing.JMenuItem();
        mnuReglas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout deskLayout = new javax.swing.GroupLayout(desk);
        desk.setLayout(deskLayout);
        deskLayout.setHorizontalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        deskLayout.setVerticalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        mnuConfiguracion.setText("Configuracion");

        mnuJugador.setSelected(true);
        mnuJugador.setText("Jugador");
        mnuJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuJugadorActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(mnuJugador);
        mnuConfiguracion.add(jSeparator1);

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(jMenuItem1);

        jMenuBar1.add(mnuConfiguracion);

        mnuApostar.setText("Jugar");

        mnuApuesta.setText("Generar apuesta");
        mnuApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuApuestaActionPerformed(evt);
            }
        });
        mnuApostar.add(mnuApuesta);

        jMenuBar1.add(mnuApostar);

        jMenu1.setText("Ver");

        mnuDatos.setText("Datos jugador");
        mnuDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDatosActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDatos);

        jMenuBar1.add(jMenu1);

        mnuHelp.setText("Help");

        mnuDescripcion.setText("Descripcion del juego");
        mnuDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDescripcionActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuDescripcion);

        mnuReglas.setText("Reglas");
        mnuReglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReglasActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuReglas);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desk)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuJugadorActionPerformed
        frmAbout.setVisible(false);
        frmApuesta.setVisible(false);
        frmReglas.setVisible(false);
        frmJugador.setVisible(true);
    }//GEN-LAST:event_mnuJugadorActionPerformed

    private void mnuDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDescripcionActionPerformed
        frmJugador.setVisible(false);
        frmApuesta.setVisible(false);
        frmReglas.setVisible(false);
        frmDatos.setVisible(false);
        frmAbout.setVisible(true);
    }//GEN-LAST:event_mnuDescripcionActionPerformed

    private void mnuReglasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReglasActionPerformed
        frmAbout.setVisible(false);
        frmApuesta.setVisible(false);
        frmJugador.setVisible(false);
        frmDatos.setVisible(false);
        frmReglas.setVisible(true);
    }//GEN-LAST:event_mnuReglasActionPerformed

    private void mnuApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuApuestaActionPerformed
        frmAbout.setVisible(false);
        frmJugador.setVisible(false);
        frmReglas.setVisible(false);
        frmDatos.setVisible(false);
        frmApuesta.setVisible(true);
    }//GEN-LAST:event_mnuApuestaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDatosActionPerformed
        frmAbout.setVisible(false);
        frmJugador.setVisible(false);
        frmReglas.setVisible(false);
        frmApuesta.setVisible(false);
        frmDatos.setVisible(true);
    }//GEN-LAST:event_mnuDatosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desk;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnuApostar;
    private javax.swing.JMenuItem mnuApuesta;
    private javax.swing.JMenu mnuConfiguracion;
    private javax.swing.JMenuItem mnuDatos;
    private javax.swing.JMenuItem mnuDescripcion;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JRadioButtonMenuItem mnuJugador;
    private javax.swing.JMenuItem mnuReglas;
    // End of variables declaration//GEN-END:variables
}
