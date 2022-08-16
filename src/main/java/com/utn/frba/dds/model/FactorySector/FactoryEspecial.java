package com.utn.frba.dds.model.FactorySector;

import com.utn.frba.dds.model.sector.Sector;
import com.utn.frba.dds.model.sector.SectorEspecial;

public class FactoryEspecial extends FactorySector {
    @Override
    public Sector crearSector() {
        return new SectorEspecial();
    }
}
