/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figurasgeometricas;

/**
 *
 * @author HOME
 */
public class FigurasGeometricas {

    public static void main(String[] args) {
        // un círculo con radio 5
        Circulo circulo = new Circulo(5);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        // un rectángulo con longitud 4 y altura 3
        Rectangulo rectangulo = new Rectangulo(4, 3);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }
}