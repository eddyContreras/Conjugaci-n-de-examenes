/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import conjuexamen.*;

/**
 *
 * @author logan
 */
public class nPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    
    private nIngresodatos ingreso;
    private nMostrar mostrar;
    private nReporte mireport;
    
    public nPrincipal() {
        this.setUndecorated(false);
           initComponents();
        
       this.setLocation(200, 50);
        ingreso=new nIngresodatos();
        mostrar=new nMostrar();
        mireport=new nReporte();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        balloonManager1 = new org.edisoncor.gui.util.BalloonManager();
        clockDigital1 = new org.edisoncor.gui.varios.ClockDigital();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        panelNice5 = new org.edisoncor.gui.panel.PanelNice();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        panelNice3 = new org.edisoncor.gui.panel.PanelNice();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("elaboracion del examen");
        setBackground(new java.awt.Color(0, 153, 204));
        setForeground(new java.awt.Color(0, 0, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelNice5.setBackground(new java.awt.Color(0, 153, 255));
        panelNice5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice1.setBackground(new java.awt.Color(255, 255, 255));
        panelNice1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "crear examen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), java.awt.Color.blue)); // NOI18N
        panelNice1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Bitstream Vera Sans Mono", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("CREAR EXAMEN");
        panelNice1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 44, 235, 25));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new.jpg"))); // NOI18N
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelNice1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 17, 83, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AAA.JPG"))); // NOI18N
        panelNice1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 110));

        panelNice5.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 14, 470, -1));

        panelNice2.setBackground(new java.awt.Color(255, 255, 255));
        panelNice2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "crear examen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), java.awt.Color.blue)); // NOI18N
        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bitstream Vera Sans Mono", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("MOSTAR EXAMENES");
        panelNice2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 24, -1, 25));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mantenimiento.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelNice2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 8, -1, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AAA.JPG"))); // NOI18N
        panelNice2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 100));

        panelNice5.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 470, 100));

        panelNice3.setBackground(new java.awt.Color(255, 255, 255));
        panelNice3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "crear examen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), java.awt.Color.blue)); // NOI18N
        panelNice3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Bitstream Vera Sans Mono", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("EXAMEN CONJUGADO");
        panelNice3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 43, -1, 25));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1291628633_reports.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelNice3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 80, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AAA.JPG"))); // NOI18N
        panelNice3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 110));

        panelNice5.add(panelNice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 470, 110));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SALIR.png"))); // NOI18N
        jButton4.setText("SALIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelNice5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 120, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/A.JPG"))); // NOI18N
        panelNice5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 530, 510));

        jMenu3.setBackground(new java.awt.Color(255, 0, 0));
        jMenu3.setForeground(new java.awt.Color(0, 0, 255));
        jMenu3.setText("                           UNIVERSIDAD NACIONAL JOSE MARIA ARGUEDAS - ANDAHUYALAS");
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jMenu3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelNice5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelNice5, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mostrar.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         mireport.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
           setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ingreso.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(nPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.util.BalloonManager balloonManager1;
    private org.edisoncor.gui.varios.ClockDigital clockDigital1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private org.edisoncor.gui.panel.PanelNice panelNice3;
    private org.edisoncor.gui.panel.PanelNice panelNice5;
    // End of variables declaration//GEN-END:variables
}
