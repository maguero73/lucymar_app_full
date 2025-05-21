package com.mariano.lucymar_app.backendgastos.controller;


import com.mariano.lucymar_app.backendgastos.model.TipoGasto;
import com.mariano.lucymar_app.backendgastos.repository.TipoGastoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/tipos-gasto")
@CrossOrigin(origins = "*")
public class TipoGastoController {

    private final TipoGastoRepository tipoGastoRepository;

    public TipoGastoController(TipoGastoRepository tipoGastoRepository) {
        this.tipoGastoRepository = tipoGastoRepository;
    }

    @GetMapping
    public List<TipoGasto> obtenerTiposGasto() {
        return tipoGastoRepository.findAll();
    }
}