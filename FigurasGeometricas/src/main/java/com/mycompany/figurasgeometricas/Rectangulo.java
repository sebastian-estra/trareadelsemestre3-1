/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

//aca se realisa el calculo del area y del perimetro 
public class Rectangulo extends FiguraGeometrica {
    double longitud;
    double altura;

    public Rectangulo(double longitud, double altura) {
        this.longitud = longitud;
        this.altura = altura;
    }

    
    double calcularArea() {
        return longitud * altura;
    }

   
    double calcularPerimetro() {
        return 2 * (longitud + altura);
    }
}