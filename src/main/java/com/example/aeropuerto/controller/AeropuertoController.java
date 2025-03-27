package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Aeropuerto;
import com.example.aeropuerto.repository.AeropuertoRepository;
import com.example.aeropuerto.service.AeropuertoService;
import com.example.aeropuerto.service.AvionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/aeropuertos")
public class AeropuertoController {

    @Autowired
    private AeropuertoService aeropuertoService;

    @GetMapping
    public List<Aeropuerto> getAll() {
        return aeropuertoService.getAllAeropuertos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aeropuerto> getById(@PathVariable Long id) {
        return aeropuertoService.getAeropuertoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Aeropuerto create(@RequestBody Aeropuerto aeropuerto) {
        return aeropuertoService.saveAeropuerto(aeropuerto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        aeropuertoService.deleteAeropuerto(id);
        return ResponseEntity.noContent().build();
    }
}