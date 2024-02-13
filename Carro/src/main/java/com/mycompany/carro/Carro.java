/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carro;


public class Carro {

    public static void main(String[] args) {
        // Instanciando dos objetos de la clase Vehiculo
        Vehiculo vehiculo1 = new Vehiculo("Toyota Camry", 2020, "Negro");
        Vehiculo vehiculo2 = new Vehiculo("Honda Civic", 2018, "Rojo");

        // Mostrando los detalles iniciales de los vehículos
        System.out.println("Detalles del Vehículo 1:");
        vehiculo1.mostrarDetalles();

        System.out.println("\nDetalles del Vehículo 2:");
        vehiculo2.mostrarDetalles();

        // Modificando el color del vehículo 1
        vehiculo1.cambiarColor("Blanco");

        // Mostrando los detalles actualizados del vehículo 1
        System.out.println("\nDetalles del Vehículo 1 después de cambiar el color:");
        vehiculo1.mostrarDetalles();
        
        // Modificando el color del vehículo 2
        vehiculo2.cambiarColor("Blanco");

        // Mostrando los detalles actualizados del vehículo 2
        System.out.println("\nDetalles del Vehículo 2 después de cambiar el color:");
        vehiculo2.mostrarDetalles();
    }
}
