package com.test.microservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.microservices.entities.Club;

public interface ClubRepository extends JpaRepository<Club, Integer> {

}
