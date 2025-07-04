
package Conexion;

import javax.swing.DefaultListModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;


public class FrmServicios extends javax.swing.JFrame {


    public FrmServicios() {
        initComponents();
    }
    
    // Método para contar servicios seleccionados
    private int contarServiciosSeleccionados() {
        int count = 0;
        if (chkConsulta.isSelected()) count++;
        if (chkVacunacion.isSelected()) count++;
        if (chkDesparasitacion.isSelected()) count++;
        if (chkEsterilizacion.isSelected()) count++;
        if (chkCirugia.isSelected()) count++;
        if (chkPeluqueria.isSelected()) count++;
        if (chkHospitalizacion.isSelected()) count++;
        if (chkAnalisis.isSelected()) count++;
        if (chkRayosX.isSelected()) count++;
        return count;
    }
    
    // Método para generar código aleatorio de atención
    private String generarCodigo() {
        Random rand = new Random();
        int codigo = rand.nextInt(9000) + 1000; // de 1000 a 9999
        return String.valueOf(codigo);
    }
    
    // Método para buscar nombre completo de cliente en base de datos
    private String buscarClientePorCodigo(String codigoCliente) {
        String nombreCompleto = null;
        try {
            Conectar conect1 = new Conectar();
            Connection con = conect1.getConexion();
            String sql = "SELECT nombres, apellidos FROM Tclientes WHERE id = '" + codigoCliente + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                nombreCompleto = rs.getString("nombres") + " " + rs.getString("apellidos");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al buscar cliente: " + e.getMessage());
        }
        return nombreCompleto;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chkConsulta = new javax.swing.JCheckBox();
        chkVacunacion = new javax.swing.JCheckBox();
        chkDesparasitacion = new javax.swing.JCheckBox();
        chkEsterilizacion = new javax.swing.JCheckBox();
        chkCirugia = new javax.swing.JCheckBox();
        chkPeluqueria = new javax.swing.JCheckBox();
        chkHospitalizacion = new javax.swing.JCheckBox();
        chkAnalisis = new javax.swing.JCheckBox();
        chkRayosX = new javax.swing.JCheckBox();
        btnMostrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scrollLista = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo.png"))); // NOI18N
        jLabel1.setText("SERVICIOS AGROVELAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 14, -1, -1));

        chkConsulta.setText("Consulta general");
        chkConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(chkConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 135, -1, -1));

        chkVacunacion.setText("Vacunacion");
        jPanel1.add(chkVacunacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 161, -1, -1));

        chkDesparasitacion.setText("Desparasitación");
        jPanel1.add(chkDesparasitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 187, -1, -1));

        chkEsterilizacion.setText("Esterilización / Castración");
        jPanel1.add(chkEsterilizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 213, -1, -1));

        chkCirugia.setText("Cirugías menores");
        jPanel1.add(chkCirugia, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 239, -1, -1));

        chkPeluqueria.setText("Peluquería / Baño");
        jPanel1.add(chkPeluqueria, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 265, -1, -1));

        chkHospitalizacion.setText("Hospitalización");
        jPanel1.add(chkHospitalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 291, -1, -1));

        chkAnalisis.setText("Análisis clínicos");
        jPanel1.add(chkAnalisis, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 317, -1, -1));

        chkRayosX.setText("Rayos X / Imagenología");
        jPanel1.add(chkRayosX, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 343, -1, -1));

        btnMostrar.setText("Mostrar Selección");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 407, 135, 52));

        btnLimpiar.setText("Limpiar Selección\t");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 407, 151, 52));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 407, 121, 52));

        jScrollPane1.setViewportView(scrollLista);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 126, 286, 237));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 407, 100, 52));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Cliente", "Servicios"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 590, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkConsultaActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        DefaultListModel<String> modelo = new DefaultListModel<>();

        if (chkConsulta.isSelected()) modelo.addElement("Consulta general");
        if (chkVacunacion.isSelected()) modelo.addElement("Vacunación");
        if (chkDesparasitacion.isSelected()) modelo.addElement("Desparasitación");
        if (chkEsterilizacion.isSelected()) modelo.addElement("Esterilización / Castración");
        if (chkCirugia.isSelected()) modelo.addElement("Cirugías menores");
        if (chkPeluqueria.isSelected()) modelo.addElement("Peluquería / Baño");
        if (chkHospitalizacion.isSelected()) modelo.addElement("Hospitalización");
        if (chkAnalisis.isSelected()) modelo.addElement("Análisis clínicos");
        if (chkRayosX.isSelected()) modelo.addElement("Rayos X / Imagenología");

        scrollLista.setModel(modelo);

    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        chkConsulta.setSelected(false);
        chkVacunacion.setSelected(false);
        chkDesparasitacion.setSelected(false);
        chkEsterilizacion.setSelected(false);
        chkCirugia.setSelected(false);
        chkPeluqueria.setSelected(false);
        chkHospitalizacion.setSelected(false);
        chkAnalisis.setSelected(false);
        chkRayosX.setSelected(false);

        // Limpiar la lista
        scrollLista.setModel(new DefaultListModel<>());
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String codigoCliente = JOptionPane.showInputDialog(this, "Ingrese el código del cliente:");
        if (codigoCliente == null || codigoCliente.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código.");
            return;
        }

        String nombreCliente = buscarClientePorCodigo(codigoCliente);
        if (nombreCliente == null) {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado con ID: " + codigoCliente);
            return;
        }

        int cantidadServicios = contarServiciosSeleccionados();
        if (cantidadServicios == 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar al menos un servicio.");
            return;
        }

        String codigoAtencion = generarCodigo();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.addRow(new Object[]{codigoAtencion, nombreCliente, cantidadServicios});
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmServicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chkAnalisis;
    private javax.swing.JCheckBox chkCirugia;
    private javax.swing.JCheckBox chkConsulta;
    private javax.swing.JCheckBox chkDesparasitacion;
    private javax.swing.JCheckBox chkEsterilizacion;
    private javax.swing.JCheckBox chkHospitalizacion;
    private javax.swing.JCheckBox chkPeluqueria;
    private javax.swing.JCheckBox chkRayosX;
    private javax.swing.JCheckBox chkVacunacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> scrollLista;
    // End of variables declaration//GEN-END:variables
}
