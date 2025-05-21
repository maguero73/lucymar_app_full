package com.mariano.lucymar_app.backendgastos.dto;

// DTO para recibir los datos de login
public class AuthRequest {
    private String username;
    private String password;

    // Constructor vacío (requerido para deserialización)
    public AuthRequest() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}