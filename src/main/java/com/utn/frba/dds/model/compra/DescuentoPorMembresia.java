
package com.utn.frba.dds.model.compra;


public class DescuentoPorMembresia extends DescuentoStrategy {

    public DescuentoPorMembresia() {
    }

    @Override
    public float descuentoAplicado(Compra compra) {

        return compra.precioTotalEntradas() * 20 / 100;
    }
    @Override
    public boolean cantidadTotalCompras() {
        return false;
    }

}
