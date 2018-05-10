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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.smartcardio.ATR;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author djs
 */
public class Clientes extends javax.swing.JFrame {

    int x, y;                                                                   //inicializa la variable x o y
     String datos[]= new String [4];                                            // Espacio en la memoria para guadar los datos BBDD
     DefaultTableModel modelo = new DefaultTableModel();                        //inicializa la variable tabla
      String palabra="DNI";
      String pa="";
    // conectamos a la base de datos////////////////////////////////////////////
    private Statement estado;
    private ResultSet resultadoConsulta;
    private Connection conexion;
    ///////////////////////////////////////////////////////////////////////////
    public void escribeDatos(){                                                 // Metodo para conectar la BBDD a la tabla
          modelo.addColumn("Nombre");                                           // Nombre de se le da a la columna de la tabla
          modelo.addColumn("Apellido");                                         // Nombre de se le da a la columna de la tabla
          modelo.addColumn("DNI");                                              // Nombre de se le da a la columna de la tabla
          modelo.addColumn("Telefono");                                         // Nombre de se le da a la columna de la tabla
          jTableCliente.setModel(modelo);                                       // Ruta hacia la tabla
    }
    
    
        //conexion a la base de datos///////////////////////////////////////////
     public void conexion(){
         
        
             
             
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
    
   public void limpiar(){
        jTextField2.setText("");                                                //se limpia el campo nombre
        jTextField3.setText("");                                                //se limpia el campo apellido
        jTextField4.setText("");                                                //se limpia el campo dni
        jTextField1.setText("");                                                //se limpia el campo telefono
        jTextBuscarCliente.setText("");                                         //se limpia el campo buscar cliente
        
   
   }
   public void nombrebuscar(){
       jComboBuscar.addItem("Nombre");
       jComboBuscar.addItem("Apellido");
       jComboBuscar.addItem("DNI");
       jComboBuscar.addItem("Telefono");
   
   }
   
    
    public Clientes() {
        initComponents();                                                       //se inicia el programa
         escribeDatos();                                                        //se escribe el nombre de la columnas de la tabla
         conexion();                                                            //se inicia los datos BBDD en la tabla
         nombrebuscar();
        this.setSize(560, 430);                                                 //dimension del programa jpanel
        this.setLocationRelativeTo(null);                                       //posiciona el programa en medio de la pantalla
  
        //modificaciones de la ventana nuevo cliente
       
        jDialogNuevoCliente.setSize(380, 400);                                  //dimensiones de la pantalla nuevo cliente jdialog
        jDialogNuevoCliente.setLocation(975, 290);                              //posicion donde se inicia la pantalla nuevo cliente
         
       
        
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
        jButtonLimpiar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        tienda = new javax.swing.JButton();
        clientes = new javax.swing.JButton();
        mascotas = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        jTextBuscarCliente = new javax.swing.JTextField();
        jButtonNuevoCliente = new javax.swing.JButton();
        jLabelMover = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jButtonEliminarCliente = new javax.swing.JButton();
        jComboBuscar = new javax.swing.JComboBox<>();
        jButtonBuscarClientePor = new javax.swing.JButton();
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
        jButtonSalirNuevoCliente.setBounds(340, 0, 40, 35);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(120, 230, 200, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(120, 54, 200, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(120, 110, 200, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(120, 170, 200, 30);

        jButtonGuardarCliente.setText("Guardar");
        jButtonGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardarCliente);
        jButtonGuardarCliente.setBounds(20, 270, 77, 32);

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpiar);
        jButtonLimpiar.setBounds(187, 270, 80, 32);

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonModificar);
        jButtonModificar.setBounds(100, 270, 83, 32);

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonActualizar);
        jButtonActualizar.setBounds(270, 270, 90, 32);

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
        mascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascotasActionPerformed(evt);
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
        cerrarSesion.setBounds(427, 0, 110, 32);

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
        jTextBuscarCliente.setBounds(60, 100, 260, 30);

        jButtonNuevoCliente.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jButtonNuevoCliente.setText("Nuevo Cliente");
        jButtonNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNuevoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonNuevoClienteMousePressed(evt);
            }
        });
        jButtonNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNuevoCliente);
        jButtonNuevoCliente.setBounds(400, 110, 120, 40);

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
        jScrollPane1.setBounds(60, 170, 453, 120);

        jButtonEliminarCliente.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jButtonEliminarCliente.setText("Eliminar Cliente");
        jButtonEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminarCliente);
        jButtonEliminarCliente.setBounds(400, 340, 120, 40);

        getContentPane().add(jComboBuscar);
        jComboBuscar.setBounds(60, 140, 160, 26);

        jButtonBuscarClientePor.setText("Buscar");
        jButtonBuscarClientePor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClientePorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarClientePor);
        jButtonBuscarClientePor.setBounds(240, 142, 71, 20);

        fondo.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fondo.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 560, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        
        //cierra sesion del programa////////////////////////////////////////////
        
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
        jTextBuscarCliente.setText(" ");                                        //cuando vamos a buscar un cliente se borra(BUSCAR NUEVO CLIENTE)
    }//GEN-LAST:event_jTextBuscarClienteMouseClicked

    private void jButtonNuevoClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoClienteMousePressed
       
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
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() -  y);//para mover el programa por la pantalla
    }//GEN-LAST:event_jLabelMoverMouseDragged

    private void jButtonSalirNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirNuevoClienteActionPerformed
        jDialogNuevoCliente.setVisible(false);                                  //
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

    private void jButtonGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarClienteActionPerformed
        
        //inserta un nuevo cliente en la BBDD///////////////////////////////////
        try {
               Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/veterinario","root","root");
            estado = conexion.createStatement();
            PreparedStatement pps = conexion.prepareStatement("INSERT INTO nuevocliente(Nombre,Apellido,DNI, Teléfono) VALUES (?,?,?,?)");
                pps.setString(1, jTextField2.getText());
                pps.setString(2, jTextField3.getText());
                pps.setString(3, jTextField4.getText());
                pps.setString(4, jTextField1.getText());
                pps.executeUpdate();

            
        } catch (Exception e) {
            System.out.println("error");
        }
        
    }//GEN-LAST:event_jButtonGuardarClienteActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        //para limpiar todos los campos escritos////////////////////////////////
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
       
        // seleccionamos una fila de la tabla para escribirla en todo los campos de nuevo cliente//////////////////
        
        int fila = jTableCliente.getSelectedRow();
       
       if(fila>=0){
           
           jTextBuscarCliente.setText(jTableCliente.getValueAt(fila, 2).toString());
            jTextField2.setText(jTableCliente.getValueAt(fila, 0).toString());
            jTextField3.setText(jTableCliente.getValueAt(fila, 1).toString());
            jTextField4.setText(jTableCliente.getValueAt(fila, 2).toString());
            jTextField1.setText(jTableCliente.getValueAt(fila, 3).toString());
            
       }
       else{
            JOptionPane.showMessageDialog(null,"No has seleccionado la fila");
       
       }
       
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        
        //para modificar los datos de cliente y actualizar la base de datos//////////////
        
        try {
           
            PreparedStatement pps = conexion.prepareStatement("UPDATE nuevocliente SET Nombre='"+jTextField2.getText()+"',Apellido='"
                    +jTextField3.getText()+"',DNI='"+jTextField4.getText()+"',Teléfono='"
                    +jTextField1.getText()+"' WHERE DNI='"+jTextBuscarCliente.getText()+"'");
 
              pps.executeUpdate();
              
              JOptionPane.showMessageDialog(null, "Datos Actualizados");
              limpiar();
 
              modelo.getDataVector().removeAllElements();
              conexion();
              
              
    }     
                catch (Exception e) {
        }
         
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNuevoClienteActionPerformed

    private void mascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mascotasActionPerformed

    private void jButtonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarClienteActionPerformed
       int fila = jTableCliente.getSelectedRow();
       String valor = jTableCliente.getValueAt(fila, 2).toString();
       if(fila>=0){
            try {
                PreparedStatement pps = conexion.prepareStatement("DELETE FROM nuevocliente WHERE DNI='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato Eliminado");
                 modelo.getDataVector().removeAllElements();
                 conexion();
                
                
           } catch (Exception e) {
           }
       
       }
       
       
       
    }//GEN-LAST:event_jButtonEliminarClienteActionPerformed

    private void jButtonBuscarClientePorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClientePorActionPerformed
       
      
      
       
    }//GEN-LAST:event_jButtonBuscarClientePorActionPerformed
    
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
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBuscarClientePor;
    private javax.swing.JButton jButtonEliminarCliente;
    private javax.swing.JButton jButtonGuardarCliente;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevoCliente;
    private javax.swing.JButton jButtonSalirNuevoCliente;
    private javax.swing.JComboBox<String> jComboBuscar;
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
