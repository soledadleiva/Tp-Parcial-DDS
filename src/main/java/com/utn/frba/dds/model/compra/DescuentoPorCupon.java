
package com.utn.frba.dds.model.compra;


public class DescuentoPorCupon extends DescuentoStrategy {
       
    private float descuento = 15; 

    @Override
    public float descuentoAplicado(Compra compra) {
        return (compra.precioTotalEntradas() * descuento) / 100 ;
    }
    
}
