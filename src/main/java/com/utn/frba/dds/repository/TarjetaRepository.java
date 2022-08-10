package com.utn.frba.dds.repository;

import com.utn.frba.dds.model.compra.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="tarjetas")
public interface TarjetaRepository extends JpaRepository<Tarjeta,Integer> {

}
