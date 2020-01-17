package com.ust.UserAuthentication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.UserAuthentication.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
    
    String findByToken(String token);
}
