
package com.utn.frba.dds.repository;

import com.utn.frba.dds.model.compra.Compra;
import com.utn.frba.dds.model.entrada.Artista;
import com.utn.frba.dds.model.entrada.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path="entradas")
public interface EntradaRepository extends JpaRepository<Entrada,Integer> {

    List<Entrada> findByCompra(Integer id);

    //SELECT * FROM entrada WHERE compra_id = ...
    @Query(value = "SELECT * FROM entrada WHERE entrada.compra.id = %:filtro% ",nativeQuery = true)
    List<Entrada> findByIdCompra(@Param("filtro")Integer filtro);
    
}
