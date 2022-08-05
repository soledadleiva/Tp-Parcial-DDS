
package com.utn.frba.dds.model.compra;


public class DescuentoPorCupon implements DescuentoStrategy {
       
    private float descuento = 15; 

    @Override
    public float aplicarDescuento(Compra compra) {
        return (compra.precioTotalEntradas() * descuento) / 100 ;
    }
    
}
