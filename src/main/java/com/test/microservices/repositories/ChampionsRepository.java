package com.test.microservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.microservices.entities.Champion;


public interface ChampionsRepository extends JpaRepository<Champion, Integer> {

}
