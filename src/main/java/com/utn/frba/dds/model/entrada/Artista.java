package com.utn.frba.dds.model.entrada;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@Entity
@Table(name = "artista")
public class Artista implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @JsonBackReference
    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Entrada> entradas;
    public String name;
    public String place;

    public String date;

    public Artista() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPlace(){
        return place;
    }


    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Artista(String name, String place, String date) {
        this.name = name;
        this.place = place;
        this.date = date;
    }
    public Artista(Integer id,String name, String place, String date) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.date = date;
    }

    public Artista(int id, List<Entrada> entradas, String name, String place, String date) {
        this.id = id;
        this.entradas = entradas;
        this.name = name;
        this.place = place;
        this.date = date;
    }
}
