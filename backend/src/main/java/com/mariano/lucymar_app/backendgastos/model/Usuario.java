package com.mariano.lucymar_app.backendgastos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "LM_USUARIOS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOMBRE") // adaptalo si el nombre real es diferente
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "USUARIO")
    private String username;

    @Column(name = "CONTRASEÑA")
    private String password;

    @Column(name = "PAIS")
    private String pais;

    public String getPassword() {
        return this.password;
    }



    // Agregá más campos si querés mapear el resto de tu tabla
}
