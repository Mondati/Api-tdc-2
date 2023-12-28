package com.example.todocode2.controller;

import com.example.todocode2.dto.DuenioMascotaDTO;
import com.example.todocode2.entity.Mascota;
import com.example.todocode2.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    @PostMapping("/mascota/save")
    public ResponseEntity<String> saveMascota(@RequestBody Mascota mascota) {
        mascotaService.saveMascota(mascota);
        return new ResponseEntity<>("Mascota creada con éxito", HttpStatus.OK);
    }

    @DeleteMapping("/mascota/delete/{id}")
    public ResponseEntity<String> deleteMascota(@PathVariable Long id){
        mascotaService.deleteMascota(id);
        return new ResponseEntity<>("Mascota eliminda con éxito", HttpStatus.OK);
    }

    @PutMapping("/mascota/edit")
    public ResponseEntity<String> editMascota(@RequestBody Mascota mascota) {
        mascotaService.editMascota(mascota);
        return new ResponseEntity<>("Mascota editada con éxito", HttpStatus.OK);
    }

    @GetMapping("/mascota/{id}")
    public Mascota getMascota(@PathVariable Long id) {
        return mascotaService.getMascota(id);
    }

    @GetMapping("/mascota/get-all")
    public List<Mascota> getAllMascotas() {
        return mascotaService.getAllMascotas();
    }

    @GetMapping("/mascota/raza-especie")
    public List<Mascota> getPerroCaniche(){
        return mascotaService.getCaniche();
    }

    @GetMapping ("mascotas/traer-duenios")
    public List<DuenioMascotaDTO> traerMascoDuenios () {
        return mascotaService.getMascoDuenios();
    }

}
