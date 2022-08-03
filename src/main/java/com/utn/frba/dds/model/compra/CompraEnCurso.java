package com.utn.frba.dds.model.compra;
import com.utn.frba.dds.model.entrada.Entrada;


public class CompraEnCurso extends EstadoCompra {

    public CompraEnCurso(Compra compra) {
        super(compra);
    }

    
    @Override
    public void agregarEntrada(Entrada entrada) {
        compra.getEntradas().add(entrada);
    }

    @Override
    public void eliminarEntrada(Entrada entrada) {
        compra.getEntradas().remove(entrada);
    }

    @Override
    public void borrar() {
        compra.getEntradas().clear();
    }

    @Override
    public EstadoCompra estadoSiguiente() {
    // Aca verifico la cantidad de entradas, si es menor a 4
    //El estado siguiente sera la compra aceptada,
    //en caso contrario se rechaza y se borra
    
    if(compra.tieneCantidadValidaDeEntradas()){
        return new CompraAceptada(compra);
    }
          else{
               return new CompraRechazada(compra);
               }
    }

    @Override
    public String mensajeCompra() {
    return "La compra se encuentra en curso";
        }
    
   
  }




    
