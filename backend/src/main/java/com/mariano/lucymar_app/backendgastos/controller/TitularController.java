package com.mariano.lucymar_app.backendgastos.controller;
import com.mariano.lucymar_app.backendgastos.model.Titular;
import com.mariano.lucymar_app.backendgastos.repository.TitularRepository;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/titulares")
public class TitularController {

    private final TitularRepository titularRepository;

    public TitularController(TitularRepository titularRepository) {
        this.titularRepository = titularRepository;
    }

    @GetMapping
    public List<Titular> listarTitulares() {
        return titularRepository.findAll();



    }
}