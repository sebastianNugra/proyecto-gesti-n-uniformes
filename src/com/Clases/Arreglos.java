package com.Clases;

public class Arreglos {

    private String prenda;
    private double costo;
    private String descripcion;
    private String fechaEntrega;

    public Arreglos() {
    }

    public Arreglos(String prenda, double costo, String descripcion, String fechaEntrega) {
        this.prenda = prenda;
        this.costo = costo;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
    }

    public String getPrenda() {
        return prenda;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    
}
