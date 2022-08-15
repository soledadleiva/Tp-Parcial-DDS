package com.utn.frba.dds.controller;

import com.utn.frba.dds.model.compra.Compra;
import com.utn.frba.dds.model.entrada.Artista;
import com.utn.frba.dds.model.entrada.Entrada;
import com.utn.frba.dds.repository.EntradaRepository;
import com.utn.frba.dds.service.EntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class EntradaController {

    @Autowired
    EntradaRepository repoEntrada;

    @Autowired
    EntradaService servicio;
    @GetMapping("/entradas")
    public List<Entrada> getEntradas(){
        return repoEntrada.findAll();
    }

    @PostMapping("/entradas")
    public ResponseEntity<Entrada> crearEntrada(@RequestBody Entrada entrada) {
        return new ResponseEntity(repoEntrada.save(entrada), HttpStatus.CREATED);
    }

    @DeleteMapping("/entradas/{id}")
    public ResponseEntity<Entrada> eliminarEntrada(@PathVariable Integer id) {
        repoEntrada.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/entradas/{id}")
    public ResponseEntity<Entrada> obtenerEntradaPorId(@PathVariable Integer id){
        return new ResponseEntity(repoEntrada.findById(id), HttpStatus.OK);
    }

    @GetMapping("/entradas/search")
    public ResponseEntity<?> searchByIdCompra(@RequestParam Integer filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findByIdCompra(filtro));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }

    }
}
