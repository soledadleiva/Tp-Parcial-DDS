package com.utn.frba.dds.repository;

import com.utn.frba.dds.model.entrada.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="artistas")
public interface ArtistaRepository extends JpaRepository<Artista, Integer> {

}
