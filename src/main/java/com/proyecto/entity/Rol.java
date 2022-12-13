
package com.proyecto.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

//Los patrones decoradores lo que nos van a decir es que en tiempo ejecucion 
//defina la clase como una entidad y por ende viene de una base de datos y tambien
//definimos la tabla osea asigna comportamientos
@Data
@Entity
@Table(name = "rol")
public class Rol implements Serializable {
    
    private static final long SeriaVersionUID = 11;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_rol")
    private long idRol;
    
    @NotEmpty
    private String nombre;
    
}
