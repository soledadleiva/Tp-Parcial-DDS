package com.utn.frba.dds.model.FactorySector;

import com.utn.frba.dds.model.sector.Sector;
import com.utn.frba.dds.model.sector.CampoVip;

public class FactoryCampoVip extends FactorySector{

    @Override
    public Sector crearSector() {
        return new CampoVip();
    }
}
