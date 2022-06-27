package com.example.spikejpa;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;

    public Categoria() {
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
    private List<Produto> produtos;


    public Long getId() {
        return id;
    }

    public Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


    public List<Produto> getProdutos() {
        return produtos;
    }
}
