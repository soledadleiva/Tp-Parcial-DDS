
package com.utn.frba.dds.model.compra;
import com.utn.frba.dds.model.entrada.Entrada;



public class CompraFinalizada extends EstadoCompra{

    public CompraFinalizada(Compra compra) {
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
     return this;
    }

    @Override
    public void mensajeCompra() {
        System.out.println("La compra ha finalizado con exito!");
    }
    
}
