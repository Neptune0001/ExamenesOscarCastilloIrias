/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinelitas.Cinelitas.service;

import com.cinelitas.Cinelitas.entity.epeliculas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cinelitas.Cinelitas.repository.peliculasRepository;

/**
 *
 * @author Neptune
 */
@Service
public class peliculasService implements IpeliculasService {

    @Autowired
    private peliculasRepository PeliRepo;
            
    @Override
    public List<epeliculas> ListPeliculas() {
        return (List<epeliculas>)PeliRepo.findAll();
    }
    
}
