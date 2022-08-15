package com.utn.frba.dds.service;

import com.utn.frba.dds.model.compra.Compra;
import com.utn.frba.dds.model.entrada.Entrada;
import com.utn.frba.dds.repository.EntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntradaServiceImpl implements EntradaService {

    @Autowired
    EntradaRepository entradaRepo;

    @Override
    public List<Entrada> findByIdCompra(Integer filtro) throws Exception {
        try{
            List<Entrada> entradas = entradaRepo.findByCompra(filtro);
            return entradas;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
