package com.projectExam.ExamenFinal.controllers;

import com.projectExam.ExamenFinal.entities.Encargado;
import com.projectExam.ExamenFinal.services.EncargadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/encargado"})
public class EncargadoController {
    @Autowired
    EncargadoService encargadoService;

    @GetMapping
    public List getAll(){
        return encargadoService.getAll();
    }
    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Encargado> findById(@PathVariable long id){
        Optional<Encargado> result = encargadoService.findById(id);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Encargado create(@RequestBody Encargado encargado){
        return encargadoService.save(encargado).get();
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Encargado> update(@PathVariable("id") long id,
                                          @RequestBody Encargado encargado){
        encargado.setId(id);
        Optional<Encargado> result = encargadoService.update(encargado);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        if (encargadoService.delete(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
