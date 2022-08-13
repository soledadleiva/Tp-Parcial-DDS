package com.utn.frba.dds.model.FactorySector;

import com.utn.frba.dds.model.sector.Sector;
import com.utn.frba.dds.model.sector.Campo;

public class FactoryCampo extends FactorySector {
    @Override
    public Sector crearSector() {
        return new Campo();
    }
}
