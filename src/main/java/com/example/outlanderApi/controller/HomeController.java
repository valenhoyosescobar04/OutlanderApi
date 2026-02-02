package com.example.outlanderApi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.outlanderApi.model.Serie;
import com.example.outlanderApi.service.SerieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {

        private final SerieService serieService;

        public HomeController(SerieService serieService) {
            this.serieService = serieService;
        }

        @GetMapping("/")
        public String index(Model model) {
            // Obtener la única serie de la base de datos
            Serie serie = serieService.getSerie();

            // Calcular el promedio de calificación
            double promedioCalificacion = serie.getTemporadas().stream()
                    .flatMap(t -> t.getCapitulos().stream())
                    .mapToDouble(c -> c.getCalificacion())
                    .average()
                    .orElse(0.0);

            // Obtener el capítulo mejor calificado
            String mejorCapitulo = serie.getTemporadas().stream()
                    .flatMap(t -> t.getCapitulos().stream())
                    .max((c1, c2) -> Double.compare(c1.getCalificacion(), c2.getCalificacion()))
                    .map(c -> c.getNombre())
                    .orElse("No hay capítulos");

            // Agregar atributos al modelo para que estén disponibles en el HTML
            model.addAttribute("serie", serie);
            model.addAttribute("promedioCalificacion", promedioCalificacion);
            model.addAttribute("mejorCapitulo", mejorCapitulo);

            // Retornar la plantilla `index.html`
            return "index";
        }
    }


