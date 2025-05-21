package com.mariano.lucymar_app.backendgastos.dto;

// DTO para devolver el token
public class AuthResponse {
    private String token;

    public AuthResponse() {
        // Constructor vacío requerido por Jackson
    }

    public AuthResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}