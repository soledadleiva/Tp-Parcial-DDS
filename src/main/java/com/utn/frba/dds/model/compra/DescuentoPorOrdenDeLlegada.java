package com.utn.frba.dds.model.compra;

public class DescuentoPorOrdenDeLlegada implements  DescuentoStrategy{
    @Override
    public float aplicarDescuento(Compra compra) {
        return 0;
    }
}
