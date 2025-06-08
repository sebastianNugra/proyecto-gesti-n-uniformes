package com.Clases;

import com.Clases.db;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Cliente implements Interface_GBAE {

    private int id;
    private String cedula;
    private String nombre;
    private String mail;
    private String telefono;

    public Cliente() {
    }

    public Cliente(int id, String cedula, String nombre, String mail, String telefono) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.mail = mail;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean mtd_guardar() {
        try {
            String sql = "INSERT INTO cliente (Ccedula, Cnombre, Cemail, Ctelefono) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = db.mycon().prepareStatement(sql);
            ps.setString(1, cedula);
            ps.setString(2, nombre);
            ps.setString(3, mail);
            ps.setString(4, telefono);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al guardar", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    @Override
    public boolean mtd_buscar() {
        try {
            String sql = "SELECT * FROM cliente WHERE Cid = ?";
            PreparedStatement ps = db.mycon().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cedula = rs.getString("Ccedula");
                nombre = rs.getString("Cnombre");
                mail = rs.getString("Cemail");
                telefono = rs.getString("Ctelefono");
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al buscar", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    @Override
    public boolean mtd_eliminar() {
        try {
            String sql = "DELETE FROM cliente WHERE Cid = ?";
            PreparedStatement ps = db.mycon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al eliminar", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    @Override
    public boolean mtd_actualizar() {
        try {
            String sql = "UPDATE cliente SET Ccedula = ?, Cnombre = ?, Cemail = ?, Ctelefono = ? WHERE Cid = ?";
            PreparedStatement ps = db.mycon().prepareStatement(sql);
            ps.setString(1, cedula);
            ps.setString(2, nombre);
            ps.setString(3, mail);
            ps.setString(4, telefono);
            ps.setInt(5, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al actualizar", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    //metodo registro duplicado
    public boolean rgtrDuplicado() {
        try {
            String sql = "SELECT * FROM cliente WHERE Ccedula = ?";
            PreparedStatement ps = db.mycon().prepareStatement(sql);
            ps.setString(1, cedula);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            return true;
        }
    }
}
