package com.example.outlanderApi.repository;


import com.example.outlanderApi.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajeRepository extends JpaRepository<Personaje, Long> {

}
