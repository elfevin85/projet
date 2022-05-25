package com.example.projet2.Service.Impl;

import com.example.projet2.Model.Test;
import com.example.projet2.Repository.TestRepository;
import com.example.projet2.Service.TestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestImplementation implements TestService {

    private final TestRepository testRepository;

    public TestImplementation(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public List<Test> readAllTest() {
        return testRepository.findAll();
    }
}
