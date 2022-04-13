package com.test.microservices.repositories.evenements;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.microservices.entities.evenements.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Integer> {

}
