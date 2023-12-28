package com.example.todocode2.service;

import com.example.todocode2.dto.DuenioMascotaDTO;
import com.example.todocode2.entity.Duenio;
import com.example.todocode2.entity.Mascota;
import com.example.todocode2.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascotaRepository;

    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepository.deleteById(id);
    }

    @Override
    public void editMascota(Mascota mascota) {
        this.mascotaRepository.save(mascota);
    }

    @Override
    public Mascota getMascota(Long id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    public List<Mascota> getAllMascotas() {
        return mascotaRepository.findAll();
    }

    @Override
    public List<Mascota> getCaniche() {

        List<Mascota> listaMascotas = this.getAllMascotas();
        List<Mascota> listaPerroCaniche = new ArrayList<Mascota>();

        for (Mascota mascota : listaMascotas) {
            if (mascota.getEspecie().equalsIgnoreCase("perro") && mascota.getRaza().equalsIgnoreCase("caniche")) {
                listaPerroCaniche.add(mascota);
            }
        }
        return listaPerroCaniche;
    }

    @Override
    public List<DuenioMascotaDTO> getMascoDuenios() {
        List<Mascota> listaMascotas = this.getAllMascotas();
        List<DuenioMascotaDTO> listaMascoDuenio = new ArrayList<DuenioMascotaDTO>();

        for (Mascota masco : listaMascotas) {
            DuenioMascotaDTO masco_duenio = new DuenioMascotaDTO();

            System.out.println(masco.getNombre());
            masco_duenio.setNombre_duenio(masco.getDuenio().getNombre());
            masco_duenio.setNombre_mascota(masco.getNombre());
            masco_duenio.setApellido_duenio(masco.getDuenio().getApellido());
            masco_duenio.setEspecie(masco.getEspecie());
            masco_duenio.setRaza(masco.getRaza());

            listaMascoDuenio.add(masco_duenio);

        }
        return listaMascoDuenio;
    }

}
