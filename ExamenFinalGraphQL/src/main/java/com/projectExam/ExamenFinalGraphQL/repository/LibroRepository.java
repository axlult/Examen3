package com.projectExam.ExamenFinalGraphQL.repository;

import com.projectExam.ExamenFinalGraphQL.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
