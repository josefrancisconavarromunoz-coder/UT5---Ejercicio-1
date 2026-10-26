package com.example.matriculacionfacultad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

/**
 * Representa a un estudiante de la facultad.
 * Un estudiante puede matricularse en varias asignaturas o en ninguna.
 */
@Entity
public class Estudiante {

    /** DNI que identifica al estudiante. */
    @Id
    private String dni;

    /** Nombre del estudiante. */
    private String nombre;

    /** Matrículas realizadas por el estudiante. */
    @OneToMany(mappedBy = "estudiante")
    private List<Matricula> matriculas;

    /** Crea un estudiante vacío para que JPA pueda cargar sus datos. */
    public Estudiante() {
    }
}
