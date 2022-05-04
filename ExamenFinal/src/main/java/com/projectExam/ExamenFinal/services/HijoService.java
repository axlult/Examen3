package com.projectExam.ExamenFinal.services;

import com.projectExam.ExamenFinal.entities.Hijo;

import java.util.List;
import java.util.Optional;

public interface HijoService {
    public List<Hijo> getAll();
    public Optional<Hijo> findById(long id);
    public  Optional<Hijo> save(Hijo child);
    public  Optional<Hijo> update(Hijo child);
    public boolean delete(Long id);
}
