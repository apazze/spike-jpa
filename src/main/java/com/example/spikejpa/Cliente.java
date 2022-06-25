package com.example.spikejpa;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Pedido> pedido;


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Pedido> getPedido() {
        return pedido;
    }
}
