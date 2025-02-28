package com.example.aeropuerto.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String destino;

    @ManyToOne
    @JoinColumn(name = "aeropuerto_id")
    private Aeropuerto aeropuerto;

    @ManyToMany(mappedBy = "vuelos")
    private List<Avion> aviones;

    // Getters y Setters
}
