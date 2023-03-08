/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinelitas.Cinelitas.service;

import com.cinelitas.Cinelitas.entity.esalas;
import com.cinelitas.Cinelitas.repository.salasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Neptune
 */
@Service
public class salasService implements IsalasService {
    
    @Autowired
    private salasRepository SalasRepo;
    
    @Override
    public List<esalas> getAllSalas() {
        return (List<esalas>)SalasRepo.findAll();
    }

    @Override
    public esalas getSalaById(long id) {
        return SalasRepo.findById(id).orElse(null);
    }

    @Override
    public void saveSala(esalas salas) {
        SalasRepo.save(salas);
    }

    @Override
    public void delete(long id) {
        SalasRepo.deleteById(id);
    }
    
}
