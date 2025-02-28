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

    @ManyToMany
    @JoinTable(
            name = "AVION-VUELO-JoinTable",
            joinColumns = @JoinColumn(name = "avion_id"),
            inverseJoinColumns = @JoinColumn(name = "vuelo_id")
    )
    private List<Vuelo> vuelos;

    // Getters y Setters
}
