package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Vuelo;
import com.example.aeropuerto.repository.VueloRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class VueloController {
    private final VueloRepository repository;

    public VueloController(VueloRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Vuelo> getAll() {
        return repository.findAll();
    }
}