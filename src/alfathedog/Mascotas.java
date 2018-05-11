/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfathedog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.scene.layout.Background;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author djs
 */
public class Mascotas extends javax.swing.JFrame {
     int x, y;                                                                  //inicializa la variable x o y
     String datos[]= new String [7];                                            // Espacio en la memoria para guadar los datos BBDD
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
          modelo.addColumn("Sexo");                                         // Nombre de se le da a la columna de la tabla
          modelo.addColumn("Especie");                                              // Nombre de se le da a la columna de la tabla
          modelo.addColumn("Raza");                                         // Nombre de se le da a la columna de la tabla
          modelo.addColumn("Chip");                                         // Nombre de se le da a la columna de la tabla
          modelo.addColumn("Fecha_nacimiento");                                         // Nombre de se le da a la columna de la tabla
           modelo.addColumn("Propietario");                                         // Nombre de se le da a la columna de la tabla
          jTableMascota.setModel(modelo);                                       // Ruta hacia la tabla
    }
    
    
        //conexion a la base de datos///////////////////////////////////////////
     public void conexion(){

          try {
               Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/veterinario","root","root");
            estado = conexion.createStatement();
            resultadoConsulta = estado.executeQuery("Select * from nuevamascota");
            while (resultadoConsulta.next()){
                datos[0]=resultadoConsulta.getString(1);
                datos[1]=resultadoConsulta.getString(2);
                datos[2]=resultadoConsulta.getString(3);
                datos[3]=resultadoConsulta.getString(4);
                 datos[4]=resultadoConsulta.getString(5);
                  datos[5]=resultadoConsulta.getString(6);
                   datos[6]=resultadoConsulta.getString(7);
                modelo.addRow(datos);
            }
            jTableMascota.setModel(modelo);
          } catch (Exception e) {
              
          }  
       
}
    
   public void limpiar(){
        jTextFieldNombre.setText("");                                                //se limpia el campo nombre
        jTextFieldSexo.setText("");                                                //se limpia el campo apellido
        jTextFieldEspecie.setText("");                                                //se limpia el campo dni
        jTextFieldRaza.setText("");                                                //se limpia el campo telefono
        jTextFieldChip.setText("");                                                //se limpia el campo nombre
        jTextFieldFecha1.setText("");                                                //se limpia el campo nombre
        jTextFieldPropietario.setText("");                                                //se limpia el campo nombre
        jTextBuscarCliente.setText("");                                         //se limpia el campo buscar cliente
        
   
   }
   public void nombrebuscar(){
//       jComboBuscar.addItem("Nombre");
//       jComboBuscar.addItem("Apellido");
//       jComboBuscar.addItem("DNI");
//       jComboBuscar.addItem("Telefono");
   
   }
   
    
    /**
     * Creates new form Clientes
     */
    public Mascotas() {
        initComponents();
         escribeDatos();                                                        //se escribe el nombre de la columnas de la tabla
         conexion();                                                            //se inicia los datos BBDD en la tabla
         nombrebuscar();
        setSize(560, 430);
        this.setLocationRelativeTo(null);
        
        //modificaciones de la ventana nueva mascota
       
        jDialogNuevaMascota.setSize(380, 450);
        jDialogNuevaMascota.setLocation(975, 290);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogNuevaMascota = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabeEspecie = new javax.swing.JLabel();
        jLabelNuuevaMascota = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabeRaza = new javax.swing.JLabel();
        jLabelPropietario = new javax.swing.JLabel();
        jLabelChip = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jLabelFechaNacimiento = new javax.swing.JLabel();
        jTextFieldChip = new javax.swing.JTextField();
        jTextFieldPropietario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelNuuevaMascota1 = new javax.swing.JLabel();
        jLabeEspecie1 = new javax.swing.JLabel();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabelSexo1 = new javax.swing.JLabel();
        jLabeRaza1 = new javax.swing.JLabel();
        jLabelPropietario1 = new javax.swing.JLabel();
        jLabelFoto1 = new javax.swing.JLabel();
        jLabelChip1 = new javax.swing.JLabel();
        jButtonSalir1 = new javax.swing.JButton();
        jLabelFechaNacimiento1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextFieldEspecie = new javax.swing.JTextField();
        jTextFieldRaza = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldSexo = new javax.swing.JTextField();
        jButtonActualizar = new javax.swing.JButton();
        jTextFieldFecha1 = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonModificar1 = new javax.swing.JButton();
        jButtonLimpiar1 = new javax.swing.JButton();
        tienda = new javax.swing.JButton();
        clientes = new javax.swing.JButton();
        mascotas = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        jTextBuscarCliente = new javax.swing.JTextField();
        jButtonNuevaMascota = new javax.swing.JButton();
        jButtonEliminarMascota = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMascota = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();

        jDialogNuevaMascota.setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabeEspecie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeEspecie.setText("ESPECIE:");
        jPanel1.add(jLabeEspecie);
        jLabeEspecie.setBounds(0, 150, 150, 20);

        jLabelNuuevaMascota.setBackground(new java.awt.Color(0, 102, 102));
        jLabelNuuevaMascota.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabelNuuevaMascota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNuuevaMascota.setText("NUEVA MASCOTA");
        jLabelNuuevaMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabelNuuevaMascota);
        jLabelNuuevaMascota.setBounds(0, 0, 340, 60);

        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("NOMBRE:");
        jPanel1.add(jLabelNombre);
        jLabelNombre.setBounds(0, 70, 150, 20);

        jLabelSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSexo.setText("SEXO:");
        jPanel1.add(jLabelSexo);
        jLabelSexo.setBounds(0, 110, 150, 20);

        jLabeRaza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeRaza.setText("RAZA:");
        jPanel1.add(jLabeRaza);
        jLabeRaza.setBounds(0, 190, 150, 20);

        jLabelPropietario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPropietario.setText("PROPIETARIO:");
        jPanel1.add(jLabelPropietario);
        jLabelPropietario.setBounds(0, 310, 150, 20);

        jLabelChip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelChip.setText("CHIP:");
        jPanel1.add(jLabelChip);
        jLabelChip.setBounds(0, 230, 150, 20);

        jButtonSalir.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jButtonSalir.setText("X");
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonSalir);
        jButtonSalir.setBounds(290, 0, 40, 30);

        jLabelFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechaNacimiento.setText("FECHA NACIMIENTO:");
        jPanel1.add(jLabelFechaNacimiento);
        jLabelFechaNacimiento.setBounds(0, 270, 150, 20);

        jTextFieldChip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChipActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldChip);
        jTextFieldChip.setBounds(150, 220, 180, 30);
        jPanel1.add(jTextFieldPropietario);
        jTextFieldPropietario.setBounds(150, 300, 180, 30);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jLabelNuuevaMascota1.setBackground(new java.awt.Color(0, 102, 102));
        jLabelNuuevaMascota1.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabelNuuevaMascota1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNuuevaMascota1.setText("NUEVA MASCOTA");
        jPanel2.add(jLabelNuuevaMascota1);
        jLabelNuuevaMascota1.setBounds(0, 0, 340, 60);

        jLabeEspecie1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeEspecie1.setText("ESPECIE:");
        jPanel2.add(jLabeEspecie1);
        jLabeEspecie1.setBounds(0, 150, 160, 20);

        jLabelNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre1.setText("NOMBRE:");
        jPanel2.add(jLabelNombre1);
        jLabelNombre1.setBounds(0, 70, 160, 20);

        jLabelSexo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSexo1.setText("SEXO:");
        jPanel2.add(jLabelSexo1);
        jLabelSexo1.setBounds(0, 110, 160, 20);

        jLabeRaza1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeRaza1.setText("RAZA:");
        jPanel2.add(jLabeRaza1);
        jLabeRaza1.setBounds(0, 190, 160, 20);

        jLabelPropietario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPropietario1.setText("PROPIETARIO:");
        jPanel2.add(jLabelPropietario1);
        jLabelPropietario1.setBounds(0, 310, 160, 20);

        jLabelFoto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto1.setText("FOTO:");
        jPanel2.add(jLabelFoto1);
        jLabelFoto1.setBounds(0, 360, 160, 20);

        jLabelChip1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelChip1.setText("CHIP:");
        jPanel2.add(jLabelChip1);
        jLabelChip1.setBounds(0, 230, 160, 20);

        jButtonSalir1.setText("X");
        jPanel2.add(jButtonSalir1);
        jButtonSalir1.setBounds(300, 10, 20, 20);

        jLabelFechaNacimiento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechaNacimiento1.setText("FECHA NACIMIENTO:");
        jPanel2.add(jLabelFechaNacimiento1);
        jLabelFechaNacimiento1.setBounds(0, 270, 160, 20);

        jTextField3.setText("jTextField1");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3);
        jTextField3.setBounds(150, 220, 180, 30);

        jTextField4.setText("jTextField1");
        jPanel2.add(jTextField4);
        jTextField4.setBounds(150, 260, 180, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 0, 0);

        jTextFieldEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEspecieActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldEspecie);
        jTextFieldEspecie.setBounds(150, 140, 180, 30);
        jPanel1.add(jTextFieldRaza);
        jTextFieldRaza.setBounds(150, 180, 180, 30);

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombre);
        jTextFieldNombre.setBounds(150, 60, 180, 30);
        jPanel1.add(jTextFieldSexo);
        jTextFieldSexo.setBounds(150, 100, 180, 30);

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonActualizar);
        jButtonActualizar.setBounds(250, 340, 110, 40);
        jPanel1.add(jTextFieldFecha1);
        jTextFieldFecha1.setBounds(150, 260, 180, 30);

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar);
        jButtonGuardar.setBounds(10, 340, 110, 40);

        jButtonModificar1.setText("Modificar");
        jButtonModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonModificar1);
        jButtonModificar1.setBounds(130, 340, 110, 40);

        jButtonLimpiar1.setText("Limpiar");
        jButtonLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpiar1);
        jButtonLimpiar1.setBounds(250, 400, 110, 40);

        jDialogNuevaMascota.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        tienda.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        tienda.setText("TIENDA");
        tienda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(tienda);
        tienda.setBounds(370, 30, 180, 60);

        clientes.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        clientes.setText("CLIENTES");
        clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesMouseClicked(evt);
            }
        });
        getContentPane().add(clientes);
        clientes.setBounds(10, 30, 180, 60);

        mascotas.setBackground(new java.awt.Color(102, 102, 102));
        mascotas.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        mascotas.setText("MASCOTAS");
        mascotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        cerrarSesion.setBounds(427, 0, 110, 32);

        jTextBuscarCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextBuscarCliente.setText("BUSCAR MASCOTA");
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
        jTextBuscarCliente.setBounds(40, 100, 260, 40);

        jButtonNuevaMascota.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jButtonNuevaMascota.setText("NUEVA");
        jButtonNuevaMascota.setToolTipText("");
        jButtonNuevaMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNuevaMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonNuevaMascotaMousePressed(evt);
            }
        });
        jButtonNuevaMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaMascotaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNuevaMascota);
        jButtonNuevaMascota.setBounds(410, 100, 120, 40);

        jButtonEliminarMascota.setText("Eliminar Mascota");
        jButtonEliminarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarMascotaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminarMascota);
        jButtonEliminarMascota.setBounds(397, 370, 130, 32);

        jTableMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableMascota);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(3, 180, 550, 110);

        fondo.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fondos Wallpaper Gratis Abstractos (71).jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 560, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        cerrarSesion.setVisible(true);
         Mascotas CL= new Mascotas();
            
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

    private void jButtonNuevaMascotaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevaMascotaMousePressed
        Mascotas CL= new Mascotas();
        jDialogNuevaMascota.setVisible(true);
        
    }//GEN-LAST:event_jButtonNuevaMascotaMousePressed

    private void clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesMouseClicked
        Clientes CL= new Clientes();
            
            CL.setVisible(true);
            
            dispose();
    }//GEN-LAST:event_clientesMouseClicked

    private void jTextFieldChipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChipActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextFieldEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEspecieActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseClicked
                                                     
        jButtonSalir.setVisible(true);
         jDialogNuevaMascota.setVisible(false);
            
            
            
            
            
          
       
    
    }//GEN-LAST:event_jButtonSalirMouseClicked

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
    
        //para modificar los datos de cliente y actualizar la base de datos//////////////
        
        try {
           
            PreparedStatement pps = conexion.prepareStatement("UPDATE nuevamascota SET Nombre='"+jTextFieldNombre.getText()+"',Sexo='"
                    +jTextFieldSexo.getText()+"',Especie='"+jTextFieldEspecie.getText()+"',Raza='"
                    +jTextFieldRaza.getText()+"',Chip='"+jTextFieldChip.getText()+"',Fecha_nacimiento='"
                    +jTextFieldFecha1.getText()+"',Propietario='"
                    +jTextFieldPropietario.getText()+"' WHERE Chip='"+jTextBuscarCliente.getText()+"'");
 
              pps.executeUpdate();
              
              JOptionPane.showMessageDialog(null, "Datos Actualizados");
              limpiar();
 
              modelo.getDataVector().removeAllElements();
              conexion();
              
              
    }     
                catch (Exception e) {
        }
         
                                                    

                                                         
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonNuevaMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNuevaMascotaActionPerformed

    private void jButtonEliminarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarMascotaActionPerformed
         int fila = jTableMascota.getSelectedRow();
       String valor = jTableMascota.getValueAt(fila, 2).toString();
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
    }//GEN-LAST:event_jButtonEliminarMascotaActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        //inserta un nuevo cliente en la BBDD///////////////////////////////////
        try {
               Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/veterinario","root","root");
            estado = conexion.createStatement();
            PreparedStatement pps = conexion.prepareStatement("INSERT INTO nuevamascota(Nombre,Sexo,Especie, Raza,Chip,Fecha_nacimiento,Propietario) VALUES (?,?,?,?)");
                pps.setString(1, jTextFieldNombre.getText());
                pps.setString(2, jTextFieldSexo.getText());
                pps.setString(3, jTextFieldEspecie.getText());
                pps.setString(4, jTextFieldRaza.getText());
                pps.setString(5, jTextFieldChip.getText());
                pps.setString(6, jTextFieldFecha1.getText());
                pps.setString(7, jTextFieldPropietario.getText());
                pps.executeUpdate();

            
        } catch (Exception e) {
            System.out.println("error");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificar1ActionPerformed
        // seleccionamos una fila de la tabla para escribirla en todo los campos de nuevo cliente//////////////////
        
        int fila = jTableMascota.getSelectedRow();
       
       if(fila>=0){
           
           jTextBuscarCliente.setText(jTableMascota.getValueAt(fila, 2).toString());
            jTextFieldNombre.setText(jTableMascota.getValueAt(fila, 0).toString());
            jTextFieldSexo.setText(jTableMascota.getValueAt(fila, 1).toString());
            jTextFieldEspecie.setText(jTableMascota.getValueAt(fila, 2).toString());
            jTextFieldRaza.setText(jTableMascota.getValueAt(fila, 3).toString());
            jTextFieldChip.setText(jTableMascota.getValueAt(fila, 4).toString());
            jTextFieldFecha1.setText(jTableMascota.getValueAt(fila, 5).toString());
            jTextFieldPropietario.setText(jTableMascota.getValueAt(fila, 6).toString());
            
       }
       else{
            JOptionPane.showMessageDialog(null,"No has seleccionado la fila");
       
       }
       
    }//GEN-LAST:event_jButtonModificar1ActionPerformed

    private void jButtonLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiar1ActionPerformed
        //para limpiar todos los campos escritos////////////////////////////////
        limpiar();
    }//GEN-LAST:event_jButtonLimpiar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mascotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JButton clientes;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEliminarMascota;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar1;
    private javax.swing.JButton jButtonModificar1;
    private javax.swing.JButton jButtonNuevaMascota;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSalir1;
    private javax.swing.JDialog jDialogNuevaMascota;
    private javax.swing.JLabel jLabeEspecie;
    private javax.swing.JLabel jLabeEspecie1;
    private javax.swing.JLabel jLabeRaza;
    private javax.swing.JLabel jLabeRaza1;
    private javax.swing.JLabel jLabelChip;
    private javax.swing.JLabel jLabelChip1;
    private javax.swing.JLabel jLabelFechaNacimiento;
    private javax.swing.JLabel jLabelFechaNacimiento1;
    private javax.swing.JLabel jLabelFoto1;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNuuevaMascota;
    private javax.swing.JLabel jLabelNuuevaMascota1;
    private javax.swing.JLabel jLabelPropietario;
    private javax.swing.JLabel jLabelPropietario1;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelSexo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMascota;
    private javax.swing.JTextField jTextBuscarCliente;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextFieldChip;
    private javax.swing.JTextField jTextFieldEspecie;
    private javax.swing.JTextField jTextFieldFecha1;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPropietario;
    private javax.swing.JTextField jTextFieldRaza;
    private javax.swing.JTextField jTextFieldSexo;
    private javax.swing.JButton mascotas;
    private javax.swing.JButton tienda;
    // End of variables declaration//GEN-END:variables
}
