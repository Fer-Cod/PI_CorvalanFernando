package com.cfportfolio.ferco.Security.Repository;

import com.cfportfolio.ferco.Security.Entity.Rol;
import com.cfportfolio.ferco.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author FerCod
 */
@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
