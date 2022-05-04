package com.projectExam.ExamenFinal.controllers;

import com.projectExam.ExamenFinal.entities.RegLibros;
import com.projectExam.ExamenFinal.services.RegLibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/libros"})
public class RegLibroController {
    @Autowired
    RegLibroService libroService;

    @GetMapping
    public List getAll(){
        return libroService.getAll();
    }
    @GetMapping(path = {"/{id}"})
    public ResponseEntity<RegLibros> findById(@PathVariable long id){
        Optional<RegLibros> result = libroService.findById(id);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public RegLibros create(@RequestBody RegLibros libros){
        return libroService.save(libros).get();
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<RegLibros> update(@PathVariable("id") long id,
                                        @RequestBody RegLibros libros){
        libros.setId(id);
        Optional<RegLibros> result = libroService.update(libros);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        if (libroService.delete(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
