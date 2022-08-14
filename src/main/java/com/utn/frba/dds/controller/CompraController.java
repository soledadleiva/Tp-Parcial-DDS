package com.utn.frba.dds.controller;

import com.utn.frba.dds.model.compra.Compra;
import com.utn.frba.dds.model.entrada.Artista;
import com.utn.frba.dds.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class CompraController {

    @Autowired
    CompraRepository repoCompra;

    @GetMapping("/compras")
    public ResponseEntity<List<Compra>> listarCompras() {
        return new ResponseEntity(repoCompra.findAll(), HttpStatus.OK);
    }

    @GetMapping("/lista")
    public List<Compra> getCompras(){
        return repoCompra.findAll();
    }

    @PostMapping("/compras")
    public ResponseEntity<Compra> crearCompra(@RequestBody Compra compra) {
        return new ResponseEntity(repoCompra.save(compra), HttpStatus.CREATED);
    }

    @DeleteMapping("/compras/{id}")
    public ResponseEntity<Compra> eliminarCompra(@PathVariable Integer id) {
        repoCompra.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/compras/{id}")
    public ResponseEntity<Compra> obtenerCompraPorId(@PathVariable Integer id){
        return new ResponseEntity(repoCompra.findById(id), HttpStatus.OK);
    }



}
