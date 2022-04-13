package com.test.microservices.repositories.evenements;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.microservices.entities.evenements.CategorieAge;

public interface CategorieAgeRepository extends JpaRepository<CategorieAge, Integer> {

}
