package com.example.outlanderApi.controller;

import com.example.outlanderApi.model.Calificacion;
import com.example.outlanderApi.service.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/calificacion")
public class CalificacionController {

    @Autowired
    private CalificacionService calificacionService;

    @GetMapping
    public List<Calificacion> getAllCalificaciones() {
        return calificacionService.getAllCalificaciones();
    }

    @GetMapping("/{id}")
    public Calificacion getCalificacionById(@PathVariable Long id) {
        return calificacionService.getCalificacionById(id);
    }

    @PostMapping
    public Calificacion createCalificacion(@RequestBody Calificacion calificacion) {
        return calificacionService.createCalificacion(calificacion);
    }
}
