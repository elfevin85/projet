package com.example.projet2.Service;

import com.example.projet2.Model.Aliment;
import com.example.projet2.Model.Coach;

import java.util.Collection;
import java.util.List;

public interface AlimentService {

    List<Aliment> readAllAliment();

    Collection<Aliment> searchAliment(String query);
}
