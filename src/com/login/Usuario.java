package com.login;

public class Usuario {

    private int id;
    private String nomUsuario;
    private String contra;

    public Usuario() {
    }

    public Usuario(int id, String nomUwsuario, String contra) {
        this.id = id;
        this.nomUsuario = nomUwsuario;
        this.contra = contra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomUwsuario() {
        return nomUsuario;
    }

    public void setNomUwsuario(String nomUwsuario) {
        this.nomUsuario = nomUwsuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
}
