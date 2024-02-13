/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carro;


public class Vehiculo {
    String modelo;
    int año;
    String color;

    public Vehiculo(String modelo, int año, String color) {
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }

    // Método para imprimir los detalles del vehículo
    public void mostrarDetalles() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Color: " + color);
    }

    // Método para cambiar el color del vehículo
    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("El color del vehículo se ha cambiado a " + nuevoColor);
    }
}
