
package com.utn.frba.dds.model.compra;


public class DescuentoPorMembresia extends DescuentoStrategy {

    public DescuentoPorMembresia() {
    }

    @Override
    public float descuentoAplicado(Compra compra) {
        if (compra.cantidadDeEntradas() == 4) {
            return compra.precioTotalEntradas() * 20 / 100;
        } else {
            return compra.precioTotalEntradas();
        }
    }

    @Override
    public boolean cantidadTotalCompras() {
        return false;
    }


}
