package com.example.todocode2.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DuenioMascotaDTO {
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_duenio;
    private String apellido_duenio;

    public DuenioMascotaDTO() {
    }

    public DuenioMascotaDTO(String nombre_mascota, String especie, String raza, String nombre_duenio, String apellido_duenio) {
        this.nombre_mascota = nombre_mascota;
        this.especie = especie;
        this.raza = raza;
        this.nombre_duenio = nombre_duenio;
        this.apellido_duenio = apellido_duenio;
    }
}
