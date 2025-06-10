package com.Formularios;

import com.Clases.db;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frm_Venta extends javax.swing.JPanel {

    DefaultTableModel modelo;
    
    public static String clienteID = "0";
    
    public frm_Venta() {
        initComponents();
        cargar_Cliente();
        cargar_Prenda();
        cargar_Tipo();
        cargar_Colegio();
        cargar_Talla();
        mtd_tabla_detalle();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        inid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb_cliente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cb_colegio = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jprecioUnitario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cb_prenda = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cb_talla = new javax.swing.JComboBox<>();
        cb_tipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jprecioTotal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_compra = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btn_eliminar = new javax.swing.JButton();
        btn_añadir = new javax.swing.JButton();
        btn_eliminarTODO = new javax.swing.JButton();
        btn_pagarImprimir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_cantidadPagada = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jmontoTotal = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jsaldoPendiente = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jcantidadTotal = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        inid.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        inid.setText("01");

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel3.setText("FACTURA Nº:");

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 1, 16)); // NOI18N
        jLabel4.setText("CLIENTE:");

        cb_cliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_clienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 1, 16)); // NOI18N
        jLabel5.setText("Colegio:");

        cb_colegio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb_colegio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_colegioActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel19.setText("$");

        jLabel21.setFont(new java.awt.Font("Roboto Condensed", 1, 16)); // NOI18N
        jLabel21.setText("P.U:");

        jprecioUnitario.setFont(new java.awt.Font("Roboto Condensed", 1, 16)); // NOI18N
        jprecioUnitario.setText("00.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inid)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_colegio, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jprecioUnitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(inid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_colegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21)
                    .addComponent(jprecioUnitario))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1060, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 16)); // NOI18N
        jLabel2.setText("Cantidad:");

        cb_prenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb_prenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_prendaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto Condensed", 1, 16)); // NOI18N
        jLabel11.setText("Prenda:");

        jLabel12.setFont(new java.awt.Font("Roboto Condensed", 1, 16)); // NOI18N
        jLabel12.setText("Talla:");

        txt_cantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_cantidad.setText("0");
        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });
        txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Roboto Condensed", 1, 16)); // NOI18N
        jLabel18.setText("Tipo:");

        cb_talla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb_talla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tallaActionPerformed(evt);
            }
        });

        cb_tipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tipoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 1, 16)); // NOI18N
        jLabel7.setText("Precio Total:");

        jLabel20.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel20.setText("$");

        jprecioTotal.setFont(new java.awt.Font("Roboto Condensed", 1, 16)); // NOI18N
        jprecioTotal.setText("00.00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_prenda, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_talla, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jprecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cb_prenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_talla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jprecioTotal)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1060, 40));

        tabla_compra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_compra);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 860, 330));

        btn_eliminar.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_añadir.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btn_añadir.setText("Añadir al carro");
        btn_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirActionPerformed(evt);
            }
        });

        btn_eliminarTODO.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btn_eliminarTODO.setText("Eliminar todo");
        btn_eliminarTODO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarTODOActionPerformed(evt);
            }
        });

        btn_pagarImprimir.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        btn_pagarImprimir.setText("PAGAR E IMPRIMIR");
        btn_pagarImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagarImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_añadir, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(btn_eliminarTODO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btn_pagarImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_eliminarTODO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(btn_pagarImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, 190, 450));

        jLabel8.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel8.setText("MONTO CANCELADO:");

        txt_cantidadPagada.setFont(new java.awt.Font("Roboto Condensed", 1, 16)); // NOI18N
        txt_cantidadPagada.setText("0");
        txt_cantidadPagada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cantidadPagadaKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel13.setText("$");

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel10.setText("MONTO TOTAL:");

        jLabel9.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel9.setText("SALDO PENDIENTE:");

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jmontoTotal.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jmontoTotal.setText("00.00");

        jLabel15.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel15.setText("$");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jmontoTotal)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jmontoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jsaldoPendiente.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jsaldoPendiente.setText("00.00");

        jLabel14.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel14.setText("$");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jsaldoPendiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jsaldoPendiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel16.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel16.setText("CANTIDAD TOTAL:");

        jcantidadTotal.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jcantidadTotal.setText("00");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cantidadPagada, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcantidadTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_cantidadPagada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcantidadTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(92, 92, 92))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 860, 110));

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

    public void cargar_Cliente() {//cargar los clientes en el ComboBox
        try {
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM cliente ");
            Vector<String> v = new Vector<>();
            while (rs.next()) {
                v.add(rs.getString("Cnombre"));
            }
            DefaultComboBoxModel<String> com = new DefaultComboBoxModel<>(v);
            cb_cliente.setModel(com);
            cb_cliente.addActionListener(e -> cargarCombinacion());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
        //cargar el ultimo numero del invoice inid
        try {
            
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM extra WHERE exid =1");
            
            if (rs.next()) {
                
                inid.setText(rs.getString("val"));
                
            }     
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error a guardar invoice id");
        }
        
        //nueva factira | invoice
        int i = Integer.valueOf(inid.getText());
        i++;
        inid.setText(String.valueOf(i));
        
    }

    public void cargar_Prenda() {
        try {
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT DISTINCT Pprenda FROM producto");

            Vector<String> v = new Vector<>();
            while (rs.next()) {
                v.add(rs.getString("Pprenda"));
            }
            DefaultComboBoxModel<String> com = new DefaultComboBoxModel<>(v);
            cb_prenda.setModel(com);
            cb_prenda.addActionListener(e -> cargarCombinacion());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error prenda", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargar_Tipo() {
        try {
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT DISTINCT Ptipo FROM producto");

            Vector<String> v = new Vector<>();
            while (rs.next()) {
                v.add(rs.getString("Ptipo"));
            }
            DefaultComboBoxModel<String> com = new DefaultComboBoxModel<>(v);
            cb_tipo.setModel(com);
            cb_tipo.addActionListener(e -> cargarCombinacion());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error tipo", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargar_Colegio() {
        try {
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT DISTINCT Pcolegio FROM producto");

            Vector<String> v = new Vector<>();
            while (rs.next()) {
                v.add(rs.getString("Pcolegio"));
            }
            DefaultComboBoxModel<String> com = new DefaultComboBoxModel<>(v);
            cb_colegio.setModel(com);
            cb_colegio.addActionListener(e -> cargarCombinacion());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error colegio", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargar_Talla() {
        try {
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT DISTINCT Ptalla FROM producto");

            Vector<String> v = new Vector<>();
            while (rs.next()) {
                v.add(rs.getString("Ptalla"));
            }
            DefaultComboBoxModel<String> com = new DefaultComboBoxModel<>(v);
            cb_talla.setModel(com);
            cb_talla.addActionListener(e -> cargarCombinacion());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar productos.");
        }
    }

    public void cargarCombinacion() {
        try {
            String colegio = cb_colegio.getSelectedItem().toString();
            String prenda = cb_prenda.getSelectedItem().toString();
            String talla = cb_talla.getSelectedItem().toString();
            String tipo = cb_tipo.getSelectedItem().toString();

            Statement s = db.mycon().createStatement();
            String query = "SELECT (Pprecio) FROM producto WHERE " + "Pcolegio = '" + colegio + "' AND "
                    + "Pprenda = '" + prenda + "' AND "
                    + "Ptalla = '" + talla + "' AND "
                    + "Ptipo = '" + tipo + "' ";

            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                jprecioUnitario.setText(rs.getString("Pprecio"));
            } else {
                jprecioUnitario.setText("00.00");
            }
            calculo_precioTotal();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calculo_precioTotal() {
        Double cantidad = Double.valueOf(txt_cantidad.getText());
        Double precio = Double.valueOf(jprecioUnitario.getText());
        Double total;
        total = cantidad * precio;
        jprecioTotal.setText(String.valueOf(total));

    }

    public void monto_total() {
        int num = tabla_compra.getRowCount();
        double total = 0;
        for (int i = 0; i < num; i++) {
            double valor = Double.parseDouble(tabla_compra.getValueAt(i, 7).toString());
            total += valor;
        }
        jmontoTotal.setText(Double.toString(total));

        //cantidad total
        int nums = tabla_compra.getRowCount();
        double totals = 0;
        for (int i = 0; i < num; i++) {
            double valores = Double.parseDouble(tabla_compra.getValueAt(i, 5).toString());
            totals += valores;
        }
        jcantidadTotal.setText(Double.toString(totals));

    }

    public void saldo() {
        Double cantidadPago = Double.parseDouble(txt_cantidadPagada.getText());
        Double tot = Double.valueOf(jmontoTotal.getText());
        Double saldo;

        saldo = tot - cantidadPago;

        jsaldoPendiente.setText(String.valueOf(saldo));
    }


    private void btn_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirActionPerformed
        DefaultTableModel dt = (DefaultTableModel) tabla_compra.getModel();

        Vector<String> v = new Vector<>();
        v.add(inid.getText());
        v.add(cb_colegio.getSelectedItem().toString());
        v.add(cb_prenda.getSelectedItem().toString());
        v.add(cb_tipo.getSelectedItem().toString());
        v.add(cb_talla.getSelectedItem().toString());
        v.add(txt_cantidad.getText());
        v.add(jprecioUnitario.getText());
        v.add(jprecioTotal.getText());

        dt.addRow(v);
        monto_total();
        saldo();
        //{"Nº", "Cliente", "Colegio","Prenda", "Tipo", "Talla", "Cantidad", "P.U.", "TOTAL"
    }//GEN-LAST:event_btn_añadirActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        try {
            DefaultTableModel dt = (DefaultTableModel) tabla_compra.getModel();
            int fila = tabla_compra.getSelectedRow();
            dt.removeRow(fila);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Seleccione una Fila", "Sistema", JOptionPane.ERROR_MESSAGE);
        }
        monto_total();
        saldo();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_eliminarTODOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarTODOActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dt = (DefaultTableModel) tabla_compra.getModel();
        dt.setRowCount(0);
        monto_total();
        saldo();
        //String id = dt.getValueAt(fila, 0).toString();
    }//GEN-LAST:event_btn_eliminarTODOActionPerformed

    private void btn_pagarImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagarImprimirActionPerformed

        try {
            DefaultTableModel dt = (DefaultTableModel) tabla_compra.getModel();
            int rc = dt.getRowCount();
            for (int i = 0; i < rc; i++) {
                String inid = dt.getValueAt(i, 0).toString();//inid, invoice id, numero factura
                String p_colegio = dt.getValueAt(i, 1).toString();
                String p_prenda = dt.getValueAt(i, 2).toString();
                String p_tipo = dt.getValueAt(i, 3).toString();
                String p_talla = dt.getValueAt(i, 4).toString();
                String cantidad = dt.getValueAt(i, 5).toString();
                String precioUnitario = dt.getValueAt(i, 6).toString();
                String precioTotal = dt.getValueAt(i, 7).toString();

                //'"++"'
                //`Vid`, `Vinid`, `Vcliente`, `Vcolegio`, `Vprenda`, `Vtipo`, `Vtalla`, `Vcantidad`, `VprecioUnitario`, `Vtotal`
                //COMPRA
                Statement s = db.mycon().createStatement();
                s.executeUpdate("INSERT INTO compra (COMinid, COMcolegio, COMprenda, COMtipo, COMtalla, COMcantidad, COMprecioUnitario, COMtotal)  VALUES (' " + inid + " ',' " + p_colegio + " ', ' " + p_prenda + " ', ' " + p_tipo + " ', ' " + p_talla + " ', ' " + cantidad + " ', ' " + precioUnitario + " ', ' " + precioTotal + " ') ");

            }
            JOptionPane.showMessageDialog(null, "Datos Guardados");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Sistema", JOptionPane.ERROR_MESSAGE);
        }

        try {
            String cnombre = cb_cliente.getSelectedItem().toString();
            //VENTA
            //`Vid`, `INID`, `Cid`, `nombre_cliente`, `cantidad_total`, `monto_total`, `status`, `balance`
            String inv_id = inid.getText();
            String nombreCliente = cb_cliente.getSelectedItem().toString();
            String totcantidad = jcantidadTotal.getText();
            String totmonto =jmontoTotal.getText();
            String blnc = jsaldoPendiente.getText();
            
            //revision paga
            Double tot = Double.valueOf(jmontoTotal.getText());
            Double pid  = Double.valueOf(txt_cantidadPagada.getText());
            String Status = null;
             if (pid.equals(0.0)) {
                Status = "Sin Cancelar";
            } else if (tot>pid){
                Status = "Cancelado Parcialmente";
            }else if (tot<=pid){
                Status = "Cancelado Completamente";
            }
            Statement ss = db.mycon().createStatement();
            ss.executeUpdate("INSERT INTO ventas(INID, Cid, nombre_cliente, cantidad_total, monto_total, status, balance) VALUES('" + inv_id + "','" + clienteID + "','" + cnombre + "','" + totcantidad + "','" + totmonto + "','" + Status + "', '" + blnc + "')");

        } catch (NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al imprimir", JOptionPane.ERROR_MESSAGE);
        }
        
        //guardar el ultimo numero inid
        try {
            String id = inid.getText();  
            
            Statement s = db.mycon().createStatement();
            s.executeUpdate("UPDATE extra SET val='"+id+ "' WHERE exid = 1");

        } catch (Exception ex) {
            
        }
        
        
        
        
    }//GEN-LAST:event_btn_pagarImprimirActionPerformed

    private void cb_colegioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_colegioActionPerformed
        //enviar la informacion a la base de datos e imprimir

    }//GEN-LAST:event_cb_colegioActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void cb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_tipoActionPerformed

    private void cb_prendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_prendaActionPerformed
        
    }//GEN-LAST:event_cb_prendaActionPerformed

    private void cb_tallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_tallaActionPerformed

    private void txt_cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyReleased
        calculo_precioTotal();
    }//GEN-LAST:event_txt_cantidadKeyReleased

    private void txt_cantidadPagadaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadPagadaKeyReleased
        //
        saldo();

    }//GEN-LAST:event_txt_cantidadPagadaKeyReleased

    private void cb_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_clienteActionPerformed
        // TODO add your handling code here:
                //obtener ID
        String nombre = cb_cliente.getSelectedItem().toString();
        
        try {
            
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT Cid, Cnombre FROM cliente WHERE Cnombre = '" + nombre + "'  ");
            
            if (rs.next()) {
                clienteID = (rs.getString("Cid"));

            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al elegir prenda", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cb_clienteActionPerformed

    //************************METODOS***********************************************
    private void mtd_tabla_detalle() {
        String titulos[] = {"Nº", "Colegio", "Prenda", "tipo", "Talla", "Cantidad", "P.U.", "TOTAL"};
        modelo = new DefaultTableModel(null, titulos);
        tabla_compra.setModel(modelo);
        modelo.setRowCount(0);
    }

    private void mtd_calculos() {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JButton btn_añadir;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_eliminarTODO;
    private javax.swing.JButton btn_pagarImprimir;
    private javax.swing.JComboBox<String> cb_cliente;
    private javax.swing.JComboBox<String> cb_colegio;
    private javax.swing.JComboBox<String> cb_prenda;
    private javax.swing.JComboBox<String> cb_talla;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JLabel inid;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jcantidadTotal;
    private javax.swing.JLabel jmontoTotal;
    private javax.swing.JLabel jprecioTotal;
    private javax.swing.JLabel jprecioUnitario;
    private javax.swing.JLabel jsaldoPendiente;
    private javax.swing.JTable tabla_compra;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_cantidadPagada;
    // End of variables declaration//GEN-END:variables
}
