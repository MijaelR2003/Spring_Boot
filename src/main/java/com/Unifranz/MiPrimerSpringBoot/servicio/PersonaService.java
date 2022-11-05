/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Unifranz.MiPrimerSpringBoot.servicio;

/**
 *
 * @author MijaelR
 */
import java.util.List;
import com.Unifranz.MiPrimerSpringBoot.domain.Persona;

public interface PersonaService{
    
    public List<Persona> listaPersonas();
    
    public void guardar (Persona persona);
    
    public void eliminar (Persona persona);
    
    public Persona encontrarPersona (Persona persona);
}
