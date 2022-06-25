package com.example.spikejpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {
    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping(path = "/inserir")
    public Produto Inserir(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

}
