package com.example.aeropuerto.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private int capacidad;

    @OneToMany(mappedBy = "avion")
    private List<Vuelo> vuelos;

    // Getters y Setters
    public Avion() {
    }
    public Avion(Long id, String modelo, int capacidad, List<Vuelo> vuelos) {
        this.id = id;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.vuelos = vuelos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
}
