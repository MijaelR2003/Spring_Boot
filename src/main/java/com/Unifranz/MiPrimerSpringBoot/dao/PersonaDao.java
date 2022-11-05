/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Unifranz.MiPrimerSpringBoot.dao;

import com.Unifranz.MiPrimerSpringBoot.domain.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author MijaelR
 */
public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}
