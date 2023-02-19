package co.com.vp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.vp.domain.Persona;

public interface PersonaDao extends JpaRepository<Persona, Long>{
    
}
