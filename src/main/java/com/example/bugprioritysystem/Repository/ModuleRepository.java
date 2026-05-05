package com.example.bugprioritysystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bugprioritysystem.Entity.Module;

public interface ModuleRepository extends JpaRepository<Module,Long>{
    
}
