

package com.mariano.lucymar_app.backendgastos.controller;

import com.mariano.lucymar_app.backendgastos.model.Gasto;
import com.mariano.lucymar_app.backendgastos.service.ErrorLogService;
import com.mariano.lucymar_app.backendgastos.service.GastoSService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/gastos")
public class GastoController {

    @Autowired
    private GastoSService gastoService;

    @Autowired
    private ErrorLogService errorLogService;

    @PostMapping
    public ResponseEntity<Gasto> guardar(@Valid @RequestBody Gasto gasto) {
        try {
            Gasto guardado = gastoService.guardarGasto(gasto);
            return ResponseEntity.ok(guardado);
        } catch (Exception e) {
            // Registrar el error en la tabla LM_ERRORES
            errorLogService.registrarError(
                    "ERR_GUARDAR",
                    "Error al guardar el gasto",
                    e.getMessage()
            );

            // Devolver un mensaje de error al cliente (por ejemplo Vue.js)
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("codigo", "ERR_GUARDAR");
            errorResponse.put("mensaje", "Error al guardar el gasto");

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body((Gasto) errorResponse);
        }
    }

}