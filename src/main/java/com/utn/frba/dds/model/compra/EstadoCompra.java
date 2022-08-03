
package com.utn.frba.dds.model.compra;
import com.utn.frba.dds.model.entrada.Entrada;


public abstract class EstadoCompra {
    
    protected Compra compra;
    
    public EstadoCompra(Compra compra){
        this.compra = compra;
    }
    
    public abstract void agregarEntrada(Entrada entrada);
    public abstract void eliminarEntrada(Entrada entrada);
    public abstract void borrar();
    public abstract EstadoCompra estadoSiguiente();
    public abstract String mensajeCompra();
}
