package com.utn.frba.dds.controller;

import com.utn.frba.dds.model.Api.ApiArtista;
import com.utn.frba.dds.model.entrada.Artista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestSpringBootController {
    @Autowired
    private ApiArtista apiArtista;

    @GetMapping(value = "/artistas")
    public Artista[] getArtistas(){
        return apiArtista.findArtistas();
    }
}
