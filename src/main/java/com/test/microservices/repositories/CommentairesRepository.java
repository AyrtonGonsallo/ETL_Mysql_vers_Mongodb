package com.test.microservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.microservices.entities.Commentaire;

public interface CommentairesRepository extends JpaRepository<Commentaire, Integer> {

}
