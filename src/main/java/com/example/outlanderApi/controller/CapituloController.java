package com.example.outlanderApi.controller;

import com.example.outlanderApi.model.Capitulo;
import com.example.outlanderApi.service.CapituloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/capitulos")
public class CapituloController {

    @Autowired
    private CapituloService capituloService;

    @GetMapping
    public List<Capitulo> getAllCapitulos() {
        return capituloService.getAllCapitulos();
    }

    @GetMapping("/{id}")
    public Capitulo getCapituloById(@PathVariable Long id) {
        return capituloService.getCapituloById(id);
    }

    @PostMapping
    public Capitulo createCapitulo(@RequestBody Capitulo capitulo) {
        return capituloService.createCapitulo(capitulo);
    }

}
