package com.example.spikejpa;

import javax.persistence.*;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    @ManyToOne
    @JoinTable(name = "cliente_pedido",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "cliente_id"))
    private Cliente cliente;


    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
