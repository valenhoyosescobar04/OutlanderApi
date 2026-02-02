package com.example.outlanderApi.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private String creador;
    private double clasificacion;
    private String imagenPoster;

    @OneToMany(mappedBy = "serie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Temporada> temporadas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public double getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(double clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getImagenPoster() {
        return imagenPoster;
    }

    public void setImagenPoster(String imagenPoster) {
        this.imagenPoster = imagenPoster;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }


    }


