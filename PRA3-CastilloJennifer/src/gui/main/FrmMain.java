
package gui.main;

import gui.internal.FrmConfig;
import gui.internal.FrmNuevo;
import gui.internal.FrmVer;
import java.awt.Dimension;


public class FrmMain extends javax.swing.JFrame {

    public FrmConfig frmConfig = new FrmConfig();
    public FrmNuevo frmNuevo = new FrmNuevo();
    public FrmVer frmVer = new FrmVer();
    
    public FrmMain() {
        initComponents();
        
        desk.add(frmConfig);
        desk.add(frmNuevo);
        desk.add(frmVer);
        
        this.pack();
        this.setLocationRelativeTo(null);
        
        Dimension desktopSize = desk.getSize();
        Dimension FrameSize = frmConfig.getSize();
        Dimension FrameSize2 = frmVer.getSize();
        Dimension FrameSize3 = frmNuevo.getSize();
        frmConfig.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        frmVer.setLocation((desktopSize.width - FrameSize2.width)/2, (desktopSize.height- FrameSize2.height)/2);
        frmNuevo.setLocation((desktopSize.width - FrameSize3.width)/2, (desktopSize.height- FrameSize3.height)/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desk = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mnuBar = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuConfig = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSalir = new javax.swing.JMenuItem();
        mnuServicio = new javax.swing.JMenu();
        mnuNuevo = new javax.swing.JMenuItem();
        mnuSuscripcion = new javax.swing.JMenu();
        mnuVerSuscripciones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mis suscripciones");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.lightGray);
        setName("Mis suscripciones"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Bienvenide");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 580, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jajas\\Downloads\\6279463.png")); // NOI18N

        desk.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desk.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout deskLayout = new javax.swing.GroupLayout(desk);
        desk.setLayout(deskLayout);
        deskLayout.setHorizontalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(deskLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        deskLayout.setVerticalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deskLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        mnuBar.setBackground(new java.awt.Color(0, 51, 255));
        mnuBar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 102, 255)));
        mnuBar.setForeground(new java.awt.Color(51, 51, 255));

        mnuArchivo.setText("Archivo");

        mnuConfig.setText("Configuracion");
        mnuConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConfigActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuConfig);
        mnuArchivo.add(jSeparator1);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuSalir);

        mnuBar.add(mnuArchivo);

        mnuServicio.setText("Servicio");

        mnuNuevo.setText("Nuevo");
        mnuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNuevoActionPerformed(evt);
            }
        });
        mnuServicio.add(mnuNuevo);

        mnuBar.add(mnuServicio);

        mnuSuscripcion.setText("Suscripciones");

        mnuVerSuscripciones.setText("Ver");
        mnuVerSuscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVerSuscripcionesActionPerformed(evt);
            }
        });
        mnuSuscripcion.add(mnuVerSuscripciones);

        mnuBar.add(mnuSuscripcion);

        setJMenuBar(mnuBar);

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

        getAccessibleContext().setAccessibleName("a");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConfigActionPerformed
        frmConfig.setVisible(false);
        frmConfig.show();
        frmNuevo.setVisible(false);
        frmVer.setVisible(false);
    }//GEN-LAST:event_mnuConfigActionPerformed

    private void mnuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNuevoActionPerformed
        frmNuevo.setVisible(false);
        frmNuevo.show();
        frmVer.setVisible(false);
        frmConfig.setVisible(false);
    }//GEN-LAST:event_mnuNuevoActionPerformed

    private void mnuVerSuscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVerSuscripcionesActionPerformed
        frmVer.setVisible(true);
        frmVer.show();
        frmNuevo.setVisible(false);
        frmConfig.setVisible(false);
    }//GEN-LAST:event_mnuVerSuscripcionesActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public static javax.swing.JLabel lblNombre;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenuBar mnuBar;
    private javax.swing.JMenuItem mnuConfig;
    private javax.swing.JMenuItem mnuNuevo;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenu mnuServicio;
    private javax.swing.JMenu mnuSuscripcion;
    private javax.swing.JMenuItem mnuVerSuscripciones;
    // End of variables declaration//GEN-END:variables
}
