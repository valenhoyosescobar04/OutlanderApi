package com.example.outlanderApi.controller;

import com.example.outlanderApi.model.Serie;
import com.example.outlanderApi.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/serie")
public class SerieController {

    @Autowired
    private SerieService serieService;

    @GetMapping
    public List<Serie> getAllSeries() {
        return serieService.getAllSeries();
    }

    @PostMapping
    public Serie createSerie(@RequestBody Serie serie) {
        return serieService.createSerie(serie);
    }

}
