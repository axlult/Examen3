package com.projectExam.ExamenFinal.repository;

import com.projectExam.ExamenFinal.entities.RegLibros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegLibroRepository extends JpaRepository<RegLibros, Long> {
}
