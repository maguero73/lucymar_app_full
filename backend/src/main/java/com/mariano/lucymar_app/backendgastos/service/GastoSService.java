package com.mariano.lucymar_app.backendgastos.service;

import com.mariano.lucymar_app.backendgastos.exception.BusinessException;

import com.mariano.lucymar_app.backendgastos.model.Gasto;
import com.mariano.lucymar_app.backendgastos.repository.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class GastoSService {

    @Autowired
    private GastoRepository gastoRepository;

    public Gasto guardarGasto(Gasto gasto) {

        // Validar el monto
        if (gasto.getMonto() == null || gasto.getMonto() <= 0) {
            throw new BusinessException("El monto debe ser mayor a cero");
        }
        return gastoRepository.save(gasto);
    }
}
