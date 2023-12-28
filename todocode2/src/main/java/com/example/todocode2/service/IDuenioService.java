package com.example.todocode2.service;

import com.example.todocode2.dto.DuenioMascotaDTO;
import com.example.todocode2.entity.Duenio;

public interface IDuenioService {

    public void saveDuenio(Duenio duenio);
    public void deleteDuenio(Long id);
    public void editDuenio(Duenio duenio);
    public Duenio getDuenio(Long id);

}
