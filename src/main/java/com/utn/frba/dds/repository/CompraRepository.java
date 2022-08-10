package com.utn.frba.dds.repository;

import com.utn.frba.dds.model.compra.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="compras")
public interface CompraRepository extends JpaRepository<Compra,Integer> {
}
