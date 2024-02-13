/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singletonfutbol;

/**
 *
 * @author HOME
 */
public class SingletonFutbol {

    public static void main(String[] args) {
       // Obtener la instancia de ConfiguracionGrupoFutbol
        ConfiguracionGrupoFutbol configuracion = ConfiguracionGrupoFutbol.getInstancia();

        // Acceder y modificar la ConfiguracionGrupoFutbol del singleton con el get 
        System.out.println("Nombre del grupo de fútbol: " + configuracion.getNombreGrupo());
        System.out.println("Cantidad de jugadores: " + configuracion.getCantidadJugadores());

        configuracion.setNombreGrupo("Equipo A");
        configuracion.setCantidadJugadores(15);

        // Acceder nuevamente a la ConfiguracionGrupoFutbol del singleton con el set 
        System.out.println("Nombre del grupo de fútbol actualizado: " + configuracion.getNombreGrupo());
        System.out.println("Cantidad de jugadores actualizada: " + configuracion.getCantidadJugadores());
    }
}