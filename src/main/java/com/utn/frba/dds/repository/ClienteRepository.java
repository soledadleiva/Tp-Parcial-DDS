package com.utn.frba.dds.repository;

import com.utn.frba.dds.model.compra.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(path="clientes")
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

  //  public Cliente findByEmail(String email);


 //Uso de SQL : Filtra a los clientes por nombre o apellido
    @Query(value= "SELECT * FROM cliente WHERE cliente.nombre LIKE %:filtro% OR  cliente.apellido LIKE %:filtro%",
    nativeQuery = true)
    List<Cliente> search(@Param("filtro") String filtro);

}
