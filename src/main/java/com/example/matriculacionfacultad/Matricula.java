package com.example.matriculacionfacultad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import java.time.LocalDate;

/**
 * Representa la matrícula de un estudiante en una asignatura.
 * Guarda la fecha de matriculación y la nota final, además de las referencias
 * al estudiante y a la asignatura correspondientes.
 */
@Entity
public class Matricula {

    /** Identificador único de la matrícula, generado automáticamente. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Fecha en la que se realizó la matrícula. */
    private LocalDate fechaMatricula;

    /** Nota final obtenida por el estudiante en la asignatura. */
    private Double notaFinal;

    /** Estudiante que realiza la matrícula. */
    @ManyToOne
    @JoinColumn(name = "dni_estudiante", nullable = false)
    private Estudiante estudiante;

    /** Asignatura en la que se matricula el estudiante. */
    @ManyToOne
    @JoinColumn(name = "codigo_asignatura", nullable = false)
    private Asignatura asignatura;

    /** Crea una matrícula vacía para que JPA pueda cargar sus datos. */
    public Matricula() {
    }
}
