package com.example.projet2.Service.Impl;

import com.example.projet2.Model.Coach;
import com.example.projet2.Repository.CoachRepository;
import com.example.projet2.Service.CoachService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoachImplementation implements CoachService {

   private final CoachRepository coachRepository;

    public CoachImplementation(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }

    @Override
    public List<Coach> readAllCoach() {
        return coachRepository.findAll();
    }
}
