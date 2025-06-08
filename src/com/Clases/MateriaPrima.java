package com.Clases;

public class MateriaPrima {
    private int id;
    private String nombre;
    private String tipo;
    private double cantidadDisponible;
    private String fechaRegistro;

    public MateriaPrima() {
    }

    public MateriaPrima(int id, String nombre, String tipo, double cantidadDisponible, String fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadDisponible = cantidadDisponible;
        this.fechaRegistro = fechaRegistro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(double cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
}
