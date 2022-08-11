
package com.utn.frba.dds.model.entrada;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.utn.frba.dds.model.compra.Compra;

import javax.persistence.*;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@Entity
@Table(name = "entrada")
public class Entrada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "sector_id")
    private Sector sector;
    @Transient
    private Artista artista;
    private String lugar;
    private String fecha;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "compra_id")
    private Compra compra;
    public Entrada() {
    }

    public Entrada(int id, Sector sector, Artista artista, String lugar, String fecha) {
        this.id = id;
        this.sector = sector;
        this.artista = artista;
        this.lugar = lugar;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }


    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() { return fecha; }

    public void setFecha(String fecha) { this.fecha = fecha; }
    
    public void visualizarEntrada(){
        System.out.println("Sector: " + sector);
        System.out.println("Artista: " + artista);
        System.out.println("Lugar: " + lugar);

    }
    
    public float precioEntrada(){
        return sector.getPrecio();
    }
}
