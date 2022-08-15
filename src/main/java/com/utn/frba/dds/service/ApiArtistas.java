package com.utn.frba.dds.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor

public class ApiArtistas {

    @Value("${spring.external.service.base-url}")
    private String basePath;

    private final RestTemplate restTemplate;




    public List<ApiDatosArtista> getArtistas() {
        ApiDatosArtista[] response = restTemplate.getForObject(basePath + "/artists", ApiDatosArtista[].class);
        return Arrays.asList(response);
    }

    public void saveArtista(ApiDatosArtista user) {
        restTemplate.postForObject(basePath + "/artists", user, ApiDatosArtista.class);
    }

    public void updateArtista(Integer id, ApiDatosArtista user) {
        restTemplate.put(basePath + "/artists/" + id, user);
    }

    public void deleteArtista(Integer id) {
        restTemplate.delete(basePath + "/artists/" + id);
    }


}