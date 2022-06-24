package com.example.spikejpa;

import javax.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    private Pedido pedido;


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Pedido getPedido() {
        return pedido;
    }
}
