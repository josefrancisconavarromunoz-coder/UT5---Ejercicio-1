package com.example.matriculacionfacultad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.List;

/**
 * Representa una asignatura que se imparte en la facultad.
 * Cada asignatura tiene un código, un nombre y un profesor responsable.
 * También puede tener varias matrículas de estudiantes.
 *
 * @author curro
 */
@Entity
public class Asignatura {

    /** Código que identifica la asignatura. */
    @Id
    private String codigo;

    /** Nombre de la asignatura. */
    private String nombre;

    /** Profesor que imparte la asignatura. */
    @ManyToOne
    @JoinColumn(name = "dni_profesor", nullable = false)
    private Profesor profesor;

    /** Matrículas realizadas en esta asignatura. */
    @OneToMany(mappedBy = "asignatura")
    private List<Matricula> matriculas;

    /** Crea una asignatura vacía para que JPA pueda cargar sus datos. */
    public Asignatura() {
    }
}
