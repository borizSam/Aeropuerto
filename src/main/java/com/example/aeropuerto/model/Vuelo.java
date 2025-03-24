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
    @JoinColumn(name = "avion_id")
    private Avion avion;

    @ManyToOne
    @JoinColumn(name = "origen_id")
    private Aeropuerto aeropuertoOrigen;

    @ManyToOne
    @JoinColumn(name = "destino_id")
    private Aeropuerto aeropuertoDestino;
}
