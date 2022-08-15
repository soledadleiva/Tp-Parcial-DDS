package com.utn.frba.dds.repository;

import com.utn.frba.dds.model.compra.Compra;
import com.utn.frba.dds.model.entrada.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path="compras")
public interface CompraRepository extends JpaRepository<Compra,Integer> {

   // @Query(value=SELECT * FROM compra
     //       WHERE compra.fecha_de_compra BETWEEN  '2022/08/07' AND '2022/08/10')

/*
    List<Compra> findByEntrada(Integer id);

    //SELECT * FROM entrada WHERE compra_id = ...
    @Query(value = "SELECT entrada FROM compra WHERE compra.id LIKE %:filtro% ",nativeQuery = true)
    List<Compra> findByIdEntrada(@Param("filtro")Integer filtro);
*/
}
