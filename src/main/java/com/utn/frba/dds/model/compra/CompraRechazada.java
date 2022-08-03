
package com.utn.frba.dds.model.compra;
import com.utn.frba.dds.model.entrada.Entrada;


public class CompraRechazada extends EstadoCompra{

    public CompraRechazada(Compra compra) {
        super(compra);
    }

    
    @Override
    public void agregarEntrada(Entrada entrada) {}

    @Override
    public void eliminarEntrada(Entrada entrada) {}

    @Override
    public void borrar() {}

    @Override
    public EstadoCompra estadoSiguiente() {
        return null;
    }

    @Override
    public String mensajeCompra() {
        return "Lo sentimos, su compra fue rechazada ya que se ha superado la cantidad maxima de entradas por persona";
    }
    
    
}
