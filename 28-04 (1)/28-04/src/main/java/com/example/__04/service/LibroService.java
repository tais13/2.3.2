package com.example.__04.service;


import com.example.__04.model.Libro;
import com.example.__04.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return LibroRepository.obtenerLibros();
    }

}
