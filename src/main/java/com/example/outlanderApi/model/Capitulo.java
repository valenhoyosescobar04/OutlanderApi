package com.example.outlanderApi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import com.example.outlanderApi.model.Temporada;
import java.util.List;

@Entity
public class Capitulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private String imagen1;  // Ruta de la primera imagen
    private String imagen2;  // Ruta de la segunda imagen
    private Double calificacion;
    private String codigo;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "temporada_id")
    private Temporada temporada;

    @OneToMany(mappedBy = "capitulo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Calificacion> calificaciones;

    public Capitulo() {

    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
    public Double getCalificacion() {
        return calificacion;
    }


    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

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

    public String getImagen1() {
        return imagen1;
    }

    public void setImagen1(String imagen1) {
        this.imagen1 = imagen1;
    }

    public String getImagen2() {
        return imagen2;
    }

    public void setImagen2(String imagen2) {
        this.imagen2 = imagen2;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Capitulo(Long id, String nombre, String descripcion, String imagen1, String imagen2, double calificacion, Temporada temporada, List<Calificacion> calificaciones) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen1 = imagen1;
        this.imagen2 = imagen2;
        this.calificacion = calificacion;
        this.temporada = temporada;
        this.calificaciones = calificaciones;
        this.codigo = codigo;
    }

}
