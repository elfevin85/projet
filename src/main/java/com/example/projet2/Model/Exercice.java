package com.example.projet2.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "exercice")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exercice {
    @Id
    @Column(name = "idexercice")
    private Integer idexercice;

    @Column(name = "nom")
    private String nom;

    @Column(name = "type_equipement")
    private String typeEquipement;

    @Column(name = "muscle")
    private String muscle;

    @Column(name = "description")
    private String description;

    @Column(name = "difficulte")
    private String difficulte;

    public Integer getIdexercice() {
        return idexercice;
    }

    public String getNom() {
        return nom;
    }

    public String getTypeEquipement() {
        return typeEquipement;
    }

    public String getMuscle() {
        return muscle;
    }

    public String getDescription() {
        return description;
    }

    public String getDifficulte() {
        return difficulte;
    }
}
