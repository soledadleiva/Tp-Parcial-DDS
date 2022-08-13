package com.utn.frba.dds.model.FactorySector;
import com.utn.frba.dds.model.sector.Sector;
import com.utn.frba.dds.model.sector.Platea;

public class FactoryPlatea extends FactorySector{
    @Override
    public Sector crearSector() {
        return new Platea();
    }
}
