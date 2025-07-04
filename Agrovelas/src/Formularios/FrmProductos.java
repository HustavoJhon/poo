package Formularios;

import Conexion.Conectar;
import java.awt.*;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Osquitar
 */
public class FrmProductos extends javax.swing.JFrame {

    /**
     * Creates new form FrmClientes
     */
    public FrmProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
         limpiar();
         vaciarTabla();
         verDatos();
    }
    public void limpiar(){
        this.TxtDescripcion.setText("");
        this.TxxUnidadMedida.setText("");
        this.TxtPrecio.setText("");
        this.TxtIdProducto.setText("");
        
    }
    public void vaciarTabla(){
        DefaultTableModel Modelo = (DefaultTableModel) jTable1.getModel();
        String titulos[] = {"CODIGO","DESCRIPCION","PRECIO","UNIDAD DE MEDIDA"};
        Modelo = new DefaultTableModel(null,titulos);
        jTable1.setModel(Modelo);
    }
    public void verDatos(){
        try {
            Connection con1 = null;
            DefaultTableModel miModelo = (DefaultTableModel) jTable1.getModel();
            Conectar conect1 = new Conectar();
            con1 = conect1.getConexion();
            String dts[] = new String[5];
            String sql = "select * from TProductos";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dts[0] = rs.getString("Id");
                dts[1] = rs.getString("descripcion");
                dts[2] = rs.getString("PrecioUnitario");
                dts[3] = rs.getString("UNidadMedida");
                miModelo.addRow(dts);
            }
            jTable1.setModel(miModelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDEN VISUALIZAR LOS DATOS DE LA TABLA PRODUCTOS", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtIdProducto = new javax.swing.JTextField();
        TxtDescripcion = new javax.swing.JTextField();
        TxtPrecio = new javax.swing.JTextField();
        TxxUnidadMedida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnNuevo = new javax.swing.JButton();
        BtnGrabar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar1 = new javax.swing.JButton();
        BtnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo.png"))); // NOI18N
        jLabel1.setText("REGISTRO DE PRODUCTOS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Código");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 137, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Descripción");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 174, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Precio Unitario");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 211, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Unidad Medida");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 248, 147, -1));

        TxtIdProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdProductoActionPerformed(evt);
            }
        });
        jPanel2.add(TxtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 134, 337, -1));

        TxtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(TxtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 171, 337, -1));

        TxtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrecioActionPerformed(evt);
            }
        });
        jPanel2.add(TxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 208, 337, -1));

        TxxUnidadMedida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(TxxUnidadMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 245, 337, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripción", "Precio Unitario", "Unidad Medida"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 294, 690, 200));

        BtnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 109, 44));

        BtnGrabar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnGrabar.setText("Grabar");
        BtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGrabarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 111, 44));

        BtnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnModificar.setText("Modificar");
        BtnModificar.setName("BtnModificar"); // NOI18N
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 111, 44));

        BtnEliminar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnEliminar1.setText("Eliminar");
        BtnEliminar1.setName("BtnModificar"); // NOI18N
        BtnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminar1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 111, 44));

        BtnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnCerrar.setText("Cerrar");
        BtnCerrar.setName("BtnModificar"); // NOI18N
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 87, 44));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
        this.TxtDescripcion.requestFocus();
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGrabarActionPerformed
       if (this.TxtPrecio.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL PRECIO", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.TxtPrecio.requestFocus();
        }
        else if (this.TxtDescripcion.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA DESCRIPCION ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.TxtDescripcion.requestFocus();
        }
        else if (this.TxxUnidadMedida.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA UNIDAD DE MEDIDA", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.TxxUnidadMedida.requestFocus();
        }
        else
        {
            try
            {
                Connection con = null;
                Conectar conect = new Conectar();
                con = conect.getConexion();
                Statement st = con.createStatement();
                String sql = "insert into TProductos(descripcion,PrecioUnitario,UnidadMedida) values (?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, this.TxtDescripcion.getText());
                pst.setString(2, this.TxtPrecio.getText());
                pst.setString(3, this.TxxUnidadMedida.getText());
                int n = pst.executeUpdate();
                if (n > 0)
                {
                    JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE");
                    limpiar();
                    vaciarTabla();
                    verDatos();
                 }
            } catch (SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(this, "LOS DATOS NO HAN SIDO GUARDADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
                System.err.println("Error al persistir los datos: " + e.getMessage());
                e.printStackTrace();
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGrabarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
    try
        {
            Connection con = null;
            Conectar conect = new Conectar();
            con = conect.getConexion();
            Statement st = con.createStatement();
            String sql = "update TProductos set Descripcion = ?, PrecioUnitario = ?, UnidadMedida = ? where Id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, this.TxtDescripcion.getText());
            pst.setString(2, this.TxtPrecio.getText());
            pst.setString(3, this.TxxUnidadMedida.getText());
            pst.setInt(4, Integer.parseInt(this.TxtIdProducto.getText()));
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(this, "DATOS ACTUALIZADOS CORRECTAMENTE");
                limpiar();
                vaciarTabla();
                verDatos();
            }
        } catch (SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this, "LOS DATOS NO HAN SIDO ACTUALIZADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        JOptionPane.showMessageDialog(null,"Saliendo....");
       this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarActionPerformed

    private void BtnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminar1ActionPerformed
    int fila = jTable1.getSelectedRow();
        if (fila == -1)
        {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN REGISTRO", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int opc = JOptionPane.showConfirmDialog(this, "¿ESTA SEGURO QUE DESEA ELIMINAR ESTE REGISTRO?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opc == JOptionPane.YES_OPTION)
            {
                try
                {
                    Connection con = null;
                    Conectar conect = new Conectar();
                    con = conect.getConexion();
                    Statement st = con.createStatement();
                    String sql = "delete from TProductos where Id= ?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, Integer.parseInt(this.TxtIdProducto.getText()));
                    int n = pst.executeUpdate();
                    if (n > 0)
                    {
                        JOptionPane.showMessageDialog(this, "DATOS ELIMINADOS CORRECTAMENTE");
                        limpiar();
                        vaciarTabla();
                        verDatos();
                        
                    }
                } catch (SQLException ex)
                {
                    JOptionPane.showMessageDialog(this, "DATOS NO ELIMINADOS CORRECTAMENTE" + ex.getMessage());
                }
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEliminar1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try
        {
            int fila = jTable1.getSelectedRow();
            this.TxtIdProducto.setText(jTable1.getValueAt(fila, 0).toString());
            this.TxtDescripcion.setText(jTable1.getValueAt(fila, 1).toString());
            this.TxtPrecio.setText(jTable1.getValueAt(fila, 2).toString());
            this.TxxUnidadMedida.setText(jTable1.getValueAt(fila, 3).toString());
            

        } catch (Exception ex)
        {
            System.out.println("ERROR AL SELECCIONAR UN PRODUCTO : " + ex.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void TxtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdProductoActionPerformed

    private void TxtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnEliminar1;
    private javax.swing.JButton BtnGrabar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JTextField TxtDescripcion;
    private javax.swing.JTextField TxtIdProducto;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JTextField TxxUnidadMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
