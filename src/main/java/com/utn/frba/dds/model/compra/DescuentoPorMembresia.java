
package com.utn.frba.dds.model.compra;


public class DescuentoPorMembresia implements DescuentoStrategy {


    @Override
    public float aplicarDescuento(Compra compra) {
        if(compra.cantidadDeEntradas() == 4){
            return compra.precioTotalEntradas() * 20 /100;
        }
        else{
            return compra.precioTotalEntradas();
        }
        
        }
    

}
