package com.example.matriculacionfacultad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.List;

/**
 * Representa a un profesor de la facultad.
 * Cada profesor pertenece a un departamento y puede impartir varias asignaturas.
 */
@Entity
public class Profesor {

    /** Dni que identifica al profesor. */
    @Id
    private String dni;

    /** Nombre del profesor. */
    private String nombre;

    /** Departamento al que pertenece el profesor. */
    @ManyToOne
    @JoinColumn(name = "codigo_departamento", nullable = false)
    private Departamento departamento;

    /** Asignaturas que imparte el profesor. */
    @OneToMany(mappedBy = "profesor")
    private List<Asignatura> asignaturas;

    /** Crea un profesor vacío para que JPA pueda cargar sus datos. */
    public Profesor() {
    }
}
