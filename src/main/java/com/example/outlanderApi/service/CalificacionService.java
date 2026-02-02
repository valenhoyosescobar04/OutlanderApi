package com.example.outlanderApi.service;


import com.example.outlanderApi.model.Calificacion;
import com.example.outlanderApi.repository.CalificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalificacionService {

    @Autowired
    private CalificacionRepository calificacionRepository;

    public List<Calificacion> getAllCalificaciones() {
        return calificacionRepository.findAll();
    }

    public Calificacion createCalificacion(Calificacion calificacion) {
        return calificacionRepository.save(calificacion);
    }

    public Calificacion getCalificacionById(Long id) {
        return calificacionRepository.findById(id).orElse(null);
    }
}
