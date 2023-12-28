package com.example.todocode2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Mascotas")
@Getter
@Setter
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;

    @OneToOne
    @JoinColumn (name="id_duenio", referencedColumnName = "id_duenio")
    private Duenio duenio;

    public Mascota() {
    }

    public Mascota(String nombre, String especie, String raza, String color) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
    }
}
