package com.cfportfolio.ferco.Repository;

import com.cfportfolio.ferco.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author FerCod
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
