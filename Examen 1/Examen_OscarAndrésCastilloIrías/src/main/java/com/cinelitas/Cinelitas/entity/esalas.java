/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinelitas.Cinelitas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author Neptune
 */
@Entity
@Table(name="salas")
public class esalas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private int numero_sala;
    private int capacidad_maxPersonas;
    
    @ManyToOne
    @JoinColumn(name="id_Pelicula")
    private epeliculas peliculas;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumero_sala() {
        return numero_sala;
    }

    public void setNumero_sala(int numero_sala) {
        this.numero_sala = numero_sala;
    }

    public int getCapacidad_maxPersonas() {
        return capacidad_maxPersonas;
    }

    public void setCapacidad_maxPersonas(int capacidad_maxPersonas) {
        this.capacidad_maxPersonas = capacidad_maxPersonas;
    }

    public epeliculas getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(epeliculas peliculas) {
        this.peliculas = peliculas;
    }

    
    
}
