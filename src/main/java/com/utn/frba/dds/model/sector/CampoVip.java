package com.utn.frba.dds.model.sector;

import com.utn.frba.dds.model.entrada.Entrada;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;

@Entity
@DiscriminatorValue("CAMPOVIP")
public class CampoVip extends Sector {

    public CampoVip() {
    }

    public CampoVip(Integer id, List<Entrada> entradas, float precio) {
        super(id, entradas, precio);
    }

    @Override
    public void setPrecio(float precio) {
        super.setPrecio(precio);
    }

    public CampoVip(float precio) {
        super(precio);
    }

}
