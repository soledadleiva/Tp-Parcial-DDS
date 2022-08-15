package com.utn.frba.dds.model.compra;


import com.utn.frba.dds.controller.CompraController;
import org.springframework.beans.factory.annotation.Autowired;

public class DescuentoOrdenLlegada {

    @Autowired
    CompraController compraController;


    public Integer cantidadDeCompras(){
        Integer cantidad = compraController.getCompras().size();
        return cantidad;
    }

    public Boolean cantidadValidaDeCompras(){
       return this.cantidadDeCompras()<=3;
    }

    public float ordenLlegada(){

        if(cantidadValidaDeCompras()){
            return  5 / 100;
        }
        else
            return 0;

    }





}
