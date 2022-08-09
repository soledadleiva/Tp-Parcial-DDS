
package com.utn.frba.dds.model.metodosDePago;


public interface CreadorPuntoDePago {
    public static PuntoDePago getPuntoDePago(String puntoDePago) {

        if (puntoDePago == null) {
            return null;
        }

        if (puntoDePago.equalsIgnoreCase("PAGAYA")) {
            return new PagaYa();
        else {
            throw new IllegalStateException("Unexpected value: " + puntoDePago);
        }
    	}
    }
}

