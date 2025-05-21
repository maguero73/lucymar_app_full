package com.mariano.lucymar_app.backendgastos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class GastosDTO {

    @NotBlank(message = "El titular es obligatorio")
    private String titular;

    @NotBlank(message = "El tipo de gasto es obligatorio")
    private String tipoGasto;

    @NotBlank(message = "La moneda es obligatoria")
    private String moneda;

    @NotBlank(message = "La fecha es obligatoria")
    private String fecha;
}
