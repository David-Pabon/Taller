package com.example.Taller.service;

import com.example.Taller.exception.DuplicateStudentIdException;
import com.example.Taller.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class EstudianteService {

    private final Map<String, Estudiante> storage = new ConcurrentHashMap<>();

    public Estudiante registrar(Estudiante estudiante) {
        String id = estudiante.getId();

        if (storage.containsKey(id)) {
            throw new DuplicateStudentIdException("Ya existe un estudiante con id: " + id);
        }

        storage.put(id, estudiante);
        return estudiante;
    }

    public List<Estudiante> listar() {
        return new ArrayList<>(storage.values());
    }
}
