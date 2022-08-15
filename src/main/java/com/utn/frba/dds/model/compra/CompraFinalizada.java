
package com.utn.frba.dds.model.compra;
import com.utn.frba.dds.controller.CompraController;
import com.utn.frba.dds.model.entrada.Entrada;
import org.springframework.beans.factory.annotation.Autowired;


public class CompraFinalizada extends EstadoCompra{

    @Autowired
    CompraController compraController;

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

    public void agregarCompraABd(Compra compra){
        compraController.crearCompra(compra);
    }


}
