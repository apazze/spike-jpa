package com.example.spikejpa;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "produto_categoria",
            joinColumns = @JoinColumn(name = "categoria_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id"))
    private List<Produto> produtos;


    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
