package com.example.projet2.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table(name = "coach")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coach {
    @Id
    @Column(name = "idcoach")
    private Integer idcoach;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "nom")
    private String nom;

    @Column(name = "Description")
    private String description;

    public Integer getIdcoach() {
        return idcoach;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }
}
