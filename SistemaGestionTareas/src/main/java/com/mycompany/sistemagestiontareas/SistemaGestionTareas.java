/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemagestiontareas;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaGestionTareas {

    public static void main(String[] args) {
       ArrayList<Tarea> listaTareas = new ArrayList<>();//llamo el metodo arraylis para poder hacer las listas y lo istancio
        Scanner scanner = new Scanner(System.in);//llamo el metodo scanner y lo istancio

        System.out.println("Bienvenido al sistema de gestión de tareas.");

        //realiso el menu para agretar las tareas 
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas pendientes");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            //el cronograma para guardar las tareas con nombre y fechas 
            switch (opcion) {
                case 1:
                    scanner.nextLine(); //esto limpiar el buffer del scanner
                    System.out.print("Ingrese el nombre de la tarea: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Ingrese la fecha de vencimiento de la tarea (dd/mm/yyyy): ");
                    String fechaVencimiento = scanner.nextLine();
                    Tarea nuevaTarea = new Tarea(nombre, descripcion, fechaVencimiento);
                    listaTareas.add(nuevaTarea);
                    System.out.println("Tarea agregada con éxito.");
                    break;
                case 2://nos muestra todo sobre si tenemos tareas pendientes o si no 
                    if (listaTareas.isEmpty()) { 
                        System.out.println("No hay tareas pendientes.");
                        /*/esta primrra linea es para si no tenemos tarea nos muestre que no hay tareas
                        guardadas que los tenemos limpios */
                    } else {
                        System.out.println("Lista de tareas pendientes:");
                        for (Tarea tarea : listaTareas) {
                            System.out.println(tarea);/*en este nos muestra toda la lista de tareas que 
                            tenemos programadas*/
                        }
                    }
                    break;
                case 3://y con este salimos del menu de las tareas y de todo el siclo 
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default://aca es por si introducimos una opcion no valida y buelba al siclo 
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
