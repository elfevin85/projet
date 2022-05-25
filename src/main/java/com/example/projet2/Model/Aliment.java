package com.example.projet2.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "aliment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aliment {
    @Id
    @Column(name = "idaliment")
    private Integer idaliment;

    @Column(name = "produit")
    private String produit;

    @Column(name = "nb_calorie")
    private Integer nbCalorie;

    @Column(name = "proteine")
    private Integer proteine;

    @Column(name = "lipide")
    private Integer lipide;

    @Column(name = "glucide")
    private Integer glucide;

    @Column(name = "categorie")
    private String categorie;

    @Column(name = "niveau_de_sante")
    private String niveauDeSante;

    public Integer getIdaliment() {
        return idaliment;
    }

    public String getProduit() {
        return produit;
    }

    public Integer getNbCalorie() {
        return nbCalorie;
    }

    public Integer getProteine() {
        return proteine;
    }

    public Integer getLipide() {
        return lipide;
    }

    public Integer getGlucide() {
        return glucide;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getNiveauDeSante() {
        return niveauDeSante;
    }
}
