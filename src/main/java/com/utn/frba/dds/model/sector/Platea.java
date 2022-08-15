package com.utn.frba.dds.model.sector;

import com.utn.frba.dds.model.entrada.Entrada;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;

@Entity
@DiscriminatorValue("PLATEA")
public class Platea extends Sector {

    public Platea() {
    }

    public Platea(Integer id, List<Entrada> entradas, float precio) {
        super(id, entradas, precio);
    }

    public Platea(Integer id, float precio) {
        super(id, precio);
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public List<Entrada> getEntradas() {
        return super.getEntradas();
    }

    @Override
    public void setEntradas(List<Entrada> entradas) {
        super.setEntradas(entradas);
    }

    @Override
    public float getPrecio() {
        return super.getPrecio();
    }

    @Override
    public void setPrecio(float precio) {
        super.setPrecio(precio);
    }

    public Platea(float precio) {
        super(precio);
    }
}
