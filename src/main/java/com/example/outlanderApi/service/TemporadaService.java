package com.example.outlanderApi.service;

import com.example.outlanderApi.model.Temporada;
import com.example.outlanderApi.repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TemporadaService {

    private final TemporadaRepository temporadaRepository;

    public TemporadaService(TemporadaRepository temporadaRepository) {
        this.temporadaRepository = temporadaRepository;
    }

    public Temporada getTemporadaByNumero(int numero) {
        return temporadaRepository.findByNumero(numero);
    }

    public List<Temporada> getAllTemporadas() {
        return temporadaRepository.findAll();
    }
}