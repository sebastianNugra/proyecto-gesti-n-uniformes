package com.login;

import java.awt.Color;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        BG = new javax.swing.JPanel();
        mostrar = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        BG2 = new javax.swing.JLabel();
        INICIAR_SESION = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        usuario1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txt_contra = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JPanel();
        txt_login = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/mostrar.png"))); // NOI18N
        mostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarMouseClicked(evt);
            }
        });
        BG.add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/ocultar.png"))); // NOI18N
        ocultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });
        BG.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/logo1-removebg-preview.png"))); // NOI18N
        BG.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 210, 180));

        nombre.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("EMPRESA TEXTIL");
        BG.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 180, 40));

        BG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/Diseño sin título.png"))); // NOI18N
        BG2.setText("asdasd");
        BG.add(BG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 290, 500));

        INICIAR_SESION.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        INICIAR_SESION.setForeground(new java.awt.Color(0, 0, 0));
        INICIAR_SESION.setText("INICIAR SESIÓN");
        BG.add(INICIAR_SESION, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 220, 40));

        usuario.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setText("USUARIO");
        BG.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txt_usuario.setForeground(new java.awt.Color(153, 153, 153));
        txt_usuario.setText("Ingrese su nombre de usuario");
        txt_usuario.setBorder(null);
        txt_usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_usuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_usuarioFocusLost(evt);
            }
        });
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyTyped(evt);
            }
        });
        BG.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 340, 30));
        BG.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 340, 20));

        usuario1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        usuario1.setForeground(new java.awt.Color(0, 0, 0));
        usuario1.setText("CONTRASEÑA");
        BG.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));
        BG.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 340, 10));

        txt_contra.setForeground(new java.awt.Color(153, 153, 153));
        txt_contra.setText("*********");
        txt_contra.setToolTipText("");
        txt_contra.setBorder(null);
        txt_contra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_contraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_contraFocusLost(evt);
            }
        });
        txt_contra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_contraMousePressed(evt);
            }
        });
        txt_contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraActionPerformed(evt);
            }
        });
        BG.add(txt_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 310, 30));

        btn_login.setBackground(new java.awt.Color(24, 126, 153));
        btn_login.setForeground(new java.awt.Color(24, 113, 118));

        txt_login.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        txt_login.setForeground(new java.awt.Color(255, 255, 255));
        txt_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_login.setText("INGRESAR");
        txt_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_loginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_loginLayout = new javax.swing.GroupLayout(btn_login);
        btn_login.setLayout(btn_loginLayout);
        btn_loginLayout.setHorizontalGroup(
            btn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        btn_loginLayout.setVerticalGroup(
            btn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        BG.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        if (txt_usuario.getText().equals("Ingrese su nombre de usuario")) {
            txt_usuario.setText("");
            txt_usuario.setForeground(Color.black);
        }
        if (String.valueOf(txt_contra.getPassword()).isEmpty()) {
            txt_contra.setText("*********");
            txt_contra.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txt_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_loginMouseEntered
        // TODO add your handling code here:
        btn_login.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_txt_loginMouseEntered

    private void txt_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_loginMouseExited
        // TODO add your handling code here:
        btn_login.setBackground(new Color(24, 126, 153));
    }//GEN-LAST:event_txt_loginMouseExited

    private void txt_contraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_contraMousePressed
        // TODO add your handling code here:
        if (String.valueOf(txt_contra.getPassword()).equals("*********")) {
            txt_contra.setText("");
            txt_contra.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su nombre de usuario");
            txt_usuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_contraMousePressed

    private void txt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_loginMouseClicked
        // TODO add your handling code here:
        try {
            String usuario = "Admin";
            String contra = "123456";

            String Pass = new String(txt_contra.getPassword());

            if (txt_usuario.getText().equals(usuario) && Pass.equals(contra)) {
                frm_principal objeto = new frm_principal();
                objeto.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o Contrasena Inconrrectos");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Login", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txt_loginMouseClicked

    private void mostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarMouseClicked
        mostrar.setVisible(false);
        ocultar.setVisible(true);
        txt_contra.setEchoChar((char) 0);
    }//GEN-LAST:event_mostrarMouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked
        mostrar.setVisible(true);
        ocultar.setVisible(false);
        txt_contra.setEchoChar('*');
    }//GEN-LAST:event_ocultarMouseClicked

    private void txt_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioKeyTyped

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        txt_contra.requestFocus();
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_usuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usuarioFocusGained
        // TODO add your handling code here:
        if (txt_usuario.getText().equals("Ingrese su nombre de usuario")) {
            txt_usuario.setText("");
            txt_usuario.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_usuarioFocusGained

    private void txt_usuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usuarioFocusLost
        // TODO add your handling code here:
        if (txt_usuario.getText().equals("")) {
            txt_usuario.setText("Ingrese su nombre de usuario");
        }
    }//GEN-LAST:event_txt_usuarioFocusLost

    private void txt_contraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_contraFocusGained
        // TODO add your handling code here:
        if (String.valueOf(txt_contra.getPassword()).equals("*********")) {
            txt_contra.setText("");
            txt_contra.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_contraFocusGained

    private void txt_contraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_contraFocusLost
        // TODO add your handling code here:
        if (String.valueOf(txt_contra.getPassword()).equals("")) {
            txt_contra.setText("*********");
        }
    }//GEN-LAST:event_txt_contraFocusLost

    private void txt_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraActionPerformed
        Enter();
    }//GEN-LAST:event_txt_contraActionPerformed

    public void Enter() {
        try {
            String usuario = "Admin";
            String contra = "123456";

            String Pass = new String(txt_contra.getPassword());

            if (txt_usuario.getText().equals(usuario) && Pass.equals(contra)) {
                frm_principal objeto = new frm_principal();
                objeto.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o Contrasena Inconrrectos");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Login", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel BG2;
    private javax.swing.JLabel INICIAR_SESION;
    private javax.swing.JPanel btn_login;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mostrar;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel ocultar;
    private javax.swing.JPasswordField txt_contra;
    private javax.swing.JLabel txt_login;
    private javax.swing.JTextField txt_usuario;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario1;
    // End of variables declaration//GEN-END:variables
}
