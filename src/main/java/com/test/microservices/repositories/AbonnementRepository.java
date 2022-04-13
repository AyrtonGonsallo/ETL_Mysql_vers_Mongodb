package com.test.microservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.microservices.entities.Abonnement;

public interface AbonnementRepository extends JpaRepository<Abonnement, Integer> {

}
