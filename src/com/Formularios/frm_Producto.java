package com.Formularios;

import com.Clases.db;
import java.sql.SQLException;
import com.Clases.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frm_Producto extends javax.swing.JPanel {

    DefaultTableModel modelo;

    public frm_Producto() {
        initComponents();
        mtd_tabla_detalle();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        body1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_actualizarProduc = new javax.swing.JButton();
        btn_guardarProduc = new javax.swing.JButton();
        btn_buscarProduc = new javax.swing.JButton();
        btn_eliminarProduc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txt_talla = new java.awt.TextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_precio = new java.awt.TextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txt_cantidad = new java.awt.TextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        cb_prenda = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cb_tipo = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        cb_colegio = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txt_buscaridProduc = new java.awt.TextField();
        label3 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_producto = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txt_buscarProduc = new java.awt.TextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(body1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_actualizarProduc.setFont(new java.awt.Font("Roboto Condensed", 1, 11)); // NOI18N
        btn_actualizarProduc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/actualizar.png"))); // NOI18N
        btn_actualizarProduc.setText("ACTUALIZAR");
        btn_actualizarProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarProducActionPerformed(evt);
            }
        });

        btn_guardarProduc.setFont(new java.awt.Font("Roboto Condensed", 1, 11)); // NOI18N
        btn_guardarProduc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/guardar.png"))); // NOI18N
        btn_guardarProduc.setText("GUARDAR");
        btn_guardarProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarProducActionPerformed(evt);
            }
        });

        btn_buscarProduc.setFont(new java.awt.Font("Roboto Condensed", 1, 11)); // NOI18N
        btn_buscarProduc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/buscar.png"))); // NOI18N
        btn_buscarProduc.setText("BUSCAR");
        btn_buscarProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarProducActionPerformed(evt);
            }
        });

        btn_eliminarProduc.setFont(new java.awt.Font("Roboto Condensed", 1, 11)); // NOI18N
        btn_eliminarProduc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/eliminar.png"))); // NOI18N
        btn_eliminarProduc.setText("ELIMINAR");
        btn_eliminarProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarProducActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Talla:");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 153));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Colegio:");

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cantidad:");

        txt_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_precioKeyTyped(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 153));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio:");

        jSeparator5.setForeground(new java.awt.Color(0, 0, 153));

        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Prenda:");

        jSeparator6.setForeground(new java.awt.Color(0, 0, 153));

        cb_prenda.setBackground(new java.awt.Color(255, 255, 255));
        cb_prenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chompa", "Camiseta", "Camisa", "Pantalon", "Panalotena", "Gorras", "Medias" }));

        jLabel8.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipo:");

        cb_tipo.setBackground(new java.awt.Color(255, 255, 255));
        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casual", "Deportiva" }));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 153));

        cb_colegio.setBackground(new java.awt.Color(255, 255, 255));
        cb_colegio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidad Educativa Zoila Esperanza Palacios", "Unidad Educativa Manuel J. Calle", "Unidad Educativa Mary Corilé", "Unidad Educativa Republica de Chile" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(cb_colegio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_precio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_cantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(txt_talla, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(55, 55, 55)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_eliminarProduc, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                        .addComponent(btn_actualizarProduc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_buscarProduc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_guardarProduc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(0, 22, Short.MAX_VALUE)))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_prenda, 0, 183, Short.MAX_VALUE)
                            .addComponent(jSeparator7))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_prenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_colegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txt_talla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_guardarProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btn_actualizarProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminarProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 420, 420));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator2.setForeground(new java.awt.Color(0, 0, 153));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscar ID");

        txt_buscaridProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscaridProducActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_buscaridProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_buscaridProduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 420, 70));

        label3.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        label3.setText("INFORMACION PRODUCTO");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tabla_producto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla_producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_productoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_producto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 630, 470));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Buscar producto:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 120, 25));

        txt_buscarProduc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarProducKeyReleased(evt);
            }
        });
        jPanel1.add(txt_buscarProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarProducActionPerformed
        Producto objeto = new Producto(Integer.parseInt(txt_buscaridProduc.getText()), cb_prenda.getSelectedItem().toString(), cb_tipo.getSelectedItem().toString(), cb_colegio.getSelectedItem().toString(), txt_talla.getText(), txt_cantidad.getText(), txt_precio.getText());

        try {

            if (objeto.mtd_actualizar()) {
                JOptionPane.showMessageDialog(null, "Producto actualizado exitosamente");
                mtd_tabla_detalle();
                mtd_limpiartextos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar producto");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_actualizarProducActionPerformed

    private void btn_guardarProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarProducActionPerformed
        Producto objeto = new Producto(0, cb_prenda.getSelectedItem().toString(), cb_tipo.getSelectedItem().toString(), cb_colegio.getSelectedItem().toString(), txt_talla.getText(), txt_cantidad.getText(), txt_precio.getText());
        try {
            boolean guardado = objeto.mtd_guardar();
            if (guardado == true) {
                JOptionPane.showMessageDialog(null, "Guardado con exito");
                mtd_tabla_detalle();
                mtd_limpiartextos();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_guardarProducActionPerformed

    private void btn_buscarProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarProducActionPerformed
        Producto objeto = new Producto();
        objeto.setId(Integer.parseInt(txt_buscaridProduc.getText()));
        try {
            objeto.setId(Integer.parseInt(txt_buscaridProduc.getText()));

            if (objeto.mtd_buscar()) {
                txt_buscaridProduc.setText(String.valueOf(objeto.getId()));
                cb_prenda.setSelectedItem(objeto.getPrenda());
                cb_tipo.setSelectedItem(objeto.getTipo());
                cb_colegio.setSelectedItem(objeto.getColegio());
                txt_talla.setText(objeto.getTalla());
                txt_cantidad.setText(objeto.getCantidad());
                txt_precio.setText(objeto.getPrecio());
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscarProducActionPerformed

    private void btn_eliminarProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarProducActionPerformed
        Producto objeto = new Producto();
        objeto.setId(Integer.parseInt(txt_buscaridProduc.getText()));
        try {

            int confirmar = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este Producto?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                if (objeto.mtd_eliminar()) {
                    JOptionPane.showMessageDialog(null, "Producto eliminado exitosamente");
                    mtd_tabla_detalle();
                    mtd_limpiartextos();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar Producto");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Sistema", JOptionPane.ERROR_MESSAGE);
        }
        mtd_limpiartextos();
        mtd_tabla_detalle();
    }//GEN-LAST:event_btn_eliminarProducActionPerformed

    private void txt_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioKeyTyped
        char caracter = evt.getKeyChar();
        if (Character.isLetter(caracter)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_precioKeyTyped

    private void txt_buscaridProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscaridProducActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscaridProducActionPerformed

    private void tabla_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_productoMouseClicked
        int r = tabla_producto.getSelectedRow();
        String id = tabla_producto.getValueAt(r, 0).toString();
        String prenda = tabla_producto.getValueAt(r, 1).toString();
        String tipo = tabla_producto.getValueAt(r, 2).toString();
        String colegio = tabla_producto.getValueAt(r, 3).toString();
        String talla = tabla_producto.getValueAt(r, 4).toString();
        String cantidad = tabla_producto.getValueAt(r, 5).toString();
        String precio = tabla_producto.getValueAt(r, 6).toString();

        txt_buscaridProduc.setText(id);
        cb_prenda.setSelectedItem(prenda);
        cb_tipo.setSelectedItem(tipo);
        cb_colegio.setSelectedItem(colegio);
        txt_talla.setText(talla);
        txt_cantidad.setText(cantidad);
        txt_precio.setText(precio);
    }//GEN-LAST:event_tabla_productoMouseClicked

    private void txt_buscarProducKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarProducKeyReleased
        String nombre = txt_buscarProduc.getText();
        try {
            DefaultTableModel dt = (DefaultTableModel) tabla_producto.getModel();
            modelo.setRowCount(0);
            Statement s = db.mycon().createStatement();

            ResultSet rs = s.executeQuery(" SELECT * FROM producto WHERE Pprenda LIKE '%" + nombre + "%' ");

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
    }//GEN-LAST:event_txt_buscarProducKeyReleased

    //************************METODOS***********************************************
    private void mtd_tabla_detalle() {
        String titulos[] = {"ID", "Prenda", "Tipo", "Colegio", "Talla", "Cantidad", "Precio"};
        modelo = new DefaultTableModel(null, titulos);
        tabla_producto.setModel(modelo);
        modelo.setRowCount(0);
        try {
            String sql = "SELECT * FROM producto";
            PreparedStatement ps = db.mycon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vector<String> v = new Vector<>();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                modelo.addRow(v);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mtd_limpiartextos() {
        cb_prenda.setSelectedIndex(-1);
        cb_tipo.setSelectedIndex(-1);
        cb_colegio.setSelectedIndex(-1);
        txt_talla.setText("");
        txt_cantidad.setText("");
        txt_precio.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body1;
    private javax.swing.JButton btn_actualizarProduc;
    private javax.swing.JButton btn_buscarProduc;
    private javax.swing.JButton btn_eliminarProduc;
    private javax.swing.JButton btn_guardarProduc;
    private javax.swing.JComboBox<String> cb_colegio;
    private javax.swing.JComboBox<String> cb_prenda;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private java.awt.Label label3;
    private javax.swing.JTable tabla_producto;
    private java.awt.TextField txt_buscarProduc;
    private java.awt.TextField txt_buscaridProduc;
    private java.awt.TextField txt_cantidad;
    private java.awt.TextField txt_precio;
    private java.awt.TextField txt_talla;
    // End of variables declaration//GEN-END:variables
}
