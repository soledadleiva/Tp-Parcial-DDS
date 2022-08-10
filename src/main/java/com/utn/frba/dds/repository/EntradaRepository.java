
package com.utn.frba.dds.repository;

import com.utn.frba.dds.model.entrada.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="entradas")
public interface EntradaRepository extends JpaRepository<Entrada,Integer> {
    
}
