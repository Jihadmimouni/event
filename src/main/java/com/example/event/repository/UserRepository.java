package com.example.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.event.model.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUsername(String username);
}
