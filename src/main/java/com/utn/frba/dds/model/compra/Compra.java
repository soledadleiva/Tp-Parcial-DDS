
package com.utn.frba.dds.model.compra;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.utn.frba.dds.model.entrada.Entrada;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@JsonIdentityInfo(
       generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@Entity
@Table(name = "compra")
public class Compra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

   // @JsonBackReference
    @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Entrada> entradas;
    @ManyToOne()
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @JsonIgnore
    @Transient
    private DescuentoStrategy descuento;
    @JsonIgnore
    @Transient
    protected EstadoCompra estadoCompra;

    private LocalDate fechaDeCompra;

    public Compra() {
        estadoCompra = new CompraEnCurso(this);
    }

    public void mensajeCompra(){

        estadoCompra.mensajeCompra();
    }

    public Compra(List<Entrada> entradas, Cliente cliente, DescuentoStrategy descuento, EstadoCompra estado) {
        this.entradas = entradas;
        this.cliente = cliente;
        this.descuento = descuento;
        this.estadoCompra = estado;
    }

    public Compra(Integer id, List<Entrada> entradas, Cliente cliente, DescuentoStrategy descuento, EstadoCompra estadoCompra, LocalDate fechaDeCompra) {
        this.id = id;
        this.entradas = entradas;
        this.cliente = cliente;
        this.descuento = descuento;
        this.estadoCompra = estadoCompra;
        this.fechaDeCompra = fechaDeCompra;
    }

    public Compra(Integer id, List<Entrada> entradas, Cliente cliente, LocalDate fechaDeCompra) {
        this.id = id;
        this.entradas = entradas;
        this.cliente = cliente;
        this.fechaDeCompra = fechaDeCompra;
    }

    public Compra(Integer id, Cliente cliente, LocalDate fechaDeCompra) {
        this.id = id;
        this.cliente = cliente;
        this.fechaDeCompra = fechaDeCompra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(LocalDate fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
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

    public DescuentoStrategy getDescuento() {
        return descuento;
    }

    public DescuentoStrategy setDescuento(DescuentoStrategy descuento) {
        this.descuento = descuento;
        return descuento;
    }

    public EstadoCompra getEstadoCompra() { return estadoCompra; }

    public void setEstadoCompra(EstadoCompra estado) {
        this.estadoCompra = estado;
    }
    
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
    
    public float precioEntrada(Entrada entrada){
        return entrada.precioEntrada();
        
    }

    public float precioTotalEntradas() {
        float sumatoriaPrecioEntradas= 0;
        for(Entrada entrada : entradas){
            sumatoriaPrecioEntradas +=  precioEntrada(entrada);

        }
        return sumatoriaPrecioEntradas;

    }

    public float descuentoAplicado(){
        return descuento.descuentoAplicado(this);
    }
    
    public float precioTotalConDescuento(){
        
        return precioTotalEntradas() - descuento.descuentoAplicado(this) ;
        
    }
    public boolean esPrimerasTresCompras(){
        return false;
    }


}
