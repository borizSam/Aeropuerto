package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Avion;
import com.example.aeropuerto.repository.AvionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aviones")
public class AvionController {
    private final AvionRepository repository;

    public AvionController(AvionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Avion> getAll() {
        return repository.findAll();
    }
}