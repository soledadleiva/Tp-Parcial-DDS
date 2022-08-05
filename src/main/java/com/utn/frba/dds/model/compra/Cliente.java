
package com.utn.frba.dds.model.compra;

import java.util.List;


public class Cliente {
    
    private String nombre;
    private String apellido;
    private String direccion;
    private String mail;
    private List<Tarjeta> tarjetas;


    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String direccion, String mail, List<Tarjeta> tarjetas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.mail = mail;
        this.tarjetas = tarjetas;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    
    
    
}
