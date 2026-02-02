package com.example.outlanderApi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numero;
    private int anioEmision;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "serie_id")
    private Serie serie;

    @OneToMany(mappedBy = "temporada", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Capitulo> capitulos;

    @ManyToMany
    @JoinTable(
            name = "temporada_personaje",
            joinColumns = @JoinColumn(name = "temporada_id"),
            inverseJoinColumns = @JoinColumn(name = "personaje_id")
    )
    private List<Personaje> personajes;

    public Temporada() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAnioEmision() {
        return anioEmision;
    }

    public void setAnioEmision(int anioEmision) {
        this.anioEmision = anioEmision;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(List<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    public Temporada(Long id, int numero, int anioEmision, Serie serie, List<Capitulo> capitulos, List<Personaje> personajes) {
        this.id = id;
        this.numero = numero;
        this.anioEmision = anioEmision;
        this.serie = serie;
        this.capitulos = capitulos;
        this.personajes = personajes;
    }
    private int numeroTemporada;

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }


}
