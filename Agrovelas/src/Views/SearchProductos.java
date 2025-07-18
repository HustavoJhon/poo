
package Conexion;
import static Conexion.SearchClientes.JT_TablaHistorial;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Osquitar
 */
public class SearchProductos extends javax.swing.JFrame {
DefaultTableModel model = new DefaultTableModel();  
Statement st = null;
ResultSet rs = null;
Connection con2 = null;
    public SearchProductos() {
        initComponents();
        setLocationRelativeTo(null);
        vaciarTabla();
        verDatos();
    }
public void vaciarTabla(){
        String titulos[] = {"ID", "AELLIDOS", "NOMBRES", "DNI", "DIRECCION"};
        model = new DefaultTableModel(null,titulos);
        JT_TablaHistorial.setModel(model);
    }
public void verDatos(){
        try {
            Connection con1 = null;
            DefaultTableModel miModelo = (DefaultTableModel) JT_TablaHistorial.getModel();
            Conectar conect1 = new Conectar();
            con1 = conect1.getConexion();
            String dts[] = new String[25];
            String sql = "select * from Tclientes";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dts[0] = rs.getString("Id");
                dts[1] = rs.getString("Apellidos");
                dts[2] = rs.getString("nombres");
                dts[3] = rs.getString("dni");
                dts[4] = rs.getString("direccion");
                miModelo.addRow(dts);
            }
            JT_TablaHistorial.setModel(miModelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDEN VISUALIZAR LOS DATOS DEL CLIENTE", "Error", JOptionPane.ERROR_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_TablaHistorial = new javax.swing.JTable();
        buscartodo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JT_TablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Dni", "Direccion"
            }
        ));
        jScrollPane1.setViewportView(JT_TablaHistorial);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 179, 867, 360));

        buscartodo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buscartodo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buscartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscartodoActionPerformed(evt);
            }
        });
        buscartodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscartodoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscartodoKeyReleased(evt);
            }
        });
        jPanel1.add(buscartodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 250, 35));

        jLabel1.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        jLabel1.setText("Bùsqueda por Còdigo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Decker", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo.png"))); // NOI18N
        jLabel2.setText("REPORTE DE STOCK");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 867, 100));

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 133, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscartodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscartodoActionPerformed

    private void buscartodoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscartodoKeyPressed
       
    }//GEN-LAST:event_buscartodoKeyPressed

    private void buscartodoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscartodoKeyReleased
        // TODO add your handling code here:
        String titulos[] = {"ID", "AELLIDOS", "NOMBRES", "DNI", "DIRECCION"};
        String[] registros = new String[100];
        String sql = "SELECT * FROM Tclientes WHERE id LIKE '%" + buscartodo.getText() + "%'";
        model = new DefaultTableModel(null, titulos);
        Conectar conect1 = new Conectar();
        con2 = conect1.getConexion();
        try
        {
            st = (Statement) con2.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next())
            {
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("Apellidos");
                registros[2] = rs.getString("Nombres");
                registros[3] = rs.getString("dni");
                registros[4] = rs.getString("direccion");
                model.addRow(registros);
            }
            JT_TablaHistorial.setModel(model);
        } catch (SQLException ex)
        {
            System.out.println("ERROR AL BUSCAR LOS DATOS : " + ex.getMessage());
        }
    }//GEN-LAST:event_buscartodoKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
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
            java.util.logging.Logger.getLogger(SearchClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable JT_TablaHistorial;
    private javax.swing.JTextField buscartodo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
