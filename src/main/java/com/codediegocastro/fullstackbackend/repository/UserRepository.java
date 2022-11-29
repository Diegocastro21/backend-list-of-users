package com.codediegocastro.fullstackbackend.repository;

import com.codediegocastro.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
