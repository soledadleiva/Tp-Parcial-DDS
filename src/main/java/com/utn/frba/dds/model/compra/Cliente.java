
package com.utn.frba.dds.model.compra;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String mail;
    private Boolean esMiembro;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true) // Relacion bidireccional con Tarjeta
    private List<Tarjeta> tarjetas;



    public Cliente() {
    }

    public Cliente(Integer id, String nombre, String apellido, String direccion, String mail, Boolean esMiembro, List<Tarjeta> tarjetas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.mail = mail;
        this.esMiembro = esMiembro;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getEsMiembro() {
        return esMiembro;
    }

    public void setEsMiembro(Boolean esMiembro) {
        this.esMiembro = esMiembro;
    }
}
