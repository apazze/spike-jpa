package com.example.spikejpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CategoriaController {

    @Autowired
    CategoriaRepository categoriaRepository;
    @GetMapping
    public Optional<Categoria> buscar(@RequestParam Long id){
        return categoriaRepository.findById(id);
    }
}
