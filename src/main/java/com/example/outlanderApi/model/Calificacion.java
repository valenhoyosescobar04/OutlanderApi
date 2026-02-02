package com.example.outlanderApi.model;


import jakarta.persistence.*;

@Entity
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int estrellas;

    @ManyToOne
    @JoinColumn(name = "capitulo_id")
    private Capitulo capitulo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public Capitulo getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(Capitulo capitulo) {
        this.capitulo = capitulo;
    }
}
