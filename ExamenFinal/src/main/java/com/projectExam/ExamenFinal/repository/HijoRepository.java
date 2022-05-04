package com.projectExam.ExamenFinal.repository;

import com.projectExam.ExamenFinal.entities.Hijo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HijoRepository extends JpaRepository<Hijo, Long> {

}
