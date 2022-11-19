package com.cfportfolio.ferco.Interface;

import com.cfportfolio.ferco.Entity.Persona;
import java.util.List;


/**
 *
 * @author FerCod
 */
public interface IPersonaService {
    
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
}
