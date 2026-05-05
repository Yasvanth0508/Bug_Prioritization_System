package com.example.bugprioritysystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bugprioritysystem.Entity.UserType;

public interface UserTypeRepository extends JpaRepository<UserType,Long>{
    
}
