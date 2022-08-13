package com.utn.frba.dds.controller;

import com.utn.frba.dds.model.compra.Cliente;
import com.utn.frba.dds.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class ClienteController {

    @Autowired
    ClienteRepository repoCliente;

    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> listarClientes() {
        return new ResponseEntity<>(repoCliente.findAll(), HttpStatus.OK);
    }

    @PostMapping("/clientes")
    public ResponseEntity<Cliente> crearCliente(@RequestBody Cliente cliente) {
        return new ResponseEntity(repoCliente.save(cliente), HttpStatus.CREATED);
    }

    @DeleteMapping("/clientes/{id}")
    public ResponseEntity<Cliente> eliminarCliente(@PathVariable Integer id) {
        repoCliente.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/clientes/{id}")
    public ResponseEntity<Cliente> obtenerclientePorId(@PathVariable Integer id){
        return new ResponseEntity(repoCliente.findById(id), HttpStatus.OK);
    }

    @PutMapping("/clientes/{id}")
    public ResponseEntity<Cliente> actualizarCliente(@PathVariable Integer id, @RequestBody Cliente cliente) {
        Optional<Cliente> clienteEncontrado = repoCliente.findById(id);
        if(clienteEncontrado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        try {
            clienteEncontrado.get().setNombre(cliente.getNombre());
            clienteEncontrado.get().setApellido(cliente.getApellido());
            clienteEncontrado.get().setDireccion(cliente.getDireccion());
            clienteEncontrado.get().setMail(cliente.getMail());

            return new ResponseEntity<>(repoCliente.save(clienteEncontrado.get()), HttpStatus.CREATED);
        } catch (DataAccessException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
