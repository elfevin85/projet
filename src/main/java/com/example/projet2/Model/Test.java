package com.example.projet2.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "test")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Test {
    @Id
    @Column(name = "id_test")
    private int idTest;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "nom")
    private String nom;

}
