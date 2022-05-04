package com.projectExam.ExamenFinal.services;

import com.projectExam.ExamenFinal.entities.RegLibros;
import com.projectExam.ExamenFinal.repository.RegLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegLibroServiceImpl implements RegLibroService{

    @Autowired
    RegLibroRepository libroRepository;

    @Override
    public List<RegLibros> getAll() {
        return libroRepository.findAll();
    }

    @Override
    public Optional<RegLibros> findById(long id) {
        return libroRepository.findById(id).map(record -> Optional.of(record)).orElse(Optional.empty());
    }

    @Override
    public Optional<RegLibros> save(RegLibros regLibros) {
        return Optional.of(libroRepository.save(regLibros));
    }

    @Override
    public Optional<RegLibros> update(RegLibros regLibros) {
        Optional<RegLibros> record = libroRepository.findById(regLibros.getId());
        if (record.isPresent()) {
            RegLibros data = record.get();
            data.setNameChild(regLibros.getNameChild());
            data.setLibrosLeidos(regLibros.getLibrosLeidos());
            data.setCantLibrosLeidos(regLibros.getCantLibrosLeidos());
            return Optional.of(libroRepository.save(data));
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        Optional<RegLibros> result = libroRepository.findById(id);
        if (result.isPresent()){
            libroRepository.deleteById(id);
            return true;
        }
            return false;
    }
}
