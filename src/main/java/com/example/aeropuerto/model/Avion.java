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
}
