
package com.utn.frba.dds.model.compra;


public class DescuentoPorMembresia extends DescuentoStrategy {


    @Override
    public float descuentoAplicado(Compra compra) {
        if(compra.cantidadDeEntradas() == 4){
            return compra.precioTotalEntradas() * 20 /100;
        }
        else{
            return compra.precioTotalEntradas();
        }
        
        }
    

}
