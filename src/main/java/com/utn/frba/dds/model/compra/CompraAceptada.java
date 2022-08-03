
package com.utn.frba.dds.model.compra;
import com.utn.frba.dds.model.entrada.Entrada;


public class CompraAceptada extends EstadoCompra {

    public CompraAceptada(Compra compra) {
        super(compra);
    }

    
    @Override
    public void agregarEntrada(Entrada entrada) {}

    @Override
    public void eliminarEntrada(Entrada entrada) {}

    @Override
    public void borrar() {
        compra.getEntradas().clear();
    }

    @Override
    public EstadoCompra estadoSiguiente() {
        return new CompraFinalizada(compra);
    }

    @Override
    public String mensajeCompra() {
        return "La compra ha sido aceptada";
    }
    
}
