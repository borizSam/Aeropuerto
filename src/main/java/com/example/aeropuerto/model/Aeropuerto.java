package com.example.aeropuerto.model;

import jakarta.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Aeropuerto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String ciudad;

    @OneToMany(mappedBy = "aeropuertoOrigen")
    private List<Vuelo> vuelosOrigen;

    @OneToMany(mappedBy = "aeropuertoDestino")
    private List<Vuelo> vuelosDestino;

}