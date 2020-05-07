package com.github.steed777.taskcentrinform.repository;

import com.github.steed777.taskcentrinform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
