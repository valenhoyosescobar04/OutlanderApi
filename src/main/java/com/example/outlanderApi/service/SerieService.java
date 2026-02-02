package com.example.outlanderApi.service;

import com.example.outlanderApi.model.Serie;
import com.example.outlanderApi.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {

    @Autowired
    private SerieRepository serieRepository;

    public List<Serie> getAllSeries() {
        return serieRepository.findAll();
    }

    public Serie createSerie(Serie serie) {
        return serieRepository.save(serie);
    }

    public Serie getSerieById(Long id) {
        return serieRepository.findById(id).orElse(null);
    }

    public Serie getSerie() {
        // Suponemos que solo hay una serie en la base de datos.
        return serieRepository.findAll().stream().findFirst().orElse(null);

    }
}