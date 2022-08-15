
package com.utn.frba.dds.model.entrada;


import com.utn.frba.dds.controller.CompraController;
import com.utn.frba.dds.controller.EntradaController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class ValidadorRetiroTicket {

    @Autowired
    static
    CompraController compraController;

    @Autowired
    EntradaController entradaController;

    //el cliente ingresa su numero de operacion
    //Se busca el numero entre la lista de compras finalizadas
    //Si lo encuentra imprime la informacion de cada entrada perteneciente a esa compra
    //Si no la encuetra devuelve un mesaje de error explicando que el codigo es incorrecto o la compra no existe;


    public void validarTicket(){

        Scanner nroOperacion = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese su numero de operación: ");
        numero = nroOperacion.nextInt();

        if (compraController.obtenerCompraPorId(numero) != null){
            for(Entrada entrada: entradaController.getEntradas() ){
                System.out.println("Id: " + entrada.getId());
                System.out.println("Sector: " + entrada.getSector());
                System.out.println("Artista: " + entrada.getArtista());
                System.out.println("Lugar: " + entrada.getLugar());
                System.out.println("Fecha: " + entrada.getFecha());
            }
        }else{
            System.out.println("El codigo ingresado es incorrecto o la compra no fue finalizada");
        }
    }

    public static Integer solicitudNroOperacion(){
        Scanner nroOperacion = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese su numero de operación: ");
        numero = nroOperacion.nextInt();
        return numero;

    }
    public static void imprimirTicket(){ // Imprime los datos de la compra
        compraController.obtenerCompraPorId(solicitudNroOperacion());
        System.out.println("Datos de su compra:");
        System.out.println("\n -----------------\n");
        System.out.println(compraController);
    }
}
