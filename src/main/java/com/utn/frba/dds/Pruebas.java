package com.utn.frba.dds;

import com.utn.frba.dds.controller.ArtistaController;
import com.utn.frba.dds.model.FactorySector.FactoryEspecial;
import com.utn.frba.dds.model.FactorySector.FactorySector;
import com.utn.frba.dds.model.compra.*;
import com.utn.frba.dds.model.entrada.Artista;
import com.utn.frba.dds.model.entrada.Entrada;
import com.utn.frba.dds.model.sector.CampoVip;
import com.utn.frba.dds.model.sector.Platea;
import com.utn.frba.dds.model.sector.SectorEspecial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Pruebas {
    @Autowired
    ArtistaController artistaController;

    public static void main(String[] args) {
        SpringApplication.run(PrimerParcialApplication.class, args);

        Artista artista1 = new Artista(1, "Selena Gomez", "Movistar Arena", "20/09/2022");
        Artista artista2 = new Artista(2, "Dua Lipa", "Estadio River Plate", "13/09/2022");
        Artista artista3 = new Artista(3, "Imagine Dragons", "Direct TV Arena", "20/08/2022");
        Artista artista4 = new Artista(4, "Eminem", "Estadio Unico de La Plata", "17/09/2022");
        Artista artista5 = new Artista(5, "Ed Sheeran", "Luna Park", "13/09/2022");
        ArrayList<Artista> artistas = new ArrayList<>();
        artistas.add(artista1);
        artistas.add(artista2);
        artistas.add(artista3);
        artistas.add(artista4);
        artistas.add(artista5);

        Entrada entrada1 = new Entrada(1, new Platea(18000), artista1, "Movistar Arena", "20/09/2022");
        Entrada entrada2 = new Entrada(2, new Platea(18000), artista1, "Movistar Arena", "20/09/2022");
        Entrada entrada3 = new Entrada(3, new Platea(18000), artista1, "Movistar Arena", "20/09/2022");
        Entrada entrada4 = new Entrada(4, new Platea(18000), artista1, "Movistar Arena", "20/09/2022");
        Entrada entrada5 = new Entrada(5, new Platea(18000), artista1, "Movistar Arena", "20/09/2022");
        Entrada entrada6 = new Entrada(6, new CampoVip(25000), artista2, "Estadio River Plate", "13/09/2022");
        ArrayList<Entrada> entradas = new ArrayList<>();
        entradas.add(entrada1);
        entradas.add(entrada2);
        entradas.add(entrada3);
        entradas.add(entrada4);
        entradas.add(entrada5);
        entradas.add(entrada5);


        Cliente cliente1 = new Cliente("Brenda", "Torrico", "Av.Siempre viva 1234", "btorrico@gmail.com", true, false, "4245454548878523");
        Cliente cliente2 = new Cliente("Soledad", "Leiva", "Medrano 951", "sleiva@gmail.com", false, true, "405254548878523");

        //Compra1: Tiene cargadas una cantidad de entradas no permitidas por el sistemas, pasa a estado rechazado
        //compra1: Tiene la cantidad correcta de entradas asi que la compra finaliza con exito!

        Compra compra1 = new Compra(1, List.of(entrada1, entrada2), cliente1, LocalDate.of(2022, 8, 15));
        //Compra compra1 = new Compra(1, List.of(entrada1, entrada2, entrada3, entrada4,entrada5), cliente1, LocalDate.of(2022, 8, 15));
        Compra compra2 = new Compra(1, List.of(entrada6), cliente2, LocalDate.of(2022, 8, 20));
        List<Compra> compras = new ArrayList<>();


        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 0 para salir, 1 para buscar un artista");
        int seleccion = entrada.nextInt();
        do {
            if (seleccion == 1) {
                Scanner entradaNombre = new Scanner(System.in);
                String artistaIngresado;
                System.out.println("Ingrese el artista que desea ver: ");
                artistaIngresado = entradaNombre.nextLine();
                List<Artista> artistasEncontrados = new ArrayList<>();

                for (Artista artista : artistas) {

                    if (artistaIngresado.equals(artista.name)) {
                        artistasEncontrados.add(artista);
                    }
                }

                if (artistasEncontrados.size()==0){
                    System.out.println("No existe ese artista :( ");
                    System.exit(0);
                }

                for (Artista artista : artistasEncontrados) {
                    System.out.println("*************************************");

                    System.out.println("Datos: ");
                    System.out.println("Artista: " + artista.name);
                    System.out.println("Lugar de presentacion: " + artista.place);
                    System.out.println("Fecha de presentacion: " + artista.date);
                }
                System.out.println("*************************************");
                Scanner decision = new Scanner(System.in);
                String compra;
                System.out.println("¿Desea realizar una compra?: En caso afirmativo ingrese: Y, en caso contrario: N ");
                compra = decision.nextLine();
                if (compra.equals("Y")) {
                    System.out.println("Le pediremos unos datos para iniciar el proceso de compra...");
                    System.out.println("*************************************");

                    Scanner entradaDatosCliente = new Scanner(System.in);
                    System.out.println("Ingrese su nombre: ");
                    String nombre = entradaDatosCliente.nextLine();
                    System.out.println("Ingrese su apellido: ");
                    String apellido = entradaDatosCliente.nextLine();
                    System.out.println("Ingrese su direccion: ");
                    String direccion = entradaDatosCliente.nextLine();
                    System.out.println("Ingrese su mail: ");
                    String mail = entradaDatosCliente.nextLine();
                    System.out.println("Ingrese su número de tarjeta: ");
                    String tarjeta = entradaDatosCliente.nextLine();
                    System.out.println("¿Cuenta con una membresia?");
                    Boolean esMiembro = entradaDatosCliente.nextBoolean();
                    System.out.println("¿Cuenta con un cupon de descuento?");
                    Boolean tieneCupon = entradaDatosCliente.nextBoolean();

                    Cliente cliente = new Cliente(nombre, apellido, direccion, mail, esMiembro, tieneCupon, tarjeta);

                    Scanner cantidad = new Scanner(System.in);
                    int compr;
                    System.out.println("Ingrese la cantidad de entradas que desea: ");
                    compr = cantidad.nextInt();
                    Scanner discapacidad = new Scanner(System.in);
                    String discapa;
                    System.out.println("¿Posee alguna discapacidad motriz? En caso afirmativo ingrese: Y, en caso contrario: N ");
                    discapa = discapacidad.nextLine();
                    if(discapa.equals("Y")){
                        new FactoryEspecial().crearSector();
                        System.out.println("Se ha creado un nuevo sector especial");
                        }
                        compra1.setEstadoCompra(new CompraEnCurso(compra1));
                    if (compra1.tieneCantidadValidaDeEntradas()) {
                        compra1.estadoSiguiente();
                        compra1.mensajeCompra();
                        DescuentoOrdenLlegada DescuentoOrdenLlegada = new DescuentoOrdenLlegada();
                        compra1.setDescuento(new DescuentoPorOrdenDeLlegadaAdapter(DescuentoOrdenLlegada));
                        if (compra1.esPrimerasTresCompras()) {
                            compra1.setDescuento(new DescuentoPorMembresia());
                            System.out.println("Se aplicara el descuento por orden de llegada: " + compra1.descuentoAplicado());
                        }else{
                            if (cliente.getEsMiembro()) {
                                compra1.setDescuento(new DescuentoPorMembresia());
                                System.out.println("Se aplicara el descuento por membresia de: " + compra1.descuentoAplicado());
                            }else{
                                if (cliente.getTieneCupon()) {
                                    compra1.setDescuento(new DescuentoPorCupon());
                                    System.out.println("Se aplicara el descuento por cupon de: " + compra1.descuentoAplicado());
                                } else{
                                    System.out.println("No hay descuentos disponibles :( ");
                                }
                            }

                        System.out.println("*************************************");

                        compra1.setEstadoCompra(new CompraFinalizada(compra1));
                        compra1.mensajeCompra();
                        compras.add(compra1);
                        System.out.println("Datos de su compra: ");
                        System.out.println("Codigo de operacion: " + compra1.getId());
                        System.out.println("Cantidad de entradas: " + compra1.getEntradas().size());
                        System.out.println("Fecha de Compra: " + LocalDate.now());
                        System.out.println("Precio total: " + compra1.precioTotalEntradas());
                        if (compra1.precioTotalConDescuento() == 0.0) {
                            System.out.println("Precio total con descuento: " + compra1.precioTotalEntradas());
                        } else {
                            System.out.println("Precio total con descuento: " + compra1.precioTotalConDescuento());
                        }
                    }
                        System.out.println("*************************************");
                    } else {
                        compra1.setEstadoCompra(new CompraRechazada(compra1));
                        compra1.mensajeCompra();
                        System.out.println("Vuelva pronto");
                    }
                }
                } else {
                    System.out.println("Seleccion invalida");
                    System.out.println("Ingrese 0 para salir, 1 para iniciar una nueva compra.");
                    seleccion = entrada.nextInt();
                }
            } while (seleccion != 0);
      }
    }


















