package com.example.outlanderApi.controller;

import com.example.outlanderApi.model.Personaje;
import com.example.outlanderApi.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/personaje")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @GetMapping
    public List<Personaje> getAllPersonajes() {
        return personajeService.getAllPersonajes();
    }

    @GetMapping("/{id}")
    public Personaje getPersonajeById(@PathVariable Long id) {
        return personajeService.getPersonajeById(id);
    }

    @PostMapping
    public Personaje createPersonaje(@RequestBody Personaje personaje) {
        return personajeService.createPersonaje(personaje);
    }

    @GetMapping("/test")
    public String testEndpoint() {
        return "Endpoint de prueba funcionando!";
    }

}