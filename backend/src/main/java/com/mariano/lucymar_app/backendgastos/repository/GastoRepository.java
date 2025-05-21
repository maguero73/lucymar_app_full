package com.mariano.lucymar_app.backendgastos.repository;


import com.mariano.lucymar_app.backendgastos.model.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GastoRepository extends JpaRepository<Gasto, Long> {
}

