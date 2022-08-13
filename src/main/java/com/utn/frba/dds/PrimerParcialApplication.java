package com.utn.frba.dds;

import com.utn.frba.dds.controller.ArtistaApiController;
import com.utn.frba.dds.controller.ArtistaController;
import com.utn.frba.dds.model.entrada.Artista;
import com.utn.frba.dds.service.ApiDatosArtista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PrimerParcialApplication implements CommandLineRunner {

	@Autowired
	ArtistaApiController artistas;

	@Autowired
	ArtistaController artistasBd;

	public static void main(String[] args) {
		SpringApplication.run(PrimerParcialApplication.class, args);
/*
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese 0 para salir, 1 para buscar un artista.");
		int seleccion = entrada.nextInt();
		do{
			if(seleccion == 1) {
				Scanner entrada = new Scanner(System.in);
				String artista;
				System.out.println("Ingrese el artista que desea ver: ");
				artista = entrada.nextLine();
				// print trae el lugar de donde se presenta
				// preguntar si quiere comprar con Y /N
				new Compra();
				Compra.comprar();
			}
			else {
				System.out.println("Seleccion invalida");
				System.out.println("Ingrese 0 para salir, 1 para iniciar una nueva compra.");
				seleccion = entrada.nextInt();
			}
		}while (seleccion != 0);
	}



		// una vez que eligio la compra y todo
		//Cliente cliente = cargarDatosCliente();
	}
	/*private static Cliente cargarDatosCliente(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		nombre = entrada.nextLine();
		System.out.println("Ingrese su apellido: ");
		apellido = entrada.nextLine();
		System.out.println("Ingrese su direccion: ");
		direccion = entrada.nextLine();
		System.out.println("Ingrese su mail: ");
		mail = entrada.nextLine();
		Cliente cliente = new Cliente(nombre, apellido, direccion, mail,[]);
	}
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	*/


	}

	@Override
	public void run(String... args) throws Exception {

/*  funciona
		System.out.println("La lista es:" + artistas.getAll());

		List<Artista> artistasAPersistir = new ArrayList<>();
		for (ApiDatosArtista apiartista : artistas.getArtistas()) {
			Artista artista = new Artista(apiartista.getId(),apiartista.getName(), apiartista.getPlace(), apiartista.getDate());
				artistasAPersistir.add(artista);
				artistasBd.saveArtista(artista);

		}

		for(Artista artista: artistasAPersistir){
			System.out.println(artistasAPersistir);
		}
	}
*/
	}
}