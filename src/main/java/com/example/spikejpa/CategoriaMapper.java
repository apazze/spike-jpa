package com.example.spikejpa;

public class CategoriaMapper {

    public static Categoria ParaCategoria(CategoriaDto categoriaDto) {
        return new Categoria(categoriaDto.getDescricao());
    }
}
