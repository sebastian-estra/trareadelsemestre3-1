/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

//aca se realisa el calculo del area y del perimetro 
public class Circulo extends FiguraGeometrica {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

   
    double calcularArea() {
        return Math.PI * radio * radio;
    }

    
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
