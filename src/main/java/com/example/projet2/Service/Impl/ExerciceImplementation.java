package com.example.projet2.Service.Impl;


import com.example.projet2.Model.Exercice;
import com.example.projet2.Repository.ExerciceRepository;
import com.example.projet2.Service.ExerciceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciceImplementation implements ExerciceService {

    private final ExerciceRepository exerciceRepository;

    public ExerciceImplementation(ExerciceRepository exerciceRepository) {
        this.exerciceRepository = exerciceRepository;
    }

    @Override
    public List<Exercice> readAllExo() {
        return exerciceRepository.findAll();
    }

    @Override
    public List<Exercice> readAllExoByJambes() {
        return exerciceRepository.getExerciceJambes();
    }

    @Override
    public List<Exercice> readAllExoByChest() {
        return exerciceRepository.getExerciceChest();
    }

    @Override
    public List<Exercice> readAllExoByEpaule() {
        return exerciceRepository.getExerciceEpaule();
    }

    @Override
    public List<Exercice> readAllExoByDos() {
        return exerciceRepository.getExerciceDos();
    }

}
