package com.test.microservices.repositories.evenements;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.microservices.entities.evenements.EvenementImportantDirect;

public interface EvenementImportantDirectRepository extends JpaRepository<EvenementImportantDirect, Integer> {

}
