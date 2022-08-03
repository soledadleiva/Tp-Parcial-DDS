
package com.utn.frba.dds.model.entrada;


public class Sector {
    
    private Ubicacion ubicacion;
    private TipoSector tipo;
    private float precio;
    
    
    //Meter los precios con ifs...

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
    
    
}
