
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
