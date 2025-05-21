package com.mariano.lucymar_app.backendgastos.repository;
import com.mariano.lucymar_app.backendgastos.model.TipoGasto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoGastoRepository extends JpaRepository<TipoGasto, String> {
}