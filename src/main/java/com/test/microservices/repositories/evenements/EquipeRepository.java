package com.test.microservices.repositories.evenements;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.microservices.entities.evenements.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Integer> {

}
