package com.Formularios;

import com.Clases.Cliente;
import com.Clases.db;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JPanel {

    DefaultTableModel modelo;

    public Clientes() {
        initComponents();
        mtd_tabla_detalle();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        body1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txt_cedula = new java.awt.TextField();
        btn_actualizar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new java.awt.TextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_telefono = new java.awt.TextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new java.awt.TextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_clientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txt_buscarid = new java.awt.TextField();
        label3 = new java.awt.Label();
        jLabel6 = new javax.swing.JLabel();
        txt_buscartbl = new java.awt.TextField();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(body1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });

        btn_actualizar.setFont(new java.awt.Font("Roboto Condensed", 1, 11)); // NOI18N
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/actualizar.png"))); // NOI18N
        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_guardar.setFont(new java.awt.Font("Roboto Condensed", 1, 11)); // NOI18N
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/guardar.png"))); // NOI18N
        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_buscar.setFont(new java.awt.Font("Roboto Condensed", 1, 11)); // NOI18N
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/buscar.png"))); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Roboto Condensed", 1, 11)); // NOI18N
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/eliminar.png"))); // NOI18N
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre:");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 153));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cedula:");

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("E-mail:");

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 153));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono:");

        jSeparator5.setForeground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator5)
                                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1)
                                .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 490, 350));

        tabla_clientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_clientes);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 560, 470));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator2.setForeground(new java.awt.Color(0, 0, 153));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscar ID");

        txt_buscarid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscaridActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_buscarid, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(198, 198, 198)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_buscarid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 490, 130));

        label3.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        label3.setText("INFORMACION CLIENTES");
        jPanel2.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Buscar por cedula:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 130, 30));

        txt_buscartbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscartblKeyReleased(evt);
            }
        });
        jPanel2.add(txt_buscartbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        Cliente objeto = new Cliente(Integer.parseInt(txt_buscarid.getText()), txt_cedula.getText(), txt_nombre.getText(), txt_email.getText(), txt_telefono.getText());
        try {
            if (objeto.mtd_actualizar()) {
                JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente");
                mtd_tabla_detalle();
                mtd_limpiartextos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar cliente");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        Cliente objeto = new Cliente(0, txt_cedula.getText(), txt_nombre.getText(), txt_email.getText(), txt_telefono.getText());
        try {
            if (objeto.rgtrDuplicado() == false) {
                boolean guardado = objeto.mtd_guardar();
                if (guardado == true) {
                    JOptionPane.showMessageDialog(null, "Cliente guardado correctamente");
                    mtd_tabla_detalle();
                    mtd_limpiartextos();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Registro Existente");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        Cliente objeto = new Cliente();
        objeto.setId(Integer.parseInt(txt_buscarid.getText()));
        try {
            objeto.setId(Integer.parseInt(txt_buscarid.getText()));

            if (objeto.mtd_buscar()) {
                txt_buscarid.setText(String.valueOf(objeto.getId()));
                txt_cedula.setText(objeto.getCedula());
                txt_nombre.setText(objeto.getNombre());
                txt_email.setText(objeto.getMail());
                txt_telefono.setText(objeto.getTelefono());
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        Cliente objeto = new Cliente();
        objeto.setId(Integer.parseInt(txt_buscarid.getText()));
        try {

            int confirmar = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este cliente?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                if (objeto.mtd_eliminar()) {
                    JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
                    mtd_tabla_detalle();
                    mtd_limpiartextos();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar cliente");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Sistema", JOptionPane.ERROR_MESSAGE);
        }
        mtd_limpiartextos();
        mtd_tabla_detalle();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void tabla_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_clientesMouseClicked
        int r = tabla_clientes.getSelectedRow();
        String id = tabla_clientes.getValueAt(r, 0).toString();
        String cedula = tabla_clientes.getValueAt(r, 1).toString();
        String nombre = tabla_clientes.getValueAt(r, 2).toString();
        String email = tabla_clientes.getValueAt(r, 3).toString();
        String telefono = tabla_clientes.getValueAt(r, 4).toString();

        txt_buscarid.setText(id);
        txt_cedula.setText(cedula);
        txt_nombre.setText(nombre);
        txt_email.setText(email);
        txt_telefono.setText(telefono);
    }//GEN-LAST:event_tabla_clientesMouseClicked

    private void txt_buscaridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscaridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscaridActionPerformed

    private void txt_buscartblKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscartblKeyReleased
        String nombre = txt_buscartbl.getText();
        try {
            DefaultTableModel dt = (DefaultTableModel) tabla_clientes.getModel();
            modelo.setRowCount(0);
            Statement s = db.mycon().createStatement();

            ResultSet rs = s.executeQuery(" SELECT * FROM producto WHERE Pproducto LIKE '%" + nombre + "%' ");

            while (rs.next()) {
                Vector<String> v = new Vector<>();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                dt.addRow(v);
            }

        } catch (SQLException ex) {
            mtd_tabla_detalle();
        }
    }//GEN-LAST:event_txt_buscartblKeyReleased

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        char caracter = evt.getKeyChar();
        if (Character.isLetter(caracter)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
        char caracter = evt.getKeyChar();
        if (Character.isLetter(caracter)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_cedulaKeyTyped

//************************METODOS***********************************************
    private void mtd_tabla_detalle() {
        String titulos[] = {"ID", "Cedula", "Nombre", "E-mail", "Telefono"};
        modelo = new DefaultTableModel(null, titulos);
        tabla_clientes.setModel(modelo);
        modelo.setRowCount(0);
        try {
            String sql = "SELECT * FROM cliente";
            PreparedStatement ps = db.mycon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vector<String> v = new Vector<>();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                modelo.addRow(v);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    //private boolean mtd_registro_duplicado(String cedula) {
    //    boolean estado = false;
    //    try {
    //        String sql = "SELECT * FROM cliente WHERE Ccedula = ?";
    //        PreparedStatement ps = db.mycon().prepareStatement(sql);
    //        ps.setString(1, cedula);
    //        ResultSet rs = ps.executeQuery();
    //
    //        if (rs.next()) {
    //           estado = true;
    //        }
    //    } catch (Exception e) {
    //        JOptionPane.showMessageDialog(null, "Error al verificar duplicado: " + e.getMessage());
    //    }
    //    return estado;
    //}
    private void mtd_limpiartextos() {
        txt_cedula.setText("");
        txt_nombre.setText("");
        txt_email.setText("");
        txt_telefono.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body1;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private java.awt.Label label3;
    private javax.swing.JTable tabla_clientes;
    private java.awt.TextField txt_buscarid;
    private java.awt.TextField txt_buscartbl;
    private java.awt.TextField txt_cedula;
    private java.awt.TextField txt_email;
    private java.awt.TextField txt_nombre;
    private java.awt.TextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
