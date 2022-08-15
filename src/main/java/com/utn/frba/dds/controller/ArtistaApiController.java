package com.utn.frba.dds.controller;

import com.utn.frba.dds.service.ApiDatosArtista;
import com.utn.frba.dds.service.ApiArtistas;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/artistas")
@RequiredArgsConstructor
public class ArtistaApiController {

    private final ApiArtistas artistaService;

    @GetMapping
    public ResponseEntity<List<ApiDatosArtista>> getAll(){
        return new ResponseEntity<>(artistaService.getArtistas(), HttpStatus.OK);
    }

    @GetMapping("/lista")
    public List<ApiDatosArtista> getArtistas(){
        return artistaService.getArtistas();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveArtista(@RequestBody ApiDatosArtista artista){
        artistaService.saveArtista(artista);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateArtista(@PathVariable("id") Integer id, @RequestBody ApiDatosArtista artista){
        artistaService.updateArtista(id, artista);
    }

    @DeleteMapping("/{id}")
    public void deleteArtista(@PathVariable("id") Integer id) {
        artistaService.deleteArtista(id);
    }




}


