package com.utn.frba.dds.service;

import lombok.Data;

import java.io.Serializable;

@Data
public class ApiDatosArtista implements Serializable {
    private Integer id;
    private String name;
    private String place;
    private String date;
}
