package com.example.projet2.Service.Impl;

import com.example.projet2.Model.Aliment;
import com.example.projet2.Repository.AlimentRepository;
import com.example.projet2.Service.AlimentService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlimentServiceImpl implements AlimentService {

    private final AlimentRepository alimentRepository;

    public AlimentServiceImpl(AlimentRepository alimentRepository) {
        this.alimentRepository = alimentRepository;
    }

    @Override
    public List<Aliment> readAllAliment() {
        return alimentRepository.findAll();
    }

    @Override
    public Collection<Aliment> searchAliment(String query) {
        return readAllAliment().stream().filter(
                        c -> c.getProduit()
                                .toLowerCase()
                                .startsWith(query.toLowerCase()))
                .collect(Collectors.toList());
    }
}
