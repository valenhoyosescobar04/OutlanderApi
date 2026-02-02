package com.example.outlanderApi.model;

import jakarta.persistence.*;

@Entity
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private String foto;

    // Constructor sin argumentos (obligatorio para JPA)
    public Personaje() {
    }

    // Constructor con parámetros
    public Personaje(String nombre, String descripcion, String foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}
