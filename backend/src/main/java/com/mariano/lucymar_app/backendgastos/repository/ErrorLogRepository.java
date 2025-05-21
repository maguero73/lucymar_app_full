package com.mariano.lucymar_app.backendgastos.repository;

import com.mariano.lucymar_app.backendgastos.model.ErrorLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ErrorLogRepository extends JpaRepository<ErrorLog, Long> {
}