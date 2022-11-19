package com.cfportfolio.ferco.Controller;

import com.cfportfolio.ferco.Entity.Persona;
import com.cfportfolio.ferco.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @asuthor FerCod
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired
    IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @PostMapping("personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "La persona fue borrada correctamente";
    }
    
   @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                                @RequestParam("nombre") String nuevoNombre,
                                @RequestParam("apellido") String nuevoApellido,
                                @RequestParam("imagen") String nuevoImagen) {
        
        Persona persona = ipersonaService.findPersona(id);
        persona.setApellido(nuevoApellido);
        persona.setNombre(nuevoNombre);
        persona.setImgagen(nuevoImagen);
        
        ipersonaService.savePersona(persona);
        return persona;
    }
    
    @GetMapping("personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona((long)1);
    }
   
}
