package com.utn.frba.dds.repository;

import com.utn.frba.dds.model.compra.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="clientes")
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
