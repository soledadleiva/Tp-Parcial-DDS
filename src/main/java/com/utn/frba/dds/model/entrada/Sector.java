
package com.utn.frba.dds.model.entrada;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@Entity
@Table(name = "sector")
        public class Sector {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @JsonBackReference
    @OneToMany(mappedBy = "sector", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Entrada> entradas;

    @OneToMany(mappedBy = "sector",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Ubicacion> ubicacion;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipoDeSector")
    private TipoSector tipo;
    private float precio;
    

    public Sector() {
    }

    public Sector(Integer id, List<Entrada> entradas, List<Ubicacion> ubicacion, TipoSector tipo, float precio) {
        this.id = id;
        this.entradas = entradas;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    public List<Ubicacion> getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(List<Ubicacion> ubicacion) {
        this.ubicacion = ubicacion;
    }

    public TipoSector getTipo() {
        return tipo;
    }

    public void setTipo(TipoSector tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public float precio(){
        if(tipo == TipoSector.CAMPO){
            return 8599;
        }
        if(tipo == TipoSector.CAMPOVIP){
            return 16800;
        }
        if(tipo == TipoSector.GENERAL){
            return 10000;
        }
        if(tipo == TipoSector.PLATEA){
            return 11500;
        } 
        return 0;
    }
}
