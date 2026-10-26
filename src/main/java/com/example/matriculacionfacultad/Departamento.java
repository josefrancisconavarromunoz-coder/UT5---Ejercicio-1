package com.example.matriculacionfacultad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

/**
 * Representa un departamento académico de la facultad.
 * Un departamento puede tener varios profesores o no tener ninguno.
 */
@Entity
public class Departamento {

    /** Código que identifica el departamento. */
    @Id
    private String codigo;

    /** Nombre del departamento. */
    private String nombre;

    /** Profesores que pertenecen al departamento. */
    @OneToMany(mappedBy = "departamento")
    private List<Profesor> profesores;

    /** Crea un departamento vacío para que JPA pueda cargar sus datos. */
    public Departamento() {
    }
}
