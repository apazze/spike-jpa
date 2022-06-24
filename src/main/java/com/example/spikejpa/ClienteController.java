package com.example.spikejpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    @Autowired
    ClienteRepository clienteRepository;

    @PostMapping(path = "/inserir")
    public Cliente Inserir(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }

}
