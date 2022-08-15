
package com.utn.frba.dds.model.compra;

import com.utn.frba.dds.controller.ClienteController;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;
import java.util.Scanner;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private  String nombre;
    private  String apellido;
    private  String direccion;
    private  String mail;
    private  Boolean esMiembro;

    private  Boolean tieneCupon;

    private  String tarjeta;

    public Cliente() {
    }

    public Cliente(Integer id, String nombre, String apellido, String direccion, String mail, Boolean esMiembro, String tarjeta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.mail = mail;
        this.esMiembro = esMiembro;
        this.tarjeta = tarjeta;
    }

    public Cliente(Integer id, String nombre, String apellido, String direccion, String mail, Boolean esMiembro, Boolean tieneCupon, String tarjeta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.mail = mail;
        this.esMiembro = esMiembro;
        this.tieneCupon = tieneCupon;
        this.tarjeta = tarjeta;
    }

    public Cliente(String nombre, String apellido, String direccion, String mail, Boolean esMiembro, Boolean tieneCupon, String tarjeta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.mail = mail;
        this.esMiembro = esMiembro;
        this.tieneCupon = tieneCupon;
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getEsMiembro() {
        return esMiembro;
    }

    public void setEsMiembro(Boolean esMiembro) {
        this.esMiembro = esMiembro;
    }

    public Boolean getTieneCupon() {
        return tieneCupon;
    }

    public void setTieneCupon(Boolean tieneCupon) {
        this.tieneCupon = tieneCupon;
    }

 public static void ingresoDeDatos(){
     Scanner entrada = new Scanner(System.in);
     System.out.println("Ingrese su nombre: ");
     String nombre = entrada.nextLine();
     System.out.println("Ingrese su apellido: ");
     String apellido = entrada.nextLine();
     System.out.println("Ingrese su direccion: ");
     String direccion = entrada.nextLine();
     System.out.println("Ingrese su mail: ");
     String mail = entrada.nextLine();
     System.out.println("Ingrese su número de tarjeta: ");
     String tarjeta = entrada.nextLine();
     System.out.println("¿Cuenta con una membresia?");
     Boolean esMiembro = entrada.nextBoolean();
     System.out.println("¿Cuenta con un cupon de descuento?");
     Boolean tieneCupon = entrada.nextBoolean();

 }

 public static void muestraDeDatos(Cliente cliente){
     System.out.println("Los datos ingresados son: " + "\nNombre: " + cliente.getNombre()+
             "\n Apellido: " + cliente.getApellido() +
             "\n Dirección: " + cliente.getDireccion() +
             "\n Mail: " + cliente.getMail() +
             "\n Tiene Membresia: " + cliente.getEsMiembro() +
             "\n Tiene un cupon: " + cliente.getTieneCupon() +
             "\n Nro de tarjeta: " + cliente.getTarjeta());
 }

}
