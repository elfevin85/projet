package com.example.projet2.Service;

import com.example.projet2.Model.Coach;
import com.example.projet2.Model.Exercice;

import java.util.List;

public interface ExerciceService {

    List<Exercice> readAllExo();
    List<Exercice> readAllExoByJambes();
    List<Exercice> readAllExoByChest();
    List<Exercice> readAllExoByEpaule();
    List<Exercice> readAllExoByDos();

}
