
package com.utn.frba.dds.model.sector;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.utn.frba.dds.model.entrada.Entrada;

import javax.persistence.*;
import java.util.List;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@Entity
@Table(name = "sector")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_sector", discriminatorType = DiscriminatorType.STRING)
        public abstract class Sector {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

   @JsonBackReference
    @OneToMany(mappedBy = "sector", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Entrada> entradas;

    private float precio = 10000;
    

    public Sector() {
    }

    public Sector(float precio) {
        this.precio = precio;
    }

    public Sector(Integer id, List<Entrada> entradas, float precio) {
        this.id = id;
        this.entradas = entradas;
        this.precio = precio;
    }

    public Sector(Integer id, float precio) {
        this.id = id;
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


    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    

}
