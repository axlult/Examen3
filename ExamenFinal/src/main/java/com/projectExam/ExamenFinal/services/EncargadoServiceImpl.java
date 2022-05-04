package com.projectExam.ExamenFinal.services;

import com.projectExam.ExamenFinal.entities.Encargado;
import com.projectExam.ExamenFinal.repository.EncargadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EncargadoServiceImpl implements EncargadoService{
    @Autowired
    EncargadoRepository encargadoRepository;

    @Override
    public List<Encargado> getAll() {
        return encargadoRepository.findAll();
    }

    @Override
    public Optional<Encargado> findById(long id) {
        return encargadoRepository.findById(id).map(record -> Optional.of(record)).orElse(Optional.empty());
    }

    @Override
    public Optional<Encargado> save(Encargado encargado) {
        return Optional.of(encargadoRepository.save(encargado));
    }

    @Override
    public Optional<Encargado> update(Encargado encargado) {
        Optional<Encargado> record = encargadoRepository.findById(encargado.getId());
        if (record.isPresent()) {
            Encargado data = record.get();
            data.setName(encargado.getName());
            data.setCedula(encargado.getCedula());
            data.setDireccion(encargado.getDireccion());
            data.setTelPrim(encargado.getTelPrim());
            data.setTelSec(encargado.getTelSec());
            return Optional.of(encargadoRepository.save(data));
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        Optional<Encargado> result = encargadoRepository.findById(id);
        if (result.isPresent()){
            encargadoRepository.deleteById(id);
            return true;
        }
            return false;
    }
}
