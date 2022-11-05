/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Unifranz.MiPrimerSpringBoot.servicio;

/**
 *
 * @author MijaelR
 */
import com.Unifranz.MiPrimerSpringBoot.dao.PersonaDao;
import java.util.List;
import com.Unifranz.MiPrimerSpringBoot.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService{
    
    @Autowired
    private PersonaDao personaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Persona> listaPersonas() {
        return (List<Persona>) personaDao.findAll();
    }
    
    @Override
    @Transactional
    public void guardar (Persona persona){
        personaDao.save(persona);
    }
    
    @Override
    @Transactional
    public void eliminar (Persona persona){
        personaDao.delete(persona);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona (Persona persona){
        return personaDao.findById(persona.getId_persona()).orElse(null);
    }    
}
