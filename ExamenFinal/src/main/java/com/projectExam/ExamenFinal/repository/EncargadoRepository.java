package com.projectExam.ExamenFinal.repository;

import com.projectExam.ExamenFinal.entities.Encargado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncargadoRepository extends JpaRepository<Encargado, Long>{
}
