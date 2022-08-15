package com.utn.frba.dds.model.compra;

public class DescuentoPorOrdenDeLlegadaAdapter extends DescuentoStrategy{

    private DescuentoOrdenLlegada ordenLlegada;

    public DescuentoPorOrdenDeLlegadaAdapter(DescuentoOrdenLlegada ordenLlegada) {
        this.ordenLlegada = ordenLlegada;
    }

    public DescuentoOrdenLlegada getOrdenLlegada() {
        return ordenLlegada;
    }

    public void setOrdenLlegada(DescuentoOrdenLlegada ordenLlegada) {
        this.ordenLlegada = ordenLlegada;
    }


    @Override
    public float descuentoAplicado(Compra compra) {
        return compra.precioTotalEntradas() * ordenLlegada.ordenLlegada();
    }


}
