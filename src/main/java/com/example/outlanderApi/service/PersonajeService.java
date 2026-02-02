package com.example.outlanderApi.service;

import com.example.outlanderApi.model.Personaje;
import com.example.outlanderApi.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    public List<Personaje> getAllPersonajes() {
        return personajeRepository.findAll();
    }

    public Personaje createPersonaje(Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    public Personaje getPersonajeById(Long id) {
        return personajeRepository.findById(id).orElse(null);
    }
}
