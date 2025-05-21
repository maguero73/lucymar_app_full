package com.mariano.lucymar_app.backendgastos.repository;

import com.mariano.lucymar_app.backendgastos.model.Titular;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitularRepository extends JpaRepository<Titular, Long> {
}