package com.mariano.lucymar_app.backendgastos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "LM_GASTOS")  // Asegurate q sea el nombre correcto de la tabla en tu BD
@Data
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gasto_seq_gen")
    @SequenceGenerator(name = "gasto_seq_gen", sequenceName = "lm_gastos_seq", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "COD_GASTO")
    private Long cod_gasto;

    @Column(name = "COD_TITULAR")
    private Long cod_titular;

    @Column(name = "MONTO")
    private Long monto;

    @Column(name = "FECHA")
    private LocalDate fecha;

    @Column(name = "CODIGO_MONEDA")
    private String codigo_moneda;

    @Column(name = "TIPO_CAMBIO")
    private Float tipo_cambio;

    @Column(name = "FECHA_CREACION")
    private LocalDate fecha_creacion;

    // Getters y Setters
}