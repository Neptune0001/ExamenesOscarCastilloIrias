/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cinelitas.Cinelitas.service;

import com.cinelitas.Cinelitas.entity.esalas;
import java.util.List;

/**
 *
 * @author Neptune
 */
public interface IsalasService {
    public List<esalas> getAllSalas();
    public esalas getSalaById(long id);
    public void saveSala (esalas salas);
    public void delete (long id);
}
