
package com.utn.frba.dds.model.compra;

import com.utn.frba.dds.model.entrada.Entrada;

import com.utn.frba.dds.model.metodosDePago.MetodoDePago;
import java.util.List;

public class Compra {
    
    private List<Entrada> entradas;
    private Cliente cliente;
    private MetodoDePago metodoDePago;
    private DescuentoStrategy descuento;
    protected EstadoCompra estadoCompra;

    
    public Compra() {
        estadoCompra = new CompraEnCurso(this);
    }
    
    public String mensajeCompra(){
       return estadoCompra.mensajeCompra();
    }

    public Compra(List<Entrada> entradas, Cliente cliente, MetodoDePago metodoDePago, DescuentoStrategy descuento, EstadoCompra estado) {
        this.entradas = entradas;
        this.cliente = cliente;
        this.metodoDePago = metodoDePago;
        this.descuento = descuento;
        this.estadoCompra = estado;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }



    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public DescuentoStrategy getDescuento() {
        return descuento;
    }

    public void setDescuento(DescuentoStrategy descuento) {
        this.descuento = descuento;
    }

    public EstadoCompra getEstadoCompra() {
        return estadoCompra;
    }

    public void setEstadoCompra(EstadoCompra estado) {
        this.estadoCompra = estado;
    }
    
    // public float total(){}
    
    // pagarCompra()
    
    public int cantidadDeEntradas(){
        return this.entradas.size();
    }

    public boolean tieneCantidadValidaDeEntradas() {
        return this.cantidadDeEntradas() <= 4; 
        }
    
    public void agregarEntrada(Entrada entrada){
        estadoCompra.agregarEntrada(entrada);
    }
    
    public void eliminarEntrada(Entrada entrada){
        estadoCompra.eliminarEntrada(entrada);
    }
    
    public void borrar(){
        estadoCompra.borrar();
    }
    
    public void estadoSiguiente(){
        estadoCompra = estadoCompra.estadoSiguiente();
    }
    
    public void VisualizarEntradas(){
        System.out.println("Contenido de la compra");
        for(Entrada entrada: entradas)
            entrada.visualizarEntrada();
        System.out.println();
    }
    
    
}
