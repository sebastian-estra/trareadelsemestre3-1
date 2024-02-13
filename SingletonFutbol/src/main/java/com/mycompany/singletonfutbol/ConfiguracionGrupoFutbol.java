/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singletonfutbol;

public class ConfiguracionGrupoFutbol {
    private static ConfiguracionGrupoFutbol instancia;
    private String nombreGrupo;
    private int cantidadJugadores;

    // Constructor privado
    private ConfiguracionGrupoFutbol() {
        this.nombreGrupo = "Equipo de Fútbol";
        this.cantidadJugadores = 11;
    }
    
    /*/lo que no entendí mucho fue lo de lis hilos del Singleton que existen los  tipos de hilos
    https://www.youtube.com/watch?v=osSJxXas3PM*/
    // Método estático para obtener la instancia única del singleton
    public static ConfiguracionGrupoFutbol getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionGrupoFutbol();
        }
        return instancia;
    }

    // Métodos para acceder y modificar la configuración con el get y el set 
    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }
}

