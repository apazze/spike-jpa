package com.example.spikejpa;

import javax.persistence.*;
import java.util.List;

@Entity
public class Principal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Secundaria> secundaria;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Secundaria> getSecundaria() {
        return secundaria;
    }
}
