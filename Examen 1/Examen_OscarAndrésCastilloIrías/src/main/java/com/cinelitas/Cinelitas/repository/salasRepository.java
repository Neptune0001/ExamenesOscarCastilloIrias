/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cinelitas.Cinelitas.repository;

import com.cinelitas.Cinelitas.entity.esalas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Neptune
 */
@Repository
public interface salasRepository extends CrudRepository<esalas, Long>{
    
}
