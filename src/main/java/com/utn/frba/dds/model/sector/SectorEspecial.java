package com.utn.frba.dds.model.sector;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ESPECIAL")
public class SectorEspecial extends Sector{

    public SectorEspecial() {
    }

    
}
