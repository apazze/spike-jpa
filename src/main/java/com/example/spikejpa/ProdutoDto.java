package com.example.spikejpa;

public class ProdutoDto {
    private String nome;
    private CategoriaDto categoriaDto;

    public String getNome() {
        return nome;
    }

    public CategoriaDto getCategoriaDto() {
        return categoriaDto;
    }
}
