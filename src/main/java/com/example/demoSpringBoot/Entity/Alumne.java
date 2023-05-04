package com.example.demoSpringBoot.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString
public class Alumne {
    /*Per a cada alumne es vol saber el nom, els cognoms, el cicle (DAM, DAW, ASIX, SMX) i la modalitat (DUAL, FCT), l’estat de les pràctiques (ENPROCES, ACABADES) i l’empresa on les realitza.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String cognom;
    private String cicle;
    private String modalitat;
    private String estat;
    @ManyToOne
    private Empresa empresa;

}
