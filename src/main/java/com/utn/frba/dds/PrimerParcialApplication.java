package com.utn.frba.dds;

import com.utn.frba.dds.controller.ArtistaApiController;
import com.utn.frba.dds.controller.ArtistaController;
import com.utn.frba.dds.controller.ClienteController;
import com.utn.frba.dds.model.compra.Cliente;
import com.utn.frba.dds.model.entrada.Artista;
import com.utn.frba.dds.service.ApiDatosArtista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class PrimerParcialApplication{

	@Autowired
	ArtistaApiController artistas;

	@Autowired
	ArtistaController artistasBd;

	@Autowired
	ClienteController clienteController;

	public static void main(String[] args) {
		SpringApplication.run(PrimerParcialApplication.class, args);


	}



	// Busqueda datos de Artista en la base de datos
	public void busquedaArtista() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el nombre del artista: ");
		String nombre = entrada.nextLine();
		List<Artista> artistas = artistasBd.artistByName(nombre);
		for (Artista artista : artistas) {
			Artista artistaaa = new Artista(artista.getId(), artista.getName(), artista.getPlace(), artista.getDate());
			System.out.println(artistaaa);
		}
	}

	public void cargarDeDatosDeApiAlSistema() {
		List<Artista> artistasAPersistir = new ArrayList<>();
		for (ApiDatosArtista apiartista : artistas.getArtistas()) {
			Artista artista = new Artista(apiartista.getId(), apiartista.getName(), apiartista.getPlace(), apiartista.getDate());
			artistasAPersistir.add(artista);
			artistasBd.saveArtista(artista);

		}

		for (Artista artista : artistasAPersistir) {
			System.out.println(artistasAPersistir);
		}
	}
}




