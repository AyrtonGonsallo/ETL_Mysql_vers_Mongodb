package com.test.microservices.repositories.evenements;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.microservices.entities.evenements.EvenementImportant;

public interface EvenementImportantRepository extends JpaRepository<EvenementImportant, Integer> {

}
