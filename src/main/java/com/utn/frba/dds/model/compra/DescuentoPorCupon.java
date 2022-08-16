
package com.utn.frba.dds.model.compra;


public class DescuentoPorCupon extends DescuentoStrategy {


    @Override
    public float descuentoAplicado(Compra compra) {
        return (compra.precioTotalEntradas() * 15) / 100 ;
    }

    @Override
    public boolean cantidadTotalCompras() {
        return false;
    }

}
