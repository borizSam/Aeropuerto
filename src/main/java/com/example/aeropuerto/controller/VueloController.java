package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Vuelo;
import com.example.aeropuerto.repository.VueloRepository;
import com.example.aeropuerto.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/vuelos")

public class VueloController {
    @Autowired
    private VueloService vueloService;

    @GetMapping
    public List<Vuelo> getAll() {
        return vueloService.getAllVuelos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vuelo> getById(@PathVariable Long id){
        return vueloService.getVueloById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }
    @PostMapping
    public Vuelo create(@RequestBody Vuelo vuelo){
        return vueloService.saveVuelo(vuelo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        vueloService.deleteVuelo(id);
        return ResponseEntity.noContent().build();

    }
}