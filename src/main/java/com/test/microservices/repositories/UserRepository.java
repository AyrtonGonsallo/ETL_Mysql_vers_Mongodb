package com.test.microservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.microservices.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
