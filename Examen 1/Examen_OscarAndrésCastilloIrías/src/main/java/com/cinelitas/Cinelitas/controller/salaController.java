/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinelitas.Cinelitas.controller;

import com.cinelitas.Cinelitas.entity.epeliculas;
import com.cinelitas.Cinelitas.entity.esalas;
import com.cinelitas.Cinelitas.service.IpeliculasService;
import com.cinelitas.Cinelitas.service.IsalasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Neptune
 */
@Controller
public class salaController {
    
    @Autowired
    private IsalasService SalaRepo;
    
    @Autowired
    private IpeliculasService PeliRepo;
    
    /*--------------------------------------------------------------------------*/
    
    @GetMapping("/pelis")
    public String index(Model model) {
        List<esalas> listaConcierto = SalaRepo.getAllSalas();
        model.addAttribute("titulo", "Tabla Peliculas");
        model.addAttribute("pelicula", listaConcierto);
        return "peliculas";
    }
    
    @GetMapping("/pelisN")
    public String crearConcierto(Model model) {
        List<epeliculas> ListaPelis = PeliRepo.ListPeliculas();
        model.addAttribute("sala", new esalas());
        model.addAttribute("peliculas", ListaPelis);
        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        SalaRepo.delete(id);
        return "redirect:/pelis";
    }

    @PostMapping("/pelis")
    public String guardarPeli(@ModelAttribute("pelicula") esalas salas) {
        SalaRepo.saveSala(salas); 
        return "redirect:/pelis";
    }
}
