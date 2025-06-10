package com.login;

import com.Formularios.Clientes;
import com.Formularios.Principal;
import com.Formularios.frm_Producto;
import com.Formularios.frm_Venta;
import com.Formularios.frm_Inventario;
import java.awt.BorderLayout;

import java.awt.Color;
import javax.swing.JPanel;

public class frm_principal extends javax.swing.JFrame {

    private Principal panelPrincipal;
    private frm_Inventario panelInventario;
    private frm_Venta panelVentas;
    private Clientes panelClientes;
    private frm_Producto panelProducto;

    public frm_principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelPrincipal = new Principal();
        panelInventario = new frm_Inventario();
        panelProducto = new frm_Producto();
        panelVentas = new frm_Venta();
        panelClientes = new Clientes();
        mostrarPanel(panelPrincipal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btn_producto = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_prin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_ventas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_clientes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_reportes = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_inventario = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        app_name = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_vccc = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(13, 71, 161));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_producto.setBackground(new java.awt.Color(18, 90, 173));
        btn_producto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_producto.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_productoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_productoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_productoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_productoMousePressed(evt);
            }
        });
        btn_producto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Productos");
        btn_producto.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 80, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/uniforme.png"))); // NOI18N
        btn_producto.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Menu.add(btn_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 220, 50));

        btn_prin.setBackground(new java.awt.Color(21, 101, 192));
        btn_prin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_prin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_prinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_prinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_prinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_prinMousePressed(evt);
            }
        });
        btn_prin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Principal");
        btn_prin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/home1.png"))); // NOI18N
        btn_prin.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, 40));

        Menu.add(btn_prin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 50));

        btn_ventas.setBackground(new java.awt.Color(18, 90, 173));
        btn_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_ventas.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ventasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ventasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ventasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ventasMousePressed(evt);
            }
        });
        btn_ventas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ventas");
        btn_ventas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/ventas.png"))); // NOI18N
        btn_ventas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Menu.add(btn_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 220, -1));

        btn_clientes.setBackground(new java.awt.Color(18, 90, 173));
        btn_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_clientes.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_clientesMousePressed(evt);
            }
        });
        btn_clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/cliente.png"))); // NOI18N
        btn_clientes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Clientes");
        btn_clientes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 220, -1));

        btn_reportes.setBackground(new java.awt.Color(18, 90, 173));
        btn_reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_reportes.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reportesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_reportesMousePressed(evt);
            }
        });
        btn_reportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_reportes.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Reportes");
        btn_reportes.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 220, -1));

        btn_inventario.setBackground(new java.awt.Color(18, 90, 173));
        btn_inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_inventario.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inventarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inventarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_inventarioMousePressed(evt);
            }
        });
        btn_inventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("...............");
        btn_inventario.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/inventario.png"))); // NOI18N
        btn_inventario.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Menu.add(btn_inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, -1));

        app_name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        app_name.setForeground(new java.awt.Color(255, 255, 255));
        app_name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/logo1-removebg-preview.png"))); // NOI18N
        Menu.add(app_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, 30));

        btn_vccc.setBackground(new java.awt.Color(18, 90, 173));
        btn_vccc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_vccc.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_vccc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_vcccMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_vcccMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_vcccMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_vcccMousePressed(evt);
            }
        });
        btn_vccc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("...");
        btn_vccc.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/ventas.png"))); // NOI18N
        btn_vccc.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Menu.add(btn_vccc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 220, -1));

        fondo.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 670));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        fondo.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 1080, 570));

        Header.setBackground(new java.awt.Color(25, 118, 210));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administración Y Control");

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("Hoy ");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(fecha))
                .addContainerGap(802, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        fondo.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1080, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarPanel(JPanel p) {
        p.setSize(1070, 640);
        p.setLocation(0, 0);
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void btn_prinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseEntered
        if (btn_prin.getBackground().getRGB() == -15574355)
            setColor(btn_prin);
    }//GEN-LAST:event_btn_prinMouseEntered

    private void btn_prinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseExited
        if (btn_ventas.getBackground().getRGB() != -15574355 || btn_inventario.getBackground().getRGB() != -15574355
                || btn_clientes.getBackground().getRGB() != -15574355 || btn_producto.getBackground().getRGB() != -15574355 || btn_reportes.getBackground().getRGB() != -15574355)
            resetColor(btn_prin);
    }//GEN-LAST:event_btn_prinMouseExited

    private void btn_prinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMousePressed

    }//GEN-LAST:event_btn_prinMousePressed

    private void btn_ventasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ventasMouseEntered
        if (btn_ventas.getBackground().getRGB() == -15574355)
            setColor(btn_ventas);
    }//GEN-LAST:event_btn_ventasMouseEntered

    private void btn_ventasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ventasMouseExited
        if (btn_prin.getBackground().getRGB() != -15574355 || btn_inventario.getBackground().getRGB() != -15574355
                || btn_clientes.getBackground().getRGB() != -15574355 || btn_producto.getBackground().getRGB() != -15574355 || btn_reportes.getBackground().getRGB() != -15574355)
            resetColor(btn_ventas);
    }//GEN-LAST:event_btn_ventasMouseExited

    private void btn_ventasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ventasMousePressed

    }//GEN-LAST:event_btn_ventasMousePressed

    private void btn_clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseEntered
        if (btn_clientes.getBackground().getRGB() == -15574355)
            setColor(btn_clientes);
    }//GEN-LAST:event_btn_clientesMouseEntered

    private void btn_clientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseExited
        if (btn_prin.getBackground().getRGB() != -15574355 || btn_inventario.getBackground().getRGB() != -15574355
                || btn_ventas.getBackground().getRGB() != -15574355 || btn_producto.getBackground().getRGB() != -15574355 || btn_reportes.getBackground().getRGB() != -15574355)
            resetColor(btn_clientes);
    }//GEN-LAST:event_btn_clientesMouseExited

    private void btn_clientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMousePressed

    }//GEN-LAST:event_btn_clientesMousePressed

    private void btn_reportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportesMouseEntered
        if (btn_reportes.getBackground().getRGB() == -15574355)
            setColor(btn_reportes);
    }//GEN-LAST:event_btn_reportesMouseEntered

    private void btn_reportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportesMouseExited
        if (btn_prin.getBackground().getRGB() != -15574355 || btn_inventario.getBackground().getRGB() != -15574355
                || btn_ventas.getBackground().getRGB() != -15574355 || btn_producto.getBackground().getRGB() != -15574355 || btn_clientes.getBackground().getRGB() != -15574355)
            resetColor(btn_reportes);
    }//GEN-LAST:event_btn_reportesMouseExited

    private void btn_reportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportesMousePressed

    }//GEN-LAST:event_btn_reportesMousePressed

    private void btn_inventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inventarioMouseEntered
        if (btn_inventario.getBackground().getRGB() == -15574355) {
            setColor(btn_inventario);
        }
    }//GEN-LAST:event_btn_inventarioMouseEntered

    private void btn_inventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inventarioMouseExited
        if (btn_prin.getBackground().getRGB() != -15574355 || btn_clientes.getBackground().getRGB() != -15574355
                || btn_ventas.getBackground().getRGB() != -15574355 || btn_producto.getBackground().getRGB() != -15574355 || btn_reportes.getBackground().getRGB() != -15574355)
            resetColor(btn_inventario);
    }//GEN-LAST:event_btn_inventarioMouseExited

    private void btn_inventarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inventarioMousePressed

    }//GEN-LAST:event_btn_inventarioMousePressed

    private void btn_inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inventarioMouseClicked
        mostrarPanel(panelInventario);
        resetColor(btn_prin);
        setColor(btn_inventario);
        resetColor(btn_ventas);
        resetColor(btn_producto);
        resetColor(btn_clientes);
        resetColor(btn_reportes);
    }//GEN-LAST:event_btn_inventarioMouseClicked

    private void btn_prinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseClicked
        mostrarPanel(panelPrincipal);
        setColor(btn_prin);
        resetColor(btn_inventario);
        resetColor(btn_ventas);
        resetColor(btn_producto);
        resetColor(btn_clientes);
        resetColor(btn_reportes);
    }//GEN-LAST:event_btn_prinMouseClicked

    private void btn_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ventasMouseClicked
        mostrarPanel(panelVentas);
        resetColor(btn_prin);
        resetColor(btn_inventario);
        setColor(btn_ventas);
        resetColor(btn_producto);
        resetColor(btn_clientes);
        resetColor(btn_reportes);
    }//GEN-LAST:event_btn_ventasMouseClicked

    private void btn_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseClicked
        mostrarPanel(panelClientes);
        resetColor(btn_prin);
        resetColor(btn_inventario);
        resetColor(btn_ventas);
        resetColor(btn_producto);
        setColor(btn_clientes);
        resetColor(btn_reportes);
    }//GEN-LAST:event_btn_clientesMouseClicked

    private void btn_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productoMouseClicked
        mostrarPanel(panelProducto);
        resetColor(btn_prin);
        resetColor(btn_inventario);
        resetColor(btn_ventas);
        setColor(btn_producto);
        resetColor(btn_clientes);
        resetColor(btn_reportes);
    }//GEN-LAST:event_btn_productoMouseClicked

    private void btn_productoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productoMouseEntered
        if (btn_producto.getBackground().getRGB() == -15574355) {
            setColor(btn_producto);
        }
    }//GEN-LAST:event_btn_productoMouseEntered

    private void btn_productoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productoMouseExited
        if (btn_prin.getBackground().getRGB() != -15574355 || btn_inventario.getBackground().getRGB() != -15574355
                || btn_ventas.getBackground().getRGB() != -15574355 || btn_reportes.getBackground().getRGB() != -15574355 || btn_clientes.getBackground().getRGB() != -15574355)
            resetColor(btn_producto);
    }//GEN-LAST:event_btn_productoMouseExited

    private void btn_productoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_productoMousePressed

    private void btn_reportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportesMouseClicked
        //falta panel
        resetColor(btn_prin);
        resetColor(btn_inventario);
        resetColor(btn_ventas);
        resetColor(btn_producto);
        resetColor(btn_clientes);
        setColor(btn_reportes);
    }//GEN-LAST:event_btn_reportesMouseClicked

    private void btn_vcccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vcccMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vcccMouseClicked

    private void btn_vcccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vcccMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vcccMouseEntered

    private void btn_vcccMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vcccMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vcccMouseExited

    private void btn_vcccMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vcccMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vcccMousePressed

    void setColor(JPanel panel) {
        panel.setBackground(new Color(21, 101, 192));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(18, 90, 173));
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel app_name;
    private javax.swing.JPanel btn_clientes;
    private javax.swing.JPanel btn_inventario;
    private javax.swing.JPanel btn_prin;
    private javax.swing.JPanel btn_producto;
    private javax.swing.JPanel btn_reportes;
    private javax.swing.JPanel btn_vccc;
    private javax.swing.JPanel btn_ventas;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel fecha;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
