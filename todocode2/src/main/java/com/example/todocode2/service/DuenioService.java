package com.example.todocode2.service;

import com.example.todocode2.dto.DuenioMascotaDTO;
import com.example.todocode2.entity.Duenio;
import com.example.todocode2.entity.Mascota;
import com.example.todocode2.repository.IDuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuenioService implements IDuenioService {

    @Autowired
    private IDuenioRepository duenioRepository;

    @Override
    public void saveDuenio(Duenio duenio) {
        duenioRepository.save(duenio);
    }

    @Override
    public void deleteDuenio(Long id) {
        duenioRepository.deleteById(id);
    }

    @Override
    public void editDuenio(Duenio duenio) {
        this.duenioRepository.save(duenio);
    }

    @Override
    public Duenio getDuenio(Long id) {
        return duenioRepository.findById(id).orElse(null);
    }



}
