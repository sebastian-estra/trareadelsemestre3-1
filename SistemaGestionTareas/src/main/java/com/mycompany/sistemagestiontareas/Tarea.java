/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestiontareas;

public class Tarea {
    String nombre;
    String descripcion;
    String fechaVencimiento;

    public Tarea(String nombre, String descripcion, String fechaVencimiento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
    }

    
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                '}';
    }
}