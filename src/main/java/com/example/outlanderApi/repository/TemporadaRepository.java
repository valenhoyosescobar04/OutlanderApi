package com.example.outlanderApi.repository;

import com.example.outlanderApi.model.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TemporadaRepository extends JpaRepository<Temporada, Long> {
    Temporada findByNumero(int numero);
}
