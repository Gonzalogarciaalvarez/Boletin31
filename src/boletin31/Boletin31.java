/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin31;

/**
 *
 * @author Gonzalo
 */

public class Boletin31 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
         // Matricula, Marca, Modelo
        Coche coche1 = new Coche("A1234", "Audi", "A4");
        Coche coche2 = new Coche("A2345", ",Mercedes", "S1");

        // Nombre
        Despacho despacho1 = new Despacho("Despacho 1");
        Despacho despacho2 = new Despacho("Despacho 2");

        // Nombre, Dni
        Cliente cliente1 = new Cliente("Paco", "12345678B");
        Cliente cliente2 = new Cliente("Pepa", "23456789C");

        // Nombre
        AreaVenta area1 = new AreaVenta("Area 1");
        AreaVenta area2 = new AreaVenta("Area 2");

        // Despacho, Fax, Nombre, Apellidos, Dni, Direccion, Antiguedad, Telefono, Salario
        Secretario secretario1 = new Secretario(despacho2, "034986475214", "Lolo", "Caballero", "89456123J", "Rua", 3, "986225533", 1000);

        // Despacho, AreaVenta, Coche, Nombre, Apellidos, Dni, Direccion, Antiguedad, Telefono, Salario
        XefeZona xefeZona1 = new XefeZona(despacho1, area1, coche1, "Lurdes", "Abel", "45678912D", "Camino", 5, "986475566", 1457);

        //Coche, telfMovil, Comision, Nombre, Apellidos, Dni, Direccion, Antiguedad, Telefono, Salario
        Vendedor vendedor1 = new Vendedor(coche2, "655474434", 10, "María", "Gil", "45612378G", "Silo", 2, "986475512", 954);
        area1.añadirVendedor(vendedor1);

        // Asigno a Xefe de Zona 1 como jefe de secretario1
        xefeZona1.setSecretarioAsignado(secretario1);

        // Muestro todos los empleados
        secretario1.imprimir();
        xefeZona1.imprimir();
        vendedor1.imprimir();

        // Incremento el salario de XefeZona1 y Vendedor1 y los muestro por pantalla
        xefeZona1.incrementarSalario();
        vendedor1.incrementarSalario();

        xefeZona1.imprimir();
        vendedor1.imprimir();
    }
    }