package com.utn.frba.dds.model.sector;

import com.utn.frba.dds.model.entrada.Entrada;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;


@Entity
@DiscriminatorValue("CAMPO")
public class Campo extends Sector {

    public Campo() {
    }

    public Campo(Integer id, List<Entrada> entradas, float precio) {
        super(id, entradas, precio);
    }

    @Override
    public void setPrecio(float precio) {
        super.setPrecio(precio);
    }

    public Campo(float precio) {
        super(precio);
    }
}
