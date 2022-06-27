package com.example.spikejpa;

public class ProdutoMapper {
    public static Produto ParaProduto(ProdutoDto produtoDto) {
        return new Produto(produtoDto.getNome(), CategoriaMapper.ParaCategoria(produtoDto.getCategoriaDto()));
    }
}
