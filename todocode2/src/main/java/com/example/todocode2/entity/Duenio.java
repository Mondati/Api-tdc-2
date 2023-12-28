package com.example.todocode2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Duenios")
@Getter
@Setter
public class Duenio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_duenio;
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;


    public Duenio() {
    }

    public Duenio(String dni, String nombre, String apellido, String celular) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }
}
