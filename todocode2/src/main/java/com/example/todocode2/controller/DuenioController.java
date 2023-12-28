package com.example.todocode2.controller;

import com.example.todocode2.entity.Duenio;
import com.example.todocode2.service.DuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DuenioController {

    @Autowired
    private DuenioService duenioService;

    @PostMapping("/duenio/save")
    public ResponseEntity<String> saveDuenio(@RequestBody Duenio duenio) {
        duenioService.saveDuenio(duenio);
        return new ResponseEntity<>("Guardado con éxito", HttpStatus.OK);
    }

    @DeleteMapping("/duenio/delete/{id}")
    public ResponseEntity<String> deleteDuenio(@PathVariable Long id) {
        duenioService.deleteDuenio(id);
        return new ResponseEntity<>("Dueño eliminado con éxito", HttpStatus.OK);
    }

    @PutMapping("/duenio/edit")
    public ResponseEntity<String> editDuenio(@RequestBody Duenio duenio) {
        duenioService.editDuenio(duenio);
        return new ResponseEntity<>("Editado correctamente", HttpStatus.OK);
    }

    @GetMapping("/duenio/{id}")
    public Duenio getDuenio(@PathVariable Long id) {
        return duenioService.getDuenio(id);
    }



}
