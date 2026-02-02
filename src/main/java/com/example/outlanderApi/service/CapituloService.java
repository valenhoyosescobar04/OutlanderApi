package com.example.outlanderApi.service;

import com.example.outlanderApi.model.Capitulo;
import com.example.outlanderApi.repository.CapituloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapituloService {

    @Autowired
    private CapituloRepository capituloRepository;

    public List<Capitulo> getAllCapitulos() {
        return capituloRepository.findAll();
    }

    public Capitulo createCapitulo(Capitulo capitulo) {
        return capituloRepository.save(capitulo);
    }

    public Capitulo getCapituloById(Long id) {
        return capituloRepository.findById(id).orElse(null);
    }
}
