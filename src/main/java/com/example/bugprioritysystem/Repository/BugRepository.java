package com.example.bugprioritysystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bugprioritysystem.Entity.Bug;
import java.util.List;


public interface BugRepository extends JpaRepository<Bug,Long>{
    List<Bug> findBySeverity(String severity);
    List<Bug> findByUserUserTypePriorityLevel(String priorityLevel);
}
