package com.example.spikejpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalController {
    @Autowired
    PrincipalRepository principalRepository;

    @PostMapping(path = "/inserir")
    public Principal Inserir(@RequestBody Principal principal){
        return principalRepository.save(principal);
    }

}
