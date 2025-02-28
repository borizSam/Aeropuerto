package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Aeropuerto;
import com.example.aeropuerto.repository.AeropuertoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aeropuertos")
public class AeropuertoController {
    private final AeropuertoRepository repository;

    public AeropuertoController(AeropuertoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Aeropuerto> getAll() {
        return repository.findAll();
    }
}