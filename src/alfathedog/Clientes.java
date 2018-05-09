/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfathedog;


import java.awt.Desktop;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author djs
 */
public class Clientes extends javax.swing.JFrame {

    int x, y;                                                                   //inicializa la variable x o y
    
     DefaultTableModel modelo = new DefaultTableModel();                        //inicializa la variable tabla
     
    // conectamos a la base de datos
    private Statement estado;
    private ResultSet resultadoConsulta;
    private Connection conexion;
    ////////////////////////////////////////
    public void escribeDatos(){                                                 // Metodo para conectar la BBDD a la tabla
          modelo.addColumn("Nombre");                                           // Nombre de se le da a la columna de la tabla
          modelo.addColumn("Apellido");                                         // Nombre de se le da a la columna de la tabla
          modelo.addColumn("DNI");                                              // Nombre de se le da a la columna de la tabla
          modelo.addColumn("Telefono");                                         // Nombre de se le da a la columna de la tabla
          jTableCliente.setModel(modelo);                                       // Ruta hacia la tabla
          
        //conexion a la base de datos//////////////////
        String datos[]= new String [4];                                         // Espacio en la memoria para guadar los datos BBDD
          try {
               Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/veterinario","root","root");
            estado = conexion.createStatement();
            resultadoConsulta = estado.executeQuery("Select * from nuevocliente");
            while (resultadoConsulta.next()){
                datos[0]=resultadoConsulta.getString(1);
                datos[1]=resultadoConsulta.getString(2);
                datos[2]=resultadoConsulta.getString(3);
                datos[3]=resultadoConsulta.getString(4);
                modelo.addRow(datos);
            }
            jTableCliente.setModel(modelo);
          } catch (Exception e) {
              
          }  
       }
   
    
    public Clientes() {
        initComponents();
         escribeDatos();

        this.setSize(560, 430);
        this.setLocationRelativeTo(null);
  
        //modificaciones de la ventana nueva mascota
       
        jDialogNuevoCliente.setSize(330, 400);
        jDialogNuevoCliente.setLocation(840, 290);
         
       
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jButtonSalirNuevoCliente = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButtonGuardarCliente = new javax.swing.JButton();
        tienda = new javax.swing.JButton();
        clientes = new javax.swing.JButton();
        mascotas = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        jTextBuscarCliente = new javax.swing.JTextField();
        jButtonNuevoCliente = new javax.swing.JButton();
        jLabelMover = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();

        jDialogNuevoCliente.setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText(" NUEVO CLIENTE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(9, 5, 220, 40);

        jLabelNombre.setText("NOMBRE :");
        jPanel1.add(jLabelNombre);
        jLabelNombre.setBounds(30, 50, 70, 50);

        jLabelApellido.setText("APELLIDO :");
        jPanel1.add(jLabelApellido);
        jLabelApellido.setBounds(30, 110, 70, 50);

        jLabelDni.setText("DNI :");
        jPanel1.add(jLabelDni);
        jLabelDni.setBounds(30, 170, 70, 50);

        jLabelTelefono.setText("TELEFONO :");
        jPanel1.add(jLabelTelefono);
        jLabelTelefono.setBounds(30, 230, 80, 50);

        jButtonSalirNuevoCliente.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButtonSalirNuevoCliente.setText("X");
        jButtonSalirNuevoCliente.setContentAreaFilled(false);
        jButtonSalirNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalirNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirNuevoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalirNuevoCliente);
        jButtonSalirNuevoCliente.setBounds(287, 0, 40, 27);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(120, 230, 140, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(120, 54, 140, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(120, 110, 140, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(120, 170, 140, 30);

        jButtonGuardarCliente.setText("Guardar");
        jButtonGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButtonGuardarCliente);
        jButtonGuardarCliente.setBounds(140, 270, 77, 23);

        jDialogNuevoCliente.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        tienda.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        tienda.setText("TIENDA");
        tienda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tiendaMousePressed(evt);
            }
        });
        getContentPane().add(tienda);
        tienda.setBounds(370, 30, 180, 60);

        clientes.setBackground(new java.awt.Color(102, 102, 102));
        clientes.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        clientes.setText("CLIENTES");
        clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(clientes);
        clientes.setBounds(10, 30, 180, 60);

        mascotas.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        mascotas.setText("MASCOTAS");
        mascotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(cerrarSesion);
        cerrarSesion.setBounds(427, 0, 110, 23);

        jTextBuscarCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextBuscarCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextBuscarCliente.setText("Buscar Cliente");
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

        jButtonNuevoCliente.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jButtonNuevoCliente.setText("Nuevo Cliente");
        jButtonNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNuevoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonNuevoClienteMousePressed(evt);
            }
        });
        getContentPane().add(jButtonNuevoCliente);
        jButtonNuevoCliente.setBounds(390, 110, 120, 40);

        jLabelMover.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabelMover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelMoverMouseDragged(evt);
            }
        });
        jLabelMover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMoverMousePressed(evt);
            }
        });
        getContentPane().add(jLabelMover);
        jLabelMover.setBounds(1, 6, 420, 20);

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "DNI", "Telefono"
            }
        ));
        jTableCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTableCliente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 170, 452, 120);

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
    }//GEN-LAST:event_jButtonNuevoClienteMousePressed

    private void mascotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mascotasMouseClicked
        Mascotas Ma= new Mascotas();
            
            Ma.setVisible(true);
            
            dispose();
    }//GEN-LAST:event_mascotasMouseClicked

    private void jLabelMoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMoverMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabelMoverMousePressed

    private void jLabelMoverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMoverMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() -  y);
    }//GEN-LAST:event_jLabelMoverMouseDragged

    private void jButtonSalirNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirNuevoClienteActionPerformed
        jDialogNuevoCliente.setVisible(false);
    }//GEN-LAST:event_jButtonSalirNuevoClienteActionPerformed

    private void tiendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiendaMousePressed
       try {
    if (Desktop.isDesktopSupported()) {
    Desktop desktop = Desktop.getDesktop();
    if (desktop.isSupported(Desktop.Action.BROWSE)) {
    desktop.browse(new URI("https://alvarezmd9.wixsite.com/veterinario"));
        }
    }
} catch (Exception e) {
e.printStackTrace();
}
    }//GEN-LAST:event_tiendaMousePressed

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
    private javax.swing.JButton jButtonGuardarCliente;
    private javax.swing.JButton jButtonNuevoCliente;
    private javax.swing.JButton jButtonSalirNuevoCliente;
    private javax.swing.JDialog jDialogNuevoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelMover;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTextBuscarCliente;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton mascotas;
    private javax.swing.JButton tienda;
    // End of variables declaration//GEN-END:variables
 
     
    

}
