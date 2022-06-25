package com.example.spikejpa;

import javax.persistence.*;

@Entity
public class Secundaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    @ManyToOne
    @JoinTable(name = "principal_secundaria",
            joinColumns = @JoinColumn(name = "secundaria_id"),
            inverseJoinColumns = @JoinColumn(name = "principal_id"))
    private Principal principal;


    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
