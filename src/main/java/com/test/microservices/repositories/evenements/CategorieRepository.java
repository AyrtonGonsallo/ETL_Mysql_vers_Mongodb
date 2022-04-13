package com.test.microservices.repositories.evenements;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.microservices.entities.evenements.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

}
