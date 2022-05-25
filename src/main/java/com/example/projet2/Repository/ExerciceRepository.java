package com.example.projet2.Repository;

import com.example.projet2.Model.Exercice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExerciceRepository extends JpaRepository<Exercice, Integer> {


    @Query("FROM Exercice WHERE muscle='Jambe' ORDER BY muscle asc")
    List<Exercice> getExerciceJambes();

    @Query("FROM Exercice WHERE muscle='Pectoraux' ORDER BY muscle asc")
    List<Exercice> getExerciceChest();

    @Query("FROM Exercice WHERE muscle='Epaule' ORDER BY muscle asc")
    List<Exercice> getExerciceEpaule();

    @Query("FROM Exercice WHERE muscle='Dos' ORDER BY muscle asc")
    List<Exercice> getExerciceDos();
}
