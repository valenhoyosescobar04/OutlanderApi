package com.example.outlanderApi.controller;

import com.example.outlanderApi.model.Temporada;
import com.example.outlanderApi.service.TemporadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class TemporadaController {

    @Autowired
    private TemporadaService temporadaService;

    @GetMapping("/temporada/{numero}")
    public String getTemporada(@PathVariable int numero, Model model) {
        Temporada temporada = temporadaService.getTemporadaByNumero(numero);
        if (temporada != null) {
            model.addAttribute("temporada", temporada);
        } else {
            model.addAttribute("error", "La temporada no existe.");
        }
        return "temporada";
    }

}