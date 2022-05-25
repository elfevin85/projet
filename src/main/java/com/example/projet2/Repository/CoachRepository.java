package com.example.projet2.Repository;

import com.example.projet2.Model.Coach;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface CoachRepository extends JpaRepository<Coach, Integer> {


}
