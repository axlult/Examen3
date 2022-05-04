package com.projectExam.ExamenFinalGraphQL.services;

import com.projectExam.ExamenFinalGraphQL.entities.Libro;
import com.projectExam.ExamenFinalGraphQL.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LibroServices {
    @Autowired
    LibroRepository libroRepository;

    public List<Libro> getAllLibros(int count) {
        return
                this.libroRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }
    public Optional<Libro> getLibro(int id) {
        return this.libroRepository.findById(id);
    }

    public Libro createLibro(String titule, String authorBook,
                               final String launchDate) {
        Libro libro = new Libro();
        libro.setTitule(titule);
        libro.setAuthorBook(authorBook);
        libro.setLaunchDate(LocalDate.parse(launchDate));
        return this.libroRepository.save(libro);
    }
    public void save(Libro libroEntity) {
        this.libroRepository.save(libroEntity);
    }

    public void deleteLibro(Libro libroEntity) {
        this.libroRepository.delete(libroEntity);
    }
}
