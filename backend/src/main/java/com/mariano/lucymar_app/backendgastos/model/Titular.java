package com.mariano.lucymar_app.backendgastos.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "LM_TITULAR")
@Data
public class Titular {

    @Id
    @Column(name = "CODIGO")
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;
}
