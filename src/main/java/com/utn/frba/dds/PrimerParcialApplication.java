package com.utn.frba.dds;

import com.utn.frba.dds.model.compra.Compra;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

@SpringBootApplication
public class PrimerParcialApplication {
	public static void main(String[] args) {
		SpringApplication.run(PrimerParcialApplication.class, args);
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
	} */
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
	} */
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}