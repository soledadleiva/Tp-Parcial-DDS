package com.utn.frba.dds.controller;

import com.utn.frba.dds.model.entrada.Artista;
import com.utn.frba.dds.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class ArtistaController {

        @Autowired
        ArtistaRepository artistaRepo;

        @GetMapping("/artistas")
         public List<Artista> getArtistas(){
        return artistaRepo.findAll();
    }

        //Encontrar por Id
        @Transactional
        @GetMapping("/artistas/{idartista}")
        public Optional<Artista> findArtista(@PathVariable Integer id){
            return artistaRepo.findById(id);
        }
         //ALTA Cliente
       @Transactional
          @PostMapping("/artistas")
         public void saveArtista(@RequestBody Artista artista){
        artistaRepo.save(artista);
    }
        // BAJA Artista
        @Transactional
        @DeleteMapping("artistas/{idartista}")
        public void deleteArtista(@PathVariable Integer idArtista){
            artistaRepo.deleteById(idArtista);
        }
        //Busqueda de un artista por el nombre
        @GetMapping("artistas/name")
        public ResponseEntity getArtistByName(@RequestParam String name){
        return new ResponseEntity<List<Artista>>(artistaRepo.findByName(name), HttpStatus.OK);
        }

    //Busqueda de un artistas que se presentan en una determinada fecha
          @GetMapping("artistas/date")
         public ResponseEntity getArtistByDate(@RequestParam String date){
        return new ResponseEntity<List<Artista>>(artistaRepo.findByDate(date), HttpStatus.OK);
         }

    //Busqueda de un artistas por lugar de presentacion
        @GetMapping("artistas/place")
         public ResponseEntity getArtistByPlace(@RequestParam String place){
        return new ResponseEntity<List<Artista>>(artistaRepo.findByPlace(place), HttpStatus.OK);
    }
}
