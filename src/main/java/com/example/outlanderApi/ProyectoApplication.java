package com.example.outlanderApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.outlanderApi.model.Personaje;
import com.example.outlanderApi.model.Temporada;
import com.example.outlanderApi.model.Capitulo;
import com.example.outlanderApi.repository.PersonajeRepository;
import com.example.outlanderApi.repository.TemporadaRepository;
import com.example.outlanderApi.repository.CapituloRepository;
import org.springframework.boot.CommandLineRunner;
import com.example.outlanderApi.model.Serie;
import com.example.outlanderApi.repository.SerieRepository;
import org.springframework.context.annotation.Bean;
import java.util.List;


@SpringBootApplication
public class ProyectoApplication {

        public static void main(String[] args) {
            SpringApplication.run(ProyectoApplication.class, args);
        }

        @Bean
        public CommandLineRunner initData(SerieRepository serieRepo, TemporadaRepository temporadaRepo, CapituloRepository capituloRepo, PersonajeRepository personajesRepo) {
            return args -> {
                if (serieRepo.count() == 0) {
                    // Crear la serie "Los Soprano"
                    Serie serie = new Serie();
                    serie.setNombre("Los Soprano");
                    serie.setDescripcion("La vida de un mafioso de Nueva Jersey, Tony Soprano, mientras equilibra su vida familiar con la vida criminal.");
                    serie.setCreador("David Chase");

                    // Crear la primera temporada
                    Temporada temporada1 = new Temporada();
                    temporada1.setNumero(1);
                    temporada1.setSerie(serie);


                    // Crear los capítulos de la primera temporada de Los Soprano
                    Capitulo capitulo1T1 = new Capitulo();
                    capitulo1T1.setNombre("The Sopranos");
                    capitulo1T1.setDescripcion("Tony Soprano empieza a ver a una terapeuta para lidiar con los problemas de ansiedad.");
                    capitulo1T1.setCalificacion(4.8);
                    capitulo1T1.setCodigo("T1C01");
                    capitulo1T1.setTemporada(temporada1);

                    Capitulo capitulo2T1 = new Capitulo();
                    capitulo2T1.setNombre("46 Long");
                    capitulo2T1.setDescripcion("Tony tiene que lidiar con problemas familiares mientras dirige su organización criminal.");
                    capitulo2T1.setCalificacion(4.7);
                    capitulo2T1.setCodigo("T1C02");
                    capitulo2T1.setTemporada(temporada1);

                    Capitulo capitulo3T1 = new Capitulo();
                    capitulo3T1.setNombre("Denial, Anger, Acceptance");
                    capitulo3T1.setDescripcion("Tony y sus socios lidian con un cliente problemático en el negocio de apuestas.");
                    capitulo3T1.setCalificacion(4.6);
                    capitulo3T1.setCodigo("T1C03");
                    capitulo3T1.setTemporada(temporada1);

                    Capitulo capitulo4T1 = new Capitulo();
                    capitulo4T1.setNombre("Meadowlands");
                    capitulo4T1.setDescripcion("El hijo de Tony, A.J., se mete en problemas en la escuela.");
                    capitulo4T1.setCalificacion(4.5);
                    capitulo4T1.setCodigo("T1C04");
                    capitulo4T1.setTemporada(temporada1);

                    Capitulo capitulo5T1 = new Capitulo();
                    capitulo5T1.setNombre("College");
                    capitulo5T1.setDescripcion("Tony lleva a su hija a visitar universidades mientras persigue a un exinformante.");
                    capitulo5T1.setCalificacion(4.9);
                    capitulo5T1.setCodigo("T1C05");
                    capitulo5T1.setTemporada(temporada1);

                    Capitulo capitulo6T1 = new Capitulo();
                    capitulo6T1.setNombre("Pax Soprana");
                    capitulo6T1.setDescripcion("Tony enfrenta problemas en su organización y en su vida personal.");
                    capitulo6T1.setCalificacion(4.7);
                    capitulo6T1.setCodigo("T1C06");
                    capitulo6T1.setTemporada(temporada1);

                    Capitulo capitulo7T1 = new Capitulo();
                    capitulo7T1.setNombre("Down Neck");
                    capitulo7T1.setDescripcion("A.J. descubre la verdad sobre el negocio de su padre.");
                    capitulo7T1.setCalificacion(4.6);
                    capitulo7T1.setCodigo("T1C07");
                    capitulo7T1.setTemporada(temporada1);

                    Capitulo capitulo8T1 = new Capitulo();
                    capitulo8T1.setNombre("The Legend of Tennessee Moltisanti");
                    capitulo8T1.setDescripcion("Chris Moltisanti enfrenta una crisis existencial.");
                    capitulo8T1.setCalificacion(4.5);
                    capitulo8T1.setCodigo("T1C08");
                    capitulo8T1.setTemporada(temporada1);

                    Capitulo capitulo9T1 = new Capitulo();
                    capitulo9T1.setNombre("Boca");
                    capitulo9T1.setDescripcion("Tony descubre que su madre puede haberlo traicionado.");
                    capitulo9T1.setCalificacion(4.6);
                    capitulo9T1.setCodigo("T1C09");
                    capitulo9T1.setTemporada(temporada1);

                    Capitulo capitulo10T1 = new Capitulo();
                    capitulo10T1.setNombre("A Hit Is a Hit");
                    capitulo10T1.setDescripcion("Tony ayuda a un amigo en el negocio de la música.");
                    capitulo10T1.setCalificacion(4.7);
                    capitulo10T1.setCodigo("T1C10");
                    capitulo10T1.setTemporada(temporada1);

                    Capitulo capitulo11T1 = new Capitulo();
                    capitulo11T1.setNombre("Nobody Knows Anything");
                    capitulo11T1.setDescripcion("Un policía informa a Tony sobre un traidor en su organización.");
                    capitulo11T1.setCalificacion(4.8);
                    capitulo11T1.setCodigo("T1C11");
                    capitulo11T1.setTemporada(temporada1);

                    Capitulo capitulo12T1 = new Capitulo();
                    capitulo12T1.setNombre("Isabella");
                    capitulo12T1.setDescripcion("Tony ve a una misteriosa mujer mientras lidia con un complot contra él.");
                    capitulo12T1.setCalificacion(4.9);
                    capitulo12T1.setCodigo("T1C12");
                    capitulo12T1.setTemporada(temporada1);

                    Capitulo capitulo13T1 = new Capitulo();
                    capitulo13T1.setNombre("I Dream of Jeannie Cusamano");
                    capitulo13T1.setDescripcion("Tony toma medidas drásticas contra los traidores.");
                    capitulo13T1.setCalificacion(5.0);
                    capitulo13T1.setCodigo("T1C13");
                    capitulo13T1.setTemporada(temporada1);

                    // Añadir todos los capítulos de la temporada 1
                    temporada1.setCapitulos(List.of(capitulo1T1, capitulo2T1, capitulo3T1, capitulo4T1, capitulo5T1, capitulo6T1, capitulo7T1, capitulo8T1, capitulo9T1, capitulo10T1, capitulo11T1, capitulo12T1, capitulo13T1));

                    // Asignar la temporada a la serie
                    serie.setTemporadas(List.of(temporada1));

                    // Guardar la serie y sus temporadas/capítulos en la base de datos
                    serieRepo.save(serie);
                }
            };
        }

    }
