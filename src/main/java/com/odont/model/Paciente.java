package com.odont.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@ToString
@Getter
@Setter
@Entity

public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre, apellido, email;
    private int DNI;
    private LocalDate fechaIngreso;
    private Domicilio domicilio;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "odontologo_id")
    private Odontologo odontologo;

    public Paciente() {
        this.domicilio = new Domicilio();
    }
















}
