package com.cfportfolio.ferco.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 *
 * @author FerCod
 */
@Entity
public class Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud requerida")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud requerida")
    private String apellido;
    
    @Size(min = 1, max = 50, message = "No cumple con la longitud requerida")
    private String imgagen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImgagen() {
        return imgagen;
    }

    public void setImgagen(String imgagen) {
        this.imgagen = imgagen;
    }
    
    
    
    
}
