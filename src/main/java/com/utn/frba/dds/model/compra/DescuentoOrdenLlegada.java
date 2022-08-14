package com.utn.frba.dds.model.compra;

import com.utn.frba.dds.controller.CompraController;
import com.utn.frba.dds.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DescuentoOrdenLlegada {

    @Autowired
    CompraController compra;

    public Integer cantidadDeEntradas(){
        Integer cantidad = compra.getCompras().size();
        return cantidad;
    }


    public float descuento(CompraController compra){
        return 0;
    }



}
