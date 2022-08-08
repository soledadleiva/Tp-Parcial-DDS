
package com.utn.frba.dds.model.entrada;

import javax.persistence.*;

@Entity
@Table(name = "sector")
        public class Sector {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Transient
    private Ubicacion ubicacion;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipoDeSector")
    private TipoSector tipo;
    private float precio;
    
    
    public Sector() {
    }

    public Sector(Ubicacion ubicacion, TipoSector tipo, float precio) {
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.precio = precio;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
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
