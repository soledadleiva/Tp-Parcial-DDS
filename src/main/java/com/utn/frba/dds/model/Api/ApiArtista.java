package com.utn.frba.dds.model.Api;

import com.utn.frba.dds.model.entrada.Artista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class ApiArtista {
    @Autowired
    private RestTemplate template = new RestTemplate();

    public Artista[] findArtistas() {
        return template.getForObject("https://ghibliapi.herokuapp.com/films", Artista[].class); //buscar link que funcione
    }
}

