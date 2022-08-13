package com.utn.frba.dds.repository;

import com.utn.frba.dds.model.entrada.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path="artistas")
public interface ArtistaRepository extends JpaRepository<Artista, Integer> {


    //SELECT * FROM artista WHERE name = ...
    List<Artista> findByName(String name);

    //SELECT * FROM artista WHERE date = ...
    List<Artista> findByDate(String date);

    //SELECT * FROM artista WHERE place = ...
    List<Artista> findByPlace(String place);
}
