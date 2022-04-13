package com.test.microservices.repositories.evenements;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.microservices.entities.evenements.Resultat;

public interface ResultatRepository extends JpaRepository<Resultat, Integer> {

}
