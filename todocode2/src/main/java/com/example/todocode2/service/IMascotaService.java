package com.example.todocode2.service;

import com.example.todocode2.dto.DuenioMascotaDTO;
import com.example.todocode2.entity.Mascota;

import java.util.List;

public interface IMascotaService {
    public void saveMascota(Mascota mascota);
    public void deleteMascota(Long id);
    public void editMascota(Mascota mascota);
    public Mascota getMascota(Long id);
    public List<Mascota> getCaniche();
    public List<DuenioMascotaDTO> getMascoDuenios();

}
