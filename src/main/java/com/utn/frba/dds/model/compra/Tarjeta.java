
package com.utn.frba.dds.model.compra;

import javax.persistence.*;

@Entity
@Table(name = "tarjeta")
        public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String numeroTarjeta;
    private Boolean esTarjetaValida;
    private float saldo;
    private float limite;

    @ManyToOne
  @JoinColumn(name = "cliente_id")
 private Cliente cliente;

    public Tarjeta() {
    }

    public Tarjeta(String numeroTarjeta, Boolean esTarjetaValida, float saldo, float limite) {
        this.numeroTarjeta = numeroTarjeta;
        this.esTarjetaValida = esTarjetaValida;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Tarjeta(String numeroTarjeta, float saldo) {
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
    }

    public Tarjeta(String numeroTarjeta, Boolean esTarjetaValida, float saldo) {
        this.numeroTarjeta = numeroTarjeta;
        this.esTarjetaValida = esTarjetaValida;
        this.saldo = saldo;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Boolean getEsTarjetaValida() {
        return esTarjetaValida;
    }

    public void setEsTarjetaValida(Boolean esTarjetaValida) {
        this.esTarjetaValida = esTarjetaValida;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    
    
}
