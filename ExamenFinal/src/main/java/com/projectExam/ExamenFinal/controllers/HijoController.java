package com.projectExam.ExamenFinal.controllers;

import com.projectExam.ExamenFinal.entities.Hijo;
import com.projectExam.ExamenFinal.services.HijoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/hijo"})
public class HijoController {
    @Autowired
    HijoService hijoService;

    @GetMapping
    public List getAll(){
        return hijoService.getAll();
    }
    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Hijo> findById(@PathVariable long id){
        Optional<Hijo> result = hijoService.findById(id);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Hijo create(@RequestBody Hijo hijo){
        return hijoService.save(hijo).get();
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Hijo> update(@PathVariable("id") long id,
                                       @RequestBody Hijo hijo){
        hijo.setId(id);
        Optional<Hijo> result = hijoService.update(hijo);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        if (hijoService.delete(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
