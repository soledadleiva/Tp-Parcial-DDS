
package com.utn.frba.dds.model.entrada;

import com.utn.frba.dds.model.compra.Cliente;

import javax.persistence.*;

@Entity
@Table(name = "entrada")
public class Entrada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Transient
    private Sector sector;
    @Transient
    private Cliente cliente;
    @Transient
    private Artista artista;
    private String lugar;

    public Entrada() {
    }

    
    
    public Entrada(int id, Sector sector, Cliente cliente, Artista artista, String lugar) {
        this.id = id;
        this.sector = sector;
        this.cliente = cliente;
        this.artista = artista;
        this.lugar = lugar;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
    
    public void visualizarEntrada(){
        System.out.println("Sector: " + sector);
        System.out.println("Cliente: " + cliente);
        System.out.println("Artista: " + artista);
        System.out.println("Lugar: " + lugar);

    }
    
    public float precioEntrada(){
        return sector.getPrecio();
    }
}
