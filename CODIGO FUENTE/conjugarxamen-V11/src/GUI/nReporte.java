/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;



import conjuexamen.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author logan
 */
public class nReporte extends javax.swing.JFrame {
    private servicios serv;
    private nobtnerExamen nobtener;
    private ArrayList<nexamen> exaconjugado;
    private ArrayList<String> lista;
    private Connection conn;
    
    
    private int n;
    private int idexamen;
    private String nombreTabla;
    private String bd;
    public nReporte() {
        initComponents();
        this.setLocation(400, 50);
        lista=new ArrayList<>();
        exaconjugado=new ArrayList<>();
        
        serv=new servicios();
        nobtener=new nobtnerExamen();
           
       
       bd="conjugarexamen";
       
       idexamen=0;
       
       conjugar();
      
    }
 
    public void reporte1() throws JRException{
        try {
           conn= serv.conectar1(bd);
         String dir="D:\\software\\conjugarxamen-V11\\src\\vista\\examenconjugado.jrxml";  
         JasperReport reporte=JasperCompileManager.compileReport(dir);
         JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, conn);
         JasperViewer.viewReport(jasperPrint);
 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(nReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void lista(){
    lista.add("a");
    lista.add("b");
    lista.add("c");
    lista.add("d");
    lista.add("e");    
    }
public void conjugar(){
exaconjugado=nobtener.cargarexamen();
String alternativaAleatoria;
String alternativaClave;
int clave;

for(int i=0;i<exaconjugado.size();i++){    

for(int contador=0;contador<exaconjugado.get(i).getPreguntas().size();contador++){
    
Random rn=new Random();
int aleatorio=0+rn.nextInt(5);


clave=exaconjugado.get(i).getPreguntas().get(contador).getCalt();

alternativaAleatoria=exaconjugado.get(i).getPreguntas().get(contador).getAlternativas().get(aleatorio).getTituloAlternativa();

alternativaClave=exaconjugado.get(i).getPreguntas().get(contador).getAlternativas().get(clave).getTituloAlternativa();  

exaconjugado.get(i).getPreguntas().get(contador).getAlternativas().get(clave).setTituloAlternativa(alternativaAleatoria);
exaconjugado.get(i).getPreguntas().get(contador).getAlternativas().get(aleatorio).setTituloAlternativa(alternativaClave);

exaconjugado.get(i).getPreguntas().get(contador).setCalt(aleatorio);
        }
    
    }
    
   }
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        panelNice7 = new org.edisoncor.gui.panel.PanelNice();
        btnGroupAlternativas = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        txttituloexamen = new org.edisoncor.gui.textField.TextFieldRound();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu4.setText("jMenu4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelNice7Layout = new javax.swing.GroupLayout(panelNice7);
        panelNice7.setLayout(panelNice7Layout);
        panelNice7Layout.setHorizontalGroup(
            panelNice7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelNice7Layout.setVerticalGroup(
            panelNice7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice1.setBackground(new java.awt.Color(153, 255, 51));
        panelNice1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "crear examen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), java.awt.Color.blue)); // NOI18N

        txttituloexamen.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 255, 255)));
        txttituloexamen.setCaretColor(new java.awt.Color(0, 0, 204));
        txttituloexamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttituloexamenActionPerformed(evt);
            }
        });
        txttituloexamen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttituloexamenKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bitstream Vera Sans Mono", 1, 18)); // NOI18N
        jLabel1.setText("EXAMEN");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/First.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Last.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNice1Layout = new javax.swing.GroupLayout(panelNice1);
        panelNice1.setLayout(panelNice1Layout);
        panelNice1Layout.setHorizontalGroup(
            panelNice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNice1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(txttituloexamen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(panelNice1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2)
                        .addGap(27, 27, 27))))
        );
        panelNice1Layout.setVerticalGroup(
            panelNice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice1Layout.createSequentialGroup()
                .addGroup(panelNice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttituloexamen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panelNice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1)))
        );

        jPanel3.add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 345, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SALIR.png"))); // NOI18N
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 139, 70));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1291628633_reports.png"))); // NOI18N
        jButton4.setText("Reporte");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AAAAAAAAAAAAAA.JPG"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 320));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 370, 320));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttituloexamenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttituloexamenKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttituloexamenKeyPressed

    private void txttituloexamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttituloexamenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttituloexamenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            idexamen--;
         
        if(idexamen<0){
        idexamen=exaconjugado.size()-1;
        
        }
    txttituloexamen.setText(exaconjugado.get(idexamen).getTituloExamen());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           idexamen++;
       if(idexamen>exaconjugado.size()-1){
       idexamen=0;
       }
    txttituloexamen.setText(exaconjugado.get(idexamen).getTituloExamen());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
     txttituloexamen.setText(exaconjugado.get(idexamen).getTituloExamen());
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          int n=0;
        
        insertarexamenconjugado();
       
        try {
  
            reporte1();
            try {
                serv.conectar("conjugarexamen");
            } catch (    ClassNotFoundException | SQLException ex) {
                Logger.getLogger(nReporte.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            for(int contador=1;contador<=exaconjugado.get(idexamen).getPreguntas().size();contador++){
                try {
                    serv.consulta("delete from examenconjugar where id ="+contador);
                    n=serv.executeUpdate();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(nReporte.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            
            }
            
            

        } catch (JRException ex) {
            Logger.getLogger(nReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    
    

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
            java.util.logging.Logger.getLogger(nReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupAlternativas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice7;
    private org.edisoncor.gui.textField.TextFieldRound txttituloexamen;
    // End of variables declaration//GEN-END:variables
public void insertarexamenconjugado(){
     
 lista();
        
        
        try {
            serv.conectar("conjugarexamen");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(nReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
       try {
            int cantidad=1;
            int n1;
            int clave;
            // 
            for(int contador=0;contador<exaconjugado.get(idexamen).getPreguntas().size();contador++){
                
                    serv.consulta("insert into examenconjugar (id,tituloexamen,titulopregunta,respclave,altera,alterb,alterc,alterd,altere) value(?,?,?,?,?,?,?,?,?)");
                    serv.setInt(1, cantidad);
                    serv.setString(2, exaconjugado.get(idexamen).getTituloExamen());
                    serv.setString(3, exaconjugado.get(idexamen).getPreguntas().get(contador).getTituloPregunta());
                    
                    clave=exaconjugado.get(idexamen).getPreguntas().get(contador).getCalt();
                    
                    serv.setString(4, lista.get(clave));
                    serv.setString(5, exaconjugado.get(idexamen).getPreguntas().get(contador).getAlternativas().get(0).getTituloAlternativa());
                    serv.setString(6, exaconjugado.get(idexamen).getPreguntas().get(contador).getAlternativas().get(1).getTituloAlternativa());
                    serv.setString(7, exaconjugado.get(idexamen).getPreguntas().get(contador).getAlternativas().get(2).getTituloAlternativa());
                    serv.setString(8, exaconjugado.get(idexamen).getPreguntas().get(contador).getAlternativas().get(3).getTituloAlternativa());
                    serv.setString(9, exaconjugado.get(idexamen).getPreguntas().get(contador).getAlternativas().get(4).getTituloAlternativa());
                    cantidad++;
                    n1=serv.executeUpdate();                                   
            }
            
              
        } catch (SQLException ex) {
            Logger.getLogger(nIngresodatos.class.getName()).log(Level.SEVERE, null, ex);
        }        
 
 
 }
}
