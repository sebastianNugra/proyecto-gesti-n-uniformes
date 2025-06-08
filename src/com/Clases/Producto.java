package com.Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Producto implements Interface_GBAE {

    private int id;
    private String prenda;
    private String tipo;
    private String colegio;
    private String talla;
    private String cantidad;
    private String precio;

    public Producto() {
    }

    public Producto(int id, String prenda, String tipo, String colegio, String talla, String cantidad, String precio) {
        this.id = id;
        this.prenda = prenda;
        this.tipo = tipo;
        this.colegio = colegio;
        this.talla = talla;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenda() {
        return prenda;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public boolean mtd_guardar() {
        try {
            String sql = "INSERT INTO producto (Pprenda, Ptipo, Pcolegio, Ptalla, Pcantidad,Pprecio) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = db.mycon().prepareStatement(sql);
            ps.setString(1, prenda);
            ps.setString(2, tipo);
            ps.setString(3, colegio);
            ps.setString(4, talla);
            ps.setString(5, cantidad);
            ps.setString(6, precio);
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
            String sql = "SELECT * FROM producto WHERE Pid = ?";
            PreparedStatement ps = db.mycon().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                prenda = rs.getString("Pprenda");
                tipo = rs.getString("Ptipo");
                colegio = rs.getString("Pcolegio");
                talla = rs.getString("Ptalla");
                cantidad = rs.getString("Pcantidad");
                precio = rs.getString("Pprecio");
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
    public boolean mtd_actualizar() {
        try {
            String sql = "UPDATE producto SET Pprenda = ?, Ptipo = ?, Pcolegio = ?, Ptalla = ?, Pcantidad = ?, Pprecio = ? WHERE Pid = ?";
            PreparedStatement ps = db.mycon().prepareStatement(sql);
            ps.setString(1, prenda);
            ps.setString(2, tipo);
            ps.setString(3, colegio);
            ps.setString(4, talla);
            ps.setString(5, cantidad);
            ps.setString(6, precio);
            ps.setInt(7, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al actualizar", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    @Override
    public boolean mtd_eliminar() {
        try {
            String sql = "DELETE FROM producto WHERE Pid = ?";
            PreparedStatement ps = db.mycon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al eliminar", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
