package com.odont.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
//@Table (name = "odontologo")
@Table
public class Odontologo {
    @Id
    //@SequenceGenerator(name="odontologo_sequence", sequenceName = "odontologo_sequence" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long matricula;
    @Column
    private String nombre, apellido;

    @OneToMany(mappedBy = "odontologo", fetch = FetchType.LAZY)
    private Set<Paciente> pacientes = new HashSet<>();

    public Odontologo(Long matricula, String nombre, String apellido) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
