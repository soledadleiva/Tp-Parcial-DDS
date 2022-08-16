
package com.utn.frba.dds.model.compra;


public abstract class DescuentoStrategy {

    public abstract float descuentoAplicado(Compra compra);

    public abstract boolean cantidadTotalCompras();
}
