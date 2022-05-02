/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.model.repository;

import com.aguirregermanportfolio.PortfolioGerman.model.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author German
 */
@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
    void deletePersonaById(Long id);
    
    Optional<Persona> findPersonaById(Long id);
}
