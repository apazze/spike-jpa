package com.example.spikejpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProdutoController {
    @Autowired
    ProdutoRepository produtoRepository;
    @Autowired
    CategoriaRepository categoriaRepository;

    @PostMapping(path = "/inserir")
    public Produto Inserir(@RequestBody Produto produto){
        Optional<Categoria> categoria = categoriaRepository.findByDescricao(produto.getCategoria().getDescricao());
        if(categoria.isPresent()){
            produto.setCategoria(categoria.get());
        }
        return produtoRepository.save(produto);
    }
}
