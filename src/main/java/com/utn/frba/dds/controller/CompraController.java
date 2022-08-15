package com.utn.frba.dds.controller;

import com.utn.frba.dds.model.compra.Compra;
import com.utn.frba.dds.model.entrada.Artista;
import com.utn.frba.dds.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("")
public class CompraController {

    @Autowired
    CompraRepository repoCompra;

/*
    @GetMapping("/compras")
    public ResponseEntity<List<Compra>> listarCompras() {
        return new ResponseEntity(repoCompra.findAll(), HttpStatus.OK);
    }

*/
    @GetMapping(path = "/compras", produces= MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Compra> getCompras(){
        return repoCompra.findAll();
    }



    @PostMapping(value = "/compras")
    public void crearCompra(@RequestBody Compra compra){
        repoCompra.save(compra);
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


    @GetMapping("/{id}")
    public Compra getCompraPorId(@PathVariable Integer id){
        Compra compra = repoCompra.findById(id).orElse(null);
        return compra;
    }

    /*
    @GetMapping("/compras/search")
    public ResponseEntity<?> searchByCompras(@RequestParam Integer filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }

    }
*/



}
