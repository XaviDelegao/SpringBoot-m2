package com.example.demoSpringBoot.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity @Getter @Setter @ToString
public class Empresa {
    @Id
    private String CIF;
    private String nom;
    private String adresa;
    @ManyToOne
    @JoinColumn(name = "alumne_id")
    private Alumne alumne;
    @OneToMany(mappedBy = "empresa")
    private List<Alumne> alumnes;
}
