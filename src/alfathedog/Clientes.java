/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfathedog;

import javax.swing.JFrame;

/**
 *
 * @author steven
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
        setSize(560, 430);
        jDialogNuevoCliente.setSize(560, 430);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogNuevoCliente = new javax.swing.JDialog();
        tienda = new javax.swing.JButton();
        clientes = new javax.swing.JButton();
        mascotas = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        jTextBuscarCliente = new javax.swing.JTextField();
        jButtonNuevoCliente = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        tienda.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        tienda.setText("TIENDA");
        getContentPane().add(tienda);
        tienda.setBounds(370, 30, 180, 60);

        clientes.setBackground(new java.awt.Color(102, 102, 102));
        clientes.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        clientes.setText("CLIENTES");
        getContentPane().add(clientes);
        clientes.setBounds(10, 30, 180, 60);

        mascotas.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        mascotas.setText("MASCOTAS");
        mascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mascotasMouseClicked(evt);
            }
        });
        getContentPane().add(mascotas);
        mascotas.setBounds(190, 30, 180, 60);

        cerrarSesion.setForeground(new java.awt.Color(0, 51, 255));
        cerrarSesion.setText("cerrar sesion");
        cerrarSesion.setContentAreaFilled(false);
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(cerrarSesion);
        cerrarSesion.setBounds(427, 0, 110, 29);

        jTextBuscarCliente.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jTextBuscarCliente.setText("               BUSCAR CLIENTE");
        jTextBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextBuscarClienteMouseClicked(evt);
            }
        });
        jTextBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextBuscarCliente);
        jTextBuscarCliente.setBounds(60, 110, 260, 40);

        jButtonNuevoCliente.setText("Nuevo");
        jButtonNuevoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonNuevoClienteMousePressed(evt);
            }
        });
        getContentPane().add(jButtonNuevoCliente);
        jButtonNuevoCliente.setBounds(390, 110, 120, 40);

        fondo.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fondo.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 560, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        cerrarSesion.setVisible(true);
         Clientes CL= new Clientes();
            
            CL.setVisible(false);
            
            dispose();
            
          AlfaTheDog atd= new AlfaTheDog();
            
            atd.setVisible(true);
            
            dispose();
       
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void jTextBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarClienteActionPerformed
        
    }//GEN-LAST:event_jTextBuscarClienteActionPerformed

    private void jTextBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextBuscarClienteMouseClicked
        jTextBuscarCliente.setText(" ");
    }//GEN-LAST:event_jTextBuscarClienteMouseClicked

    private void jButtonNuevoClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoClienteMousePressed
        Clientes CL= new Clientes();
        jDialogNuevoCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonNuevoClienteMousePressed

    private void mascotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mascotasMouseClicked
        Mascotas Ma= new Mascotas();
            
            Ma.setVisible(true);
            
            dispose();
    }//GEN-LAST:event_mascotasMouseClicked

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JButton clientes;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButtonNuevoCliente;
    private javax.swing.JDialog jDialogNuevoCliente;
    private javax.swing.JTextField jTextBuscarCliente;
    private javax.swing.JButton mascotas;
    private javax.swing.JButton tienda;
    // End of variables declaration//GEN-END:variables
}
