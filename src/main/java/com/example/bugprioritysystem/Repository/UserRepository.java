package com.example.bugprioritysystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bugprioritysystem.Entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
